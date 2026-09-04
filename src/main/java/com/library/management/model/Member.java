package com.library.management.model;

import com.library.management.enums.MemberType;
import com.library.management.interfaces.Borrowable;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Member implements Borrowable, Serializable {

    private static final long serialVersionUID = 1L;

    private String memberId;
    private String name;
    private String email;
    private String phone;
    private LocalDate joinDate;
    private MemberType memberType;
    private List<String> borrowedBookIds;

    protected Member(
            String memberId,
            String name,
            String email,
            String phone,
            MemberType memberType
    ) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.joinDate = LocalDate.now();
        this.memberType = memberType;
        this.borrowedBookIds = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public MemberType getMemberType() {
        return memberType;
    }

    public List<String> getBorrowedBookIds() {
        return new ArrayList<>(borrowedBookIds);
    }

    public int getCurrentBorrowedCount() {
        return borrowedBookIds.size();
    }

    @Override
    public boolean borrowBook(String bookId) {
        if (bookId == null || borrowedBookIds.contains(bookId)) {
            return false;
        }

        if (borrowedBookIds.size() >= getMaxBorrowLimit()) {
            return false;
        }

        return borrowedBookIds.add(bookId);
    }

    @Override
    public boolean returnBook(String bookId) {
        return borrowedBookIds.remove(bookId);
    }

    public abstract int getMaxBorrowLimit();

    public abstract int getLoanPeriodDays();

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Member member)) {
            return false;
        }

        return Objects.equals(memberId, member.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId);
    }

    @Override
    public String toString() {
        return String.format(
                "[%s] %s (%s) - %s - Borrowed: %d/%d",
                memberId,
                name,
                memberType,
                email,
                getCurrentBorrowedCount(),
                getMaxBorrowLimit()
        );
    }
}