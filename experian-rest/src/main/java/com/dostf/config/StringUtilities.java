package com.dostf.config;

import org.json.JSONException;
import org.json.XML;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class StringUtilities {

    public static final String REGEX_REPLACE = "&lt;";
    public static final String REPLACEMENT = "<";

    public String xmlToJson(String xmlResponse) throws JSONException {
        return Optional.ofNullable(XML.toJSONObject(
                replaceXml(xmlResponse)).toString(4)).
                orElseThrow(() -> new JSONException("Error al convertir el xml"));
    }

    private String replaceXml(String xmlResponse) {
        return xmlResponse.replaceAll(REGEX_REPLACE, REPLACEMENT);
    }

}
