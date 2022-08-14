package com.example.pointofsaleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CartActivity extends AppCompatActivity {
    TextView first, second, third, fourth, amount, discount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        first = findViewById(R.id.txtTest);
        second = findViewById(R.id.txtTest2);
        third = findViewById(R.id.txtTest3);
        fourth = findViewById(R.id.txtTest4);

        amount = findViewById(R.id.txtPrice);
        discount = findViewById(R.id.txtDiscount);


        String milk = getIntent().getStringExtra("milk");
        String bread = getIntent().getStringExtra("bread");
        String polish = getIntent().getStringExtra("polish");
        String pen = getIntent().getStringExtra("pen");

        Log.d("The milk", "onCreate: "+milk);
        Log.d("The bread", "onCreate: "+ bread);
        Log.d("The polish", "onCreate: "+ polish);
        Log.d("The pen", "onCreate: "+ pen);

        int milkP = Integer.valueOf(milk) * 60;
        int breadP = Integer.valueOf(bread) * 60;
        int polishP = Integer.valueOf(polish) * 150;
        int penP = Integer.valueOf(pen) * 50;

        first.setText(milk);
        second.setText(bread);
        third.setText(polish);
        fourth.setText(pen);

        int total = milkP + breadP + polishP + penP;
        double interest = 0.15 * total;
        discount.setText(String.valueOf(interest));

        double payingAmount = total - interest;
        amount.setText(String.valueOf(payingAmount));
    }
}