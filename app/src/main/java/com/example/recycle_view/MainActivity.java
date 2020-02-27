package com.example.recycle_view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyListData[] myListData = new MyListData[] {
                new MyListData("Pendapatan", android.R.drawable.ic_dialog_email),
                new MyListData("Info Tabungan", android.R.drawable.ic_dialog_info),
                new MyListData("Pengeluaran", android.R.drawable.ic_delete),
                new MyListData("Peringatan", android.R.drawable.ic_dialog_alert),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
