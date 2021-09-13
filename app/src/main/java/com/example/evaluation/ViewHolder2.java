package com.example.evaluation;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.jetbrains.annotations.NotNull;

public class ViewHolder2 extends RecyclerView.ViewHolder {
private ImageView mIvimage2;
    public ViewHolder2(@NonNull @NotNull View itemView) {
        super(itemView);
        mIvimage2 = itemView.findViewById(R.id.MovieImage2);
    }
    public void setData2(ResponseModel responseModel){
        Glide.with(mIvimage2).load(responseModel.getNowShowing()).into(mIvimage2);
    }
}
