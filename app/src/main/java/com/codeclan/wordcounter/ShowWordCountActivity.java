package com.codeclan.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;

public class ShowWordCountActivity extends AppCompatActivity {

    TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_word_count);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String stringToCount = extras.getString("stringToCount");

        WordCounter wordCounter = new WordCounter();
        wordCounter.getWordCount(stringToCount);
        String wordCountString = wordCounter.wordCountAsString();

        outputText = (TextView)findViewById(R.id.output_text);
        outputText.setText(wordCountString);

    }
}
