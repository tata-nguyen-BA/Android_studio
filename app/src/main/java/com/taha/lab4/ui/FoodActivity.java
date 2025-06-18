// File: app/src/main/java/com/taha/lab4/ui/FoodActivity.java
package com.taha.lab4.ui;

import com.taha.lab4.models.MenuItem;
import com.taha.lab4.R;

import java.util.Arrays;
import java.util.List;

public class FoodActivity extends BaseMenuActivity {
    @Override
    protected List<MenuItem> createData() {
        return Arrays.asList(
                new MenuItem(R.drawable.pho, "Phở Hà Nội", "Bát phở truyền thống Bắc Bộ", 30000),
                new MenuItem(R.drawable.bunbo, "Bún Bò Huế", "Vị cay đặc trưng xứ Huế", 35000),
                new MenuItem(R.drawable.miquang, "Mì Quảng", "Mỳ quảng Quảng Nam chuẩn vị", 28000),
                new MenuItem(R.drawable.hutieu, "Hủ Tiếu Sài Gòn", "Ngọt nước hầm xương Sài Gòn", 32000)
        );
    }
}
