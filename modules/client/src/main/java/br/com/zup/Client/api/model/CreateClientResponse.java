package br.com.zup.Client.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Id;
import java.io.Serializable;

@Builder
@Getter
@ToString
@EqualsAndHashCode
public class CreateClientResponse implements Serializable {


    private static final long serialVersionUID = 2249988793210972399L;

    @JsonProperty("id")
    Long id;
}
