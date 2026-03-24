package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: db, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2565db extends Activity implements Or, InterfaceC3128nr {

    @NotNull
    private final WF extraDataMap = new WF(0);

    @NotNull
    private final Qr lifecycleRegistry = new Qr(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(@NotNull KeyEvent keyEvent) {
        AbstractC0500aq.m(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC0500aq.l(decorView, "window.decorView");
        if (AbstractC0136He.l(decorView, keyEvent)) {
            return true;
        }
        return AbstractC0136He.m(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(@NotNull KeyEvent keyEvent) {
        AbstractC0500aq.m(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC0500aq.l(decorView, "window.decorView");
        if (AbstractC0136He.l(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Nullable
    public <T extends AbstractC0438Za> T getExtraData(@NotNull Class<T> cls) {
        AbstractC0500aq.m(cls, "extraDataClass");
        Vs.u(this.extraDataMap.get(cls));
        return null;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = FragmentC2930kC.b;
        AbstractC0500aq.M(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC0500aq.m(bundle, "outState");
        Qr qr = this.lifecycleRegistry;
        Ir ir = Ir.a;
        qr.g();
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(@NotNull AbstractC0438Za abstractC0438Za) {
        AbstractC0500aq.m(abstractC0438Za, "extraData");
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldDumpInternalState(@org.jetbrains.annotations.Nullable java.lang.String[] r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L5c
            int r2 = r4.length
            if (r2 != 0) goto L8
            goto L5c
        L8:
            r4 = r4[r1]
            int r2 = r4.hashCode()
            switch(r2) {
                case -645125871: goto L4c;
                case 100470631: goto L3c;
                case 472614934: goto L33;
                case 1159329357: goto L23;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L5c
        L12:
            java.lang.String r2 = "--autofill"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L1b
            goto L5c
        L1b:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r4 < r2) goto L5c
        L21:
            r1 = r0
            goto L5c
        L23:
            java.lang.String r2 = "--contentcapture"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L2c
            goto L5c
        L2c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r4 < r2) goto L5c
            goto L21
        L33:
            java.lang.String r2 = "--list-dumpables"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L45
            goto L5c
        L3c:
            java.lang.String r2 = "--dump-dumpable"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L45
            goto L5c
        L45:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r4 < r2) goto L5c
            goto L21
        L4c:
            java.lang.String r2 = "--translation"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L55
            goto L5c
        L55:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r4 < r2) goto L5c
            goto L21
        L5c:
            r4 = r1 ^ 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractActivityC2565db.shouldDumpInternalState(java.lang.String[]):boolean");
    }

    @Override // defpackage.InterfaceC3128nr
    public boolean superDispatchKeyEvent(@NotNull KeyEvent keyEvent) {
        AbstractC0500aq.m(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public Context zza() {
        return getApplicationContext();
    }
}
