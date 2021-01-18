package com.cc.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * @author: jinjinwen
 * @description: MySerializer
 * @date: 2021-01-15 18:56
 **/
public class JackSerializer extends JsonSerializer<String> {
    @Override
    public void serialize(String value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if(value==null || value==""){
            gen.writeString("这是我加上的");

        }else{
            gen.writeString(value+"这是我加上的");
        }
    }
}
