package com.example.jobIntentService;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.EditTextId);
    }

    public void enqueueWork(View view) {
        String input = editText.getText().toString();

        Intent intent = new Intent(this,ExampleJobService.class);
        intent.putExtra("input",input);

        ExampleJobService.enqueueWork(this,intent);
    }
}
