package com.iqbal.library;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;

/**
 * Created by iqbal@asknteach.com on 12/22/15.
 */
public abstract class MovingAnimationDrawable extends AnimationDrawable {

    Handler hAnimationHandler;

    public MovingAnimationDrawable(AnimationDrawable animationDrawable) {
        for (int i = 0; i < animationDrawable.getNumberOfFrames(); i++) {
            this.addFrame(animationDrawable.getFrame(i), animationDrawable.getDuration(i));
        }
    }

    @Override
    public void start() {
        super.start();
        hAnimationHandler = new Handler();
        hAnimationHandler.postDelayed(new Runnable() {

            public void run() {
                onAnimationFinish();
            }
        }, getTotalDuration());

    }

    public int getTotalDuration() {

        int duration = 0;

        for (int i = 0; i < this.getNumberOfFrames(); i++) {
            duration += this.getDuration(i);
        }

        return duration;
    }

    protected abstract void onAnimationFinish();
}
