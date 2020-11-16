package com.AppTong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.AppTong.adapter.AllCategoryAdapter;
import com.AppTong.model.AllCategoryModel;

import java.util.ArrayList;
import java.util.List;

public class AllCategory extends AppCompatActivity {
    RecyclerView allCategoryRecycler;
    AllCategoryAdapter allCategoryAdapter;
    List<AllCategoryModel>  categoryModelList;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_category);
        allCategoryRecycler = findViewById(R.id.allCategory);
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(AllCategory.this, MainActivity.class);
                startActivity(back);
                finish();
            }
        });
        categoryModelList = new ArrayList<>();
        categoryModelList.add((new AllCategoryModel("1",R.drawable.ic_category,"Danh Mục")));
        categoryModelList.add((new AllCategoryModel("2",R.drawable.ic_freeship,"Freeship 100%")));
        categoryModelList.add((new AllCategoryModel("3",R.drawable.ic_cart,"Mã Giảm Giá")));
        categoryModelList.add((new AllCategoryModel("4",R.drawable.ic_category,"Danh Mục")));
        categoryModelList.add((new AllCategoryModel("5",R.drawable.ic_freeship,"Freeship 100%")));
        categoryModelList.add((new AllCategoryModel("6",R.drawable.ic_cart,"Mã Giảm Giá")));
        categoryModelList.add((new AllCategoryModel("7",R.drawable.ic_category,"Danh Mục")));

        setCategoryRecycler(categoryModelList);
    }
    private void setCategoryRecycler(List<AllCategoryModel> allcategorydataList) {
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 3);
        allCategoryRecycler.setLayoutManager(layoutManager);
        allCategoryAdapter = new AllCategoryAdapter(this,allcategorydataList);
        allCategoryRecycler.setAdapter(allCategoryAdapter);
    }
}