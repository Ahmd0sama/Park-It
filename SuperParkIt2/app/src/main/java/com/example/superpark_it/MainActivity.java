package com.example.superpark_it;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSignup(View view) {
        Intent myIntet = new Intent(this,SignUp.class);
        startActivity(myIntet);
    }

    public void CurrentLocation(View view) {
        Intent MyIntent =new Intent(this,MapsActivity.class);
        startActivity(MyIntent);
    }
}
