/*
 * This file is generated by jOOQ.
 */
package com.jooq.generator.tables.daos;


import com.jooq.generator.tables.Book;
import com.jooq.generator.tables.records.BookRecord;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


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
@Repository
public class BookDao extends DAOImpl<BookRecord, com.jooq.generator.tables.pojos.Book, Long> {

    /**
     * Create a new BookDao without any configuration
     */
    public BookDao() {
        super(Book.BOOK, com.jooq.generator.tables.pojos.Book.class);
    }

    /**
     * Create a new BookDao with an attached configuration
     */
    @Autowired
    public BookDao(Configuration configuration) {
        super(Book.BOOK, com.jooq.generator.tables.pojos.Book.class, configuration);
    }

    @Override
    public Long getId(com.jooq.generator.tables.pojos.Book object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.generator.tables.pojos.Book> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Book.BOOK.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.jooq.generator.tables.pojos.Book> fetchById(Long... values) {
        return fetch(Book.BOOK.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.jooq.generator.tables.pojos.Book fetchOneById(Long value) {
        return fetchOne(Book.BOOK.ID, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.generator.tables.pojos.Book> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Book.BOOK.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.jooq.generator.tables.pojos.Book> fetchByName(String... values) {
        return fetch(Book.BOOK.NAME, values);
    }

    /**
     * Fetch records that have <code>price BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.generator.tables.pojos.Book> fetchRangeOfPrice(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(Book.BOOK.PRICE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>price IN (values)</code>
     */
    public List<com.jooq.generator.tables.pojos.Book> fetchByPrice(BigDecimal... values) {
        return fetch(Book.BOOK.PRICE, values);
    }
}