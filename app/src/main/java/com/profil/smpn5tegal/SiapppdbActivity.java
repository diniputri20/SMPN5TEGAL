package com.profil.smpn5tegal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SiapppdbActivity extends AppCompatActivity {

    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siapppdb);
        WebView web = (WebView) findViewById(R.id.web_view);
        web.loadUrl("https://jateng.siap-ppdb.com/");
        web.setWebViewClient(new WebViewClient());
    }
    public class myWebclient extends WebViewClient{

    }
}