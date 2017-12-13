package com.example.android.mindspain;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {
    String loc;


    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;


    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.places_layout, container, false);


        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Barcelona",R.drawable.barcelona));
        words.add(new Word("Granada", R.drawable.granada));
        words.add(new Word("Spanish Beaches", R.drawable.spanish_islands));
        words.add(new Word("Madrid", R.drawable.madrid));
        words.add(new Word("Seville", R.drawable.seville));
        words.add(new Word("Valencia", R.drawable.valencia));
        words.add(new Word("San Sebastian", R.drawable.san_sebastian));
        words.add(new Word("Cordoba", R.drawable.cordoba));



        PlacesListAdapter itemsAdapter = new PlacesListAdapter(getActivity(),words);

        ListView listView = (ListView) v.findViewById(R.id.list);


        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word=words.get(position);
                if(position==0)
                    loc=word.getEng();
                else if(position==1)
                    loc=word.getEng();
                else if(position==2)
                    loc=word.getEng();
                else if(position==3)
                    loc=word.getEng();
                else if(position==4)
                    loc=word.getEng();
                else if(position==5)
                    loc=word.getEng();
                else if(position==6)
                    loc=word.getEng();
                else if(position==7)
                    loc=word.getEng();
                Uri gmmIntentUri = Uri.parse("geo:40.463667,-3.749220?q=" + Uri.encode(loc));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
// Make the Intent explicit by setting the Google Maps package
                mapIntent.setPackage("com.google.android.apps.maps");

// Attempt to start an activity that can handle the Intent
                startActivity(mapIntent);








            }
        });


        return  v;
    }

}
