package com.example.elilo.notebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    ListView mListView;
    String[] pages = new String[]{"Add Note", "Add Checklist"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        mListView = findViewById(R.id.list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.txtlist, pages);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(ListViewActivity.this, AddNoteActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(ListViewActivity.this, AddChecklistActivity.class);
                        startActivity(intent1);
                        break;

                }
            }
        });

        //mListView = findViewById(R.id.list_view);
        //pages = new String[] {"Add Note", "Add Checklist"};
        //ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.txtlist, pages);
        //mListView.setAdapter(mAdapter);
    }
}