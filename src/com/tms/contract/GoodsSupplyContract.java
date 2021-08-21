package com.tms.contract;

import java.util.Date;

/**
 * Child class of the Contract class
 * Contains info about contracts of some good supplies to
 */
public class GoodsSupplyContract extends Contract {

    public String goodsType;
    public int goodsAmount;

    public GoodsSupplyContract() {
    }

    GoodsSupplyContract(String documentNumber, Date documentDate, String goodsType, int goodsAmount) {
        super(documentNumber, documentDate);
        this.goodsType = goodsType;
        this.goodsAmount = goodsAmount;
    }

    @Override
    public String toString() {
        return "GoodsSupplyContract{" + goodsType + " " +
                goodsAmount + "kg " +
                documentNumber + " from " +
                documentDate + "}";
    }
}
