package com.example.shubhamgulati.demoapp;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class C extends Fragment {

    RecyclerView rv;

    public C() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv=view.findViewById(R.id.rv);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Eclair");
        arrayList.add("Froyo");
        arrayList.add("Gingerbread");
        arrayList.add("HoneyComb");
        arrayList.add("Ice Cream Sandwich");
        arrayList.add("Jelly Bean");
        arrayList.add("KitKat");
        arrayList.add("Lollipop");
        arrayList.add("Marshmallow");
        arrayList.add("Nougat");
        arrayList.add("Oreo");
        arrayList.add("Pie");
        Adapter adapter=new Adapter(arrayList,getContext());
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        rv.setAdapter(adapter);
    }
}
