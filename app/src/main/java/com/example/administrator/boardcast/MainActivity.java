package com.example.administrator.boardcast;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PersistableBundle;
import android.service.restrictions.RestrictionsReceiver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="Boardcast"; //宣告常數 字串
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnsend = findViewById(R.id.btnsend);
        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyBaordcast myBaordcast =new MyBaordcast();    //宣告class MyBoardcast 物件 要寫在intent前面
                registerReceiver(myBaordcast,new IntentFilter(TAG)); //註冊 廣播
                //IntentFilter 可先宣告ex: IntentFilter intentfilter = new  IntentFilter()  在加入 intentfilter.addAction(TAG)
                Intent intent = new Intent();
                intent.setAction(TAG);
                sendBroadcast(intent);
            }
        });
    }
}
