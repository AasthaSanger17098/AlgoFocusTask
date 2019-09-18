package com.gla.algofocustask;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.mail);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = email.getText().toString();
                String s2 = password.getText().toString();
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{4,}$";

                if ((s1=="")||(s2=="")) {
                    Toast.makeText(MainActivity.this, "Please Fill ALl Fields", Toast.LENGTH_SHORT).show();
                }
                else {
                    if ((s1.matches(emailPattern))||(s2.length()>=8)||s2.matches(PASSWORD_PATTERN)) {
                        startActivity(new Intent(MainActivity.this,userData.class));
                    } else {
                        Toast.makeText(MainActivity.this, "Invalid validation", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
