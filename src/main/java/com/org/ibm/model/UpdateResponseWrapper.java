package com.org.ibm.model;

import java.util.List;
import org.springframework.util.MultiValueMap;
import org.springframework.util.LinkedMultiValueMap;

import com.org.ibm.model.UpdatePaymentExecutionProcedureRequest;
import org.springframework.http.ResponseEntity;
import com.org.ibm.model.UpdatePaymentExecutionProcedureResponse;


public class UpdateResponseWrapper {

	private UpdatePaymentExecutionProcedureResponse response;
        
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
 
	public UpdatePaymentExecutionProcedureResponse getResponse(){
            return response;
	}
 
	public void setResponse(UpdatePaymentExecutionProcedureResponse response){
            this.response=response;
	}  
}
