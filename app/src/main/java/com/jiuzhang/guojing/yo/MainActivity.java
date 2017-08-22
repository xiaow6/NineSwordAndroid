package com.jiuzhang.guojing.yo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

@SuppressWarnings("ConstantConditions")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO find EditText by id
        final EditText et_1 = (EditText) findViewById(R.id.name);
        // TODO set up Buttons
        // find the Buttons you declared in the layout file by their ids
        // set up the click event listeners of the buttons
        // in each of the click event functions, display a toast that shows the text of the EditText
        final Button btn_1 = (Button) findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, btn_1.getText() + " " + et_1.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        final Button btn_2 = (Button) findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, btn_2.getText() + " " + et_1.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        final Button btn_3 = (Button) findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, btn_3.getText() + " " + et_1.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        final Button btn_4 = (Button) findViewById(R.id.btn_4);
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, btn_4.getText() + " " + et_1.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
