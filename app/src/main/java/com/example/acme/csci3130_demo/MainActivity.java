package com.example.acme.csci3130_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button but;
    EditText etxt;
    TextView vtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but = (Button) findViewById(R.id.button);
        etxt = (EditText) findViewById(R.id.editText);
        vtxt = (TextView) findViewById(R.id.textView);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = etxt.getText().toString();
                vtxt.setText(msg);
            }
        });
    }
}
