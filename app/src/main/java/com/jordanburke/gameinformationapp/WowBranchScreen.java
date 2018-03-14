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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wow_branch_screen);
        wowForumsButton = findViewById(R.id.forum_button);
        wowHeadButton = findViewById(R.id.wow_head_button);
        wowForumButtonPress();
        wowHeadButtonPress();
    }
    public void wowForumButtonPress() {
        wowForumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl( "https://us.battle.net/forums/en/wow/" );
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
