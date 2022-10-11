package com.org.ibm.model;

import java.util.List;
import org.springframework.util.MultiValueMap;
import org.springframework.util.LinkedMultiValueMap;

import org.springframework.http.ResponseEntity;
import com.org.ibm.model.RetrievePaymentExecutionWorkstepResponse;


public class RetrievePaymentExecutionWorkstepResponseWrapper {

	private RetrievePaymentExecutionWorkstepResponse response;
        
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
 
	public RetrievePaymentExecutionWorkstepResponse getResponse(){
            return response;
	}
 
	public void setResponse(RetrievePaymentExecutionWorkstepResponse response){
            this.response=response;
	}  
}
