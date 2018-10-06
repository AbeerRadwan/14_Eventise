package com.example.abeer.eventise2;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;
import android.content.Context;
import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ImageView;

public class listAdapter extends ArrayAdapter<Event>  {
    public listAdapter(Context context, List<Event> object) {
        super(context, 0,object);
    }



    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view

        View listItemView = convertView;

        if(listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(

                    R.layout.list_card, parent, false);

        }



        Event currentWord = getItem(position);

        ImageView icon=(ImageView)listItemView.findViewById(R.id.imageCard);


        icon.setImageResource(currentWord.getPic());
        return listItemView;


    }}


