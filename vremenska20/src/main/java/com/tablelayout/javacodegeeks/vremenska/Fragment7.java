package com.tablelayout.javacodegeeks.vremenska;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class Fragment7 extends Fragment {

    WebView mWebView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.fragment_7, container, false);
        mWebView = (WebView) fragmentView.findViewById(R.id.dia);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setAppCacheEnabled(false);
        mWebView.loadUrl("https://dia.fly.dev/");
        return fragmentView;

    }
}
