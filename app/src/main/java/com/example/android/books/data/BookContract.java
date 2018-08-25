package com.example.android.books.data;

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
     * Each entry in the table represents a single pet.
     */
    public static final class BookEntry implements BaseColumns {

        /** Name of database table for pets */
        public final static String TABLE_NAME = "books";

        /**
         * Unique ID number for the pet (only for use in the database table).
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        //
//        /**
//         * Breed of the pet.
//         *
//         * Type: TEXT
//         */
//        public final static String COLUMN_BOOK_AUTHOR = "author";

        /**
         * Name of the pet.
         *
         * Type: TEXT
         */
        public final static String COLUMN_BOOK_NAME ="name";

        public final static String COLUMN_BOOK_SUPPLIER = "supplier";

        public final static String COLUMN_BOOK_PHONE = "phone";

        public final static String COLUMN_BOOK_PRICE ="price";

        public final static String COLUMN_BOOK_QUANTITY ="quantity";


//        /**
//         * Possible values for the gender of the pet.
//         */
//        public static final int GENDER_UNKNOWN = 0;
//        public static final int GENDER_MALE = 1;
//        public static final int GENDER_FEMALE = 2;
    }

}

