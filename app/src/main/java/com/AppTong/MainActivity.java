package com.AppTong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.AppTong.adapter.BookAdapter;
import com.AppTong.adapter.CategoryAdapter;
import com.AppTong.adapter.ProductsAdapter;
import com.AppTong.model.Book;
import com.AppTong.model.Category;
import com.AppTong.model.Products;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView discountRecyclerView, categoryRecyclerView, bookRecyclerView;
    ProductsAdapter productsAdapter;
    List<Products> productsList;
    CategoryAdapter categoryAdapter;
    List<Category> categoryList;
    List<Book> bookList;
    BookAdapter bookAdapter;
    ImageView allCategory;
    ImageView account;

    Deque<Integer> integerDeque = new ArrayDeque<>(3);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        account = findViewById(R.id.account);
        discountRecyclerView = findViewById(R.id.discountRecycler);
        categoryRecyclerView = findViewById(R.id.categoryRecycler);
        bookRecyclerView = findViewById(R.id.bookRecycler);
        allCategory = findViewById(R.id.allcategoryimg);
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login = new Intent(MainActivity.this,Login.class);
                startActivity(login);
            }
        });
        allCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AllCategory.class);
                startActivity(i);
            }
        });
        productsList = new ArrayList<>();
        productsList.add(new Products("1",R.drawable.tiki4));
        productsList.add(new Products("2",R.drawable.tiki2));
        productsList.add(new Products("3",R.drawable.tiki3));
        productsList.add(new Products("4",R.drawable.tiki1));
        productsList.add(new Products("5",R.drawable.tiki1));
        productsList.add(new Products("6",R.drawable.tiki2));
        // add data to model
        categoryList = new ArrayList<>();
        categoryList.add((new Category("1",R.drawable.ic_category,"Danh Mục")));
        categoryList.add((new Category("2",R.drawable.ic_freeship,"Freeship 100%")));
        categoryList.add((new Category("3",R.drawable.ic_cart,"Mã Giảm Giá")));
        categoryList.add((new Category("4",R.drawable.ic_category,"Danh Mục")));
        categoryList.add((new Category("5",R.drawable.ic_freeship,"Freeship 100%")));
        categoryList.add((new Category("6",R.drawable.ic_cart,"Mã Giảm Giá")));
        categoryList.add((new Category("7",R.drawable.ic_category,"Danh Mục")));
        //
        bookList = new ArrayList<>();
        bookList.add((new Book("1",R.drawable.baihoc,"21 Bài Học Cho Thế Kỉ 21")));
        bookList.add((new Book("2",R.drawable.nhagiakim,"Nhà Giả Kim")));
        bookList.add((new Book("3",R.drawable.dambighet,"Dám Bị Ghét")));
        bookList.add((new Book("4",R.drawable.matbiec,"Mắt Biếc")));
        bookList.add((new Book("5",R.drawable.nhagiakim,"Nhà Giả Kim")));
        bookList.add((new Book("6",R.drawable.baihoc,"21 Bài Học Cho Thế Kỉ 21")));
        setProductRecycler(productsList);
        setCategoryRecycler(categoryList);
        setBookRecycler(bookList);
    }



    private void setCategoryRecycler(List<Category> categorydataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        categoryRecyclerView.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this,categorydataList);
        categoryRecyclerView.setAdapter(categoryAdapter);
    }
    private void setProductRecycler(List<Products> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        discountRecyclerView.setLayoutManager(layoutManager);
        productsAdapter = new ProductsAdapter(this,dataList);
        discountRecyclerView.setAdapter(productsAdapter);
    }
    private void setBookRecycler(List<Book> bookdata) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        bookRecyclerView.setLayoutManager(layoutManager);
        bookAdapter = new BookAdapter(this,bookdata);
        bookRecyclerView.setAdapter(bookAdapter);
    }
}