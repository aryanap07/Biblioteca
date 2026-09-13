package com.library.management.model;

import com.library.management.enums.MemberType;

public class Librarian extends Member {

    private static final long serialVersionUID = 1L;

    private static final int MAX_BORROW_LIMIT = 20;
    private static final int LOAN_PERIOD_DAYS = 60;

    private String staffId;

    public Librarian(
            String memberId,
            String name,
            String email,
            String phone,
            String staffId
    ) {
        super(memberId, name, email, phone, MemberType.LIBRARIAN);
        this.staffId = staffId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    @Override
    public int getMaxBorrowLimit() {
        return MAX_BORROW_LIMIT;
    }

    @Override
    public int getLoanPeriodDays() {
        return LOAN_PERIOD_DAYS;
    }
}
