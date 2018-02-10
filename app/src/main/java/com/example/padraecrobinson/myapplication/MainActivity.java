package com.example.padraecrobinson.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        final EditText input = (EditText) findViewById(R.id.input_box);
        final TextView output = (TextView) findViewById(R.id.output_box);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Validator runtime_validator = new Validator();
                String try_pass = input.getText().toString();

                if(runtime_validator.validate(try_pass)==5){
                    output.setText("Password is good");
                }
                else{
                    output.setText("Password is bad");
                }
            }
        });




    }
}