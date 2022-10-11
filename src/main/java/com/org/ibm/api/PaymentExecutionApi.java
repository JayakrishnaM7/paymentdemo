/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
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
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@Validated
@Api(value = "PaymentExecution", description = "the PaymentExecution API")
public interface PaymentExecutionApi {
    

    @ApiOperation(value = "InCR Initiate a payment execution procedure", nickname = "initiate", notes = "InCR Initiate a payment execution procedure", response = InitiatePaymentExecutionProcedureResponse.class, tags={ "CR - PaymentExecutionProcedure", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = InitiatePaymentExecutionProcedureResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = HTTPError.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = HTTPError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = HTTPError.class),
        @ApiResponse(code = 404, message = "Not Found", response = HTTPError.class),
        @ApiResponse(code = 429, message = "Too Many Requests", response = HTTPError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = HTTPError.class) })
    @RequestMapping(value = "/PaymentExecution/Initiate",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InitiatePaymentExecutionProcedureResponse> initiate(@ApiParam(value = "" ,required=true )  @Valid @RequestBody InitiatePaymentExecutionProcedureRequest initiatePaymentExecutionProcedureRequest); 


    @ApiOperation(value = "ReCR Retrieve details about a payment execution instruction", nickname = "retrieve", notes = "ReCR Retrieve details about a payment execution instruction", response = RetrievePaymentExecutionProcedureResponse.class, tags={ "CR - PaymentExecutionProcedure", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = RetrievePaymentExecutionProcedureResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = HTTPError.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = HTTPError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = HTTPError.class),
        @ApiResponse(code = 404, message = "Not Found", response = HTTPError.class),
        @ApiResponse(code = 429, message = "Too Many Requests", response = HTTPError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = HTTPError.class) })
    @RequestMapping(value = "/PaymentExecution/{paymentexecutionId}/Retrieve",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<RetrievePaymentExecutionProcedureResponse> retrieve(@ApiParam(value = "",required=true) @PathVariable("paymentexecutionId") String paymentexecutionId); 


    @ApiOperation(value = "ReBQ Retrieve details about the gateway transaction", nickname = "retrievePaymentExecutionWorkstep", notes = "ReBQ Retrieve details about the gateway transaction", response = RetrievePaymentExecutionWorkstepResponse.class, tags={ "BQ - PaymentExecutionWorkstep", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = RetrievePaymentExecutionWorkstepResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = HTTPError.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = HTTPError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = HTTPError.class),
        @ApiResponse(code = 404, message = "Not Found", response = HTTPError.class),
        @ApiResponse(code = 429, message = "Too Many Requests", response = HTTPError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = HTTPError.class) })
    @RequestMapping(value = "/PaymentExecution/{paymentexecutionId}/PaymentExecutionWorkstep/{paymentexecutionworkstepId}/Retrieve",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<RetrievePaymentExecutionWorkstepResponse> retrievePaymentExecutionWorkstep(@ApiParam(value = "",required=true) @PathVariable("paymentexecutionId") String paymentexecutionId,@ApiParam(value = "",required=true) @PathVariable("paymentexecutionworkstepId") String paymentexecutionworkstepId); 


    @ApiOperation(value = "ReBQ Retrieve details about the payment mechanism selection", nickname = "retrievePaymentMechanism", notes = "ReBQ Retrieve details about the payment mechanism selection", response = RetrievePaymentMechanismResponse.class, tags={ "BQ - PaymentMechanism", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = RetrievePaymentMechanismResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = HTTPError.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = HTTPError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = HTTPError.class),
        @ApiResponse(code = 404, message = "Not Found", response = HTTPError.class),
        @ApiResponse(code = 429, message = "Too Many Requests", response = HTTPError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = HTTPError.class) })
    @RequestMapping(value = "/PaymentExecution/{paymentexecutionId}/PaymentMechanism/{paymentmechanismId}/Retrieve",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<RetrievePaymentMechanismResponse> retrievePaymentMechanism(@ApiParam(value = "",required=true) @PathVariable("paymentexecutionId") String paymentexecutionId,@ApiParam(value = "",required=true) @PathVariable("paymentmechanismId") String paymentmechanismId); 


    @ApiOperation(value = "UpCR Update details of a payment execution instruction", nickname = "update", notes = "UpCR Update details of a payment execution instruction", response = UpdatePaymentExecutionProcedureResponse.class, tags={ "CR - PaymentExecutionProcedure", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UpdatePaymentExecutionProcedureResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = HTTPError.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = HTTPError.class),
        @ApiResponse(code = 403, message = "Forbidden", response = HTTPError.class),
        @ApiResponse(code = 404, message = "Not Found", response = HTTPError.class),
        @ApiResponse(code = 429, message = "Too Many Requests", response = HTTPError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = HTTPError.class) })
    @RequestMapping(value = "/PaymentExecution/{paymentexecutionId}/Update",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<UpdatePaymentExecutionProcedureResponse> update(@ApiParam(value = "",required=true) @PathVariable("paymentexecutionId") String paymentexecutionId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody UpdatePaymentExecutionProcedureRequest updatePaymentExecutionProcedureRequest); 

}
