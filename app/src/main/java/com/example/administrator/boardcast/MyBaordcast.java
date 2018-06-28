package com.example.administrator.boardcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyBaordcast extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals("Boardcast")){
            Log.i("tag","boardcast");
        }
    }
}
