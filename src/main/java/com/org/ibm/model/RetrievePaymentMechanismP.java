package com.org.ibm.model;

import org.springframework.http.ResponseEntity;
import com.org.ibm.model.RetrievePaymentMechanismResponse;

public class RetrievePaymentMechanismP {

    private String paymentexecutionId;
    private String paymentmechanismId;

    public RetrievePaymentMechanismP() {

    }

    public RetrievePaymentMechanismP(String paymentexecutionId,String paymentmechanismId) {
        this.paymentexecutionId = paymentexecutionId;
        this.paymentmechanismId = paymentmechanismId;
    }

    public String getPaymentexecutionId () {
        return paymentexecutionId;
    }

    public void setPaymentexecutionId (String paymentexecutionId) {
        this.paymentexecutionId = paymentexecutionId;
    }
    public String getPaymentmechanismId () {
        return paymentmechanismId;
    }

    public void setPaymentmechanismId (String paymentmechanismId) {
        this.paymentmechanismId = paymentmechanismId;
    }

}
