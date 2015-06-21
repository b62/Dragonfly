package com.makswell.max.dragonfly;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // define scenarios
        // TODO move out here? Some service?
        // 1
        String[] scenariosArray = {
                "Panoramic Selfy (1 level)",
                "Dome Selfy"
        };

        //2 fill list
        List<String> scenariosList = new ArrayList<String>(Arrays.asList(scenariosArray));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                R.layout.item_list_scenarios,
                R.id.list_item_scenarios_textview,
                scenariosList);

        ListView scenariosListView = (ListView)rootView.findViewById(R.id.listview_scenarios);
        scenariosListView.setAdapter(adapter);


        return rootView;
    }
}
