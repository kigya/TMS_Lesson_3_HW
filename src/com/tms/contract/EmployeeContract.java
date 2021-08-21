package com.tms.contract;

import java.util.Date;

/**
 * Child class of the Contract class
 * Contains info about some employs contracts
 */
public class EmployeeContract extends Contract {

    public Date contractExpirationDate;
    public String employeeName;

    public EmployeeContract() {
    }

    public EmployeeContract(String documentNumber, Date documentDate, Date contractExpirationDate, String employeeName) {
        super(documentNumber, documentDate);
        this.contractExpirationDate = contractExpirationDate;
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "EmployeeContract{" + employeeName + " " +
                documentNumber + " from " +
                documentDate + " to " +
                contractExpirationDate + "}";
    }
}
