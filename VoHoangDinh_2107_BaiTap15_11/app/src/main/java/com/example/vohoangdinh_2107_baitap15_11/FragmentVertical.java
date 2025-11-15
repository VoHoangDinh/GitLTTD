package com.example.vohoangdinh_2107_baitap15_11;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vohoangdinh_2107_baitap15_11.R;
import com.example.vohoangdinh_2107_baitap15_11.ItemAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentVertical extends Fragment {

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_fragment_vertical, container, false);
        RecyclerView rv = view.findViewById(R.id.rvVertical);

        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        rv.setAdapter(new ItemAdapter(getData()));
        return view;
    }

    private List<ItemData> getData() {
        List<ItemData> list = new ArrayList<>();

        list.add(new ItemData("Con Mèo", R.drawable.ic_cat));
        list.add(new ItemData("Con Chó", R.drawable.ic_dog));
        list.add(new ItemData("Con Chim", R.drawable.ic_bird));

        return list;
    }

}
