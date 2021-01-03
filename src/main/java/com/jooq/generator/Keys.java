/*
 * This file is generated by jOOQ.
 */
package com.jooq.generator;


import com.jooq.generator.tables.Book;
import com.jooq.generator.tables.Fruit;
import com.jooq.generator.tables.records.BookRecord;
import com.jooq.generator.tables.records.FruitRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>jooq-test</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<BookRecord, Long> IDENTITY_BOOK = Identities0.IDENTITY_BOOK;
    public static final Identity<FruitRecord, Long> IDENTITY_FRUIT = Identities0.IDENTITY_FRUIT;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = UniqueKeys0.KEY_BOOK_PRIMARY;
    public static final UniqueKey<FruitRecord> KEY_FRUIT_PRIMARY = UniqueKeys0.KEY_FRUIT_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<BookRecord, Long> IDENTITY_BOOK = Internal.createIdentity(Book.BOOK, Book.BOOK.ID);
        public static Identity<FruitRecord, Long> IDENTITY_FRUIT = Internal.createIdentity(Fruit.FRUIT, Fruit.FRUIT.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = Internal.createUniqueKey(Book.BOOK, "KEY_book_PRIMARY", Book.BOOK.ID);
        public static final UniqueKey<FruitRecord> KEY_FRUIT_PRIMARY = Internal.createUniqueKey(Fruit.FRUIT, "KEY_fruit_PRIMARY", Fruit.FRUIT.ID);
    }
}
