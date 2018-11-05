package com.mmj.www.newadapterviewspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;

public class bananaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banana);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        WebView webview1 = findViewById(R.id.webview1);

        Bundle bundle = getIntent().getExtras();
        String detail = bundle.getString("detail");
        String urlString = "";
        switch(detail) {
            case "Apple":
                urlString = "https://search.daum.net/search?w=img&DA=IIM&t__nil_searchbox=btn&q=%EB%B0%94%EB%82%98%EB%82%98&docid=33jhzNDAK7pr0fImg4";
                break;
            case "Banana":
                urlString = "https://terms.naver.com/entry.nhn?docId=1106882&cid=40942&categoryId=32108";
                break;
            case "Orange":
                urlString = "https://terms.naver.com/entry.nhn?docId=1127966&cid=40942&categoryId=32108";
                break;
        }
        webview1.loadUrl(urlString);

    }
}
