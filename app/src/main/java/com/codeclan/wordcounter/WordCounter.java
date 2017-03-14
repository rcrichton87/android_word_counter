package com.codeclan.wordcounter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 14/03/2017.
 */

public class WordCounter {

    HashMap<String, Integer> wordCount;

    public WordCounter(){
        this.wordCount = new HashMap<String, Integer>();
    }

    public int getWordCountSize(){
        return this.wordCount.size();
    }

    public HashMap<String, Integer> getWordCount(String string){
        String[] parts = string.split(" |, |\\. ");
        for (String word : parts){
            word = word.toLowerCase();
            Integer count = wordCount.get(word);
            if (count == null){
                count = 0;
            }
            count++;
            wordCount.put(word, count);
        }
        return wordCount;
    }

    public String wordCountAsString(){
        String output = new String();
        int count = 1;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()){
            output += entry.getKey() + ": " + entry.getValue();
            if (count < getWordCountSize()){
                output += ", ";
                count++;
            }
        }
        return output;
    }

}
