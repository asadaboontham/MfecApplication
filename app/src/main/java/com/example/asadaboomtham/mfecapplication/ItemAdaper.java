package com.example.asadaboomtham.mfecapplication;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by asada boomtham on 13/6/2560.
 */

public class ItemAdaper extends RecyclerView.Adapter<ItemAdaper.ViewHolder> {
    private List<ShopItem> shopItemList;
    private Context mContext;

    public ItemAdaper(IActivity mContext, List<ShopItem> shopItemList) {
        this.mContext = mContext;
        this.shopItemList = shopItemList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.shopping_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ShopItem shopItem = shopItemList.get(position);
        holder.imgItem.setBackground(ContextCompat.getDrawable(mContext,shopItem.getImg()));
        holder.tvNameItem.setText(shopItem.getName());
        holder.tvPriceItem.setText(shopItem.getPrice());

    }
//
//    @Override
//    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//
//    }

    @Override
    public int getItemCount() {
        return shopItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.img_item)
        ImageView imgItem;
        @BindView(R.id.tv_name_item)
        TextView tvNameItem;
        @BindView(R.id.tv_price_item)
        TextView tvPriceItem;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
