package com.example.aruuywa;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DosActivity extends AppCompatActivity {
    int r1,r2 = 0;
    SoundPool sp1,sp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);

        sp1=new SoundPool(9, AudioManager.STREAM_MUSIC,0);
        r1=sp1.load(getApplicationContext(), R.raw.burro_s, 1);
        sp2=new SoundPool(9, AudioManager.STREAM_MUSIC,0);
        r2=sp2.load(getApplicationContext(), R.raw.burro, 1);
    }
    public void animal(View v){
        if(r1!=0)
            sp1.play(r1 ,1 , 1, 0, 0, 1);
    }

    public void aymara(View v){
        if(r2!=0)
            sp2.play(r2 ,1 , 1, 0, 0, 1);
    }
    public void siguiente(View v){
        Intent i = new Intent(DosActivity.this,TresActivity.class);

        startActivity(i);

    }
    public void anterior(View v){
        Intent i = new Intent(DosActivity.this,MainActivity.class);

        startActivity(i);

    }

}
