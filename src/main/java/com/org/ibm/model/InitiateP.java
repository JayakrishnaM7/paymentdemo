package com.org.ibm.model;

import com.org.ibm.model.InitiatePaymentExecutionProcedureRequest;
import org.springframework.http.ResponseEntity;
import com.org.ibm.model.InitiatePaymentExecutionProcedureResponse;

public class InitiateP {

    private InitiatePaymentExecutionProcedureRequest initiatePaymentExecutionProcedureRequest;

    public InitiateP() {

    }

    public InitiateP(InitiatePaymentExecutionProcedureRequest initiatePaymentExecutionProcedureRequest) {
        this.initiatePaymentExecutionProcedureRequest = initiatePaymentExecutionProcedureRequest;
    }

    public InitiatePaymentExecutionProcedureRequest getInitiatePaymentExecutionProcedureRequest () {
        return initiatePaymentExecutionProcedureRequest;
    }

    public void setInitiatePaymentExecutionProcedureRequest (InitiatePaymentExecutionProcedureRequest initiatePaymentExecutionProcedureRequest) {
        this.initiatePaymentExecutionProcedureRequest = initiatePaymentExecutionProcedureRequest;
    }

}
