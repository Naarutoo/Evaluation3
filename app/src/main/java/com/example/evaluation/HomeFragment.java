package com.example.evaluation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment {
    private TextView mTv,mTv2;
    private RecyclerView recyclerView1,recyclerView2;
private List<ResponseModel> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initviews(view);
    }

    private void initviews(View view) {
        mTv = view.findViewById(R.id.Tv);
        mTv2 = view.findViewById(R.id.Tv2);
        recyclerView1 = view.findViewById(R.id.recycleview1);
        recyclerView2 = view.findViewById(R.id.recycleview2);
        callApi();
    }

    private void callApi() {
        ApiService apiService = Network.getInstance().create(ApiService.class);
        apiService.getData().enqueue(new Callback<List<ComingSoonModel>>() {
            @Override
            public void onResponse(Call<List<ComingSoonModel>> call, Response<List<ComingSoonModel>> response) {
list =response.body();
setAdapter();
            }

            private void setAdapter() {
                Adapter adapter = new Adapter(list);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
                recyclerView1.setLayoutManager(linearLayoutManager);
                recyclerView1.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<ComingSoonModel>> call, Throwable t) {

            }
        });


            }
        });
    }


}