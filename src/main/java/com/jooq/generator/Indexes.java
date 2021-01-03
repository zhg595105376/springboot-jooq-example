/*
 * This file is generated by jOOQ.
 */
package com.jooq.generator;


import com.jooq.generator.tables.Book;
import com.jooq.generator.tables.Fruit;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>jooq-test</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index BOOK_PRIMARY = Indexes0.BOOK_PRIMARY;
    public static final Index FRUIT_PRIMARY = Indexes0.FRUIT_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index BOOK_PRIMARY = Internal.createIndex("PRIMARY", Book.BOOK, new OrderField[] { Book.BOOK.ID }, true);
        public static Index FRUIT_PRIMARY = Internal.createIndex("PRIMARY", Fruit.FRUIT, new OrderField[] { Fruit.FRUIT.ID }, true);
    }
}