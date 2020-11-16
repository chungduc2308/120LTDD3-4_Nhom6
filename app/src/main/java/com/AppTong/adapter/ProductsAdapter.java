package com.AppTong.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.AppTong.R;
import com.AppTong.model.Products;
import java.util.List;
public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductsViewHolder> {
    Context context;
    List<Products> productsList;
    public ProductsAdapter(Context context, List<Products> productsList) {
        this.context = context;
        this.productsList = productsList;
    }
    @NonNull
    @Override
    public ProductsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_row_item,parent,false);
        return new ProductsViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ProductsViewHolder holder, int position) {
        holder.imageView.setImageResource(productsList.get(position).getProductimg());
    }
    @Override
    public int getItemCount() {
        return productsList.size();
    }
    public static class ProductsViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;

        public ProductsViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgtiki);

        }
    }
}
