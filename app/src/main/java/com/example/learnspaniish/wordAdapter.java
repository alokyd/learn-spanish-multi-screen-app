package com.example.learnspaniish;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class wordAdapter extends ArrayAdapter {
    // modify the constrecture for the background color attrinbutes
    private int mcolorResourceID;

    public wordAdapter(Activity context, ArrayList<wordlist> word, int colorResourceID) {
        super(context, 0, word);
        mcolorResourceID=colorResourceID;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //check if the existing view is being resused ,otherwise inflate the view
        View listItems =convertView;
        if (listItems==null){
            listItems= LayoutInflater.from(getContext()).inflate(R.layout.wordlistitem,parent,false );
        }

        //get the object located at thud=s position in the list
        wordlist currentword= (wordlist) getItem(position);

        //find the text view in the list_item.xml layout with the ID tvspanish.
        TextView tvspanish=(TextView) listItems.findViewById(R.id.tvspanish);
        //get the spanish translation fron rhe currentword object and set this text on
        //the spanish text view.
        tvspanish.setText(currentword.getSpanishword());

        //find the text view in the wordlistitem.xml
        // layout with the OD default word
        TextView tvdefault=(TextView) listItems.findViewById(R.id.tvdefault);
        //get the spanish translation fron rhe currentword object and set this text on
        //the spanish text view.
        tvdefault.setText(currentword.getDefaultword());
        //return the whole list item layout (containing two text view )
        //show thet it can be shown in the list view.

        ImageView  imageitem= (ImageView) listItems.findViewById(R.id.imageView);
        if(currentword.hasImage()){
        imageitem.setImageResource(currentword.getImageresourceid());
        imageitem.setVisibility(View.VISIBLE);}
        else{
            imageitem.setVisibility(View.GONE);
        }
        // theme color for the list item
        View textcontainor= listItems.findViewById(R.id.colorContainar);
        // fimd the color that the color id maps tp
        int color = ContextCompat.getColor(getContext(),mcolorResourceID);
        // set color to the container view
        textcontainor.setBackgroundColor(color);
        return listItems;
    }
}
