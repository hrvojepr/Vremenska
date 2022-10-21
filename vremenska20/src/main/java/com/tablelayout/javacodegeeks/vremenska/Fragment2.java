package com.tablelayout.javacodegeeks.vremenska;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class Fragment2 extends Fragment {

    WebView mWebView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.fragment_2, container, false);
        mWebView = (WebView) fragmentView.findViewById(R.id.meteoinfo);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(false);
        webSettings.setDomStorageEnabled(false);
        webSettings.setAppCacheEnabled(false);

        mWebView.loadUrl("https://meteo-info.hr/grad/Zagreb");
        return fragmentView;

    }
}
