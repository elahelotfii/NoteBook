package com.example.elilo.notebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class AddNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        EditText editText = findViewById(R.id.edtcontent);
        EditText editText1 = findViewById(R.id.edttitle);
    }
}