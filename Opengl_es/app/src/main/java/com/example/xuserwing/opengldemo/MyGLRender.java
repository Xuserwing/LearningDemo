package com.example.xuserwing.opengldemo;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Xuserwing on 2017/4/28.
 * gl渲染器
 */

public class MyGLRender implements GLSurfaceView.Renderer {
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        // onSurfaceCreated() - Called once to set up the view's OpenGL ES environment.
        // 四个参数为红绿蓝和透明度
        GLES20.glClearColor(0.5F, 0.5F, 0.5F, 1.0F);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        // onSurfaceChanged() - Called if the geometry of the view changes, for example when the device's screen orientation changes.
        GLES20.glViewport(0, 0, width, height);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        //onDrawFrame() - Called for each redraw of the view.
        //GL_COLOR_BUFFER_BIT：表明颜色缓冲区。
        //GL_DEPTH_BUFFER_BIT：表明深度缓冲区。
        //GL_STENCIL_BUFFER_BIT：表明模型缓冲区
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
    }
}
