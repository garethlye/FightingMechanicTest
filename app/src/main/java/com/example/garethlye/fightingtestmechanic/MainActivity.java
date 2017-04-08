package com.example.garethlye.fightingtestmechanic;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.garethlye.fightingtestmechanic.databinding.MainActivityBinding;


/**
 * Created by garethlye on 07/04/2017.
 **/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        MainActivityBinding mainActivityBinding = DataBindingUtil.bind(findViewById(R.id.container));
        mainActivityBinding.setActivity(this);
        //WelcomeSplashBinding welcomeSplashBinding = DataBindingUtil.setContentView(this, R.layout.welcome_splash);
        //welcomeSplashBinding.setActivity(MainActivity.this);
    }

    public void onProceedClick(View view){
        Intent i = new Intent(MainActivity.this, CreateCharacterScreen.class);
        startActivity(i);
    }

    public void onDeleteClick(View view){
        Intent i = new Intent(MainActivity.this, MainActivity.class);
        startActivity(i);
    }
}
