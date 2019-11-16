package com.chhaianpin.samsungmobilepos;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_original);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        String employeeID = "";
        Button btn1 = findViewById(R.id.one);
        Button btn2 = findViewById(R.id.two);
        Button btn3 = findViewById(R.id.three);
        Button btn4 = findViewById(R.id.four);
        Button btn5 = findViewById(R.id.five);
        Button btn6 = findViewById(R.id.six);
        Button btn7 = findViewById(R.id.seven);
        Button btn8 = findViewById(R.id.eight);
        Button btn9 = findViewById(R.id.nine);
        Button btn0 = findViewById(R.id.zero);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        
        Log.i("EmployeeID", employeeID);

    }

    public String getButtonPressed(String str) {
        return str;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.one:
                getButtonPressed("1");
                break;
            case R.id.two:
                getButtonPressed("2");
                break;
            case R.id.three:
                getButtonPressed("3");
                break;
            case R.id.four:
                getButtonPressed("4");
                break;
            case R.id.five:
                getButtonPressed("5");
                break;
            case R.id.six:
                getButtonPressed("6");
                break;
            case R.id.seven:
                getButtonPressed("7");
                break;
            case R.id.eight:
                getButtonPressed("8");
                break;
            case R.id.nine:
                getButtonPressed("9");
                break;
            case R.id.zero:
                getButtonPressed("0");
                break;
        }
    }

    private String addToString(String string) {
        return string;
    }
}
