package com.faultinmycode.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class LoginActivity extends AppCompatActivity {
    private EditText mUserName,mPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUserName=(EditText) findViewById(R.id.editText);
        mPassword=(EditText) findViewById(R.id.editText2);
        Button btn_sign_in= (Button) findViewById(R.id.button);
        btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String UserName=mUserName.getText().toString();
                String Pass=mPassword.getText().toString();
                if (UserName.equalsIgnoreCase("admin") && Pass.equals("123")){
                    Intent Profileintent=new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(Profileintent);
                    Toast.makeText(LoginActivity.this,"Ban da dang nhap thanh cong",Toast.LENGTH_LONG).show();
                }else
                    Toast.makeText(LoginActivity.this,"ban khong dang nhap thanh cong",Toast.LENGTH_LONG).show();
            }
        });
    }
}
