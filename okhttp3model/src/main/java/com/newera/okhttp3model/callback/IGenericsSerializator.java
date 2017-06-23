package com.newera.okhttp3model.callback;


public interface IGenericsSerializator {
    <T> T transform(String response, Class<T> classOfT);
}
