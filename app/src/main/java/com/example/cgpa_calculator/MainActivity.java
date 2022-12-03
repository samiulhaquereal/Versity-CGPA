package com.example.cgpa_calculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText idt;
    private ImageButton button;
    private TextView textView;
    private AlertDialog.Builder alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        idt = findViewById(R.id.editviewid);
        button = findViewById(R.id.btnid);
        textView = findViewById(R.id.textid);

        button.setOnClickListener(this);
        textView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String idtt = idt.getText().toString();

        if(view.getId()==R.id.btnid)
        {
            Intent myIntent= new Intent(this, dash.class);
            myIntent.putExtra("idt", idtt);
            startActivity(myIntent);
        }
        else if (view.getId()==R.id.textid)
        {
            Toast.makeText(this, "Also Done", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public void onBackPressed() {
        alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle("Exit");
        alertDialog.setMessage("Do you want to exit ?");
        alertDialog.setIcon(R.drawable.exit);

        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        alertDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog a = alertDialog.create();
        a.show();



    }
}