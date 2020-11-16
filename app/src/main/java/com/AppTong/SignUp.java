package com.AppTong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    EditText e1, e2,e3;
    TextView e4;
    Button b1;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        db = new DatabaseHelper(this);
        e1 = findViewById(R.id.userName);
        e2 = findViewById(R.id.Password);
        e3 = findViewById(R.id.EnterPassWord);
        b1 = findViewById(R.id.BtLogin);
        e4 = findViewById(R.id.gotoLogin);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                if(s1.equals("") || s2.equals("") || s3.equals("")){
                    Toast.makeText(getApplicationContext(),"Fields are empty",Toast.LENGTH_SHORT).show();
                }
                else
                if(s2.equals(s3)){
                    Boolean chkemail = db.chkemail(s1);
                    if(chkemail == true){
                        Boolean insert = db.insert(s1,s2);
                        if(insert = true){
                            Toast.makeText(getApplicationContext(),"Register Successfully",Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Email Already exists",Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(),"Password do not match",Toast.LENGTH_SHORT).show();
                }
                Intent i = new Intent(SignUp.this,Login.class);
                startActivity(i);
            }
        });
        e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotologin = new Intent(SignUp.this, Login.class);
                startActivity(gotologin);
            }
        });
    }
}