package br.com.scala.finances.model;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity(name="ACCOUNTS")
@Data
@Builder
public class Account {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer account_id;

    @Column(nullable = false)
    private Integer user_id;

    private Double balance;

    private Double income;

    private Double expense;
}
