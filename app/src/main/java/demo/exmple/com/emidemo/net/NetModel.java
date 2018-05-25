package demo.exmple.com.emidemo.net;


import android.os.Handler;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


/**
* Created by TMVPHelper on 2017/11/27
*/
public class NetModel implements NetContract.Model{
    private static NetModel netModel;
    private OkHttpClient Client;
    private final Handler handler;
    private String urls;

    public static NetModel getInstance(){
        if (netModel == null) {
            synchronized (NetModel.class){
                netModel = new NetModel();
            }
        }
        return netModel;
    }
    public NetModel(){
        Client = new OkHttpClient();
        handler = new Handler();
    }
    @Override
    public void getDataFrom(String url, final CallBacks callBacks) {

        Request request = new Request.Builder().url(url).build();
        Client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String string = response.body().string();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        callBacks.succ(string);
                    }

                });
            }
    });
    }
}