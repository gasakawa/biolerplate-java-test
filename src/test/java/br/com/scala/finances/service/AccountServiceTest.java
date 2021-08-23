package br.com.scala.finances.service;

import br.com.scala.finances.model.Account;
import br.com.scala.finances.repository.AccountRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AccountServiceTest {

    @InjectMocks
    private AccountService accountServiceMock;

    @Mock
    private AccountRepository accountRepository;

    private Account accountMock(){
        return Account.builder()
                .user_id(1)
                .balance(25.50)
                .expense(20.00)
                .income(3.00)
                .build();
    }

    @Test
    public void saveTest(){
        Account accountMock = accountMock();
        Account expectedAccountMock = accountMock();
        expectedAccountMock.setAccount_id(1);
        Integer expectedId = 1;

        Mockito.when(accountRepository.save(Mockito.any(Account.class))).thenReturn(expectedAccountMock);

        Account retorno = accountServiceMock.save(accountMock);

        Assertions.assertThat(retorno).isNotNull();
        Assertions.assertThat(retorno.getAccount_id()).isEqualTo(expectedId);
    }
}
