package com.example.vohoangdinh_2107_baitap15_11;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.vohoangdinh_2107_baitap15_11.FragmentVertical;
import com.example.vohoangdinh_2107_baitap15_11.FragmentHorizontal;
import com.example.vohoangdinh_2107_baitap15_11.FragmentGrid;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new FragmentVertical();
            case 1:
                return new FragmentHorizontal();
            default:
                return new FragmentGrid();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
