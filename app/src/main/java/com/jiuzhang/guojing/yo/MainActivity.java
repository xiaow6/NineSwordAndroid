package com.jiuzhang.guojing.yo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT).show();

        // TODO 5 get View using findViewById
        // get the EditText, the Button and the TextView using findViewById
        Button btn1 = (Button) findViewById(R.id.button);
        // TODO 6 set OnClickListener of Button
        // set the OnClickListener of the button so that when the button is clicked,
        // your program should set the text of TextView to be the value of the EditText
        // new created an object; which is parsed by setOnClickListener;
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextView txv1 = (TextView) findViewById(R.id.text_view);
                EditText edittext1 = (EditText) findViewById(R.id.edit_text);
                txv1.setText(edittext1.getText().toString());
            }
        });
    }
}
