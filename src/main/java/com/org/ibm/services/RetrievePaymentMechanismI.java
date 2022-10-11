package com.org.ibm.services;

import com.org.ibm.model.RetrievePaymentMechanismP;
import com.org.ibm.model.RetrievePaymentMechanismResponseWrapper;

public interface RetrievePaymentMechanismI {

    public RetrievePaymentMechanismResponseWrapper execute(RetrievePaymentMechanismP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
