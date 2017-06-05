package com.sldroid.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


/*
image size eka loku ewa use aranna epa.. slow wenawa
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Order> orderList;
    private OrderAdapter orderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        orderList = new ArrayList<>();
        orderAdapter = new OrderAdapter(this, orderList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(orderAdapter);

        setSampleOrderList();
    }

    private void setSampleOrderList() {

        Order order;

        for (int i=0; i<8; i++){
            order = new Order((byte) 0, "Jennifer Lopez", "Diesel", 20000, 300, 8, 8);
            orderList.add(order);
        }

        orderAdapter.notifyDataSetChanged();
    }
}
