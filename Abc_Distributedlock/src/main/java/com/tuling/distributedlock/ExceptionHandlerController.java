package com.tuling.distributedlock;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

/***
 * @Author 郭嘉   QQ:2790284115
 * @Slogan 致敬大师，致敬未来的你
 */


@ControllerAdvice
public class ExceptionHandlerController {


    @ExceptionHandler
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Object exceptionHandler(RuntimeException e){

        Map<String,Object> result=new HashMap<>(  );
        result.put( "status","error" );
        result.put( "message",e.getMessage() );
        return result;
    }


}
