package com.tms.contract;

import java.util.Date;

/**
 * Child class of the Contract class
 * Contains info about particular finance invoices
 */
public class FinancialInvoice extends Contract {

    public int totalMonthSum;
    public String departmentCode;

    public FinancialInvoice() {
    }

    FinancialInvoice(String documentNumber, Date documentDate, int totalMonthSum, String departmentCode) {
        super(documentNumber, documentDate);
        this.totalMonthSum = totalMonthSum;
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "FinancialInvoice{" + departmentCode + " " +
                documentNumber + " from " +
                documentDate + ": " +
                totalMonthSum + "$}";
    }
}
