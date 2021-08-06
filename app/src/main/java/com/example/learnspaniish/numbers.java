package com.example.learnspaniish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        //create words list
        ArrayList<wordlist> word= new ArrayList<wordlist>();

        word.add(new wordlist("uno","one",R.drawable.number_one));
        word.add(new wordlist("dos","two",R.drawable.number_two));
        word.add(new wordlist("tres","three",R.drawable.number_three));
        word.add(new wordlist("cuatro","four",R.drawable.number_four));
        word.add(new wordlist("cinco","five",R.drawable.number_five));
        word.add(new wordlist("seis","six",R.drawable.number_six));
        word.add(new wordlist("siete","seven",R.drawable.number_seven));
        word.add(new wordlist("ocho","eight",R.drawable.number_eight));
        word.add(new wordlist("nueve","nine",R.drawable.number_nine));
        word.add(new wordlist("diez","ten",R.drawable.number_ten));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        wordAdapter adapter= new wordAdapter(this,word,R.color.number);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView lvwords= (ListView) findViewById(R.id.lvwords);
        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        lvwords.setAdapter(adapter);
    }
}
