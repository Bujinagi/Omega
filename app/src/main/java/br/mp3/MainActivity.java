package br.mp3;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer song1;
    private Button playButtonVar;
    private Button pauseButtonVar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        song1 = MediaPlayer.create(this, R.raw.eungfreestyle);
        playButtonVar = (Button) findViewById(R.id.playButton);
        pauseButtonVar = (Button) findViewById(R.id.pauseButton);
    }

    public void playSong(View view) {
        song1.start();
        playButtonVar.setEnabled(true);
        Context context = getApplicationContext();
        CharSequence text = "Song is now playing.";
        int duration = Toast.LENGTH_SHORT;
        Toast playToast= Toast.makeText(context, text, duration);
        playToast.show();
    }

    public void pauseSong(View view) {
        song1.pause();
        pauseButtonVar.setEnabled(true);
        Context context = getApplicationContext();
        CharSequence text = "Paused song.";
        int duration = Toast.LENGTH_SHORT;
        Toast pauseToast = Toast.makeText(context, text, duration);
        pauseToast.show();
    }
}
