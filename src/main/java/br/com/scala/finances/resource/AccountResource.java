package br.com.scala.finances.resource;

import br.com.scala.finances.dto.AccountDTO;
import br.com.scala.finances.model.Account;
import br.com.scala.finances.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/account")
public class AccountResource {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public ResponseEntity<AccountDTO> save(@RequestBody Account account){
        AccountDTO dto = new AccountDTO(accountService.save(account));
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
}
