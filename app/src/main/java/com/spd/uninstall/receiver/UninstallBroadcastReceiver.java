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
    private static final String pkgName = "package:com.speedata.speakercheck";

    @Override
    public void onReceive(Context context, Intent intent) {

        if (!TextUtils.equals(ACTION, intent.getAction())) {
            return;
        }

        Uri data = intent.getData();
        String packageName = Objects.requireNonNull(data).toString();
        Log.d("Uninstall", packageName);
        if (pkgName.equals(packageName)) {
            Toast.makeText(context, packageName, Toast.LENGTH_SHORT).show();
            // TODO: 2020/3/2 关闭对讲硬件相关参数



        }
    }


}
