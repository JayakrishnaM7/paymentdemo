package com.org.ibm.model;

import com.org.ibm.model.UpdatePaymentExecutionProcedureRequest;
import org.springframework.http.ResponseEntity;
import com.org.ibm.model.UpdatePaymentExecutionProcedureResponse;

public class UpdateP {

    private String paymentexecutionId;
    private UpdatePaymentExecutionProcedureRequest updatePaymentExecutionProcedureRequest;

    public UpdateP() {

    }

    public UpdateP(String paymentexecutionId,UpdatePaymentExecutionProcedureRequest updatePaymentExecutionProcedureRequest) {
        this.paymentexecutionId = paymentexecutionId;
        this.updatePaymentExecutionProcedureRequest = updatePaymentExecutionProcedureRequest;
    }

    public String getPaymentexecutionId () {
        return paymentexecutionId;
    }

    public void setPaymentexecutionId (String paymentexecutionId) {
        this.paymentexecutionId = paymentexecutionId;
    }
    public UpdatePaymentExecutionProcedureRequest getUpdatePaymentExecutionProcedureRequest () {
        return updatePaymentExecutionProcedureRequest;
    }

    public void setUpdatePaymentExecutionProcedureRequest (UpdatePaymentExecutionProcedureRequest updatePaymentExecutionProcedureRequest) {
        this.updatePaymentExecutionProcedureRequest = updatePaymentExecutionProcedureRequest;
    }

}
