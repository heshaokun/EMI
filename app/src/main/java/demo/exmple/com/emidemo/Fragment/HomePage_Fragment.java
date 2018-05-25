package demo.exmple.com.emidemo.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import demo.exmple.com.emidemo.R;


/**
 * Created by 贺韶坤 on 2018/5/15.
 */
//首页Fragment
public class HomePage_Fragment extends Fragment {

    private WebView HomePage_web;
    private ProgressBar progressBar;
    private View progressBar1;
    private WebSettings webSettings;

    private String url = "http://test.emibj.com:7082/partnerApp/partner.html?openid=o1e08v1GTPDNQneNy2X9WwWYawks.html";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.homepagefragment,container,false);
        HomePage_web = view.findViewById(R.id.HomePage_web);
        //progressBar = (ProgressBar) view.findViewById(R.id.progressBar);
      //  progressBar = view.findViewById(R.id.progressBar);
        webSettings = HomePage_web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        HomePage_web.setWebViewClient(new MyWebViewClient());
        HomePage_web.loadUrl(url);
      //  initView();

        return view;
    }

//    private void initView() {
//        HomePage_web.setWebViewClient(new WebViewClient() {
//            //网页加载开始时调用，显示加载提示旋转进度条
//            @Override
//            public void onPageStarted(WebView view, String url, Bitmap favicon) {
//                // TODO Auto-generated method stub
//                super.onPageStarted(view, url, favicon);
//                progressBar.setVisibility(View.VISIBLE);
////                Toast.makeText(ElecHall.this, "onPageStarted", 2).show();
//            }
//
//            //网页加载完成时调用，隐藏加载提示旋转进度条
//            @Override
//            public void onPageFinished(WebView view, String url) {
//                // TODO Auto-generated method stub
//                super.onPageFinished(view, url);
//                progressBar.setVisibility(View.GONE);
////                Toast.makeText(ElecHall.this, "onPageFinished", 2).show();
//            }
//
//            //网页加载失败时调用，隐藏加载提示旋转进度条
//            @Override
//            public void onReceivedError(WebView view, int errorCode,
//                                        String description, String failingUrl) {
//                // TODO Auto-generated method stub
//                super.onReceivedError(view, errorCode, description, failingUrl);
//                progressBar.setVisibility(View.GONE);
////                Toast.makeText(ElecHall.this, "onReceivedError", 2).show();
//            }
//
//        });
//
//    }
private class MyWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        //    return super.shouldOverrideUrlLoading(view, url);
        view.loadUrl(url);
        return true;
    }

    @Override
    public void onReceivedError(WebView view, int errorCode,
                                String description, String failingUrl) {
        //     super.onReceivedError(view, errorCode, description, failingUrl);
        //  Toast.makeText(this,"网页加载错误！",0).show();
    }
}
//        @Override
//    public  boolean onBackPressed(){
//
//        if(HomePage_web.canGoBack()){
//            HomePage_web.goBack();
//            Log.v("webView.goBack()", "webView.goBack()");
//            return true;
//
//        }else{
//            Log.v("Conversatio退出","Conversatio退出");
//            return false;
//        }
//
//    }
}
