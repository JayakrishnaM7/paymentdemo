package com.org.ibm.model;

import org.springframework.http.ResponseEntity;
import com.org.ibm.model.RetrievePaymentExecutionWorkstepResponse;

public class RetrievePaymentExecutionWorkstepP {

    private String paymentexecutionId;
    private String paymentexecutionworkstepId;

    public RetrievePaymentExecutionWorkstepP() {

    }

    public RetrievePaymentExecutionWorkstepP(String paymentexecutionId,String paymentexecutionworkstepId) {
        this.paymentexecutionId = paymentexecutionId;
        this.paymentexecutionworkstepId = paymentexecutionworkstepId;
    }

    public String getPaymentexecutionId () {
        return paymentexecutionId;
    }

    public void setPaymentexecutionId (String paymentexecutionId) {
        this.paymentexecutionId = paymentexecutionId;
    }
    public String getPaymentexecutionworkstepId () {
        return paymentexecutionworkstepId;
    }

    public void setPaymentexecutionworkstepId (String paymentexecutionworkstepId) {
        this.paymentexecutionworkstepId = paymentexecutionworkstepId;
    }

}
