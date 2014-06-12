package com.example.cursoandroidutnnivel1;

import android.app.Application;
import android.graphics.Bitmap.CompressFormat;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class MyApplication extends Application
{
	@Override
	public void onCreate()
	{
		super.onCreate();

		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(getApplicationContext()).discCacheExtraOptions(1200, 800, CompressFormat.PNG, 75,
				null).build();
		ImageLoader.getInstance().init(config);
	}
}