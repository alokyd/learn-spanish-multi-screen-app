package com.example.learnspaniish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class familymember extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familymember);
         //create words list
            ArrayList<wordlist> family= new ArrayList<wordlist>();

        family.add(new wordlist("MADRE ","MOTHER ",R.drawable.family_mother));
        family.add(new wordlist("PADRE","FATHER ",R.drawable.family_father));
        family.add(new wordlist("TIO ","UNCLE",R.drawable.family_older_brother));
        family.add(new wordlist("TIA ","AUNT",R.drawable.family_daughter));
        family.add(new wordlist("HERMANO ","BROTHER",R.drawable.family_son));
        family.add(new wordlist("HERMANA","SISTER  ",R.drawable.family_older_sister));
        family.add(new wordlist("PRIMA","COUSIN(GIRL)",R.drawable.family_younger_sister));
        family.add(new wordlist("PRIMO","COUSIN(BOY)",R.drawable.family_younger_brother));
        family.add(new wordlist("ABIELO","GRANDFATHER",R.drawable.family_grandfather));
        family.add(new wordlist("ABUELA","GRANDMOTHER",R.drawable.family_grandmother));

            // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
            // adapter knows how to create list items for each item in the list.
            wordAdapter adapter= new wordAdapter(this,family,R.color.FAMILY);
            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // activity_numbers.xml layout file.
            ListView familylist= (ListView) findViewById(R.id.familymemberlist);
            // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link Word} in the list.
            familylist.setAdapter(adapter);
    }
}