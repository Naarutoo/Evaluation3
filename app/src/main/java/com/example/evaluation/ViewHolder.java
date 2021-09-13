package com.example.evaluation;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.jetbrains.annotations.NotNull;

public class ViewHolder extends RecyclerView.ViewHolder {
ImageView mIvimage;
    public ViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);
    mIvimage = itemView.findViewById(R.id.MovieImage);
    }
    public void setData(ResponseModel responseModel){
        Glide.with(mIvimage).load(responseModel.getComingSoon()).into(mIvimage);
    }
}
