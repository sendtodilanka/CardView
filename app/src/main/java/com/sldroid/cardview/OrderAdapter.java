package com.sldroid.cardview;

import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.sldroid.cardview.OrderAdapter.OrderViewHolder;

import java.util.List;

/**
 * Copyright(c) SLDroid Creations (Pvt) Ltd.  All Rights Reserved.
 * This software is the proprietary information of SLDroid Creations (Pvt) Ltd.
 * .
 * Created by dilanka on 6/3/17.
 */

class OrderAdapter extends RecyclerView.Adapter<OrderViewHolder> {

    private Context mContext;
    private List<Order> orderList;

    OrderAdapter(Context mContext, List<Order> orderList) {
        this.mContext = mContext;
        this.orderList = orderList;
    }

    @Override
    public OrderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview, parent, false);

        return new OrderViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final OrderViewHolder holder, int position) {
        Order order = orderList.get(position);
        holder.cusName.setText(order.getCusName());
        holder.fuelType.setText(order.getFuelType());
        holder.fuelVolume.setText(String.valueOf(order.getFuelVolume()));
        holder.fuelPrice.setText(String.valueOf(order.getFuelPrice()));
        holder.orderStatus.setText(String.valueOf(order.getOrderStatus()));

        holder.btnCardMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(holder.btnCardMore);
            }
        });
    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }

    private void showPopupMenu(View view) {
        // inflate menu
        PopupMenu popup = new PopupMenu(mContext, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.card, popup.getMenu());
        popup.setOnMenuItemClickListener(new CardMenuItemClickListner());
        popup.show();
    }

    class OrderViewHolder extends RecyclerView.ViewHolder {
        TextView cusName, fuelType, fuelVolume, fuelPrice, orderStatus;
        ImageButton btnCardMore;

        OrderViewHolder(View view) {
            super(view);
            cusName = (TextView)view.findViewById(R.id.cusName);
            fuelType = (TextView)view.findViewById(R.id.fuelType);
            fuelVolume = (TextView)view.findViewById(R.id.fuelVolume);
            fuelPrice = (TextView)view.findViewById(R.id.fuelPrice);
            orderStatus = (TextView)view.findViewById(R.id.orderStatus);
            btnCardMore = (ImageButton)view.findViewById(R.id.btnCardMore);
        }
    }

    private class CardMenuItemClickListner implements PopupMenu.OnMenuItemClickListener {
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            switch (item.getItemId()){
                case R.id.act_open:
                    return true;
                case R.id.act_destination:
                    return true;
            }
            return false;
        }
    }
}
