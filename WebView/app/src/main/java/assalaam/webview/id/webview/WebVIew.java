package assalaam.webview.id.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebVIew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView myWebVIew = (WebView) findViewById(R.id.web);
        myWebVIew.loadUrl("https://www.smkassalaambandung.sch.id");
    }
}
