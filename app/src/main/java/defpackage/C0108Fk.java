package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.components.ComponentRegistrar;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: Fk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0108Fk implements InterfaceC2892jb, InterfaceC0151Ic, InterfaceC3478uE, InterfaceC0209Lj, TH, CC, Uz {
    public static final C0108Fk b = new C0108Fk(1);
    public static final C0108Fk c = new C0108Fk(2);
    public static final C0108Fk d = new C0108Fk(3);
    public static final /* synthetic */ C0108Fk e = new C0108Fk(4);
    public static final C0108Fk f = new C0108Fk(5);
    public static final C0108Fk m = new C0108Fk(6);
    public static final C3694yE n = new C3694yE(null, null, null, null, null);
    public static final C0108Fk o = new C0108Fk(7);
    public final /* synthetic */ int a;

    public /* synthetic */ C0108Fk(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0072 -> B:27:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.C0108Fk r11, java.io.FileOutputStream r12, defpackage.InterfaceC3493uc r13) throws java.io.IOException {
        /*
            r11.getClass()
            boolean r0 = r13 instanceof defpackage.Fv
            if (r0 == 0) goto L16
            r0 = r13
            Fv r0 = (defpackage.Fv) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.e = r1
            goto L1b
        L16:
            Fv r0 = new Fv
            r0.<init>(r11, r13)
        L1b:
            java.lang.Object r11 = r0.c
            Sc r13 = defpackage.EnumC0321Sc.a
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            long r3 = r0.b
            java.io.FileOutputStream r12 = r0.a
            defpackage.AbstractC0115Ga.U(r11)
            goto L75
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            defpackage.AbstractC0115Ga.U(r11)
            r3 = 10
        L3b:
            r5 = 60000(0xea60, double:2.9644E-319)
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
        */
        //  java.lang.String r1 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
        /*
            if (r11 > 0) goto L7a
            java.nio.channels.FileChannel r5 = r12.getChannel()     // Catch: java.io.IOException -> L59
            r6 = 0
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            java.nio.channels.FileLock r11 = r5.lock(r6, r8, r10)     // Catch: java.io.IOException -> L59
            defpackage.AbstractC0500aq.l(r11, r1)     // Catch: java.io.IOException -> L59
            r13 = r11
            goto L8d
        L59:
            r11 = move-exception
            java.lang.String r1 = r11.getMessage()
            if (r1 == 0) goto L79
            java.lang.String r5 = "Resource deadlock would occur"
            boolean r1 = defpackage.AbstractC3481uH.b0(r1, r5)
            if (r1 != r2) goto L79
            r0.a = r12
            r0.b = r3
            r0.e = r2
            java.lang.Object r11 = defpackage.AbstractC0136He.k(r3, r0)
            if (r11 != r13) goto L75
            goto L8d
        L75:
            r11 = 2
            long r5 = (long) r11
            long r3 = r3 * r5
            goto L3b
        L79:
            throw r11
        L7a:
            java.nio.channels.FileChannel r5 = r12.getChannel()
            r6 = 0
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            java.nio.channels.FileLock r13 = r5.lock(r6, r8, r10)
            defpackage.AbstractC0500aq.l(r13, r1)
        L8d:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0108Fk.c(Fk, java.io.FileOutputStream, uc):java.lang.Object");
    }

    public static C0108Fk f(Context context, int i) throws Resources.NotFoundException {
        AbstractC0136He.e("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, RA.p);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListX = AbstractC3296qu.x(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListX2 = AbstractC3296qu.x(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListX3 = AbstractC3296qu.x(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        C2878jF c2878jFA = C2878jF.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C2754h(0)).a();
        typedArrayObtainStyledAttributes.recycle();
        return new C0108Fk(colorStateListX, colorStateListX2, colorStateListX3, dimensionPixelSize, c2878jFA, rect);
    }

    @Override // defpackage.TH
    public UH b(C0312Rk c0312Rk) {
        boolean z = c0312Rk.a;
        return new C0450Zm((Context) c0312Rk.b, (String) c0312Rk.c, (N2) c0312Rk.d, z);
    }

    @Override // defpackage.InterfaceC2892jb
    public Object d(C2811i1 c2811i1) {
        switch (this.a) {
            case 2:
                Object objG = c2811i1.g(new KA(U6.class, Executor.class));
                AbstractC0500aq.l(objG, "get(...)");
                return new C3010lj((Executor) objG);
            default:
                Object objG2 = c2811i1.g(new KA(InterfaceC3538vK.class, Executor.class));
                AbstractC0500aq.l(objG2, "get(...)");
                return new C3010lj((Executor) objG2);
        }
    }

    public void e(InterfaceC0157Ii interfaceC0157Ii) {
        C3630x4 c3630x4 = C3630x4.a;
        C0386Vq c0386Vq = (C0386Vq) interfaceC0157Ii;
        c0386Vq.a(AbstractC0186Kd.class, c3630x4);
        c0386Vq.a(C3469u5.class, c3630x4);
        D4 d4 = D4.a;
        c0386Vq.a(AbstractC0169Jd.class, d4);
        c0386Vq.a(D5.class, d4);
        A4 a4 = A4.a;
        c0386Vq.a(AbstractC3332rd.class, a4);
        c0386Vq.a(E5.class, a4);
        B4 b4 = B4.a;
        c0386Vq.a(AbstractC3279qd.class, b4);
        c0386Vq.a(F5.class, b4);
        T4 t4 = T4.a;
        c0386Vq.a(AbstractC0152Id.class, t4);
        c0386Vq.a(C2542d6.class, t4);
        S4 s4 = S4.a;
        c0386Vq.a(AbstractC0135Hd.class, s4);
        c0386Vq.a(C0571c6.class, s4);
        C4 c4 = C4.a;
        c0386Vq.a(AbstractC3386sd.class, c4);
        c0386Vq.a(H5.class, c4);
        N4 n4 = N4.a;
        c0386Vq.a(AbstractC0118Gd.class, n4);
        c0386Vq.a(J5.class, n4);
        E4 e4 = E4.a;
        c0386Vq.a(AbstractC0016Ad.class, e4);
        c0386Vq.a(K5.class, e4);
        G4 g4 = G4.a;
        c0386Vq.a(AbstractC3710yd.class, g4);
        c0386Vq.a(L5.class, g4);
        J4 j4 = J4.a;
        c0386Vq.a(AbstractC3656xd.class, j4);
        c0386Vq.a(P5.class, j4);
        K4 k4 = K4.a;
        c0386Vq.a(AbstractC3602wd.class, k4);
        c0386Vq.a(R5.class, k4);
        H4 h4 = H4.a;
        c0386Vq.a(AbstractC3494ud.class, h4);
        c0386Vq.a(N5.class, h4);
        C3522v4 c3522v4 = C3522v4.a;
        c0386Vq.a(AbstractC3059md.class, c3522v4);
        c0386Vq.a(C3631x5.class, c3522v4);
        C3468u4 c3468u4 = C3468u4.a;
        c0386Vq.a(AbstractC3004ld.class, c3468u4);
        c0386Vq.a(C3685y5.class, c3468u4);
        I4 i4 = I4.a;
        c0386Vq.a(AbstractC3548vd.class, i4);
        c0386Vq.a(O5.class, i4);
        F4 f4 = F4.a;
        c0386Vq.a(AbstractC3440td.class, f4);
        c0386Vq.a(M5.class, f4);
        C3576w4 c3576w4 = C3576w4.a;
        c0386Vq.a(AbstractC3114nd.class, c3576w4);
        c0386Vq.a(C3739z5.class, c3576w4);
        L4 l4 = L4.a;
        c0386Vq.a(AbstractC3764zd.class, l4);
        c0386Vq.a(T5.class, l4);
        M4 m4 = M4.a;
        c0386Vq.a(AbstractC0033Bd.class, m4);
        c0386Vq.a(V5.class, m4);
        O4 o4 = O4.a;
        c0386Vq.a(AbstractC0050Cd.class, o4);
        c0386Vq.a(W5.class, o4);
        R4 r4 = R4.a;
        c0386Vq.a(AbstractC0101Fd.class, r4);
        c0386Vq.a(C0462a6.class, r4);
        P4 p4 = P4.a;
        c0386Vq.a(AbstractC0084Ed.class, p4);
        c0386Vq.a(Y5.class, p4);
        Q4 q4 = Q4.a;
        c0386Vq.a(AbstractC0067Dd.class, q4);
        c0386Vq.a(Z5.class, q4);
        C3684y4 c3684y4 = C3684y4.a;
        c0386Vq.a(AbstractC3224pd.class, c3684y4);
        c0386Vq.a(A5.class, c3684y4);
        C3738z4 c3738z4 = C3738z4.a;
        c0386Vq.a(AbstractC3169od.class, c3738z4);
        c0386Vq.a(B5.class, c3738z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(defpackage.InterfaceC0227Mk r9, defpackage.InterfaceC3493uc r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.C0181Jp
            if (r0 == 0) goto L13
            r0 = r10
            Jp r0 = (defpackage.C0181Jp) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            Jp r0 = new Jp
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.d
            java.lang.String r3 = "FirebaseSessions"
            r4 = 2
            r5 = 1
            java.lang.String r6 = ""
            if (r2 == 0) goto L48
            if (r2 == r5) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r9 = r0.a
            java.lang.String r9 = (java.lang.String) r9
            defpackage.AbstractC0115Ga.U(r10)     // Catch: java.lang.Exception -> L33
            goto L90
        L33:
            r10 = move-exception
            goto L97
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            java.lang.Object r9 = r0.a
            Mk r9 = (defpackage.InterfaceC0227Mk) r9
            defpackage.AbstractC0115Ga.U(r10)     // Catch: java.lang.Exception -> L46
            goto L65
        L46:
            r10 = move-exception
            goto L73
        L48:
            defpackage.AbstractC0115Ga.U(r10)
            r10 = r9
            Lk r10 = (defpackage.C0210Lk) r10     // Catch: java.lang.Exception -> L46
            com.google.android.gms.tasks.Task r9 = r10.e()     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = "getToken(...)"
            defpackage.AbstractC0500aq.l(r9, r2)     // Catch: java.lang.Exception -> L71
            r0.a = r10     // Catch: java.lang.Exception -> L71
            r0.d = r5     // Catch: java.lang.Exception -> L71
            java.lang.Object r9 = defpackage.AbstractC3279qd.b(r9, r0)     // Catch: java.lang.Exception -> L71
            if (r9 != r1) goto L62
            return r1
        L62:
            r7 = r10
            r10 = r9
            r9 = r7
        L65:
            p6 r10 = (defpackage.C3199p6) r10     // Catch: java.lang.Exception -> L46
            java.lang.String r10 = r10.a     // Catch: java.lang.Exception -> L46
            r7 = r10
            r10 = r9
            r9 = r7
            goto L7a
        L6d:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L73
        L71:
            r9 = move-exception
            goto L6d
        L73:
            java.lang.String r2 = "Error getting authentication token."
            android.util.Log.w(r3, r2, r10)
            r10 = r9
            r9 = r6
        L7a:
            Lk r10 = (defpackage.C0210Lk) r10     // Catch: java.lang.Exception -> L33
            com.google.android.gms.tasks.Task r10 = r10.d()     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "getId(...)"
            defpackage.AbstractC0500aq.l(r10, r2)     // Catch: java.lang.Exception -> L33
            r0.a = r9     // Catch: java.lang.Exception -> L33
            r0.d = r4     // Catch: java.lang.Exception -> L33
            java.lang.Object r10 = defpackage.AbstractC3279qd.b(r10, r0)     // Catch: java.lang.Exception -> L33
            if (r10 != r1) goto L90
            return r1
        L90:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L33
            if (r10 != 0) goto L95
            goto L9c
        L95:
            r6 = r10
            goto L9c
        L97:
            java.lang.String r0 = "Error getting Firebase installation id ."
            android.util.Log.w(r3, r0, r10)
        L9c:
            Kp r10 = new Kp
            r10.<init>(r6, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0108Fk.g(Mk, uc):java.lang.Object");
    }

    @Override // defpackage.InterfaceC3203pA
    public Object get() {
        switch (this.a) {
            case 15:
                return C2816i6.f;
            default:
                return new VK(1);
        }
    }

    @Override // defpackage.InterfaceC3478uE
    public /* bridge */ /* synthetic */ Object getDefaultValue() {
        return n;
    }

    public Signature[] h(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // defpackage.Uz
    public void i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.Uz
    public void j(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    public int k(Object obj) {
        return ((C0381Vl) obj).c;
    }

    public boolean l(Object obj) {
        return ((C0381Vl) obj).d;
    }

    public List m(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C0319Sa c0319Sa : componentRegistrar.getComponents()) {
            String str = c0319Sa.a;
            if (str != null) {
                C2947kb c2947kb = new C2947kb(0, str, c0319Sa);
                c0319Sa = new C0319Sa(str, c0319Sa.b, c0319Sa.c, c0319Sa.d, c0319Sa.e, c2947kb, c0319Sa.g);
            }
            arrayList.add(c0319Sa);
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC3478uE
    public Object readFrom(InputStream inputStream, InterfaceC3493uc interfaceC3493uc) throws C0389Wc {
        try {
            C0284Pq c0284Pq = C0284Pq.d;
            String strX = CH.X(MO.B(inputStream));
            c0284Pq.getClass();
            return (C3694yE) c0284Pq.a(C3694yE.Companion.serializer(), strX);
        } catch (Exception e2) {
            throw new C0389Wc("Cannot parse session configs", e2);
        }
    }

    @Override // defpackage.InterfaceC3478uE
    public Object writeTo(Object obj, OutputStream outputStream, InterfaceC3493uc interfaceC3493uc) throws IOException {
        byte[] bytes = C0284Pq.d.b(C3694yE.Companion.serializer(), (C3694yE) obj).getBytes(AbstractC3202p9.a);
        AbstractC0500aq.l(bytes, "getBytes(...)");
        outputStream.write(bytes);
        return DK.a;
    }

    public C0108Fk(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C2878jF c2878jF, Rect rect) {
        this.a = 9;
        AbstractC0136He.f(rect.left);
        AbstractC0136He.f(rect.top);
        AbstractC0136He.f(rect.right);
        AbstractC0136He.f(rect.bottom);
    }

    public C0108Fk(RecyclerView recyclerView) {
        this.a = 24;
    }

    @Override // defpackage.CC
    public void a() {
    }
}
