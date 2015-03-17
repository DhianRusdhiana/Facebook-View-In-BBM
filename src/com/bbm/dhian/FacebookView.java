package com.bbm.dhian;


import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;



/*
 * Failed to analyse overrides
 */
public class FacebookView
extends WebView {

    public FacebookView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
		

        WebSettings webSettings = this.getSettings();
        webSettings.setJavaScriptEnabled(true);

        this.setWebViewClient(new MyCustomWebViewClient());
        this.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        this.loadUrl("https://facebook.com");

	}
	private class MyCustomWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
	
}
