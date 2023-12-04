package com.example.day7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Surface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private String getScreenOrientation(){
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
            return "Портретная ориентация";
        else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            return "Альбомная ориентация";
        else
            return "";
    }
    private String getRotateOrientation() {
        int rotate = getWindowManager().getDefaultDisplay().getRotation();
        switch (rotate) {
            case Surface.ROTATION_0:
                return "Не поворачивали";
            case Surface.ROTATION_90:
                return "Повернули на 90 градусов по часовой стрелке";
            case Surface.ROTATION_180:
                return "Повернули на 180 градусов";
            case Surface.ROTATION_270:
                return "Повернули на 90 градусов против часовой стрелки";
            default:
                return "Не понятно";
        }
    }
}