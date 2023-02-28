package com.example.buoi5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Item_Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        Bundle bundle = getIntent().getExtras();
        ViewItem item = (ViewItem) bundle.get("text");
        ImageView img = findViewById(R.id.item_image1);
        img.setImageResource(item.getImgId());
        TextView txt1 = findViewById(R.id.item_title1);
        txt1.setText(item.getTitle());
        TextView txt2 = findViewById(R.id.item_text1);
        txt2.setText(item.getText());

    }
}