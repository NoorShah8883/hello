package com.Roshiappstudio.batterrycharging.Avtivities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.Toast;

public class ExemplBrodcast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        int plugged = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);

        // Are we charging / charged?
        int status = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
        boolean isCharging = status == BatteryManager.BATTERY_STATUS_CHARGING ||
                status == BatteryManager.BATTERY_STATUS_FULL;
        if (isCharging) {
            Toast.makeText(context, "Charging", Toast.LENGTH_SHORT).show();
            context.startService(new Intent(context, FloatingViewService.class));
        }

        else {
            context.stopService(new Intent(context, FloatingViewService.class));
//            Toast.makeText(context, "Disconnected", Toast.LENGTH_SHORT).show();
        }



       /* if (Intent.ACTION_POWER_CONNECTED.equals(intent.getAction())) {

            Toast.makeText(context, "connected", Toast.LENGTH_SHORT).show();
            context.startService(new Intent(context, FloatingViewService.class));

        }  IntentFilter filter = new IntentFilter(Intent.ACTION_POWER_CONNECTED);
        context.registerReceiver(null,filter);

        if (Intent.ACTION_POWER_DISCONNECTED.equals(intent.getAction())) {
            //Toast.makeText(context, "Disconnected", Toast.LENGTH_SHORT).show();
            context.stopService(new Intent(context, FloatingViewService.class));
            Toast.makeText(context, "disConnected", Toast.LENGTH_SHORT).show();
        }
        IntentFilter filter1 = new IntentFilter(Intent.ACTION_POWER_DISCONNECTED);
        context.registerReceiver(null,filter);
*/
    }

//    BroadcastReceiver receiver=new BroadcastReceiver() {
//        @Override
//        public void onReceive(Context context, Intent intent) {
//            int plugged = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
//            if (plugged == BatteryManager.BATTERY_PLUGGED_AC) {
//                Toast.makeText(context, "connected", Toast.LENGTH_SHORT).show();
//                context.startService(new Intent(context, FloatingViewService.class));
//                Log.d("con", "Phone was connected to power");
//                // on AC power
//            } else if (plugged == BatteryManager.BATTERY_PLUGGED_USB) {
//                // on USB power
//            } else if (plugged == 0) {
//                // on battery power
//            } else {
//                // intent didnt include extra info
//            }
//        }
//    };
//    IntentFilter filter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
//    registerReceiver(receiver, filter);

}
