package com.spd.uninstall;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.spd.uninstall.receiver.UninstallBroadcastReceiver;


/**
 * @author xuyan
 */
public class MainActivity extends AppCompatActivity {

    private IntentFilter intentFilter;
    private UninstallBroadcastReceiver receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initIntentFilter();


    }

    private void initIntentFilter() {
        intentFilter = new IntentFilter();
        intentFilter.addAction(Intent.ACTION_PACKAGE_REMOVED);
        intentFilter.addDataScheme("package");

        receiver = new UninstallBroadcastReceiver();

        registerReceiver(receiver, intentFilter);


    }

    @Override
    protected void onDestroy() {
        unregisterReceiver(receiver);

        super.onDestroy();
    }
}
