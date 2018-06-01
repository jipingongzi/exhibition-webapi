package com.example.exhibitionwebapi.config;

import com.example.exhibitionwebapi.web.vo.ResponseVo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

/**
 * 异常处理器，将所有的异常统一进行包装
 * @author ibm
 * @since 0
 * @date 2018-4-11
 */
@ControllerAdvice
@ResponseStatus(HttpStatus.OK)
public class ResponseExceptionHandler {

    /**
     * 针对Exception类型异常的处理
     * @param ex 原本异常
     * @param request http请求
     * @return 返回给ResponseConverter的对象
     */
    @ExceptionHandler({ Exception.class })
    @ResponseBody
    public ResponseVo handleBaseException(Exception ex, WebRequest request) {
        return getRestResponse(ex.getMessage());
    }

    private ResponseVo getRestResponse(String info){
        ResponseVo result = new ResponseVo(false,info);
        return result;
    }
}
