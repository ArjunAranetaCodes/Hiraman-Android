package com.example.test3;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends Activity{
	private WebView webView;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);

		webView = (WebView) findViewById(R.id.webView1);
		webView.setWebViewClient(new WebViewClient());
		
		webView.getSettings().setJavaScriptEnabled(true);
		webView.getSettings().setDomStorageEnabled(true);
		//webView.loadUrl("http://www.google.com");

	   //String customHtml = "<html><body><h1>Hello, WebView</h1></body></html>";
	   //webView.loadData(customHtml, "text/html", "UTF-8");

		webView.loadUrl("http://172.33.4.82:85/pahiram/index.php");
		//webView.loadUrl("http://172.33.4.72/recycleitem/admin/request.php");
	}
}