package assalaam.layout.id.septian;

import android.os.Bundle;
import android.app.Activity;
import java.io.IOException;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;


public class PlayingAudio extends Activity {
    ImageButton mainkan;
    TextView keterangan;
    MediaPlayer mp;
    private Button btnPlay;
    private Button btnPause;
    private Button btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_audio);

        btnPause = (Button) findViewById(R.id.btnPAUSE);
        btnStop = (Button) findViewById(R.id.btnSTOP);

        keterangan=(TextView)findViewById(R.id.ket);
        keterangan.setText("Silakan klik tombol play");

        mainkan=(ImageButton)findViewById(R.id.putarMusik);
        mainkan.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                mainkan.setEnabled(false);
                keterangan.setText("Tombol play tidak aktif");
                go();
            }
        });
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pause();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stop();
            }
        });
    }
    public void go() {
        mp = MediaPlayer.create(PlayingAudio.this, R.raw.honeymoon);
        try {
            mp.prepare();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mp.start();
        mp.setOnCompletionListener(new OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer arg0) {
                mainkan.setEnabled(true);
                keterangan.setText("Silakan klik tombol play");
            }
        });
    }

    /** Dijalankan Oleh Tombol Pause */
    public void pause(){
        if(mp.isPlaying()){
            if(mp!=null){
                mp.pause();

            }
        } else {
            if(mp!=null){
                mp.start();

            }
        }
    }

    /** Dijalankan Oleh Tombol Stop */
    public void stop(){
        mp.stop();

        try{
            mp.prepare();
            mp.seekTo(0);
        }catch (Throwable t) {
            t.printStackTrace();
        }

        stateAwal();
    }
    public void stateAwal(){
        btnPause.setEnabled(false);
        btnStop.setEnabled(false);
    }

}
