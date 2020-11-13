package com.example.elilo.notebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    ListView mListView;
    String[] pages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        mListView = findViewById(R.id.list_view);
        pages = new String[] {"Add Note", "Add Checklist"};
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.txtlist, pages);
        mListView.setAdapter(mAdapter);
    }
}