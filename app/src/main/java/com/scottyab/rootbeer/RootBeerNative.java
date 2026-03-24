package com.scottyab.rootbeer;

import defpackage.AbstractC0136He;

/* loaded from: classes2.dex */
public class RootBeerNative {
    public static final boolean a;

    static {
        try {
            System.loadLibrary("toolChecker");
            a = true;
        } catch (UnsatisfiedLinkError e) {
            AbstractC0136He.n(e);
        }
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z);
}
