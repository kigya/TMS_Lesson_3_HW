package com.tms.registry;

import com.tms.contract.Contract;

/**
 * Methods implementation of the interface
 */
public class Register implements IDocumentRegistration {

    public Contract[] documentsArray = new Contract[10];
    int counter = 0;

    @Override
    public void saveDocumentInRegister(Contract contract) {
        if (counter < documentsArray.length) {
            documentsArray[counter] = contract;
            counter++;
        } else {
            System.out.println("Error! The limit of documents has been reached!");
        }
    }

    @Override
    public String getDocumentInfo(Contract contract) {
        return contract.toString();
    }
}
