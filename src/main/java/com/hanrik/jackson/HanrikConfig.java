package com.hanrik.jackson;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;

public class HanrikConfig extends MapperConfigBase<HanrikFeature, HanrikConfig> {

    protected HanrikConfig(MapperConfigBase<HanrikFeature, HanrikConfig> src) {
        super(src);
    }

    protected HanrikConfig _withBase(BaseSettings newBase) {
        return null;
    }

    protected HanrikConfig _withMapperFeatures(int mapperFeatures) {
        return null;
    }

    public HanrikConfig with(ContextAttributes attrs) {
        return null;
    }

    public HanrikConfig withRootName(PropertyName rootName) {
        return null;
    }

    public HanrikConfig with(SubtypeResolver str) {
        return null;
    }

    public HanrikConfig withView(Class<?> view) {
        return null;
    }

    public boolean useRootWrapping() {
        return false;
    }
}
