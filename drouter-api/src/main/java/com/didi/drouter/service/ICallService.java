package com.didi.drouter.service;

/**
 * Created by gaowei on 2019/3/28
 */
public interface ICallService {

    <T> T call(Object... params);
}
