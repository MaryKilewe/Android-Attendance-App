package com.example.marys.barcodereader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Navigation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
    }


    public void nextStudent(View view) {
        Intent intent = new Intent(this,StudentAccess.class);
        startActivity(intent);
    }

    public void nextManage(View view) {
        Intent intent = new Intent(this,ManageStudents.class);
        startActivity(intent);
    }

    public void nextView(View view) {
        Intent intent = new Intent(this,AboutPage.class);
        startActivity(intent);
    }



}
