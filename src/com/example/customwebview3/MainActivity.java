package com.example.customwebview3;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

public class MainActivity extends Activity {

	 HTML5WebView mWebView;

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        mWebView = new HTML5WebView(this);

	        String data1 = "<!doctype html>";
			data1 += "<html>";
			data1 += "<head>";
			data1 += "</head>";
			data1 += "<body>"; 
			data1 += "<div id=\"kaltura_player_1432112229\" style=\"width: 560px; height: 315px;\" itemprop=\"video\" itemscope itemtype=\"http://schema.org/VideoObject\">";
			data1 += "<span itemprop=\"name\" content=\"CVLS000MVS000002 - AMI DIASHLAI Bangla movie sexy item song  TEASER\"></span>";
			data1 += "<span itemprop=\"description\" content=\"\"></span>";
			data1 += "<span itemprop=\"duration\" content=\"69\"></span>";
			data1 += "<span itemprop=\"thumbnail\" content=\"http://cfvod.kaltura.com/p/1868701/sp/186870100/thumbnail/entry_id/0_kspzqt77/version/100000/acv/222\"></span>";	
			data1 += "<span itemprop=\"width\" content=\"560\"></span>";
			data1 += "<span itemprop=\"height\" content=\"315\"></span>";	
			data1 += "</div>";
			
			data1 += "<script src=\"http://cdnapi.kaltura.com/p/1868701/sp/186870100/embedIframeJs/uiconf_id/29233222/partner_id/1868701?autoembed=true&entry_id=0_kspzqt77&playerId=kaltura_player_1432112229&cache_st=1432112229&width=560&height=315\"></script>";
			data1 += "</body>";
			data1 += "</html>";
			
			
	        if (savedInstanceState != null) {
	            mWebView.restoreState(savedInstanceState);
	        } else {    
	            //mWebView.loadUrl("http://www.google.com");
	            
	            mWebView.loadDataWithBaseURL("http://localhost/", data1, "text/html", "utf-8", null);
	        }

	        setContentView(mWebView.getLayout());
	    }

	    @Override
	    public void onSaveInstanceState(Bundle outState) {
	        super.onSaveInstanceState(outState);
	        mWebView.saveState(outState);
	    }

	    @Override
	    public void onStop() {
	        super.onStop();
	        mWebView.stopLoading();
	    }

	    @Override
	    public boolean onKeyDown(int keyCode, KeyEvent event) {

	        if (keyCode == KeyEvent.KEYCODE_BACK) {
	            if (mWebView.inCustomView()) {
	                mWebView.hideCustomView();
	            //  mWebView.goBack();
	                //mWebView.goBack();
	                return true;
	            }

	        }
	        return super.onKeyDown(keyCode, event);
	    }

	
}
