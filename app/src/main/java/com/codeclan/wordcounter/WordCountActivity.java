package com.codeclan.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WordCountActivity extends AppCompatActivity {

    EditText wordCountEditText;
    Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);
        wordCountEditText = (EditText)findViewById(R.id.word_count_text);
        countButton = (Button)findViewById(R.id.count_button);
    }

    public void onCountButtonPressed(View button){
        String stringToCount = wordCountEditText.getText().toString();
        Intent intent = new Intent(this, ShowWordCountActivity.class);
        intent.putExtra("stringToCount", stringToCount);
        startActivity(intent);
    }

}
