package com.singh.vinay.livestrimingofkick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import io.kickflip.sdk.Kickflip;
import io.kickflip.sdk.api.json.Stream;
import io.kickflip.sdk.av.BroadcastListener;
import io.kickflip.sdk.exception.KickflipException;

public class MainActivity extends AppCompatActivity {
    private static final String CLIENT_ID = "yHd7!UC2BYOq68YPYq6YIGusJJtISIyRZyzXLDaW";
    private static final java.lang.String CLIENT_SECRET ="Pysdn7E4q.VvDcMQb5Lo6WGZN60acJGrdB8@qc=klvbFpoacSmPkDNOQD?Vm?3c-NqW9lR2UWBGz:yOpSx2?U?aWMHbmXVFHx9TL6xiPau5UBo26K?cK?PfR_FVrF6r4";
    private static final String TAG = "ssssscfcf";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Kickflip.setup(this, CLIENT_ID, CLIENT_SECRET);
        Kickflip.startBroadcastActivity(MainActivity.this, new BroadcastListener() {
            @Override
            public void onBroadcastStart() {

            }

            @Override
            public void onBroadcastLive(Stream stream) {
                Log.i(TAG, "BroadcastLive @ " + stream.getKickflipUrl());
            }

            @Override
            public void onBroadcastStop() {

            }

            @Override
            public void onBroadcastError(KickflipException error) {

            }

        });

    }
}
