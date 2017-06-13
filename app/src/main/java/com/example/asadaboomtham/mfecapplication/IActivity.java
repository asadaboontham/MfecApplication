package com.example.asadaboomtham.mfecapplication;

import android.os.Bundle;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class IActivity extends AppCompatActivity {

    @BindView(R.id.rv_list_item)
    RecyclerView rvListItem;

    private String user;
    private List<ShopItem> shopItemList;
    private ShopItem shopItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i);
        ButterKnife.bind(this);
        user = getIntent().getStringExtra("user");
        initShopItem();
        initView();
    }

    private void initShopItem() {
        shopItemList = new ArrayList<>();
        shopItemList.add(new ShopItem("Hail", "100", R.mipmap.ic_launcher));
        shopItemList.add(new ShopItem("Hail", "100", R.mipmap.ic_launcher));
        shopItemList.add(new ShopItem("Hail", "100", R.mipmap.ic_launcher));
        shopItemList.add(new ShopItem("Hail", "100", R.mipmap.ic_launcher));
        shopItemList.add(new ShopItem("Hail", "100", R.mipmap.ic_launcher));
    }
    private void initView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rvListItem.setLayoutManager(linearLayoutManager);
        ItemAdaper itemAdaper = new ItemAdaper(this,shopItemList);
        rvListItem.setAdapter(itemAdaper);
    }
}
