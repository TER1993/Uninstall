package com.spd.uninstall.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

import com.spd.uninstall.AppSeven;
import com.spd.uninstall.MainActivity;

/**
 * @author :Reginer in  2019/9/25 14:24.
 * 联系方式:QQ:282921012
 * 功能描述:开机广播
 */
public class BootBroadcastReceiver extends BroadcastReceiver {
    private static final String ACTION = Intent.ACTION_BOOT_COMPLETED;

    @Override
    public void onReceive(Context context, Intent intent) {

        if (!TextUtils.equals(ACTION, intent.getAction())) {
            return;
        }

        AppSeven.getInstance().startActivity(new Intent(AppSeven.getInstance(), MainActivity.class));

    }


}
