package com.chhaianpin.samsungmobilepos;

import android.content.Intent;
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
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    HashMap<Integer, User> users;
    private EditText inputUserName;
    private EditText inputPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_original);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        inputUserName = findViewById(R.id.inputUserName);
        inputPassword = findViewById(R.id.inputPassword);

        users = new HashMap<>();

        users.put(1, new User("chhaian", "123"));
        users.put(2, new User("isabella", "456"));
        users.put(3, new User("jared", "789"));

        btnLogin = (Button) findViewById(R.id.submitButton);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(inputUserName.getText().toString(), inputPassword.getText().toString());
            }
        });
    }

    public void validate(String name, String password) {
        if (name.matches("") || password.matches("")) {
            Toast.makeText(MainActivity.this, "Username and password required", Toast.LENGTH_SHORT).show();
            return;
        }

        for (Map.Entry<Integer, User> u : users.entrySet()) {
            if (u.getValue().getUserID().matches(name) && u.getValue().getPassword().matches(password)) {
                Intent intent = new Intent(MainActivity.this, QRActivity.class);
                Toast.makeText(this, "Logging in " + u.getValue().getUserID(), Toast.LENGTH_SHORT).show();
                startActivity(intent);
                return;
            }
        }

        Toast.makeText(this, "Incorrect username and/or password", Toast.LENGTH_SHORT).show();
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

    public void logIn(View view) {
        EditText user = view.findViewById(R.id.inputUserName);
        Log.i("user", user.getText().toString());
//        String userStr = user.getText().toString();
//        EditText pw = view.findViewById(R.id.inputPassword);
//        String pwStr = pw.getText().toString();
//        Log.i("user", "User: " + userStr + " pw: " + pwStr);

//        if (userStr.matches("") || pwStr.matches("")) {
//            Toast.makeText(this, "A username and password are required", Toast.LENGTH_SHORT).show();
//        }
//
//        for (Map.Entry<Integer, User> u : users.entrySet()) {
//            if (u.getValue().getUserID().equals(userStr)) {
//                Toast.makeText(this, "User exists in database", Toast.LENGTH_SHORT).show();
//            }
//        }
//
//        Toast.makeText(this, "User does not exist in database", Toast.LENGTH_SHORT).show();
    }
}
