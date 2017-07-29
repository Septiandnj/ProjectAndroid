package assalaam.layout.id.septian;

/**
 * Created by Administrator on 7/29/2017.
 */
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyService extends Service {
    MediaPlayer mp;

    @Override
    public IBinder onBind(Intent arg0) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void onCreate() {
        mp=MediaPlayer.create(this, R.raw.honeymoon);
        mp.setLooping(false);
    }
    public void onStart (Intent intent, int stardId) {
        mp.start();
    }
    @Override
    public void onDestroy() {
        mp.stop();
    }
}
