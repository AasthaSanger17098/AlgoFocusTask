package com.gla.algofocustask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class userData extends AppCompatActivity {
    EditText fname, lname, mobile, address;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_data);
        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        mobile = findViewById(R.id.mobile);
        address = findViewById(R.id.address);

        submit = findViewById(R.id.button);
        String s1 = fname.getText().toString();
        String s2 = lname.getText().toString();
        String s3 = mobile.getText().toString();;
        String s4 = address.getText().toString();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((fname.getText().toString() == "") && (lname.getText().toString() == "")) {
                    Toast.makeText(userData.this, "Please fill All Fields", Toast.LENGTH_SHORT).show();
                }
                else {
                    startActivity(new Intent(userData.this,location.class));
                }
            }
        });




    }
}
