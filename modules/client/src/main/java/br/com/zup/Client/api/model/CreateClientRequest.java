package br.com.zup.Client.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Builder
@Getter
@ToString
@EqualsAndHashCode
public class CreateClientRequest implements Serializable {

    @NotBlank(message = "The name can't be null or empty")
    @JsonProperty("name")
    String name;

    @NotNull(message = "The age can't be null")
    @JsonProperty("age")
    Integer age;

    @NotBlank(message = "The city can't be null or empty")
    @JsonProperty("city")
    String city;

    @JsonProperty("bankAccount")
    Float bankAccount;
}
