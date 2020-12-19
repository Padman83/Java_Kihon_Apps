package com.example.the_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView webView1;
    WebView webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView1 = findViewById(R.id.webView_1);
        webView2 = findViewById(R.id.webView_2);

        WebSettings webSettings1 = webView1.getSettings();
        webSettings1.setJavaScriptEnabled(true);
        String path = "file:android_asset/";
        String name = "webView.html";
        String file = path+name;
        webView1.loadUrl(file);

        WebSettings webSettings2 = webView2.getSettings();
        webSettings2.setJavaScriptEnabled(true);
        webView2.loadUrl("https://developer.android.com/");
    }
}