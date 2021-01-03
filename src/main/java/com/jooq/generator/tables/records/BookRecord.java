/*
 * This file is generated by jOOQ.
 */
package com.jooq.generator.tables.records;


import com.jooq.generator.tables.Book;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class BookRecord extends UpdatableRecordImpl<BookRecord> implements Record3<Long, String, BigDecimal> {

    private static final long serialVersionUID = -347683927;

    /**
     * Setter for <code>jooq-test.book.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>jooq-test.book.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>jooq-test.book.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jooq-test.book.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jooq-test.book.price</code>.
     */
    public void setPrice(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>jooq-test.book.price</code>.
     */
    public BigDecimal getPrice() {
        return (BigDecimal) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, BigDecimal> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, String, BigDecimal> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Book.BOOK.ID;
    }

    @Override
    public Field<String> field2() {
        return Book.BOOK.NAME;
    }

    @Override
    public Field<BigDecimal> field3() {
        return Book.BOOK.PRICE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public BigDecimal component3() {
        return getPrice();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public BigDecimal value3() {
        return getPrice();
    }

    @Override
    public BookRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public BookRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public BookRecord value3(BigDecimal value) {
        setPrice(value);
        return this;
    }

    @Override
    public BookRecord values(Long value1, String value2, BigDecimal value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BookRecord
     */
    public BookRecord() {
        super(Book.BOOK);
    }

    /**
     * Create a detached, initialised BookRecord
     */
    public BookRecord(Long id, String name, BigDecimal price) {
        super(Book.BOOK);

        set(0, id);
        set(1, name);
        set(2, price);
    }
}
