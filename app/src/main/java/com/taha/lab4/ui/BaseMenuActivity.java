// File: app/src/main/java/com/taha/lab4/ui/BaseMenuActivity.java
package com.taha.lab4.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.taha.lab4.adapters.MenuAdapter;
import com.taha.lab4.models.MenuItem;
import com.taha.lab4.R;

import java.util.List;

public abstract class BaseMenuActivity extends AppCompatActivity {
    protected ListView listView;
    protected Button btnOrder;
    protected List<MenuItem> dataList;
    protected int selectedPos = -1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listView = findViewById(R.id.listViewMenu);
        btnOrder = findViewById(R.id.btnOrder);

        dataList = createData();
        MenuAdapter adapter = new MenuAdapter(this, R.layout.item_menu, dataList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, pos, id) -> {
            selectedPos = pos;
        });

        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        listView.setOnItemClickListener((parent, view, pos, id) -> {
            selectedPos = pos;
            // đánh dấu vào ListView, để selector phát huy tác dụng
            listView.setItemChecked(pos, true);
        });


        btnOrder.setOnClickListener(v -> {
            if (selectedPos < 0) {
                Toast.makeText(this, "Chọn trước đã!", Toast.LENGTH_SHORT).show();
                return;
            }
            MenuItem sel = dataList.get(selectedPos);
            Intent data = new Intent()
                    .putExtra("name", sel.getName())
                    .putExtra("price", sel.getPrice());
            setResult(RESULT_OK, data);
            finish();
        });
    }

    // Mỗi Activity con sẽ override để trả về list tương ứng
    protected abstract List<MenuItem> createData();
}
