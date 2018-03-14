package com.jordanburke.gameinformationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Button wowLinkButton;
    private Button rainbowSixButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wowLinkButton = findViewById(R.id.wow_button);
        rainbowSixButton = findViewById(R.id.rainbow_button);
        wowButtonPress();
        rainbowButtonPress();

    }

    public void wowButtonPress() {
        wowLinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thisIntent = new Intent(MainActivity.this, WowBranchScreen.class);
                MainActivity.this.startActivity(thisIntent);

            }
        });
    }
    public void rainbowButtonPress() {
        rainbowSixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl( "https://forums.ubi.com/forumdisplay.php/64-Rainbow-Six" );
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