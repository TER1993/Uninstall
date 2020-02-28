package com.spd.uninstall.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import java.util.Objects;


/**
 * @author xuyan 应用卸载广播
 */
public class UninstallBroadcastReceiver extends BroadcastReceiver {
    private static final String ACTION = Intent.ACTION_PACKAGE_REMOVED;

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d("Uninstall", "1");

        if (!TextUtils.equals(ACTION, intent.getAction())) {
            Log.d("Uninstall", "2");
            return;
        }
        Log.d("Uninstall", "3");
        Uri data = intent.getData();

        String packageName = Objects.requireNonNull(data).toString();
        Log.d("Uninstall", packageName);
        if (true){
            Toast.makeText(context, packageName, Toast.LENGTH_SHORT).show();
        }
    }


}
