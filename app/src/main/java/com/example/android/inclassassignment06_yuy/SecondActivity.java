package com.example.android.inclassassignment06_yuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView nameView;
    TextView legsView;
    TextView furView;
    TextView infoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nameView =  (TextView)findViewById(R.id.name2);
        legsView =  (TextView)findViewById(R.id.legs2);
        furView = (TextView)findViewById(R.id.hasFur2);
        infoView = (TextView)findViewById(R.id.info2);

        Intent intent = getIntent();
        Animal a = (Animal) intent.getSerializableExtra(Keys.ANIMAL);

        nameView.setText(a.getName());
        legsView.setText(a.getLegs());
        furView.setText(String.valueOf( a.hasFur()));
        infoView.setText(a.getInfo());

        this.setTitle("Animal Info");
    }
}
