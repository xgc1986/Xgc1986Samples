package com.xgc1986.xgc1986samples.helper;

import android.os.Build;

import com.xgc1986.xgc1986samples.R;
import com.xgc1986.xgc1986samples.demo.ParallaxDemoActivity;
import com.xgc1986.xgc1986samples.demo.RippleButtonDemoActivity;
import com.xgc1986.xgc1986samples.demo.RippleImageButtonDemoActivity;
import com.xgc1986.xgc1986samples.demoV19.RippleButtonDemoV19Activity;
import com.xgc1986.xgc1986samples.demoV19.RippleImageButtonDemoV19Activity;

public class ActivityHelper {

    // demo_activity_parallax demos
    public static ActivityHelper rippleButtonDemo = new ActivityHelper(
            RippleButtonDemoActivity.class,
            RippleButtonDemoV19Activity.class,
            null,
            "Basic buttons Demo",
            "RippleButton class",
            "https://github.com/xgc1986/RippleButton",
            R.mipmap.demo_ripple_button,
            R.color.blue_light);
    public static ActivityHelper rippleImageButtonDemo = new ActivityHelper(
            RippleImageButtonDemoActivity.class,
            RippleImageButtonDemoV19Activity.class,
            null,
            "Image Buttons demo",
            "RippleImageButton class",
            "https://github.com/xgc1986/RippleButton",
            R.mipmap.demo_ripple_imagebutton,
            R.color.blue_light);
    public static ActivityHelper parallaxDemo = new ActivityHelper(
            ParallaxDemoActivity.class,
            null,
            null,
            "Parallax Pager Demo",
            "Create a pager transition with parallax effect",
            "https://github.com/xgc1986/ParallaxPagerTransformer",
            R.mipmap.demo_parallax,
            R.color.green_light);

    /*
      Class stuff
     */
    private Class<?> mV21Activity;
    private Class<?> mV10Activity;
    private Class<?> mV19Activity;

    public String mTitle;
    public String mSubtitle;
    public String mGithub;
    public int mImageResource;
    public int mColor;


    private ActivityHelper(Class<?> v21Activity, Class<?> v19Activity, Class<?> v10Activity, String title, String subtitle, String github, int resource, int color) {
        mV21Activity = v21Activity;
        mV10Activity = v10Activity;
        mV19Activity = v19Activity;
        mTitle = title;
        mSubtitle = subtitle;
        mGithub = github;
        mImageResource = resource;
        mColor = color;
    }

    public Class<?> getActivity() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            if (mV21Activity != null) {
                return mV21Activity;
            }
            return null;
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
            if (mV19Activity != null) {
                return mV19Activity;
            } else {
                return mV21Activity;
            }
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
            if (mV10Activity != null) {
                return mV10Activity;
            } else if (mV19Activity != null) {
                return mV19Activity;
            } else {
                return mV21Activity;
            }
        }

        return null;
    }
}
