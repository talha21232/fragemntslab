package com.example.fragemntslab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Fragment1 extends Fragment {

    View fragmentView;
    ListView listView;

    String[] stock = new String[]{"pakistan","india","canada","russia","china","newzealand"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentView=inflater.inflate(R.layout.fragment_fregment1, container, false);

        listView = fragmentView.findViewById(R.id.list);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(getActivity().getApplicationContext(),android.R.layout.simple_list_item_1,stock);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fragment2 second = (Fragment2)getFragmentManager().findFragmentById(R.id.fregment2);
                second.setmethod("stock" +stock[i]);
                listView.setSelector(android.R.color.holo_blue_dark);
            }
        });

        return fragmentView;


    }
}