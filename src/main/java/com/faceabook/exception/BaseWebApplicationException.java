package com.faceabook.exception;

import com.faceabook.response.error.ErrorResponse;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by vivekdwivedi on 9/20/2017.
 */
public class BaseWebApplicationException extends WebApplicationException{

    private final int mStatus;
    private final String mErrorMessage;
    private final String mDeveloperMessage;

    public BaseWebApplicationException(int httpStatus, String errorMessage, String developerMessage){
        this.mStatus = httpStatus;
        this.mErrorMessage = errorMessage;
        this.mDeveloperMessage = developerMessage;
    }

    @Override
    public Response getResponse() {
        return Response.status(mStatus).type(MediaType.APPLICATION_JSON_TYPE).entity(getErrorResponse()).build();
    }

    @Override
    public String getMessage() {
        return mErrorMessage;
    }

    public ErrorResponse getErrorResponse() {
        ErrorResponse response = new ErrorResponse();
        response.setApplicationMessage(mDeveloperMessage);
        response.setConsumerMessage(mErrorMessage);
        return response;
    }
}
