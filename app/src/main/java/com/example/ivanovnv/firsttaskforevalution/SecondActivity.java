package com.example.ivanovnv.firsttaskforevalution;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    private TextView mTextView;
    private Button mButton;
    public static String ID_TEXT = "ID_TEXT";

    View.OnClickListener mOnButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY,mTextView.getText().toString());

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.ac_second);

        mTextView = findViewById(R.id.tv_text);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        mTextView.setText(bundle.getString(ID_TEXT));

        mButton = findViewById(R.id.bt_openlink);
        mButton.setOnClickListener(mOnButtonClickListener);
    }
}
