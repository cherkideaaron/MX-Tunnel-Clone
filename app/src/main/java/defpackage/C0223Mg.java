package defpackage;

import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: Mg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0223Mg extends Thread {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public C0223Mg(Context context, String str) {
        this.b = context;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0223Mg.run():void");
    }

    public C0223Mg(InputStream inputStream, InterfaceC3155oH interfaceC3155oH) {
        this.b = new BufferedReader(new InputStreamReader(inputStream));
        this.c = interfaceC3155oH;
    }
}
