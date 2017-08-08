package assalaam.calculator.id.burunghias;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;

public class Pentet extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pentet);

        ImageButton aa = (ImageButton) findViewById(R.id.Pentet);
        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik) {
                Intent myIntent = new
                        Intent(klik.getContext(), Empatbelas.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }

}
