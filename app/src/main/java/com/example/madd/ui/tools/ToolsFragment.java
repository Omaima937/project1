package com.example.madd.ui.tools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.madd.HigherDecorater;
import com.example.madd.R;
import com.example.madd.Share;
import com.google.android.material.tabs.TabLayout;

public class ToolsFragment extends Fragment {

    private ToolsViewModel toolsViewModel;
    private Toolbar tool;
    private TabLayout tabs;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tools,
                container, false);

        tool = (Toolbar) tool.findViewById(R.id.toolbar);
        tabs = (TabLayout) tabs.findViewById(R.id.tablayout);
        viewPager = (ViewPager) viewPager.findViewById(R.id.viewpager);

        adapter = new ViewPagerAdapter(getFragmentManager());

        //Add Fragment Here

        adapter.AddFragment(new HigherDecorater(), "Famous Decorator");
        adapter.AddFragment(new Share(), "Share");
        viewPager.setAdapter(adapter);
        tabs.setupWithViewPager(viewPager);

return view;
    }

}