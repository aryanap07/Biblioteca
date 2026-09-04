package com.library.management.model;

import com.library.management.enums.MemberType;

public class FacultyMember extends Member {

    private static final long serialVersionUID = 1L;

    private static final int MAX_BORROW_LIMIT = 10;
    private static final int LOAN_PERIOD_DAYS = 30;

    private String employeeId;
    private String department;

    public FacultyMember(
            String memberId,
            String name,
            String email,
            String phone,
            String employeeId,
            String department
    ) {
        super(memberId, name, email, phone, MemberType.FACULTY);
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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