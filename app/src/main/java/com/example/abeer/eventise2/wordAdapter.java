package com.example.abeer.eventise2;

import android.content.Context;

import android.widget.ArrayAdapter;
import java.util.List;
public class wordAdapter extends ArrayAdapter<Event> {
    private int mColorResourceId;
    public wordAdapter(Context context, List<Event>events) {
        super(context, 0 ,events);



    }
}
