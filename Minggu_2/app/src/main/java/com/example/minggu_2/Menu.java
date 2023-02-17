package com.example.minggu_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);
    }

    public void linear(View view) {
        Intent intent = new Intent(Menu.this, MainActivity.class);
        startActivity(intent);
    }
    public void Relative(View view) {
        Intent intent = new Intent(Menu.this, RelativeActivity.class);
        startActivity(intent);
    }
    public void Constraint(View view) {
        Intent intent = new Intent(Menu.this, ConstraintActivity.class);
        startActivity(intent);
    }
    public void Frame(View view) {
        Intent intent = new Intent(Menu.this, FrameActivity.class);
        startActivity(intent);
    }
    public void Table(View view) {
        Intent intent = new Intent(Menu.this, TabelActivity.class);
        startActivity(intent);
    }
    public void Material(View view) {
        Intent intent = new Intent(Menu.this, MaterialDesignActivity.class);
        startActivity(intent);
    }
    public void ScrollV(View view) {
        Intent intent = new Intent(Menu.this, ScrollView.class);
        startActivity(intent);
    }
    public void ScrollVH(View view) {
        Intent intent = new Intent(Menu.this, ScrollViewHorizontal.class);
        startActivity(intent);
    }
}
