package org.achartengine.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class Point implements Serializable {
    private float mX;
    private float mY;

    public Point() {
    }

    public float getX() {
        return this.mX;
    }

    public float getY() {
        return this.mY;
    }

    public void setX(float f) {
        this.mX = f;
    }

    public void setY(float f) {
        this.mY = f;
    }

    public Point(float f, float f2) {
        this.mX = f;
        this.mY = f2;
    }
}
