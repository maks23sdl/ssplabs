package com.example.shydlovskiy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView myTextView;
    Button btn1;
    Button btn2;
    Button btn3;

    public static int RandomNumberGenerator(){
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;
        return randomNumber;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        int targetNumber = 0;
        int randomNumber = RandomNumberGenerator();

        if(view.getId() == R.id.button1){
            targetNumber = 1;
        } else if (view.getId() == R.id.button2) {
            targetNumber = 2;
        } else if (view.getId() == R.id.button3) {
            targetNumber = 3;
        }

        Toast toast1 = Toast.makeText(getApplicationContext(),
                R.string.trueText, Toast.LENGTH_SHORT);

        Toast toast2 = Toast.makeText(getApplicationContext(),
                R.string.falseText, Toast.LENGTH_SHORT);

        if(targetNumber==randomNumber){
            toast1.show();
        } else {
            toast2.show();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.aboutProgramItem){
            Intent intent = new Intent(this, AboutProgramActivity.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.aboutAuthorItem) {
            Intent intent = new Intent(this, AboutAuthorActivity.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.exitItem) {
          this.finish();
        }
        return  super.onOptionsItemSelected(item);
    }
}
