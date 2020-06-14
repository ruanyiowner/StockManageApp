package com.RuanYi.StockManageApp;

import android.os.Bundle;

import com.RuanYi.StockManageApp.db.DBManager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class StockIOActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_io);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button BtnTest = (Button)findViewById(R.id.btnTest);
        BtnTest.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
              //System.out.println("测试。");
               // android.util.Log.v("MyDebug","我的测试。");

                DBManager dbManager = new DBManager(view.getContext());


            }
        });


    }

}
