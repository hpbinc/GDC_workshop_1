package com.app.hance.gdc_workshop_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void click(View view) {
        EditText user = (EditText) findViewById(R.id.user);
        EditText pass = (EditText) findViewById(R.id.pass);


        String username = user.getText().toString();
        String password = pass.getText().toString();

        if (username.equals("abc") && password.equals("123")) {

            Toast.makeText(this, "Valid user :)", Toast.LENGTH_SHORT).show();

            Intent i = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(i);

        } else {
            Toast.makeText(this, "Invalid user!!!", Toast.LENGTH_SHORT).show();

        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

}