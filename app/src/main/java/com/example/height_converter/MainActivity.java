package com.example.height_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText edittext;
    private EditText edittext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= findViewById(R.id.button);
        edittext= findViewById(R.id.editTextNumberDecimal);
        textView= findViewById(R.id.textView3);
        edittext2= findViewById(R.id.editTextNumberDecimal2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= edittext.getText().toString();
                double feet= Double.parseDouble(s);
                String s1= edittext2.getText().toString();
                double inches= Double.parseDouble(s1);
                double cm= feet*30.48 + inches*2.54 ;
                textView.setText("Height is " + cm + " cm");
                Toast.makeText(MainActivity.this, "Thanks for using this app", Toast.LENGTH_SHORT).show();

            }
        });
    }
}