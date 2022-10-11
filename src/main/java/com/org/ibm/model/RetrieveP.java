package com.org.ibm.model;

import org.springframework.http.ResponseEntity;
import com.org.ibm.model.RetrievePaymentExecutionProcedureResponse;

public class RetrieveP {

    private String paymentexecutionId;

    public RetrieveP() {

    }

    public RetrieveP(String paymentexecutionId) {
        this.paymentexecutionId = paymentexecutionId;
    }

    public String getPaymentexecutionId () {
        return paymentexecutionId;
    }

    public void setPaymentexecutionId (String paymentexecutionId) {
        this.paymentexecutionId = paymentexecutionId;
    }

}
