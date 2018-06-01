package com.example.exhibitionwebapi.config;

import com.example.exhibitionwebapi.web.vo.ResponseVo;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.io.IOException;
import java.lang.reflect.Type;

public class ResponseConverter extends MappingJackson2HttpMessageConverter {

    @Override
    protected void writeInternal(Object object, Type type, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {

        if(object instanceof ResponseVo){
            super.writeInternal(object, type, outputMessage);
            return;
        }
        ResponseVo restResponse = new ResponseVo(true,object);
        super.writeInternal(restResponse, type, outputMessage);
    }
}