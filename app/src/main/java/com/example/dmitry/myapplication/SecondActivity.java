package com.example.dmitry.myapplication;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity  extends AppCompatActivity {
    EditText loginBox;
    EditText passwordBox;
    EditText roleBox;
    EditText nameBox;
    EditText idBox;
    Button delButton;
    Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        //textviews
        idBox = findViewById(R.id.id);
        loginBox = findViewById(R.id.login);
        passwordBox = findViewById(R.id.password);
        roleBox = findViewById(R.id.role);
        nameBox = findViewById(R.id.name);
        //buttons
        saveButton = findViewById(R.id.saveButton);
        delButton = findViewById(R.id.deleteButton);

    }

    public void save(View view) {
    }

    public void delete(View view) {
    }

}
