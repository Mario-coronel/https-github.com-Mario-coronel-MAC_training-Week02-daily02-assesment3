package com.example.admin.assesment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ShowPeople extends AppCompatActivity {
    ArrayList<Person> people;
    TextView tvToShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_people);
        people = getIntent().getParcelableArrayListExtra("people");
        tvToShow = findViewById(R.id.tvToshow);
        int x = 1;
        String info = "";
        for (Person p : people) {
            info = info.concat("Person : " + x + "\n");
            info = info.concat("Name: " + p.getName() + "\n");
            info = info.concat("Middle Name: " + p.getMiddleName() + "\n");
            info = info.concat("Last Name : " + p.getLastName() + "\n");
            info = info.concat("Age : " + p.getAge() + "\n");
            x++;
        }
        tvToShow.setText(info);
    }
}
