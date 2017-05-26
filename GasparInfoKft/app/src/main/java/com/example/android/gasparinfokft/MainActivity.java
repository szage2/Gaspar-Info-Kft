package com.example.android.gasparinfokft;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openURLinBrowser(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.dk/maps/place/Gaspar+Info+Kft/@47.5005938,19.1084485,15z/data=!4m5!3m4!1s0x0:0xae0eb3a069ea4c66!8m2!3d47.5005938!4d19.1084485"));
        startActivity(browserIntent);
    }


}
