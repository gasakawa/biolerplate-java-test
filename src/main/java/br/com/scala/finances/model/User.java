package br.com.scala.finances.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="USERS")
@Data
public class User {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer user_id;

    private String name;

    private String email;
}
