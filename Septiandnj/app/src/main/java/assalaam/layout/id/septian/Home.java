package assalaam.layout.id.septian;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button lls = (Button) findViewById(R.id.LinearLayout);
        lls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View LinearLayout) {
                Intent myIntent = new
                        Intent(LinearLayout.getContext(), LinearLayout.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button llr = (Button) findViewById(R.id.LayoutSederhana);
        llr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View LayoutSederhana) {
                Intent myIntent = new
                        Intent(LayoutSederhana.getContext(), LayoutSederhana.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button llt = (Button) findViewById(R.id.TampilanLayoutTabel);
        llt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View TampilanLayoutTabel) {
                Intent myIntent = new
                        Intent(TampilanLayoutTabel.getContext(), TampilanLayoutTabel.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button ga = (Button) findViewById(R.id.GambarAndroid);
        ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View GambarAndroid) {
                Intent myIntent = new
                        Intent(GambarAndroid.getContext(), GambarAndroid.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button ta = (Button) findViewById(R.id.AutoCompleteSederhana);
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View AutoCompleteSederhana) {
                Intent myIntent = new
                        Intent(AutoCompleteSederhana.getContext(), AutoCompleteSederhana.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button kd = (Button) findViewById(R.id.DialogBox);
        kd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View DialogBox) {
                Intent myIntent = new
                        Intent(DialogBox.getContext(), DialogBox.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button aa = (Button) findViewById(R.id.picker);
        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View picker) {
                Intent myIntent = new
                        Intent(picker.getContext(), picker.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button bb = (Button) findViewById(R.id.checkBox);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View checkBox) {
                Intent myIntent = new
                        Intent(checkBox.getContext(), checkBox.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button cc = (Button) findViewById(R.id.RadioButton);
        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RadioButton) {
                Intent myIntent = new
                        Intent(RadioButton.getContext(), RadioButton.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button dd = (Button) findViewById(R.id.Seleksi);
        dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View Seleksi) {
                Intent myIntent = new
                        Intent(Seleksi.getContext(), Seleksi.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button ee = (Button) findViewById(R.id.ServiceSederhana);
        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View ServiceSederhana) {
                Intent myIntent = new
                        Intent(ServiceSederhana.getContext(), ServiceSederhana.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
