package assalaam.calculator.id.burunghias;

import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebView;

public class Assalaam extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assalaam);

        WebView myWebVIew = (WebView) findViewById(R.id.web);
        myWebVIew.loadUrl("https://www.smkassalaambandung.sch.id");
    }

}
