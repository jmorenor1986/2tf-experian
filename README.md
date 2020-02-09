2TF-APOSTAR
===============================
Project that consume two services provided for Experian WS HISTORIA CREDITO PN/EVIDENTE MASTER

Modules
----------
![alt text](images/modules.png)

Evidente
----------
This end-point has the next methods:
* Validar: This allows to validate the identification data of user.

How configuration
----------
The project contain a configuration file. it's name is application.yml.
experian-rest/src/main/resources/
* Operations: generic end-points data.

    ```yml
    operaciones:
      api:
        urlBase: https://demo-servicesesb.datacredito.com.co
        evidenteProperties:
          urlEvidente: /wss/idws2/services/ServicioIdentificacionPlus
          idUsuarioEntidad: ODAwODkyMzA=
          paramProducto: 3136
          producto: 010
          canal: 001
    ```
* Security : Data configuration to implements ws-security to consume the Experian services.these properties are supplied by apostar, is the security of consume the services exposed by them.
    ```yml
    security:
      trustStore: C:/clientes/prueba/demo-servicesesb.jks
      trustStorePassword: experian
      keyStore: C:/clientes/prueba/demo-servicesesb.jks
      keyStorePassword: experian
      allowInsecureParser: 1
      certPassword: experian
      password: experian
      user: 2-830513238
      signaturePropertyFile: dev/crypto.properties
      signatureUser: experian.sign
      mustUnderstand: false
      signatureParts: "{Content}{http://schemas.xmlsoap.org/soap/envelope/}Body;{Element}{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}UsernameToken;{Element}{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd}Timestamp;"
      signatureKeyId: DirectReference
      signatureAlgorithm: http://www.w3.org/2000/09/xmldsig#rsa-sha1

    ```    
* Data servlet: data to exposed the services rest
    ```yml
    server:
      servlet:
        context-path: /experian-rest
      port: 5000
    ```

Files to security
----------------
The project contains two files to consume the experian services into  esperian-rest/main/resources/%ENVIROMENT%/
* crypto.properties
    ```properties
    org.apache.ws.security.crypto.provider=org.apache.ws.security.components.crypto.Merlin
    org.apache.ws.security.crypto.merlin.keystore.type=jks
    org.apache.ws.security.crypto.merlin.keystore.password=experian
    org.apache.ws.security.crypto.merlin.keystore.alias=experian.sign
    org.apache.ws.security.crypto.merlin.file=C:/clientes/prueba/demo-servicesesb.jks
    ```
* JKS: this is the keystore to add the experian certificate and client certificate.

End points
----------
The endpoints are supplied by swagger. the url is *%SERVER%:%PORT%:/experian-rest/swagger-ui.html*

Stack
----------
the services were made with the next development stack

![](images/mockito.png)
![](images/spring.png)
![](images/swagger.png)

