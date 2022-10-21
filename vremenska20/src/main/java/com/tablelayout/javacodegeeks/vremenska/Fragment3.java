package com.tablelayout.javacodegeeks.vremenska;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class Fragment3 extends Fragment {

    WebView mWebView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.fragment_3, container, false);
        mWebView = (WebView) fragmentView.findViewById(R.id.meteohr);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(false);
        webSettings.setDomStorageEnabled(false);
        webSettings.setAppCacheEnabled(false);
        mWebView.loadUrl("http://meteo.hr//prognoze.php?id=&section=prognoze_model&param=7d&el=&Code=14240");
        return fragmentView;

    }
}
