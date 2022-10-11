package com.org.ibm.api;

import com.org.ibm.model.HTTPError;
import com.org.ibm.model.InitiatePaymentExecutionProcedureRequest;
import com.org.ibm.model.InitiatePaymentExecutionProcedureResponse;
import com.org.ibm.model.RetrievePaymentExecutionProcedureResponse;
import com.org.ibm.model.RetrievePaymentExecutionWorkstepResponse;
import com.org.ibm.model.RetrievePaymentMechanismResponse;
import com.org.ibm.model.UpdatePaymentExecutionProcedureRequest;
import com.org.ibm.model.UpdatePaymentExecutionProcedureResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.org.ibm.services.InitiateI;
import com.org.ibm.model.InitiateP;
import com.org.ibm.model.InitiateResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.org.ibm.services.UpdateI;
import com.org.ibm.model.UpdateP;
import com.org.ibm.model.UpdateResponseWrapper;
import com.org.ibm.services.RetrieveI;
import com.org.ibm.model.RetrieveP;
import com.org.ibm.model.RetrieveResponseWrapper;
import com.org.ibm.services.RetrievePaymentMechanismI;
import com.org.ibm.model.RetrievePaymentMechanismP;
import com.org.ibm.model.RetrievePaymentMechanismResponseWrapper;
import com.org.ibm.services.RetrievePaymentExecutionWorkstepI;
import com.org.ibm.model.RetrievePaymentExecutionWorkstepP;
import com.org.ibm.model.RetrievePaymentExecutionWorkstepResponseWrapper;

@RestController
public class PaymentExecutionApiController implements PaymentExecutionApi {

	@Autowired
	RetrievePaymentExecutionWorkstepI retrievePaymentExecutionWorkstepI;


	@Autowired
	RetrievePaymentMechanismI retrievePaymentMechanismI;


	@Autowired
	RetrieveI retrieveI;


	@Autowired
	UpdateI updateI;


	@Autowired
	InitiateI initiateI;


    public ResponseEntity<InitiatePaymentExecutionProcedureResponse> initiate(@ApiParam(value = "" ,required=true )  @Valid @RequestBody InitiatePaymentExecutionProcedureRequest initiatePaymentExecutionProcedureRequest){
        
        InitiateResponseWrapper res  = initiateI.execute(new InitiateP(initiatePaymentExecutionProcedureRequest));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<RetrievePaymentExecutionProcedureResponse> retrieve(@ApiParam(value = "",required=true) @PathVariable("paymentexecutionId") String paymentexecutionId){
        
        RetrieveResponseWrapper res  = retrieveI.execute(new RetrieveP(paymentexecutionId));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<RetrievePaymentExecutionWorkstepResponse> retrievePaymentExecutionWorkstep(@ApiParam(value = "",required=true) @PathVariable("paymentexecutionId") String paymentexecutionId,@ApiParam(value = "",required=true) @PathVariable("paymentexecutionworkstepId") String paymentexecutionworkstepId){
        
        RetrievePaymentExecutionWorkstepResponseWrapper res  = retrievePaymentExecutionWorkstepI.execute(new RetrievePaymentExecutionWorkstepP(paymentexecutionId, paymentexecutionworkstepId));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<RetrievePaymentMechanismResponse> retrievePaymentMechanism(@ApiParam(value = "",required=true) @PathVariable("paymentexecutionId") String paymentexecutionId,@ApiParam(value = "",required=true) @PathVariable("paymentmechanismId") String paymentmechanismId){
        
        RetrievePaymentMechanismResponseWrapper res  = retrievePaymentMechanismI.execute(new RetrievePaymentMechanismP(paymentexecutionId, paymentmechanismId));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<UpdatePaymentExecutionProcedureResponse> update(@ApiParam(value = "",required=true) @PathVariable("paymentexecutionId") String paymentexecutionId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody UpdatePaymentExecutionProcedureRequest updatePaymentExecutionProcedureRequest){
        
        UpdateResponseWrapper res  = updateI.execute(new UpdateP(paymentexecutionId, updatePaymentExecutionProcedureRequest));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

}
