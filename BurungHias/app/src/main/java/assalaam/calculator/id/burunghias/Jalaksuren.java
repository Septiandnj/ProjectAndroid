package assalaam.calculator.id.burunghias;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;

public class Jalaksuren extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jalaksuren);

        ImageButton aa = (ImageButton) findViewById(R.id.Jalaksuren);
        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik) {
                Intent myIntent = new
                        Intent(klik.getContext(), Tujuh.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }

}