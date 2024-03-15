package com.example.shydlovskiy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class AboutProgramActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_program);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0, 1, 1, "Вернуться");
        menu.add(0, 2, 2, "Выйти");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == 1){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }else if (item.getItemId() == 2) {
            this.finish();
        }
        return  super.onOptionsItemSelected(item);
    }
}