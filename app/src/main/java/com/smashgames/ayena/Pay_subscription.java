package com.smashgames.ayena;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Pay_subscription extends AppCompatActivity {
    private Button subscribe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_subscription);

        subscribe = (Button) findViewById(R.id.subscribe_button);

        subscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pay_subscription.this,Payment_successful.class);
                startActivity(intent);
            }
        });
    }
}