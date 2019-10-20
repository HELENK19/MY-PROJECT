package com.team19.animation.ui;

import android.view.animation.Interpolator;

public class BounceInterpolater implements Interpolator {

    private double mAmplitude = 1;
    private double mFrequency = 10;

    BounceInterpolater(double amplitude, double frequency) {
        mAmplitude = amplitude;
        mFrequency = frequency;
    }

    public float getInterpolation(float v) {
        return (float) (-1 * Math.pow(Math.E, -v/ mAmplitude) *
                Math.cos(mFrequency * v) + 1);
    }
}
