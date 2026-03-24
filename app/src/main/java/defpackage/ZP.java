package defpackage;

import com.google.android.gms.measurement.internal.zzjo;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class ZP {
    public static final AbstractC3071mp a;
    public static final SB b;
    public static final SB c;
    public static final SB d;

    static {
        int i = AbstractC3071mp.c;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        a = AbstractC3071mp.g(15, objArr);
        C2798hp c2798hp = AbstractC2906jp.b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        MO.f(7, objArr2);
        b = AbstractC2906jp.e(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        MO.f(3, objArr3);
        c = AbstractC2906jp.e(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        MO.f(2, objArr4);
        d = AbstractC2906jp.e(2, objArr4);
        Object[] objArrCopyOf = new Object[4];
        String[] strArr = zzjo.zza;
        int length = strArr.length;
        MO.f(length, strArr);
        if (4 < length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC0115Ga.t(4, length));
        }
        System.arraycopy(strArr, 0, objArrCopyOf, 0, length);
        String[] strArr2 = zzjo.zzb;
        int length2 = strArr2.length;
        MO.f(length2, strArr2);
        int i2 = length + length2;
        if (objArrCopyOf.length < i2) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC0115Ga.t(objArrCopyOf.length, i2));
        }
        System.arraycopy(strArr2, 0, objArrCopyOf, length, length2);
        AbstractC2906jp.e(i2, objArrCopyOf);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        MO.f(2, objArr5);
        AbstractC2906jp.e(2, objArr5);
    }
}
