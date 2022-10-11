package com.org.ibm.services;

import com.org.ibm.model.RetrievePaymentExecutionWorkstepP;
import com.org.ibm.model.RetrievePaymentExecutionWorkstepResponseWrapper;

public interface RetrievePaymentExecutionWorkstepI {

    public RetrievePaymentExecutionWorkstepResponseWrapper execute(RetrievePaymentExecutionWorkstepP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
