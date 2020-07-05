package com.example.madd;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class HigherDecorater extends Fragment {

    private RecyclerView myrecycle;
    private List<Decoraters> lstDecorators;
    private DecoratorsRecycleView.RecyclerViewClickListener listener;
    View v;
    public HigherDecorater()
    {
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.activity_higher_decorater,container,false);
        myrecycle = (RecyclerView) v.findViewById(R.id.decorators_recyclerview);
        DecoratorsRecycleView recyclerAdapter = new DecoratorsRecycleView(getContext(), lstDecorators,listener);
        myrecycle.setLayoutManager(new GridLayoutManager(getActivity(),3));
        myrecycle.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstDecorators =new ArrayList<>();
        lstDecorators.add(new Decoraters("Joanna Gaines",R.drawable.joannagaines));
        lstDecorators.add(new Decoraters("Nate Berkus",R.drawable.nateberkus));
        lstDecorators.add(new Decoraters("Kelly Wearstler",R.drawable.kellywearstler));
        lstDecorators.add(new Decoraters("Martyn Lawrence Bullard",R.drawable.martynlawrence));
        lstDecorators.add(new Decoraters("Bobby Berk",R.drawable.bobbyberk));
        lstDecorators.add(new Decoraters("Peter Marino",R.drawable.petermarino));
        lstDecorators.add(new Decoraters("Justina Blakeney",R.drawable.justinablakeney));
        lstDecorators.add(new Decoraters("Emily Henderson",R.drawable.emilyhenderson));
        lstDecorators.add(new Decoraters("Jonathan Adler",R.drawable.jonathanadler));
        lstDecorators.add(new Decoraters("Ken Fulk",R.drawable.kenfulk));
        lstDecorators.add(new Decoraters("Roman and Williams",R.drawable.romanandwilliam));
        lstDecorators.add(new Decoraters("India Mahdavi",R.drawable.indiamahdavi));
        lstDecorators.add(new Decoraters("Tiffany Brooks",R.drawable.tiffanybrooks));
        lstDecorators.add(new Decoraters("Axel Vervoordt",R.drawable.axelvervoordt));
        lstDecorators.add(new Decoraters("Kathryn M. Ireland",R.drawable.karthrynmireland));
        lstDecorators.add(new Decoraters("Thom Filicia",R.drawable.thomfilica));
        lstDecorators.add(new Decoraters("Jacques Grange",R.drawable.jacques));
        lstDecorators.add(new Decoraters("Thomas O'Brien",R.drawable.thomasobrien));
        lstDecorators.add(new Decoraters("Vicky Charles",R.drawable.vickycharles));
        lstDecorators.add(new Decoraters("Michael S. Smith",R.drawable.michealssmith));

    }
}

