package com.example.shydlovskiy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class secretActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0, 1, 1, "Вернуться назад");
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == 1){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        return  super.onOptionsItemSelected(item);
    }
}