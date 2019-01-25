package br.com.zup.Client.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
    @Builder
    @Getter
    @ToString
    @EqualsAndHashCode
    public class FindAllClientsResponse implements Serializable {


        private static final long serialVersionUID = 2249988793210972399L;

        @JsonProperty("name")
        String name;

        @JsonProperty("age")
        Integer age;

        @JsonProperty("bankAccount")
        Float bankAccount;
    }