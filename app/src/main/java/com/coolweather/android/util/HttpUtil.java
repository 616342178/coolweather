package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by jinzhicheng on 2017/10/24.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback) {
        //用OkHttp来实现客户端与服务器进行交互
        //我们发起一条HTTP请求只需要调用sendOkHttpRequest()方法,传入请求地址,并注册一个回调来处理服务器响应
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
