package assalaam.calculator.id.burunghias;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Pilihan extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan);

        Button kacer = (Button) findViewById(R.id.klik1);
        kacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik1) {
                Intent myIntent = new
                        Intent(klik1.getContext(), Kacer.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button kenari = (Button) findViewById(R.id.klik2);
        kenari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik2) {
                Intent myIntent = new
                        Intent(klik2.getContext(), Kenari.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button pleci = (Button) findViewById(R.id.klik3);
        pleci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik3) {
                Intent myIntent = new
                        Intent(klik3.getContext(), Pleci.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button branjangan = (Button) findViewById(R.id.klik4);
        branjangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik4) {
                Intent myIntent = new
                        Intent(klik4.getContext(), Branjangan.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button cucak = (Button) findViewById(R.id.klik5);
        cucak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik5) {
                Intent myIntent = new
                        Intent(klik5.getContext(), Cucakrawa.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button ciblek = (Button) findViewById(R.id.klik6);
        ciblek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik6) {
                Intent myIntent = new
                        Intent(klik6.getContext(), Ciblek.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button jalak = (Button) findViewById(R.id.klik7);
        jalak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik7) {
                Intent myIntent = new
                        Intent(klik7.getContext(), Jalaksuren.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button hijau = (Button) findViewById(R.id.klik8);
        hijau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik8) {
                Intent myIntent = new
                        Intent(klik8.getContext(), Cucakhijau.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button panca = (Button) findViewById(R.id.klik9);
        panca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik9) {
                Intent myIntent = new
                        Intent(klik9.getContext(), Pancawarna.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button tledekan = (Button) findViewById(R.id.klik10);
        tledekan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik10) {
                Intent myIntent = new
                        Intent(klik10.getContext(), Tledekan.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button anis = (Button) findViewById(R.id.klik11);
        anis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik11) {
                Intent myIntent = new
                        Intent(klik11.getContext(), Aniskembang.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button merah = (Button) findViewById(R.id.klik12);
        merah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik12) {
                Intent myIntent = new
                        Intent(klik12.getContext(), Anismerah.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button murai = (Button) findViewById(R.id.klik13);
        murai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik13) {
                Intent myIntent = new
                        Intent(klik13.getContext(), Muraibatu.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button pentet = (Button) findViewById(R.id.klik14);
        pentet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik14) {
                Intent myIntent = new
                        Intent(klik14.getContext(), Pentet.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button gelatik = (Button) findViewById(R.id.klik15);
        gelatik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik15) {
                Intent myIntent = new
                        Intent(klik15.getContext(), Gelatik.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button kolibri = (Button) findViewById(R.id.klik16);
        kolibri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik16) {
                Intent myIntent = new
                        Intent(klik16.getContext(), Kolibri.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button cipoh = (Button) findViewById(R.id.klik17);
        cipoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik17) {
                Intent myIntent = new
                        Intent(klik17.getContext(), Cipoh.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button labed = (Button) findViewById(R.id.klik18);
        labed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik18) {
                Intent myIntent = new
                        Intent(klik18.getContext(), Lavbed.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button trocok = (Button) findViewById(R.id.klik19);
        trocok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik19) {
                Intent myIntent = new
                        Intent(klik19.getContext(), Trucukan.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button jenggot = (Button) findViewById(R.id.klik20);
        jenggot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik20) {
                Intent myIntent = new
                        Intent(klik20.getContext(), Cucakjenggot.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button platuk = (Button) findViewById(R.id.klik21);
        platuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View klik21) {
                Intent myIntent = new
                        Intent(klik21.getContext(), Platuk.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }
}
