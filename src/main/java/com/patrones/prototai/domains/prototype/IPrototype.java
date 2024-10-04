package com.patrones.prototai.domains.prototype;

public interface IPrototype {
    IPrototype clone();
    IPrototype deepClone();
}
