package com.example.shydlovskiy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class AboutAuthorActivity extends AppCompatActivity{

    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_author);

    }

    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0, 1, 1, "Подробнее");
        menu.add(0, 2, 2, "Вернуться");
        menu.add(0, 3, 3, "Выйти");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == 2){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }else if (item.getItemId() == 1) {
            Intent intent = new Intent(this, secretActivity.class);
            startActivity(intent);}
        else if (item.getItemId() == 3) {
            this.finish();
        }
        return  super.onOptionsItemSelected(item);
    }

    public boolean onPrepareOptionsMenu(Menu menu){
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        MenuItem secretItem = menu.findItem(1);
        if(checkBox.isChecked()) {
            secretItem.setVisible(true);
        }else{
            secretItem.setVisible(false);
        }
        return super.onPrepareOptionsMenu(menu);
    }
}