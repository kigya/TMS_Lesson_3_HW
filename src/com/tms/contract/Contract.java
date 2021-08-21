package com.tms.contract;

import java.util.Date;

/**
 * Parent abstract class for classes EmployeeContract, FinancialInvoice, GoodsSupplyContract
 */
public abstract class Contract extends Date {

    public String documentNumber;
    public Date documentDate;

    Contract() {
    }

    Contract(String documentNumber, Date documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }
}
