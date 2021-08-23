package br.com.scala.finances.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity(name="TRANSACTIONS")
@Data
public class Transaction {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer transaction_id;

    @Column(nullable = false)
    private Integer account_id;

    private Double value;

    private Date created_at;
}
