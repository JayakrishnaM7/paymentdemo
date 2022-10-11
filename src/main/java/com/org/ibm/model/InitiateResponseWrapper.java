package com.org.ibm.model;

import java.util.List;
import org.springframework.util.MultiValueMap;
import org.springframework.util.LinkedMultiValueMap;

import com.org.ibm.model.InitiatePaymentExecutionProcedureRequest;
import org.springframework.http.ResponseEntity;
import com.org.ibm.model.InitiatePaymentExecutionProcedureResponse;


public class InitiateResponseWrapper {

	private InitiatePaymentExecutionProcedureResponse response;
        
        private MultiValueMap<String,String> headers = new LinkedMultiValueMap<>();

        public MultiValueMap<String, String> getHeaders(){
            return this.headers;
	}

	public void setHeaders(MultiValueMap<String,String> headers){
            this.headers = headers;
	}
        
        public void addHeaders(String header, List<String> value) {
            headers.put(header, value);
        }
 
	public InitiatePaymentExecutionProcedureResponse getResponse(){
            return response;
	}
 
	public void setResponse(InitiatePaymentExecutionProcedureResponse response){
            this.response=response;
	}  
}
