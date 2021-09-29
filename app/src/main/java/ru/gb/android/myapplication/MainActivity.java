package ru.gb.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private View firstView;
    private AppCompatImageView logIv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setupListeners();

    }
    private void setupListeners(){

        firstView.setOnClickListener(v ->{
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
        });
        logIv.setOnClickListener(v-> {
            Snackbar.make(v,"Hello", Snackbar.LENGTH_SHORT).show();
        });
    }
    private void initViews() {
        firstView = findViewById(R.id.first_view);
        logIv = findViewById(R.id.button_logo);
    }
}