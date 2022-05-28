package com.cse.apis.tajeerapis.utility;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class RestUtility {


    public static String convertPojoToJson(final Object pojo) throws JsonProcessingException {
        final ObjectMapper objectMapper = new ObjectMapper();
        String result = null;
        try
        {
            if(pojo!=null)
            {
                objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
                result = objectMapper.writeValueAsString(pojo);
            }
        }
        catch (final IOException e)
        {
            throw e;
        }
        return  result;
    }


}
