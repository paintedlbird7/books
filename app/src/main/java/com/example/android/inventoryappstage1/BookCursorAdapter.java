package com.example.android.inventoryappstage1;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.example.android.inventoryappstage1.data.BookContract;

/**
 * {@link BookCursorAdapter} is an adapter for a list or grid view
 * that uses a {@link Cursor} of book data as its data source. This adapter knows
 * how to create list items for each row of book data in the {@link Cursor}.
 */
public class BookCursorAdapter extends CursorAdapter {

    /**
     * Constructs a new {@link BookCursorAdapter}.
     *
     * @param context The context
     * @param c       The cursor from which to get the data.
     */
    public BookCursorAdapter(Context context, Cursor c) {
        super(context, c, 0 /* flags */);
    }

    /**
     * Makes a new blank list item view. No data is set (or bound) to the views yet.
     *
     * @param context app context
     * @param cursor  The cursor from which to get the data. The cursor is already
     *                moved to the correct position.
     * @param parent  The parent to which the new view is attached to
     * @return the newly created list item view.
     */
    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        // Inflate a list item view using the layout specified in list_item.xml
        return LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
    }

    /**
     * This method binds the book data (in the current row pointed to by cursor) to the given
     * list item layout. For example, the name for the current book can be set on the name TextView
     * in the list item layout.
     *
     * @param view    Existing view, returned earlier by newView() method
     * @param context app context
     * @param cursor  The cursor from which to get the data. The cursor is already moved to the
     *                correct row.
     */
    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        // Find individual views that we want to modify in the list item layout
        TextView nameTextView = (TextView) view.findViewById(R.id.name);
        //TextView priceTextView = (TextView) view.findViewById(R.id.price);
        //TextView quantityTextView = (TextView) view.findViewById(R.id.quantity);
        TextView supplierTextView = (TextView) view.findViewById(R.id.supplier);
        //TextView phoneTextView = (TextView) view.findViewById(R.id.phone);
        TextView summaryTextView = (TextView) view.findViewById(R.id.summary);

        // Find the columns of book attributes that we're interested in
        int nameColumnIndex = cursor.getColumnIndex(BookContract.BookEntry.COLUMN_BOOK_NAME);
        int priceColumnIndex = cursor.getColumnIndex(BookContract.BookEntry.COLUMN_BOOK_PRICE);
        int quantityColumnIndex = cursor.getColumnIndex(BookContract.BookEntry.COLUMN_BOOK_QUANTITY);
        int supplierColumnIndex = cursor.getColumnIndex(BookContract.BookEntry.COLUMN_BOOK_SUPPLIER);
        int phoneColumnIndex = cursor.getColumnIndex(BookContract.BookEntry.COLUMN_BOOK_PHONE);


        // Read the book attributes from the Cursor for the current book
        String bookName = cursor.getString(nameColumnIndex);
        String bookPrice = cursor.getString(priceColumnIndex);
        String bookQuantity = cursor.getString(quantityColumnIndex);
        //String bookSupplier = cursor.getString(supplierColumnIndex);
        String bookPhone = cursor.getString(phoneColumnIndex);

        // If the book name is empty string or null, then use some default text
        // that says "Unknown name", so the TextView isn't blank.
//        if (TextUtils.isEmpty(bookName)) {
//            bookName = context.getString(R.string.unknown_book);

            // Update the TextViews with the attributes for the current book
            nameTextView.setText(bookName);
//            priceTextView.setText(bookPrice);
//            quantityTextView.setText(bookQuantity);
            //summaryTextView.setText(bookSummary);
            //supplierTextView.setText(bookSupplier);
            //phoneTextView.setText(bookPhone);
        }
    }



//    public void bindView(View view, Context context, Cursor cursor) {
//        TextView nameTextView = (TextView) view.findViewById(R.id.name);
//                TextView summaryTextView = (TextView) view.findViewById(R.id.summary);
//
//        // Find the columns of book attributes that we're interested in
//        int nameColumnIndex = cursor.getColumnIndex(BookContract.BookEntry.COLUMN_BOOK_NAME);
//        int priceColumnIndex = cursor.getColumnIndex(BookContract.BookEntry.COLUMN_BOOK_PRICE);
//
//        // Read the book attributes from the Cursor for the current book
//        String bookName = cursor.getString(nameColumnIndex);
//        String bookPrice = cursor.getString(priceColumnIndex);
//
//        // If the pet breed is empty string or null, then use some default text
//        // that says "Unknown breed", so the TextView isn't blank.
//        if (TextUtils.isEmpty(bookPrice)) {
//            bookPrice = context.getString(R.string.unknown_price);
//
//            // Update the TextViews with the attributes for the current pet
//        nameTextView.setText(bookName);
//        summaryTextView.setText(bookPrice);
//  }
//        }
//
//    }