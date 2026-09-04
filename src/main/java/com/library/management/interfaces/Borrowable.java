package com.library.management.interfaces;

public interface Borrowable {

    boolean borrowBook(String bookId);

    boolean returnBook(String bookId);

    int getMaxBorrowLimit();
}