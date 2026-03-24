package defpackage;

import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* renamed from: nt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3130nt implements JG {
    public static C3130nt b;
    public final int a;

    public C3130nt() {
        this.a = UserVerificationMethods.USER_VERIFY_ALL;
    }

    public static synchronized C3130nt d() {
        try {
            if (b == null) {
                b = new C3130nt(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            str = str.substring(0, 20);
        }
        sb.append(str);
        return sb.toString();
    }

    public void a(String str, String str2, Throwable... thArr) {
        if (this.a <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    public void b(String str, String str2, Throwable... thArr) {
        if (this.a <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    @Override // defpackage.JG
    public StackTraceElement[] c(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }

    public void e(String str, String str2, Throwable... thArr) {
        if (this.a <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    public void g(String str, String str2, Throwable... thArr) {
        if (this.a <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    public /* synthetic */ C3130nt(int i) {
        this.a = i;
    }
}
