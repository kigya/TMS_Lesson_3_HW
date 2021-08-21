package com.tms.registry;

import com.tms.contract.Contract;

/**
 * Interface that declares methods for adding a document to an array and retrieving contract data
 */
public interface IDocumentRegistration {

    void saveDocumentInRegister(Contract contract);

    String getDocumentInfo(Contract contract);

}
