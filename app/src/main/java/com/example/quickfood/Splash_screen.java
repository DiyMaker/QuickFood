package com.example.quickfood;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        openApp(true);
        //

        ImageView logo, texto, background;

        logo=(ImageView) findViewById(R.id.logo);
        texto=(ImageView) findViewById(R.id.texto);
        Animation animar_fondo = AnimationUtils.loadAnimation(
                this,R.anim.animar_fondo
        );
        Animation animacion_entrada = AnimationUtils.loadAnimation(
                this,R.anim.animacion_entrada
        );
        logo.startAnimation(animacion_entrada);
        texto.startAnimation(animacion_entrada);
       // background.startAnimation(animar_fondo);
    }
    public void openApp ( boolean locationPermission){
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =new Intent(Splash_screen .this, login.class);
                startActivity(intent);
            }
        },3550);
    }

}
