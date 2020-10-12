package com.smashgames.ayena;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Payment_unsuccessful extends AppCompatActivity {

    private Button tryagain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_unsuccessful);

        tryagain = (Button) findViewById(R.id.try_again_payment);

        tryagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Payment_unsuccessful.this,Pay_subscription.class);
                startActivity(intent);
            }
        });
    }
}