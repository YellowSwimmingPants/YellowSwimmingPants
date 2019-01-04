package com.ehappy.yellowswimmingpants;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ManagerActivity extends AppCompatActivity {
    private Button btFixInfo,btManagement;
    private TextView tvUserAccount, tvAccount, tvUserName, tvName, tvPriority, tvPri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);
        show();
    }

    private void show() {
        btFixInfo = findViewById(R.id.btFixInfo);
        btManagement = findViewById(R.id.btManagement);
        tvUserAccount = findViewById(R.id.tvUserAccount);
        tvAccount = findViewById(R.id.tvAccount);
        tvUserName = findViewById(R.id.tvUserName);
        tvName = findViewById(R.id.tvName);
        tvPriority = findViewById(R.id.tvPriority);
        tvPri = findViewById(R.id.tvPri);
    }

    private void onFixInfoClick(){


    }
}
