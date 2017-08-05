package assalaam.calculator.id.burunghias;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Home extends Activity implements View.OnClickListener {
    Button keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button pilihan = (Button) findViewById(R.id.jenis);
        pilihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View jenis) {
                Intent myIntent = new
                        Intent(jenis.getContext(), Pilihan.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton tentang = (ImageButton) findViewById(R.id.about);
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View about) {
                Intent myIntent = new
                        Intent(about.getContext(), Tentang.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton internet = (ImageButton) findViewById(R.id.link);
        internet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View link) {
                Intent myIntent = new
                        Intent(link.getContext(), Assalaam.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton keluar = (ImageButton) findViewById(R.id.exitBtn);
        keluar.setOnClickListener(this);
    }

    public void onClick(View clicked) {
        switch (clicked.getId()) {
            case R.id.exitBtn:
                exit();
                break;
        }
    }

    private void exit() {
        AlertDialog.Builder builder = new  AlertDialog.Builder(this);
        builder.setMessage("Apakah Kamu Benar-Benar Ingin Keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Home.this.finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int arg1) {
                        // TODO Auto-generated method stub
                        dialog.cancel();
                    }
                }).show();
    }
}
