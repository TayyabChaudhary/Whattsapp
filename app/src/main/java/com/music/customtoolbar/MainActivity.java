package com.music.customtoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar_menu);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case
                R.id.app_setting:
                Toast.makeText(this, "App Setting", Toast.LENGTH_SHORT).show();
                break;
                case
                        R.id.profile_setting:
                    Toast.makeText(this, "Profile Settings", Toast.LENGTH_SHORT).show();
                    break;

            default:
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                break;
        }


        return true;
    }
}