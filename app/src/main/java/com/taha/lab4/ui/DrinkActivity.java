// File: app/src/main/java/com/taha/lab4/ui/DrinkActivity.java
package com.taha.lab4.ui;

import com.taha.lab4.models.MenuItem;
import com.taha.lab4.R;

import java.util.Arrays;
import java.util.List;

public class DrinkActivity extends BaseMenuActivity {
    @Override
    protected List<MenuItem> createData() {
        return Arrays.asList(
                new MenuItem(R.drawable.pepsi, "Pepsi", "Nước ngọt có ga", 15000),
                new MenuItem(R.drawable.heineken, "Heineken", "Bia xanh Hà Lan", 25000),
                new MenuItem(R.drawable.tiger, "Tiger", "Bia Tiger Singapore", 22000),
                new MenuItem(R.drawable.saigondo, "Sài Gòn Đỏ", "Bia hơi Sài Gòn Đỏ", 20000)
        );
    }
}
