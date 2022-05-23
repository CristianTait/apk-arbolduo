package com.arbolduo.apk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewHome extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_home);

        webView = (WebView) findViewById(R.id.wbView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://arbolduo.com");

        WebSettings webSettings = webView.getSettings();
        webSettings.getJavaScriptEnabled();

    }

    @Override
    public void onBackPressed(){
        if (webView.canGoBack()){
            webView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}