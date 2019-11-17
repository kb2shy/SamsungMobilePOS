package com.chhaianpin.samsungmobilepos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ShoppingCart extends AppCompatActivity {

    private ArrayList<Item> items;
    private double net;
    private double tax;
    private double total;

    private TextView item1;
    private TextView qty1;
    private TextView price1;
    private TextView amount1;

    private TextView item2;
    private TextView qty2;
    private TextView price2;
    private TextView amount2;

    private TextView item3;
    private TextView qty3;
    private TextView price3;
    private TextView amount3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);

        items = new ArrayList<>();
        items.add(new Item("Duo MS:PE Chain", 119.00, "5495344", 1));
        items.add(new Item("Naughty:PE Hoop Drop", 89.00, "5497872", 2));
        items.add(new Item("FW19 CVD Evening Clutch", 10.00, "5523422", 1));

        net = getNet();
        tax = getTax();
        total = net + tax;

        item1 = findViewById(R.id.item1);
        item2 = findViewById(R.id.item2);
        item3 = findViewById(R.id.item3);

        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (i == 0) {
                item1.setText(item.getName());
                qty1.setText(item.getQuantity());
                price1.setText(String.format("%.02f", item.getPrice()));
                amount1.setText(String.format("%.02f", item.getAmount()));
            }

            if (i == 0) {
                item2.setText(item.getName());
                qty2.setText(item.getQuantity());
                price2.setText(String.format("%.02f", item.getPrice()));
                amount2.setText(String.format("%.02f", item.getAmount()));
            }

            if (i == 0) {
                item3.setText(item.getName());
                qty3.setText(item.getQuantity());
                price3.setText(String.format("%.02f", item.getPrice()));
                amount3.setText(String.format("%.02f", item.getAmount()));
            }
        }


    }

    private double getNet(){
        double net = 0;
        for (Item i : items) {
            net += i.getPrice() * i.getQuantity();
        }

        return net;
    }

    private double getTax(){
        return getNet() * 1.098;
    }
}
