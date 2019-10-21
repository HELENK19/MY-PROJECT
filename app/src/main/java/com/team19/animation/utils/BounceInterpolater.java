package com.team19.animation.utils;

import android.view.animation.Interpolator;

public class BounceInterpolater implements Interpolator {
    private double mAmplitude ;
    private double mFrequency ;

    public BounceInterpolater(double amplitude, double frequency) {
        mAmplitude = amplitude;
        mFrequency = frequency;
    }

    public float getInterpolation(float v) {
        return (float) (-1 * Math.pow(Math.E, -v/ mAmplitude) *
                Math.cos(mFrequency * v) + 1);
    }
}
