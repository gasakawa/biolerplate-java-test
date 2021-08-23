package br.com.scala.finances.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="CATEGORIES")
@Data
public class Category {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer category_id;

    private String name;

    private char type;
}
