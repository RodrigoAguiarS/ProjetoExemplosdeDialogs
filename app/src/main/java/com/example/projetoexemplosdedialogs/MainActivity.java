package com.example.projetoexemplosdedialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDialog(View view) {
        MyDialogFragment dialog = new MyDialogFragment();
        dialog.show(getSupportFragmentManager(), "dialog");

    }

    public void openSimple(View view) {
        SimpleDialogFragment simpleDialog = new SimpleDialogFragment();
        simpleDialog.show(getSupportFragmentManager(), "simpleDialog");
    }

    public void openRadio(View view) {
        RadioDialogFragment dialogRadio = new RadioDialogFragment();
        dialogRadio.show(getSupportFragmentManager(),"dialogRadio");
    }

    public void openMultiple(View view) {
        MultipleDialogFragment dialogMultiple = new MultipleDialogFragment();
        dialogMultiple.show(getSupportFragmentManager(), "dialogMultiple");
    }

    public void openEdit(View view) {
        MyEditDialogFragment.show(getSupportFragmentManager(), new MyEditDialogFragment.OnTextListener() {
            @Override
            public void onSetText(String text) {
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();

            }
        });

    }
}