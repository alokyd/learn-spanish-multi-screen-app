package com.example.learnspaniish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class phrase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrase);
        //create words list
        ArrayList<wordlist> phrase= new ArrayList<wordlist>();

        phrase.add(new wordlist("Buenos dias","good morning"));
        phrase.add(new wordlist("Ayudame, por favor","Help me please"));
        phrase.add(new wordlist("ponte ios zapatos","put your on shoes."));
        phrase.add(new wordlist("cepillate ios manos","Brush your teeth."));
        phrase.add(new wordlist("Dame un abrazo","Give me a hug."));
        phrase.add(new wordlist("Dame la mano","give me your hand."));
        phrase.add(new wordlist("Te ayudo?","can i help you?"));
        phrase.add(new wordlist("por favor","please"));
        phrase.add(new wordlist("Gracis","thank you"));
        phrase.add(new wordlist("de nada","you're welcome"));
        phrase.add(new wordlist("ponte ios zapatos","put your on shoes."));
        phrase.add(new wordlist("cepillate ios manos","Brush your teeth."));
        phrase.add(new wordlist("Dame un abrazo","Give me a hug."));
        phrase.add(new wordlist("Dame la mano","give me your hand."));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        wordAdapter adapter= new wordAdapter(this,phrase,R.color.phrase);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView familylist= (ListView) findViewById(R.id.phraselist);
        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        familylist.setAdapter(adapter);
    }
}