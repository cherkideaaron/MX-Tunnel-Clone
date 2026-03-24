package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: Ld, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0203Ld {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final C2578dp b;
    public final C3 c;
    public final JG d;
    public final C3308r6 e;

    static {
        HashMap map = new HashMap();
        f = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.0.4";
    }

    public C0203Ld(Context context, C2578dp c2578dp, C3 c3, C3178om c3178om, C3308r6 c3308r6) {
        this.a = context;
        this.b = c2578dp;
        this.c = c3;
        this.d = c3178om;
        this.e = c3308r6;
    }

    public static N5 c(KJ kj, int i) {
        int i2 = 0;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) kj.c;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        KJ kj2 = (KJ) kj.d;
        if (i >= 8) {
            for (KJ kj3 = kj2; kj3 != null; kj3 = (KJ) kj3.d) {
                i2++;
            }
        }
        int i3 = i2;
        String str = (String) kj.b;
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        byte b = (byte) (0 | 1);
        N5 n5C = (kj2 == null || i3 != 0) ? null : c(kj2, i + 1);
        if (b == 1) {
            return new N5(str, (String) kj.a, listD, n5C, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        throw new IllegalStateException(AbstractC3264qG.i("Missing required properties:", sb));
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            Q5 q5 = new Q5();
            q5.e = i;
            q5.f = (byte) (q5.f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            q5.a = jMax;
            byte b = (byte) (q5.f | 1);
            q5.f = b;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            q5.b = str;
            q5.c = fileName;
            q5.d = lineNumber;
            q5.f = (byte) (b | 2);
            arrayList.add(q5.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final List a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        C3 c3 = this.c;
        String str = c3.e;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        if (b == 3) {
            return Collections.singletonList(new M5(str, c3.b, 0L, 0L));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        throw new IllegalStateException(AbstractC3264qG.i("Missing required properties:", sb));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.V5 b(int r18) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0203Ld.b(int):V5");
    }
}
