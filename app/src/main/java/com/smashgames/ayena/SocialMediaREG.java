package com.smashgames.ayena;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SocialMediaREG extends AppCompatActivity {
    private TextView Fb,Google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media_r_e_g);

        Fb = (TextView) findViewById(R.id.FacebookLogin);
        Google = (TextView) findViewById(R.id.GoogleLogin);

        Fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocialMediaREG.this,Intentions.class);
                startActivity(intent);
            }
        });

        Google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocialMediaREG.this,Intentions.class);
                startActivity(intent);
            }
        });

    }
}