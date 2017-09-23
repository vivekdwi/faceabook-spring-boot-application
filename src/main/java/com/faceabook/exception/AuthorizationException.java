package com.faceabook.exception;

import com.faceabook.constants.ErrorConstants;
import org.springframework.http.HttpStatus;

/**
 * Created by vivekdwivedi on 9/20/2017.
 */
public class AuthorizationException extends BaseWebApplicationException{

    public AuthorizationException(String applicatoinMessage){
        super(HttpStatus.FORBIDDEN.value(), ErrorConstants.NOT_AUTHORIZED, applicatoinMessage);
    }
}
