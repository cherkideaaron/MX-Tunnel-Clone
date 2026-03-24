package defpackage;

import android.app.Notification;

/* renamed from: Xl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0415Xl {
    public final int a;
    public final int b;
    public final Notification c;

    public C0415Xl(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0415Xl.class != obj.getClass()) {
            return false;
        }
        C0415Xl c0415Xl = (C0415Xl) obj;
        if (this.a == c0415Xl.a && this.b == c0415Xl.b) {
            return this.c.equals(c0415Xl.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
