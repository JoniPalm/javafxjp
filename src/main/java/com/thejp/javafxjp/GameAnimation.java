package com.thejp.javafxjp;

import javafx.animation.AnimationTimer;

public abstract class GameAnimation extends AnimationTimer {
    long lastFrameTime;
    @Override
    public void handle(long now) {
        float secondsSinceLastFrame = (float)((now - lastFrameTime) / 1e9);
        lastFrameTime = now;
        tick(secondsSinceLastFrame);
    }

    public abstract void tick(float secondsSinceLastFrame);
}
