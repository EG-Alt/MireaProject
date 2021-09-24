package com.mirea.altukhova.mireaproject.ui.audio_player;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import com.mirea.altukhova.mireaproject.R;

public class AudioService extends Service {
    private MediaPlayer player;

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        player = MediaPlayer.create(this, R.raw.godsmack_let_it_out);
        player.setLooping(true);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        player.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        player.stop();
    }
}