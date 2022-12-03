package com.example.cgpa_calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class dash extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dash);
        getSupportActionBar().hide();

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationid);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);



        getSupportFragmentManager().beginTransaction().replace(R.id.viewpagertabid,new home()).commit();


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment selectedfregment = null;

            if(item.getItemId()==R.id.homeID)
            {
                selectedfregment = new home();
            }
            else if(item.getItemId()==R.id.chartID)
            {
                selectedfregment = new chart();
            }
            else if(item.getItemId()==R.id.profileID)
            {
                selectedfregment = new profile();
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.viewpagertabid,selectedfregment).commit();




            return true;
        }
    };





    public void onBackPressed() {

        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);

    }
}