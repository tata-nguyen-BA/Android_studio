// File: app/src/main/java/com/taha/lab4/ui/MainActivity.java
package com.taha.lab4.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.taha.lab4.R;

public class MainActivity extends AppCompatActivity {
    private static final int REQ_FOOD = 100;
    private static final int REQ_DRINK = 101;

    private TextView tvFood, tvDrink;
    private Button btnChooseFood, btnChooseDrink;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFood = findViewById(R.id.tvFoodResult);
        tvDrink = findViewById(R.id.tvDrinkResult);
        btnChooseFood = findViewById(R.id.btnChooseFood);
        btnChooseDrink = findViewById(R.id.btnChooseDrink);

        btnChooseFood.setOnClickListener(v ->
                startActivityForResult(
                        new Intent(this, FoodActivity.class), REQ_FOOD
                )
        );

        btnChooseDrink.setOnClickListener(v ->
                startActivityForResult(
                        new Intent(this, DrinkActivity.class), REQ_DRINK
                )
        );
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_OK || data == null) return;

        String name = data.getStringExtra("name");
        int price = data.getIntExtra("price", 0);
        if (requestCode == REQ_FOOD) {
            tvFood.setText("Thức ăn: " + name + " — " + price + " ₫");
        } else if (requestCode == REQ_DRINK) {
            tvDrink.setText("Đồ uống: " + name + " — " + price + " ₫");
        }
    }
}
