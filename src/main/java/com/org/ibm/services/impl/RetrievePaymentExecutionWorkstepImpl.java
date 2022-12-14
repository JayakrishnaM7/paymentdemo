package com.org.ibm.services.impl;
 
import java.util.*;
 
import com.org.ibm.model.RetrievePaymentExecutionWorkstepP;
import com.org.ibm.model.RetrievePaymentExecutionWorkstepResponseWrapper;
import com.org.ibm.services.RetrievePaymentExecutionWorkstepI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class RetrievePaymentExecutionWorkstepImpl implements RetrievePaymentExecutionWorkstepI {
 
    private static final Log logger = LogFactory.getLog(RetrievePaymentExecutionWorkstepImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public RetrievePaymentExecutionWorkstepResponseWrapper execute(RetrievePaymentExecutionWorkstepP requestParams){
        //TODO
        return new RetrievePaymentExecutionWorkstepResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
