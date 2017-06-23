package com.newera.okhttp3model.builder;


import com.newera.okhttp3model.OkHttpUtils;
import com.newera.okhttp3model.request.OtherRequest;
import com.newera.okhttp3model.request.RequestCall;

public class HeadBuilder extends GetBuilder
{
    @Override
    public RequestCall build()
    {
        return new OtherRequest(null, null, OkHttpUtils.METHOD.HEAD, url, tag, params, headers,id).build();
    }
}
