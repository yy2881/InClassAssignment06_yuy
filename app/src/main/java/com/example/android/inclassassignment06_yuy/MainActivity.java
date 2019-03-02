package com.example.android.inclassassignment06_yuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name_view;
    EditText legs_view;
    EditText info_view;
    CheckBox check_Box;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        name_view = (EditText) findViewById(R.id.name1);
        legs_view = (EditText)findViewById(R.id.legs1);
        info_view = (EditText)findViewById(R.id.info1);
        check_Box = (CheckBox)findViewById(R.id.checkbox);
        button = (Button)findViewById(R.id.button);






        button.setOnClickListener(new View.OnClickListener(){
                                      @Override
                                      public void onClick(View v) {

                                          boolean hasFur = check_Box.isChecked();
                                          String info = info_view.getText().toString();
                                          String name = name_view.getText().toString();
                                          String legs = legs_view.getText().toString();
                                          Animal animal = new Animal(name, legs, hasFur, info);
                                          Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                                          intent.putExtra(Keys.ANIMAL,animal);
                                         //intent.putExtra(Keys.NUM,animal.getLegs());
                                         // intent.putExtra(Keys.BOOLEAN,animal.hasFur());
                                         // intent.putExtra(Keys.STRING2,animal.getInfo());
                                          startActivity(intent);
                                      }
                                  }
        );



    }
}
