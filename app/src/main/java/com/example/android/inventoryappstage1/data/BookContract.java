package com.example.android.inventoryappstage1.data;

import android.provider.BaseColumns;

/**
 * API Contract for the Books app.
 */
public final class BookContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private BookContract() {}

    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents a single book.
     */
    public static final class BookEntry implements BaseColumns {

        /** Name of database table for pets */
        public final static String TABLE_NAME = "books";

        /**
         * Unique ID number for the book (only for use in the database table).
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;



        /**
         * Name of the book.
         *
         * Type: TEXT
         */
        public final static String COLUMN_BOOK_NAME ="name";

        public final static String COLUMN_BOOK_SUPPLIER = "supplier";

        public final static String COLUMN_BOOK_PHONE = "phone";

        public final static String COLUMN_BOOK_PRICE ="price";

        public final static String COLUMN_BOOK_QUANTITY ="quantity";

    }

}

