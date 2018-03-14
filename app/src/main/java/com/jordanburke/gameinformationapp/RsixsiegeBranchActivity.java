package com.jordanburke.gameinformationapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RsixsiegeBranchActivity extends AppCompatActivity {

    private Button siegeForumButton;
    private Button tipsTricksButton;
    private Button mapCalloutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsixsiege_branch);
        siegeForumButton = findViewById(R.id.siege_button_forum);
        tipsTricksButton = findViewById(R.id.tips_tricks_button);
        mapCalloutButton = findViewById(R.id.map_callouts_button);
        buttonForumPressed();
        tipsTricksButtonPressed();
        mapCalloutButtonPressed();
    }
    public void buttonForumPressed() {
        siegeForumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl( "https://forums.ubi.com/forumdisplay.php/64-Rainbow-Six" );
            }
        });
    }
    public void tipsTricksButtonPressed() {
        tipsTricksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl("https://www.youtube.com/watch?v=aCho2bABZDc&list=PLKAi7RofzSCz3mmTdSbOWjs1uR5HYldow");
            }
        });

    }
    public void mapCalloutButtonPressed() {
        mapCalloutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl("https://www.youtube.com/watch?v=3fuR-k57WF0&list=PLsSNbAgLD2wzW3I_wJevUm2bgrCmhjgGI");
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
