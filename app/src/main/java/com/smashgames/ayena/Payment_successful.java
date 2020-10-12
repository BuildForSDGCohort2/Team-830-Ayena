package com.smashgames.ayena;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Payment_successful extends AppCompatActivity {
    private Button successful;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_successful);

        successful = (Button) findViewById(R.id.proceed_payment_success);

        successful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Payment_successful.this,home.class);
                startActivity(intent);
            }
        });
    }
}