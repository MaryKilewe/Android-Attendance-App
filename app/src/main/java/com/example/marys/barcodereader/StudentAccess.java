package com.example.marys.barcodereader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StudentAccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_access);
    }

    public void nextView(View view) {
        Intent intent = new Intent(this,BarReader.class);
        startActivity(intent);
    }
}
