package com.hanrik.jackson.deser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.Writer;

public class GenericStringDeserializer extends StringDeserializer {

    @Override
    public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {

        if (p.isExpectedStartObjectToken() || p.isExpectedStartArrayToken()) {

            JsonFactory jsonFactory = p.getCodec().getFactory();

            try (Writer writer = new CharArrayWriter();
                 JsonGenerator generator = jsonFactory.createGenerator(writer)) {

                generator.copyCurrentStructure(p);
                generator.flush();

                return writer.toString();
            }
        }

        return super.deserialize(p, ctxt);
    }
}
