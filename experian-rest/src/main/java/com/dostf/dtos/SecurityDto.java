package com.dostf.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SecurityDto {
    private String uri;
    private Class<?> serviceClass;
    private boolean logRequest;
    private boolean logResponse;
}
