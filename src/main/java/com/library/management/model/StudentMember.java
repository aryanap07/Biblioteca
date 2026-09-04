package com.library.management.model;

import com.library.management.enums.MemberType;

public class StudentMember extends Member {

    private static final long serialVersionUID = 1L;

    private static final int MAX_BORROW_LIMIT = 3;
    private static final int LOAN_PERIOD_DAYS = 14;

    private String studentRollNumber;
    private String department;

    public StudentMember(
            String memberId,
            String name,
            String email,
            String phone,
            String studentRollNumber,
            String department
    ) {
        super(memberId, name, email, phone, MemberType.STUDENT);
        this.studentRollNumber = studentRollNumber;
        this.department = department;
    }

    public String getStudentRollNumber() {
        return studentRollNumber;
    }

    public void setStudentRollNumber(String studentRollNumber) {
        this.studentRollNumber = studentRollNumber;
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