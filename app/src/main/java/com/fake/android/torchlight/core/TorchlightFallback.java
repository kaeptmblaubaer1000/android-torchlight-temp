package com.fake.android.torchlight.core;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.fake.android.torchlight.R;

public class TorchlightFallback extends Torchlight {
    @Override
    public void init(Context context) {

    }

    @Override
    public void _release() {

    }

    @Override
    protected void _set(boolean enable) {
        if (enable && !enabled) {
            context.startActivity(new Intent(context, Activity.class));
        }
    }

    /**
     * Created by kaeptmblaubaer1000 on 23.02.2017.
     * This {@link android.app.Activity} provides compatibility for devices without a flash.
     */
    public static class Activity extends AppCompatActivity {
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_flash);
        }
    }
}
