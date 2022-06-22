package com.tesco.dcxp.platform.models;

public interface ChannelTrait<T> {
    T forMobile(T t);
    T forWeb(T t);
    T forJibi(T t);
}
