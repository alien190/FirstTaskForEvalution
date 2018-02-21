package com.example.ivanovnv.firsttaskforevalution;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by IvanovNV on 21.02.2018.
 */

public class SecondActivity extends AppCompatActivity {

    private TextView mTextView;
    public static String ID_TEXT = "ID_TEXT";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.ac_second);

        mTextView = findViewById(R.id.tv_text);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        mTextView.setText(bundle.getString(ID_TEXT));
    }
}
