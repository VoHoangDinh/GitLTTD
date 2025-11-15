package com.example.vohoangdinh_2107_baitap15_11;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentGrid extends Fragment {

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_fragment_grid, container, false);

        RecyclerView rv = view.findViewById(R.id.rvGrid);

        rv.setLayoutManager(new GridLayoutManager(getContext(), 3));
        rv.setAdapter(new ItemAdapter(generateData()));

        return view;
    }

    // → CHỈ TRẢ TEXT
    private List<ItemData> generateData() {
        List<ItemData> list = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            list.add(new ItemData("Item " + (i + 1)));  // Không có ảnh
        }
        return list;
    }
}
