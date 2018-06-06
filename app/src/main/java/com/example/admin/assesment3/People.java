package com.example.admin.assesment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;
import java.util.ArrayList;

public class People extends AppCompatActivity {

    ArrayList<Person> people;
    EditText etName;
    EditText etMiddleName;
    EditText etLastName;
    EditText etAge;
    Button toAdd;
    Button toShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);
        binds();
    }

    private void binds() {
        etName = findViewById(R.id.etName);
        etMiddleName = findViewById(R.id.etMiddleName);
        etLastName = findViewById(R.id.etLastName);
        etAge = findViewById(R.id.etAge);
        toAdd = findViewById(R.id.bAdd);
        toShow = findViewById(R.id.bShowAll);
        people = new ArrayList<>();
    }

    public void addPerson(View view) {
        String name = etName.getText().toString().trim();
        String middleName = etMiddleName.getText().toString().trim();
        String lastName = etLastName.getText().toString().trim();
        String age = etAge.getText().toString().trim();
        if(!name.equals("") && !lastName.equals("") && !middleName.equals("") && !age.equals("")){
            Person p = new Person(name, middleName, lastName, age);
            people.add(p);
            clearFields();
        }
        System.out.println(people);

    }

    private void clearFields() {
        etName.setText("");
        etMiddleName.setText("");
        etLastName.setText("");
        etAge.setText("");
    }

    public void toShowAll(View view) {
        Intent show = new Intent(getApplicationContext(), ShowPeople.class);
        show.putParcelableArrayListExtra("people", people);
        startActivity(show);
    }
}
