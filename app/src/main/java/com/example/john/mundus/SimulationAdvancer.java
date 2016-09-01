package com.example.john.mundus;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/**
 * Created by john on 8/21/2016.
 */
public class SimulationAdvancer implements Runnable {
    World world;
    /*
    @Override
    public void onReceive(Context context, Intent intent) {
        if (!Strings.isNullOrEmpty(intent.getAction())) {
            MyApplication myApplication = (MyApplication) context.getApplicationContext();
            SharedPreferences sharedPreferences = myApplication.getSharedPreferences();
            if (intent.getAction().equals(INTENT_ACTION)) {
                doPeriodicTask(context, myApplication);
            }
        }
    }
    */
    @Override
    public void run() {
        for (Human human : world.humans) {
            human.advanceSimulation();
        }
    }
}
