package com.hanrik.jackson;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.module.SimpleDeserializers;
import com.hanrik.jackson.deser.GenericStringDeserializer;

public class HanrikModule extends Module {

    public String getModuleName() {
        return this.getClass().getSimpleName();
    }

    public Version version() {
        return Version.unknownVersion();
    }

    public void setupModule(SetupContext context) {

        GenericStringDeserializer genericStringDeserializer = new GenericStringDeserializer();

        SimpleDeserializers deserializers = new SimpleDeserializers();
        deserializers.addDeserializer(String.class, genericStringDeserializer);

        context.addDeserializers(deserializers);
    }

}
