package com.ehappy.yellowswimmingpants;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FixInfoActivity extends AppCompatActivity {
    private Button btCommit, btCancel;
    private TextView tvUserAccount, tvInputUserPassword, tvInputNewPassword, tvInputNewPasswordAgain;
    private EditText etUserAccount, etInputUserPassword, etInputNewPassword, etInputNewPasswordAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fix_info);
        show();
    }

    private void show() {
        btCommit = findViewById(R.id.btCommit);
        btCancel = findViewById(R.id.btCancel);
        tvUserAccount = findViewById(R.id.tvUserAccount);
        tvInputUserPassword = findViewById(R.id.tvInputUserPassword);
        tvInputNewPassword = findViewById(R.id.tvInputNewPassword);
        tvInputNewPasswordAgain = findViewById(R.id.tvInputNewPasswordAgain);
        etUserAccount = findViewById(R.id.etUserAccount);
        etInputUserPassword = findViewById(R.id.etInputUserPassword);
        etInputNewPassword = findViewById(R.id.etInputNewPassword);
        etInputNewPasswordAgain = findViewById(R.id.etInputNewPasswordAgain);
    }
}
