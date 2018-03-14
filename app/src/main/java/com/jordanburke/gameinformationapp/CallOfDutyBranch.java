package com.jordanburke.gameinformationapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CallOfDutyBranch extends AppCompatActivity {

    private Button zombieButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_of_duty_branch);
        zombieButton = findViewById(R.id.zombie_button);
        zombieButtonPress();
    }

    public void zombieButtonPress() {
        zombieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl( "https://www.callofduty.com/wwii/zombies" );
            }
        });
    }
    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
        //test


    }
}
