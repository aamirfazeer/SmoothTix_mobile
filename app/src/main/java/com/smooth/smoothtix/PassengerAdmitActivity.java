package com.smooth.smoothtix;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class PassengerAdmitActivity extends AppCompatActivity {
    String schedule_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admit_form);

        schedule_id = getIntent().getStringExtra("schedule_id");
    }
}
