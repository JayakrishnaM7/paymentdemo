package com.org.ibm.services.impl;
 
import java.util.*;
 
import com.org.ibm.model.RetrievePaymentMechanismP;
import com.org.ibm.model.RetrievePaymentMechanismResponseWrapper;
import com.org.ibm.services.RetrievePaymentMechanismI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class RetrievePaymentMechanismImpl implements RetrievePaymentMechanismI {
 
    private static final Log logger = LogFactory.getLog(RetrievePaymentMechanismImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public RetrievePaymentMechanismResponseWrapper execute(RetrievePaymentMechanismP requestParams){
        //TODO
        return new RetrievePaymentMechanismResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
