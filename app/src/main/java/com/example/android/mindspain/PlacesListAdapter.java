package com.example.android.mindspain;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by awasthi's on 12/13/2017.
 */

public class PlacesListAdapter extends ArrayAdapter<Word>{

    public PlacesListAdapter(Activity context,ArrayList<Word> words) {
        super(context,0,words);
    }

    @Override
    public View getView(int position,View v,ViewGroup parent) {

        if(v==null)
            v = LayoutInflater.from(getContext()).inflate(
                    R.layout.places_list, parent, false);

         TextView Place = (TextView) v.findViewById(R.id.eng_text);
        Word currentWord = getItem(position);

        Place.setText(currentWord.getEng());
        ImageView imageView=(ImageView) v.findViewById(R.id.image);
        imageView.setImageResource(currentWord.getImageId());





        return v;
    }


}
