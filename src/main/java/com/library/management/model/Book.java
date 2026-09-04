package com.library.management.model;

import com.library.management.enums.BookStatus;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    private String bookId;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private int publicationYear;
    private String category;
    private BookStatus status;
    private int totalCopies;
    private int availableCopies;

    public Book(
            String bookId,
            String isbn,
            String title,
            String author,
            String publisher,
            int publicationYear,
            String category,
            int totalCopies
    ) {
        this.bookId = bookId;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.category = category;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
        updateStatus();
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
        if (availableCopies > totalCopies) {
            availableCopies = totalCopies;
        }
        updateStatus();
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = Math.max(0, Math.min(availableCopies, totalCopies));
        updateStatus();
    }

    public boolean isAvailable() {
        return availableCopies > 0 && status != BookStatus.LOST;
    }

    public void borrowCopy() {
        if (availableCopies > 0) {
            availableCopies--;
            updateStatus();
        }
    }

    public void returnCopy() {
        if (availableCopies < totalCopies) {
            availableCopies++;
            updateStatus();
        }
    }

    private void updateStatus() {
        if (status == BookStatus.LOST) {
            return;
        }

        status = availableCopies > 0
                ? BookStatus.AVAILABLE
                : BookStatus.BORROWED;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Book book)) {
            return false;
        }

        return Objects.equals(bookId, book.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId);
    }

    @Override
    public String toString() {
        return String.format(
                "[%s] \"%s\" by %s (%d) - %s - Available: %d/%d",
                bookId,
                title,
                author,
                publicationYear,
                status,
                availableCopies,
                totalCopies
        );
    }
}