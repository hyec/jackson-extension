package com.hanrik.jackson;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.cfg.ConfigFeature;

public enum HanrikFeature implements ConfigFeature {

    ENABLE_GENERAL_STRING_DESERIALIZE(false)

    ;
    private final boolean _defaultState;
    private final int _mask;

    HanrikFeature(boolean defaultState) {
        _defaultState = defaultState;
        _mask = (1 << ordinal());
    }

    public boolean enabledByDefault() { return _defaultState; }

    public int getMask() { return _mask; }

    public boolean enabledIn(int flags) { return (flags & _mask) != 0; }
}
