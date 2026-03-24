package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.fragment.app.l;
import androidx.fragment.app.t;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzaer;
import com.google.android.gms.internal.p002firebaseauthapi.zzahs;
import com.google.android.gms.internal.p002firebaseauthapi.zzt;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.google.firebase.auth.internal.RecaptchaActivity;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.SplashActivity;

/* renamed from: om, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3178om implements JG, NA, SuccessContinuation, DC, Uw, OnCompleteListener, Continuation {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public C3178om(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.b = new AtomicInteger();
                this.c = new AtomicInteger();
                break;
            case 17:
                this.b = new WF();
                this.c = new C3240pt();
                break;
            default:
                this.b = new SparseIntArray();
                this.c = new SparseIntArray();
                break;
        }
    }

    public static int z(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public ArrayList A(String str) {
        UC ucC = UC.c(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            ucC.f(1);
        } else {
            ucC.g(1, str);
        }
        TC tc = (TC) this.b;
        tc.b();
        Cursor cursorG = tc.g(ucC);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            ucC.release();
        }
    }

    public void B(C3686y6 c3686y6) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c3686y6.a);
            jSONObject.put("Status", AbstractC3264qG.A(c3686y6.b));
            jSONObject.put("AuthToken", c3686y6.c);
            jSONObject.put("RefreshToken", c3686y6.d);
            jSONObject.put("TokenCreationEpochInSecs", c3686y6.f);
            jSONObject.put("ExpiresInSecs", c3686y6.e);
            jSONObject.put("FisError", c3686y6.g);
            C3663xk c3663xk = (C3663xk) this.c;
            c3663xk.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", c3663xk.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(x())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void C(C2808hz c2808hz) {
        TC tc = (TC) this.b;
        tc.b();
        tc.c();
        try {
            ((C0087Eg) this.c).e(c2808hz);
            tc.h();
        } finally {
            tc.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int D(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.b
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r0.length
            if (r6 < r0) goto Lc
            return r1
        Lc:
            java.lang.Object r0 = r5.c
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L14
        L12:
            r0 = r1
            goto L6f
        L14:
            r2 = 0
            if (r0 != 0) goto L18
            goto L33
        L18:
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L1e:
            if (r0 < 0) goto L33
            java.lang.Object r3 = r5.c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r0)
            MG r3 = (defpackage.MG) r3
            int r4 = r3.a
            if (r4 != r6) goto L30
            r2 = r3
            goto L33
        L30:
            int r0 = r0 + (-1)
            goto L1e
        L33:
            if (r2 == 0) goto L3c
            java.lang.Object r0 = r5.c
            java.util.List r0 = (java.util.List) r0
            r0.remove(r2)
        L3c:
            java.lang.Object r0 = r5.c
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r2 = 0
        L45:
            if (r2 >= r0) goto L59
            java.lang.Object r3 = r5.c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r2)
            MG r3 = (defpackage.MG) r3
            int r3 = r3.a
            if (r3 < r6) goto L56
            goto L5a
        L56:
            int r2 = r2 + 1
            goto L45
        L59:
            r2 = r1
        L5a:
            if (r2 == r1) goto L12
            java.lang.Object r0 = r5.c
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
            MG r0 = (defpackage.MG) r0
            java.lang.Object r3 = r5.c
            java.util.List r3 = (java.util.List) r3
            r3.remove(r2)
            int r0 = r0.a
        L6f:
            if (r0 != r1) goto L7f
            java.lang.Object r0 = r5.b
            int[] r0 = (int[]) r0
            int r2 = r0.length
            java.util.Arrays.fill(r0, r6, r2, r1)
            java.lang.Object r6 = r5.b
            int[] r6 = (int[]) r6
            int r6 = r6.length
            return r6
        L7f:
            int r0 = r0 + 1
            java.lang.Object r2 = r5.b
            int[] r2 = (int[]) r2
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.Object r2 = r5.b
            int[] r2 = (int[]) r2
            java.util.Arrays.fill(r2, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3178om.D(int):int");
    }

    public void E() {
        ((SparseIntArray) this.b).clear();
    }

    public boolean F(View view) {
        GL gl = (GL) this.b;
        int iG = gl.g();
        int iM = gl.m();
        int iE = gl.e(view);
        int iP = gl.p(view);
        FL fl = (FL) this.c;
        fl.b = iG;
        fl.c = iM;
        fl.d = iE;
        fl.e = iP;
        fl.a = 24579;
        return fl.a();
    }

    public void G(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        u(i3);
        int[] iArr2 = (int[]) this.b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.b, i, i3, -1);
        List list = (List) this.c;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            MG mg = (MG) ((List) this.c).get(size);
            int i4 = mg.a;
            if (i4 >= i) {
                mg.a = i4 + i2;
            }
        }
    }

    public void H(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        u(i3);
        int[] iArr2 = (int[]) this.b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        List list = (List) this.c;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            MG mg = (MG) ((List) this.c).get(size);
            int i4 = mg.a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((List) this.c).remove(size);
                } else {
                    mg.a = i4 - i2;
                }
            }
        }
    }

    public LA I(JB jb, int i) {
        ZL zl;
        LA la;
        WF wf = (WF) this.b;
        int iE = wf.e(jb);
        if (iE >= 0 && (zl = (ZL) wf.j(iE)) != null) {
            int i2 = zl.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                zl.a = i3;
                if (i == 4) {
                    la = zl.b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    la = zl.c;
                }
                if ((i3 & 12) == 0) {
                    wf.h(iE);
                    zl.a = 0;
                    zl.b = null;
                    zl.c = null;
                    ZL.d.c(zl);
                }
                return la;
            }
        }
        return null;
    }

    public C3686y6 J() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(x());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = C3686y6.h;
        C3632x6 c3632x6 = new C3632x6();
        c3632x6.f = 0L;
        c3632x6.h = (byte) (c3632x6.h | 2);
        c3632x6.b(1);
        c3632x6.e = 0L;
        c3632x6.h = (byte) (c3632x6.h | 1);
        c3632x6.a = strOptString;
        c3632x6.b(AbstractC3264qG.F(5)[iOptInt]);
        c3632x6.c = strOptString2;
        c3632x6.d = strOptString3;
        c3632x6.f = jOptLong;
        byte b = (byte) (c3632x6.h | 2);
        c3632x6.e = jOptLong2;
        c3632x6.h = (byte) (b | 1);
        c3632x6.g = strOptString4;
        return c3632x6.a();
    }

    public void K(JB jb) {
        ZL zl = (ZL) ((WF) this.b).get(jb);
        if (zl == null) {
            return;
        }
        zl.a &= -2;
    }

    public void L(JB jb) {
        C3240pt c3240pt = (C3240pt) this.c;
        int iH = c3240pt.h() - 1;
        while (true) {
            if (iH < 0) {
                break;
            }
            if (jb == c3240pt.i(iH)) {
                Object[] objArr = c3240pt.c;
                Object obj = objArr[iH];
                Object obj2 = AbstractC0115Ga.f;
                if (obj != obj2) {
                    objArr[iH] = obj2;
                    c3240pt.a = true;
                }
            } else {
                iH--;
            }
        }
        ZL zl = (ZL) ((WF) this.b).remove(jb);
        if (zl != null) {
            zl.a = 0;
            zl.b = null;
            zl.c = null;
            ZL.d.c(zl);
        }
    }

    @Override // defpackage.NA
    public void a(MA ma, int i) throws IOException {
        int[] iArr = (int[]) this.c;
        try {
            ma.read((byte[]) this.b, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            ma.close();
        }
    }

    @Override // defpackage.DC
    public void b(String str) {
        boolean zContains = str.contains("Success! Created");
        SplashActivity splashActivity = (SplashActivity) this.c;
        if (zContains) {
            XD xd = splashActivity.b.b;
            String string = Deobfuscator$MHRTUNNELVPN$app.getString(-168078602367930L);
            String str2 = (String) this.b;
            xd.putString(string, str2);
            xd.apply();
            XD xd2 = splashActivity.b.b;
            xd2.putString(Deobfuscator$MHRTUNNELVPN$app.getString(-168117257073594L), str2);
            xd2.apply();
            new Ux(splashActivity, 3000L).start();
            splashActivity.c.setVisibility(8);
        }
        if (str.contains("Success! Exists")) {
            splashActivity.c.setText("A problem has occured please try again later!");
            AbstractC3279qd.j0(splashActivity.getApplicationContext(), "Retry Again Later!");
            new Handler().postDelayed(new RunnableC2705g5(this, 24), 3000L);
        }
    }

    @Override // defpackage.JG
    public StackTraceElement[] c(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrC = stackTraceElementArr;
        for (JG jg : (JG[]) this.b) {
            if (stackTraceElementArrC.length <= 1024) {
                break;
            }
            stackTraceElementArrC = jg.c(stackTraceElementArr);
        }
        return stackTraceElementArrC.length > 1024 ? ((C3130nt) this.c).c(stackTraceElementArrC) : stackTraceElementArrC;
    }

    public void d(JB jb, LA la) {
        WF wf = (WF) this.b;
        ZL zlA = (ZL) wf.get(jb);
        if (zlA == null) {
            zlA = ZL.a();
            wf.put(jb, zlA);
        }
        zlA.c = la;
        zlA.a |= 8;
    }

    public void e() {
        int[] iArr = (int[]) this.b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.c = null;
    }

    public void f(boolean z) {
        l lVar = ((t) this.c).v;
        if (lVar != null) {
            lVar.getParentFragmentManager().l.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
    }

    public void g(boolean z) {
        t tVar = (t) this.c;
        Context context = tVar.t.b;
        l lVar = tVar.v;
        if (lVar != null) {
            lVar.getParentFragmentManager().l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
    }

    public void h(boolean z) {
        l lVar = ((t) this.c).v;
        if (lVar != null) {
            lVar.getParentFragmentManager().l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
    }

    public void i(boolean z) {
        l lVar = ((t) this.c).v;
        if (lVar != null) {
            lVar.getParentFragmentManager().l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    @Override // defpackage.Uw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.AN j(android.view.View r17, defpackage.AN r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Object r3 = r0.c
            oM r3 = (defpackage.C3160oM) r3
            int r4 = r3.a
            java.lang.Object r5 = r0.b
            H7 r5 = (defpackage.H7) r5
            r5.getClass()
            yN r6 = r2.a
            r7 = 7
            Gp r7 = r6.f(r7)
            r8 = 32
            Gp r6 = r6.f(r8)
            int r8 = r7.b
            java.lang.Object r9 = r5.b
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r9
            r9.w = r8
            int r8 = r17.getLayoutDirection()
            r11 = 1
            if (r8 != r11) goto L31
            r8 = r11
            goto L32
        L31:
            r8 = 0
        L32:
            int r12 = r17.getPaddingBottom()
            int r13 = r17.getPaddingLeft()
            int r14 = r17.getPaddingRight()
            boolean r15 = r9.o
            if (r15 == 0) goto L4b
            int r12 = r18.a()
            r9.v = r12
            int r10 = r3.c
            int r12 = r12 + r10
        L4b:
            int r3 = r3.b
            boolean r10 = r9.p
            int r11 = r7.a
            if (r10 == 0) goto L5a
            if (r8 == 0) goto L57
            r10 = r3
            goto L58
        L57:
            r10 = r4
        L58:
            int r13 = r10 + r11
        L5a:
            boolean r10 = r9.q
            int r0 = r7.c
            if (r10 == 0) goto L66
            if (r8 == 0) goto L63
            goto L64
        L63:
            r4 = r3
        L64:
            int r14 = r4 + r0
        L66:
            android.view.ViewGroup$LayoutParams r3 = r17.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            boolean r4 = r9.s
            if (r4 == 0) goto L78
            int r4 = r3.leftMargin
            if (r4 == r11) goto L78
            r3.leftMargin = r11
            r10 = 1
            goto L79
        L78:
            r10 = 0
        L79:
            boolean r4 = r9.t
            if (r4 == 0) goto L84
            int r4 = r3.rightMargin
            if (r4 == r0) goto L84
            r3.rightMargin = r0
            r10 = 1
        L84:
            boolean r0 = r9.u
            if (r0 == 0) goto L92
            int r0 = r3.topMargin
            int r4 = r7.b
            if (r0 == r4) goto L92
            r3.topMargin = r4
            r11 = 1
            goto L93
        L92:
            r11 = r10
        L93:
            if (r11 == 0) goto L98
            r1.setLayoutParams(r3)
        L98:
            int r0 = r17.getPaddingTop()
            r1.setPadding(r13, r0, r14, r12)
            boolean r0 = r5.a
            if (r0 == 0) goto La7
            int r1 = r6.d
            r9.m = r1
        La7:
            if (r15 != 0) goto Lab
            if (r0 == 0) goto Lae
        Lab:
            r9.J()
        Lae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3178om.j(android.view.View, AN):AN");
    }

    public void k(boolean z) {
        l lVar = ((t) this.c).v;
        if (lVar != null) {
            lVar.getParentFragmentManager().l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
    }

    public void l(boolean z) {
        l lVar = ((t) this.c).v;
        if (lVar != null) {
            lVar.getParentFragmentManager().l.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
    }

    public void m(boolean z) {
        t tVar = (t) this.c;
        Context context = tVar.t.b;
        l lVar = tVar.v;
        if (lVar != null) {
            lVar.getParentFragmentManager().l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
    }

    public void n(boolean z) {
        l lVar = ((t) this.c).v;
        if (lVar != null) {
            lVar.getParentFragmentManager().l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
    }

    public void o(boolean z) {
        l lVar = ((t) this.c).v;
        if (lVar != null) {
            lVar.getParentFragmentManager().l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 22:
                QO qo = (QO) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                synchronized (qo.f) {
                    qo.e.remove(taskCompletionSource);
                }
                return;
            case ConnectionResult.API_DISABLED /* 23 */:
                int i = GenericIdpActivity.c;
                Intent intent = new Intent("android.intent.action.VIEW");
                GenericIdpActivity genericIdpActivity = (GenericIdpActivity) this.b;
                ResolveInfo resolveInfoResolveActivity = genericIdpActivity.getPackageManager().resolveActivity(intent, 0);
                String str = (String) this.c;
                if (resolveInfoResolveActivity == null) {
                    Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                    zzaer.zzb(genericIdpActivity, str);
                    return;
                }
                List<ResolveInfo> listQueryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                    Intent intent2 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                    intent2.putExtra("com.android.browser.application_id", str);
                    Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                    intent2.addFlags(1073741824);
                    intent2.addFlags(268435456);
                    genericIdpActivity.startActivity(intent2);
                    return;
                }
                R2 r2A = new C3170oe().a();
                Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
                Uri uri = (Uri) task.getResult();
                Intent intent3 = (Intent) r2A.b;
                intent3.setData(uri);
                genericIdpActivity.startActivity(intent3, (Bundle) r2A.c);
                return;
            default:
                C2671fQ c2671fQ = RecaptchaActivity.c;
                Intent intent4 = new Intent("android.intent.action.VIEW");
                RecaptchaActivity recaptchaActivity = (RecaptchaActivity) this.b;
                ResolveInfo resolveInfoResolveActivity2 = recaptchaActivity.getPackageManager().resolveActivity(intent4, 0);
                String str2 = (String) this.c;
                if (resolveInfoResolveActivity2 == null) {
                    Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                    zzaer.zzb(recaptchaActivity, str2);
                    return;
                }
                List<ResolveInfo> listQueryIntentServices2 = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                if (listQueryIntentServices2 == null || listQueryIntentServices2.isEmpty()) {
                    Intent intent5 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                    intent5.putExtra("com.android.browser.application_id", str2);
                    intent5.addFlags(1073741824);
                    intent5.addFlags(268435456);
                    recaptchaActivity.startActivity(intent5);
                    return;
                }
                R2 r2A2 = new C3170oe().a();
                Intent intent6 = (Intent) r2A2.b;
                intent6.addFlags(1073741824);
                intent6.addFlags(268435456);
                intent6.setData((Uri) task.getResult());
                recaptchaActivity.startActivity(intent6, (Bundle) r2A2.c);
                return;
        }
    }

    public void p(boolean z) {
        l lVar = ((t) this.c).v;
        if (lVar != null) {
            lVar.getParentFragmentManager().l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
    }

    public void q(boolean z) {
        l lVar = ((t) this.c).v;
        if (lVar != null) {
            lVar.getParentFragmentManager().l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
    }

    public void r(boolean z) {
        l lVar = ((t) this.c).v;
        if (lVar != null) {
            lVar.getParentFragmentManager().l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
    }

    public void s(boolean z) {
        l lVar = ((t) this.c).v;
        if (lVar != null) {
            lVar.getParentFragmentManager().l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
    }

    public void t(boolean z) {
        l lVar = ((t) this.c).v;
        if (lVar != null) {
            lVar.getParentFragmentManager().l.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v1, types: [iH] */
    /* JADX WARN: Type inference failed for: r3v0, types: [long] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable] */
    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) throws Throwable {
        FileWriter fileWriter;
        ?? r10 = (JSONObject) ((ExecutorC0305Rd) ((D3) this.b).d).a.submit(new CallableC2676fd(this, 2)).get();
        Closeable closeable = null;
        if (r10 != 0) {
            C3308r6 c3308r6 = (C3308r6) this.c;
            XE xeZ = ((C2827iH) c3308r6.c).z(r10);
            ?? r3 = xeZ.c;
            C2827iH c2827iH = (C2827iH) c3308r6.e;
            c2827iH.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                try {
                    try {
                        r10.put("expires_at", r3);
                    } catch (Exception e) {
                        e = e;
                    }
                    try {
                        fileWriter = new FileWriter((File) c2827iH.b);
                        try {
                            fileWriter.write(r10.toString());
                            fileWriter.flush();
                            r3 = fileWriter;
                        } catch (Exception e2) {
                            e = e2;
                            Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                            r3 = fileWriter;
                            AbstractC0115Ga.m(r3, "Failed to close settings writer.");
                            C3308r6.l("Loaded settings: ", r10);
                            String str = ((C2715gF) c3308r6.b).f;
                            SharedPreferences.Editor editorEdit = ((Context) c3308r6.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                            editorEdit.putString("existing_instance_identifier", str);
                            editorEdit.apply();
                            ((AtomicReference) c3308r6.n).set(xeZ);
                            ((TaskCompletionSource) ((AtomicReference) c3308r6.o).get()).trySetResult(xeZ);
                            return Tasks.forResult(null);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        fileWriter = null;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        r3 = fileWriter;
                        AbstractC0115Ga.m(r3, "Failed to close settings writer.");
                        C3308r6.l("Loaded settings: ", r10);
                        String str2 = ((C2715gF) c3308r6.b).f;
                        SharedPreferences.Editor editorEdit2 = ((Context) c3308r6.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        editorEdit2.putString("existing_instance_identifier", str2);
                        editorEdit2.apply();
                        ((AtomicReference) c3308r6.n).set(xeZ);
                        ((TaskCompletionSource) ((AtomicReference) c3308r6.o).get()).trySetResult(xeZ);
                        return Tasks.forResult(null);
                    }
                    AbstractC0115Ga.m(r3, "Failed to close settings writer.");
                    C3308r6.l("Loaded settings: ", r10);
                    String str22 = ((C2715gF) c3308r6.b).f;
                    SharedPreferences.Editor editorEdit22 = ((Context) c3308r6.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    editorEdit22.putString("existing_instance_identifier", str22);
                    editorEdit22.apply();
                    ((AtomicReference) c3308r6.n).set(xeZ);
                    ((TaskCompletionSource) ((AtomicReference) c3308r6.o).get()).trySetResult(xeZ);
                } catch (Throwable th) {
                    th = th;
                    AbstractC0115Ga.m(closeable, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r3;
                AbstractC0115Ga.m(closeable, "Failed to close settings writer.");
                throw th;
            }
        }
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.a) {
            case 9:
                String string = "[ ";
                if (((C3318rG) this.b) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder sbN = AbstractC3264qG.n(string);
                        sbN.append(((C3318rG) this.b).n[i]);
                        sbN.append(" ");
                        string = sbN.toString();
                    }
                }
                return string + "] " + ((C3318rG) this.b);
            case 15:
                return ((InterfaceC3644xI) this.b) + ": " + ((Throwable) this.c).getMessage();
            case 19:
                return "Bounds{lower=" + ((C0130Gp) this.b) + " upper=" + ((C0130Gp) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public void u(int i) {
        int[] iArr = (int[]) this.b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View v(int i, int i2, int i3, int i4) {
        GL gl = (GL) this.b;
        int iG = gl.g();
        int iM = gl.m();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewO = gl.o(i);
            int iE = gl.e(viewO);
            int iP = gl.p(viewO);
            FL fl = (FL) this.c;
            fl.b = iG;
            fl.c = iM;
            fl.d = iE;
            fl.e = iP;
            if (i3 != 0) {
                fl.a = i3;
                if (fl.a()) {
                    return viewO;
                }
            }
            if (i4 != 0) {
                fl.a = i4;
                if (fl.a()) {
                    view = viewO;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.datatransport.cct.CctBackendFactory w(java.lang.String r14) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3178om.w(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public File x() {
        if (((File) this.b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.b) == null) {
                        C3663xk c3663xk = (C3663xk) this.c;
                        c3663xk.a();
                        this.b = new File(c3663xk.a.getFilesDir(), "PersistedInstallation." + ((C3663xk) this.c).f() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.b;
    }

    public Long y(String str) {
        UC ucC = UC.c(1, "SELECT long_value FROM Preference where `key`=?");
        ucC.g(1, str);
        TC tc = (TC) this.b;
        tc.b();
        Cursor cursorG = tc.g(ucC);
        try {
            Long lValueOf = null;
            if (cursorG.moveToFirst() && !cursorG.isNull(0)) {
                lValueOf = Long.valueOf(cursorG.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorG.close();
            ucC.release();
        }
    }

    public C3178om(int i, int i2) {
        this.a = 1;
        this.b = new int[]{i, i2};
        this.c = new float[]{0.0f, 1.0f};
    }

    public C3178om(int i, int i2, int i3) {
        this.a = 1;
        this.b = new int[]{i, i2, i3};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public /* synthetic */ C3178om(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ C3178om(int i, boolean z) {
        this.a = i;
    }

    public C3178om(H2 h2, String str) {
        this.a = 25;
        this.b = str;
        Objects.requireNonNull(h2);
        this.c = h2;
    }

    public C3178om(TC tc, int i) {
        this.a = i;
        this.b = tc;
        switch (i) {
            case 20:
                this.c = new C0087Eg(tc, 3);
                break;
            case 21:
                this.c = new C0087Eg(tc, 6);
                break;
            default:
                this.c = new C0087Eg(tc, 1);
                break;
        }
    }

    public C3178om(GL gl) {
        this.a = 16;
        this.b = gl;
        FL fl = new FL();
        fl.a = 0;
        this.c = fl;
    }

    public C3178om(Context context) {
        this.a = 3;
        this.c = null;
        this.b = context;
    }

    public C3178om(t tVar) {
        this.a = 0;
        this.b = new CopyOnWriteArrayList();
        this.c = tVar;
    }

    public /* synthetic */ C3178om(Object obj, int i) {
        this.a = i;
        this.c = obj;
    }

    public /* synthetic */ C3178om(Object obj, Object obj2, int i, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public C3178om(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 1;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new XP((String) Preconditions.checkNotNull(((Exception) Preconditions.checkNotNull(task.getException())).getMessage())));
        }
        zzahs zzahsVar = (zzahs) task.getResult();
        String strZza = zzahsVar.zza();
        if (zzac.zzc(strZza)) {
            return Tasks.forException(new XP(AbstractC3264qG.w("No Recaptcha Enterprise siteKey configured for tenant/project ", (String) this.b)));
        }
        List<String> listZza = zzt.zza('/').zza((CharSequence) strZza);
        String str = listZza.size() != 4 ? null : listZza.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception(AbstractC3264qG.w("Invalid siteKey format ", strZza)));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + ((String) this.b));
        }
        H2 h2 = (H2) this.c;
        C0587cM c0587cM = (C0587cM) h2.f;
        C3663xk c3663xk = (C3663xk) h2.d;
        c3663xk.a();
        Application application = (Application) c3663xk.a;
        c0587cM.getClass();
        Task<RecaptchaTasksClient> taskFetchTaskClient = Recaptcha.fetchTaskClient(application, str);
        H2 h22 = (H2) this.c;
        String str2 = (String) this.b;
        synchronized (h22.a) {
            h22.c = zzahsVar;
            ((HashMap) h22.b).put(str2, taskFetchTaskClient);
        }
        return taskFetchTaskClient;
    }

    public C3178om(ExecutorService executorService) {
        this.a = 11;
        this.c = new Z3(0);
        this.b = executorService;
    }

    public C3178om(JG[] jgArr) {
        this.a = 4;
        this.b = jgArr;
        this.c = new C3130nt();
    }
}
