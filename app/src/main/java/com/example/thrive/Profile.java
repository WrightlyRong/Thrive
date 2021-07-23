package com.example.thrive;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {

    Button updateProfileBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        BottomNavigationView nav= findViewById(R.id.bottomnavview2);
        findViewById(R.id.bottomnavview2).setBackground(null);
        nav.setSelectedItemId(R.id.profile);

        nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.home:
                        Intent intent = new Intent(Profile.this, MainActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.profile:
                        break;
                    case R.id.shop:
                        Intent intent2 = new Intent(Profile.this, Shop.class);
                        startActivity(intent2);
                        break;
                    case R.id.stat:
                        Intent intent3 = new Intent(Profile.this, Stat.class);
                        startActivity(intent3);
                        break;
                    case R.id.friends:
                        Intent intent4 = new Intent(Profile.this, Friends.class);
                        startActivity(intent4);
                        break;
                }
                return true;
            }
        });

        updateProfileBtn = findViewById(R.id.updatePersonalInfo);
        updateProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoPersonalInfo();
            }
        });
    }

    public void gotoPersonalInfo(){
        Intent intent = new Intent(Profile.this, PersonalInfo.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Profile.this, MainActivity.class);
        startActivity(intent);
    }
}