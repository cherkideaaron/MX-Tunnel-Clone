package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: Zm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0450Zm implements UH {
    public final Context a;
    public final String b;
    public final N2 c;
    public final boolean d;
    public final Object e = new Object();
    public C0433Ym f;
    public boolean m;

    public C0450Zm(Context context, String str, N2 n2, boolean z) {
        this.a = context;
        this.b = str;
        this.c = n2;
        this.d = z;
    }

    public final C0433Ym a() {
        C0433Ym c0433Ym;
        synchronized (this.e) {
            try {
                if (this.f == null) {
                    C0399Wm[] c0399WmArr = new C0399Wm[1];
                    if (this.b == null || !this.d) {
                        this.f = new C0433Ym(this.a, this.b, c0399WmArr, this.c);
                    } else {
                        this.f = new C0433Ym(this.a, new File(this.a.getNoBackupFilesDir(), this.b).getAbsolutePath(), c0399WmArr, this.c);
                    }
                    this.f.setWriteAheadLoggingEnabled(this.m);
                }
                c0433Ym = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0433Ym;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a().close();
    }

    @Override // defpackage.UH
    public final C0399Wm d() {
        return a().b();
    }

    @Override // defpackage.UH
    public final void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.e) {
            try {
                C0433Ym c0433Ym = this.f;
                if (c0433Ym != null) {
                    c0433Ym.setWriteAheadLoggingEnabled(z);
                }
                this.m = z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
