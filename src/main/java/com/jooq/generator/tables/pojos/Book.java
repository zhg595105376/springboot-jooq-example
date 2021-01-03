/*
 * This file is generated by jOOQ.
 */
package com.jooq.generator.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Book implements Serializable {

    private static final long serialVersionUID = -1437310811;

    private Long       id;
    private String     name;
    private BigDecimal price;

    public Book() {}

    public Book(Book value) {
        this.id = value.id;
        this.name = value.name;
        this.price = value.price;
    }

    public Book(
        Long       id,
        String     name,
        BigDecimal price
    ) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Book (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(price);

        sb.append(")");
        return sb.toString();
    }
}
