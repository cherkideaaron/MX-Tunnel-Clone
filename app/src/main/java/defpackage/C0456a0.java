package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0456a0 extends AccessibilityNodeProvider {
    public final C0565c0 a;

    public C0456a0(C0565c0 c0565c0) {
        this.a = c0565c0;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        Z zA = this.a.a(i);
        if (zA == null) {
            return null;
        }
        return zA.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        Z zB = this.a.b(i);
        if (zB == null) {
            return null;
        }
        return zB.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.c(i, i2, bundle);
    }
}
