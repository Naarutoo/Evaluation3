package com.example.evaluation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Adapter2 extends RecyclerView.Adapter<ViewHolder2> {
    ArrayList<ResponseModel>list2;

    public Adapter2(ArrayList<ResponseModel> list2) {
        this.list2 = list2;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder2 onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout2,parent,false);
        return new ViewHolder2(view2);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder2 holder, int position) {
     ResponseModel responseModel = list2.get(position);
    }

    @Override
    public int getItemCount() {
        return list2.size();
    }
}
