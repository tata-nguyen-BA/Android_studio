package com.taha.lab4.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.taha.lab4.R;
import com.taha.lab4.models.MenuItem;

import java.util.List;
import java.util.Locale;

public class MenuAdapter extends ArrayAdapter<MenuItem> {
    private final int resourceLayout;
    public MenuAdapter(Context context, int resource, List<MenuItem> items) {
        super(context, resource, items);
        this.resourceLayout = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Inflate if needed
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(resourceLayout, parent, false);
        }

        // Bind data
        MenuItem item = getItem(position);
        if (item != null) {
            ImageView iv = convertView.findViewById(R.id.imgMenu);
            TextView tvName = convertView.findViewById(R.id.tvName);
            TextView tvDesc = convertView.findViewById(R.id.tvDesc);
            TextView tvPrice = convertView.findViewById(R.id.tvPrice);

            iv.setImageResource(item.getImageRes());
            tvName.setText(item.getName());
            tvDesc.setText(item.getDesc());
            tvPrice.setText(String.format(Locale.getDefault(), "%,d ₫", item.getPrice()));
            iv.setContentDescription("Hình ảnh " + item.getName());
        }

        return convertView;
    }
}