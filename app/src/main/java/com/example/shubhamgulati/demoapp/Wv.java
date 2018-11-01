package com.example.shubhamgulati.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Wv extends AppCompatActivity {

    EditText et;
    WebView wb;
    Button go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wv);
        et=findViewById(R.id.et);
        et.setHint("Example-https://www.google.com");
        wb=findViewById(R.id.wb);

        go=findViewById(R.id.go);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u=et.getText().toString();
                wb.getSettings().getJavaScriptEnabled();
                wb.getSettings().getLoadsImagesAutomatically();
                wb.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wb.loadUrl(u);
            }
        });

    }
}
