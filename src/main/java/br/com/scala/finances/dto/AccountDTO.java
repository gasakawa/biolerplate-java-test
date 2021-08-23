package br.com.scala.finances.dto;

import br.com.scala.finances.model.Account;
import lombok.Data;

@Data
public class AccountDTO {

    public AccountDTO(Account account){
        account_id = account.getAccount_id();
    }

    private Integer account_id;
}
