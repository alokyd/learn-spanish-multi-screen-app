package com.example.learnspaniish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
            //create words list
            ArrayList<wordlist> color= new ArrayList<wordlist>();

        color.add(new wordlist("rojo ","red ",R.drawable.color_red));
        color.add(new wordlist("amarillo ","yellow",R.drawable.color_mustard_yellow));
        color.add(new wordlist("azul ","blue",R.drawable.color_dusty_yellow));
        color.add(new wordlist("negro ","black",R.drawable.color_black));
        color.add(new wordlist("verde  ","green",R.drawable.color_green));
        color.add(new wordlist("naranja ","orange",R.drawable.color_brown));
        color.add(new wordlist("gris ","gray",R.drawable.color_gray));
        color.add(new wordlist("blanco ","white",R.drawable.color_white));
        color.add(new wordlist("marron ","brown",R.drawable.color_brown));
        color.add(new wordlist("morado ","purple",R.drawable.color_mustard_yellow));

            // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
            // adapter knows how to create list items for each item in the list.
            wordAdapter adapter= new wordAdapter(this,color,R.color.color);
            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // activity_numbers.xml layout file.
            ListView colorlist= (ListView) findViewById(R.id.colorlist);
            // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link Word} in the list.
            colorlist.setAdapter(adapter);
        }
    }