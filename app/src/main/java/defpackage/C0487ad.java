package defpackage;

import android.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: ad, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0487ad {
    public final C0102Fe a;
    public final D3 b;

    public C0487ad(C0102Fe c0102Fe, C3121nk c3121nk) {
        this.a = c0102Fe;
        this.b = new D3(c3121nk);
    }

    public final String a(String str) {
        String strSubstring;
        D3 d3 = this.b;
        synchronized (d3) {
            if (Objects.equals((String) d3.c, str)) {
                strSubstring = (String) d3.d;
            } else {
                C3121nk c3121nk = (C3121nk) d3.b;
                C0423Yc c0423Yc = D3.g;
                c3121nk.getClass();
                File file = new File((File) c3121nk.d, str);
                file.mkdirs();
                List listK = C3121nk.k(file.listFiles(c0423Yc));
                if (listK.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
                    strSubstring = null;
                } else {
                    strSubstring = ((File) Collections.min(listK, D3.h)).getName().substring(4);
                }
            }
        }
        return strSubstring;
    }

    public final void b(String str) {
        D3 d3 = this.b;
        synchronized (d3) {
            if (!Objects.equals((String) d3.c, str)) {
                D3.M((C3121nk) d3.b, str, (String) d3.d);
                d3.c = str;
            }
        }
    }
}
