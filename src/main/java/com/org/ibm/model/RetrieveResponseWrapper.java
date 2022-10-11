package com.org.ibm.model;

import java.util.List;
import org.springframework.util.MultiValueMap;
import org.springframework.util.LinkedMultiValueMap;

import org.springframework.http.ResponseEntity;
import com.org.ibm.model.RetrievePaymentExecutionProcedureResponse;


public class RetrieveResponseWrapper {

	private RetrievePaymentExecutionProcedureResponse response;
        
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
 
	public RetrievePaymentExecutionProcedureResponse getResponse(){
            return response;
	}
 
	public void setResponse(RetrievePaymentExecutionProcedureResponse response){
            this.response=response;
	}  
}
