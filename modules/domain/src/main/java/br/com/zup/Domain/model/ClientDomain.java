package br.com.zup.Domain.model;

import br.com.zup.Domain.exception.ClientBadRequest;
import lombok.*;

import java.io.Serializable;

@Builder(builderMethodName = "hiddenBuilder")
@Getter
@ToString
@EqualsAndHashCode
public class ClientDomain implements Serializable {

    private static final long serialVersionUID = -3220698134518194444L;

    Long id;

    String name;

    Integer age;

    Float bankAccount;

    public static ClientDomainBuilder builder(String name, Integer age, Float bankAccount) throws ClientBadRequest {

        if(name.length() <= 4) {
            throw new ClientBadRequest("Your name need four or more characters ");
        } else if(age < 18){
            throw new ClientBadRequest("Minimum age is 18");
        } else if (bankAccount == null) {
            throw new ClientBadRequest("The Bank Account can not null");
        }

        return hiddenBuilder().name(name).age(age).bankAccount(bankAccount);
    }
}
