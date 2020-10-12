package com.smashgames.ayena;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PhoneNumberReg extends AppCompatActivity {

    private TextView ConnectWithSocial;
    private Button proceed;
    private EditText mobilenumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number_reg);

        ConnectWithSocial = (TextView) findViewById(R.id.SocialMediaReg);
        proceed = (Button) findViewById(R.id.proceed_mobileReg);
        mobilenumber = (EditText) findViewById(R.id.MobileNumberReg);

        ConnectWithSocial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhoneNumberReg.this,SocialMediaREG.class);
                startActivity(intent);
            }
        });
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhoneNumberReg.this,Intentions.class);
                startActivity(intent);
            }
        });
    }
}