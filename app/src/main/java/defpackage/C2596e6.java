package defpackage;

import android.content.Context;

/* renamed from: e6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2596e6 extends AbstractC0356Ud {
    public final Context a;
    public final VK b;
    public final VK c;
    public final String d;

    public C2596e6(Context context, VK vk, VK vk2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = context;
        if (vk == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = vk;
        if (vk2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = vk2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0356Ud)) {
            return false;
        }
        AbstractC0356Ud abstractC0356Ud = (AbstractC0356Ud) obj;
        if (this.a.equals(((C2596e6) abstractC0356Ud).a)) {
            C2596e6 c2596e6 = (C2596e6) abstractC0356Ud;
            if (this.b.equals(c2596e6.b) && this.c.equals(c2596e6.c) && this.d.equals(c2596e6.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return AbstractC3264qG.l(sb, this.d, "}");
    }
}
