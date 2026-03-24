package defpackage;

import com.google.android.gms.internal.ads.zziaw;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.recaptcha.internal.zzln;
import java.util.HashMap;

/* renamed from: pQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3219pQ {
    public static int a(int i, int i2) {
        return String.valueOf(i).length() + i2;
    }

    public static int b(int i, int i2, int i3) {
        return zziaw.zzA(i) + i2 + i3;
    }

    public static int c(int i, int i2, int i3, int i4) {
        return zziaw.zzA(i) + i2 + i3 + i4;
    }

    public static int d(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    public static String e(StringBuilder sb, String str, int i, String str2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ void f() {
    }

    public static void g(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static int h(int i, int i2, int i3) {
        return zzlm.zzz(i) + i2 + i3;
    }

    public static int i(int i, int i2, int i3) {
        return zzln.zzA(i) + i2 + i3;
    }
}
