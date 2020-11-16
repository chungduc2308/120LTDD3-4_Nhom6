package com.AppTong.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.AppTong.R;
import com.AppTong.model.Book;

import java.util.List;
public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {
    Context context;
    List<Book> bookList;
    public BookAdapter(Context context, List<Book> bookList) {
        this.context = context;
        this.bookList = bookList;
    }
    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_book,parent,false );
        return new BookViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull BookAdapter.BookViewHolder holder, int position) {
        holder.bookimg.setImageResource(bookList.get(position).getImgrul());
        holder.booktitle.setText(bookList.get(position).getTitle());
    }
    @Override
    public int getItemCount() {
        return bookList.size();
    }
public class BookViewHolder extends RecyclerView.ViewHolder{
    TextView booktitle ;
    ImageView bookimg;
    public BookViewHolder(@NonNull View itemView) {
        super(itemView);
        bookimg = itemView.findViewById(R.id.categoryimg);
        booktitle = itemView.findViewById(R.id.tv_title);
    }
}
}
