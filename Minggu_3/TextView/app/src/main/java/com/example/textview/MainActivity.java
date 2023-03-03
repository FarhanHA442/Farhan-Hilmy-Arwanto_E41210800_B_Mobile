package com.example.textview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView= (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new Adapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "1414370309", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Bobon Luis", "1820468591", "128291001"));
        mahasiswaArrayList.add(new Mahasiswa("Victor Abowo", "1649279272", "128157789"));
        mahasiswaArrayList.add(new Mahasiswa("Sera Juan", "1614920169", "174456519"));
        mahasiswaArrayList.add(new Mahasiswa("Mario Luigi", "2486344269", "177456529"));
        mahasiswaArrayList.add(new Mahasiswa("Udin Bagus", "5114106369", "174456539"));
        mahasiswaArrayList.add(new Mahasiswa("Sina Edgar", "1114909569", "174484449"));
        mahasiswaArrayList.add(new Mahasiswa("Fafan Mahen", "8214137169", "173566519"));
        mahasiswaArrayList.add(new Mahasiswa("Tutung Ayib", "7414954169", "179226519"));
        mahasiswaArrayList.add(new Mahasiswa("Kukung Miswar", "5617520169", "177736519"));
        mahasiswaArrayList.add(new Mahasiswa("Raden Dolar", "9416340169", "174463219"));
    }
}