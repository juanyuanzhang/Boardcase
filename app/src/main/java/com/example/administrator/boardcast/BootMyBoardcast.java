package com.example.administrator.boardcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BootMyBoardcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)){   //開機時利用Taost與您說早安
            Log.i("tag","boardcast");
            Toast.makeText(context,"早安，您好",Toast.LENGTH_LONG).show();
        }
    }
}
