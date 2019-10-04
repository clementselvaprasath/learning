package com.muchine.fragment2;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by sejoonlim on 8/6/16.
 */
public class ListFragment extends Fragment {

    private String[] values = { "첫 번째 이미지", "두 번째 이미지" };

    private ListView listView;

    public static interface ImageSelectionCallback {
        public void onImageSelected(int position);
    }

    public ImageSelectionCallback callback;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (!(context instanceof ImageSelectionCallback)) return;
        callback = (ImageSelectionCallback) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_list, container, false);

        initListView(rootView);
        return rootView;
    }

    private void initListView(ViewGroup rootView) {
        listView = (ListView) rootView.findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, values);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (callback == null) return;
                callback.onImageSelected(i);
            }
        });
    }

}
