package br.com.scala.finances.service;

import br.com.scala.finances.model.Account;
import br.com.scala.finances.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account save(Account account){
        return accountRepository.save(account);

    }

}
