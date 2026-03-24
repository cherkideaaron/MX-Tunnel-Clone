package defpackage;

import com.google.android.gms.common.logging.Logger;

/* loaded from: classes2.dex */
public abstract class Ry {
    private static final Logger zza = new Logger("PhoneAuthProvider", new String[0]);

    public abstract void onCodeAutoRetrievalTimeOut(String str);

    public abstract void onCodeSent(String str, Qy qy);

    public abstract void onVerificationCompleted(Py py);

    public abstract void onVerificationFailed(C0142Hk c0142Hk);
}
