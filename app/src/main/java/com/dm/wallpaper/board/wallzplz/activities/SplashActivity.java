package com.hamzabadar.wallzplz.activities;

import android.support.annotation.NonNull;

import com.dm.wallpaper.board.activities.WallpaperBoardSplashActivity;
import com.dm.wallpaper.board.activities.configurations.SplashScreenConfiguration;
import com.hamzabadar.wallzplz.R;

public class SplashActivity extends WallpaperBoardSplashActivity {

    @NonNull
    @Override
    public SplashScreenConfiguration onInit() {
        return new SplashScreenConfiguration(MainActivity.class)
                .setBottomText(getString(R.string.splash_screen_title));
    }
}
