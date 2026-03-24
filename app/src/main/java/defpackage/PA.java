package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class PA implements InterfaceC2574dk {
    public static final Charset d = Charset.forName("UTF-8");
    public final File a;
    public final int b = 65536;
    public OA c;

    public PA(File file) {
        this.a = file;
    }

    public final void a() {
        File file = this.a;
        if (this.c == null) {
            try {
                this.c = new OA(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }

    @Override // defpackage.InterfaceC2574dk
    public final void c() {
        AbstractC0115Ga.m(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // defpackage.InterfaceC2574dk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e() {
        /*
            r7 = this;
            java.io.File r0 = r7.a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r1
            goto L3b
        Lc:
            r7.a()
            OA r0 = r7.c
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r2}
            int r0 = r0.l()
            byte[] r0 = new byte[r0]
            OA r4 = r7.c     // Catch: java.io.IOException -> L2b
            om r5 = new om     // Catch: java.io.IOException -> L2b
            r6 = 10
            r5.<init>(r6, r0, r3)     // Catch: java.io.IOException -> L2b
            r4.e(r5)     // Catch: java.io.IOException -> L2b
            goto L33
        L2b:
            r4 = move-exception
            java.lang.String r5 = "FirebaseCrashlytics"
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            android.util.Log.e(r5, r6, r4)
        L33:
            q1 r4 = new q1
            r3 = r3[r2]
            r5 = 4
            r4.<init>(r3, r5, r0)
        L3b:
            if (r4 != 0) goto L3f
            r3 = r1
            goto L4a
        L3f:
            int r0 = r4.b
            byte[] r3 = new byte[r0]
            java.lang.Object r4 = r4.c
            byte[] r4 = (byte[]) r4
            java.lang.System.arraycopy(r4, r2, r3, r2, r0)
        L4a:
            if (r3 == 0) goto L53
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r0 = defpackage.PA.d
            r1.<init>(r3, r0)
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.PA.e():java.lang.String");
    }

    @Override // defpackage.InterfaceC2574dk
    public final void n(long j, String str) {
        a();
        int i = this.b;
        if (this.c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i2 = i / 4;
            if (str.length() > i2) {
                str = "..." + str.substring(str.length() - i2);
            }
            this.c.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(d));
            while (!this.c.f() && this.c.l() > i) {
                this.c.i();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }
}
