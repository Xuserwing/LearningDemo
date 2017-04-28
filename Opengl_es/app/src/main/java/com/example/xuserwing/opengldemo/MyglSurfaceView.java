package com.example.xuserwing.opengldemo;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;

/**
 * Created by Xuserwing on 2017/4/28.
 */

public class MyglSurfaceView extends GLSurfaceView {
    private MyGLRender mMyGLRender;
    public MyglSurfaceView(Context context) {
        super(context);
        try {
            setEGLContextClientVersion(2);
            mMyGLRender = new MyGLRender();
            setRenderer(mMyGLRender);
            setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
        }catch (Exception e){
            Log.d("gldemo", "MyglSurfaceView: "+ e);
        }


    }

    public MyglSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

}
