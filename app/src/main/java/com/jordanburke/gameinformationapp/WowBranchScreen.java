package com.jordanburke.gameinformationapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WowBranchScreen extends AppCompatActivity {

    private Button wowForumsButton;
    private Button wowHeadButton;
    private Button wowPetButton;
    private Button wowMountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wow_branch_screen);
        wowForumsButton = findViewById(R.id.forum_button);
        wowHeadButton = findViewById(R.id.wow_head_button);
        wowPetButton = findViewById(R.id.wow_pet_button);
        wowMountButton = findViewById(R.id.wow_mount_button);
        wowForumButtonPress();
        wowHeadButtonPress();
        wowPetButtonPress();
        wowMountButtonPress();
    }
    public void wowForumButtonPress() {
        wowForumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl( "https://us.battle.net/forums/en/wow/" );
            }
        });

    }
    public void wowMountButtonPress() {
        wowMountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl( "http://www.warcraftmounts.com/" );
            }
        });

    }
    public void wowPetButtonPress() {
        wowPetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl( "http://www.wow-petopia.com/" );
            }
        });

    }
    public void wowHeadButtonPress() {
        wowHeadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl( "http://www.wowhead.com/" );
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
