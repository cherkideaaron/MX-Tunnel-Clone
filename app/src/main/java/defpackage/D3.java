package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.OverwritingInputMerger;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.Tasks;
import com.mxtunnel.pro.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class D3 implements InterfaceC0079Dp, InterfaceC3482uI {
    public static volatile D3 e;
    public static final Object f = new Object();
    public static final C0423Yc g = new C0423Yc(0);
    public static final C0440Zc h = new C0440Zc(0);
    public static final C0339Td i = new C0339Td();
    public static D3 j;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public D3() {
        this.a = 23;
        this.b = Collections.emptyList();
        this.c = Collections.emptyList();
    }

    public static D3 A(Context context) {
        if (e == null) {
            synchronized (f) {
                try {
                    if (e == null) {
                        e = new D3(context);
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public static D3 L(int i2, int i3, Context context, AttributeSet attributeSet, int[] iArr) {
        return new D3(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public static void M(C3121nk c3121nk, String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return;
        }
        try {
            c3121nk.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e2);
        }
    }

    public static final void j() {
        if (((Boolean) new C0322Sd(0, i, C0339Td.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 0).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void k() {
        if (((Boolean) new C0322Sd(0, i, C0339Td.class, "isBlockingThread", "isBlockingThread()Z", 0, 1).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        r7 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        if (r7.isEmpty() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        if (r6.contains("?") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (r6.endsWith("&") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        r7 = "&".concat(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        return defpackage.AbstractC3264qG.g(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        return defpackage.AbstractC3264qG.h(r6, "?", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0029, code lost:
    
        if (r1.getValue() != null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        r1 = java.net.URLEncoder.encode((java.lang.String) r1.getValue(), "UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (r7.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        r1 = (java.util.Map.Entry) r7.next();
        r0.append("&");
        r0.append((java.lang.String) r1.getKey());
        r0.append("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        if (r1.getValue() == null) goto L5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005b -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m(java.lang.String r6, java.util.Map r7) throws java.io.UnsupportedEncodingException {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "="
            r0.append(r2)
            java.lang.Object r3 = r1.getValue()
            java.lang.String r4 = ""
            java.lang.String r5 = "UTF-8"
            if (r3 == 0) goto L36
        L2b:
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r5)
            goto L37
        L36:
            r1 = r4
        L37:
            r0.append(r1)
            boolean r1 = r7.hasNext()
            java.lang.String r3 = "&"
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r0.append(r3)
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            r0.append(r2)
            java.lang.Object r3 = r1.getValue()
            if (r3 == 0) goto L36
            goto L2b
        L5e:
            java.lang.String r7 = r0.toString()
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L69
            return r6
        L69:
            java.lang.String r0 = "?"
            boolean r1 = r6.contains(r0)
            if (r1 == 0) goto L80
            boolean r0 = r6.endsWith(r3)
            if (r0 != 0) goto L7b
            java.lang.String r7 = r3.concat(r7)
        L7b:
            java.lang.String r6 = defpackage.AbstractC3264qG.g(r6, r7)
            return r6
        L80:
            java.lang.String r6 = defpackage.AbstractC3264qG.h(r6, r0, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.D3.m(java.lang.String, java.util.Map):java.lang.String");
    }

    public static boolean n(Editable editable, KeyEvent keyEvent, boolean z) {
        C3322rK[] c3322rKArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c3322rKArr = (C3322rK[]) editable.getSpans(selectionStart, selectionEnd, C3322rK.class)) != null && c3322rKArr.length > 0) {
            for (C3322rK c3322rK : c3322rKArr) {
                int spanStart = editable.getSpanStart(c3322rK);
                int spanEnd = editable.getSpanEnd(c3322rK);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public int B(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((C2827iH) this.b).b).getChildCount();
        int i3 = i2;
        while (i3 < childCount) {
            D9 d9 = (D9) this.c;
            int iB = i2 - (i3 - d9.b(i3));
            if (iB == 0) {
                while (d9.d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += iB;
        }
        return -1;
    }

    public C2828iI C(String str) {
        UC ucC = UC.c(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            ucC.f(1);
        } else {
            ucC.g(1, str);
        }
        TC tc = (TC) this.b;
        tc.b();
        Cursor cursorG = tc.g(ucC);
        try {
            return cursorG.moveToFirst() ? new C2828iI(cursorG.getString(AbstractC0500aq.D(cursorG, "work_spec_id")), cursorG.getInt(AbstractC0500aq.D(cursorG, "system_id"))) : null;
        } finally {
            cursorG.close();
            ucC.release();
        }
    }

    public View D(int i2) {
        return ((RecyclerView) ((C2827iH) this.b).b).getChildAt(i2);
    }

    public int E() {
        return ((RecyclerView) ((C2827iH) this.b).b).getChildCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0207 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0229  */
    /* JADX WARN: Type inference failed for: r0v107, types: [int] */
    /* JADX WARN: Type inference failed for: r0v135 */
    /* JADX WARN: Type inference failed for: r0v185 */
    /* JADX WARN: Type inference failed for: r0v186 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean F() throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 1446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.D3.F():boolean");
    }

    public boolean G(CharSequence charSequence, int i2, int i3, C3268qK c3268qK) {
        if ((c3268qK.c & 3) == 0) {
            InterfaceC0547bi interfaceC0547bi = (InterfaceC0547bi) this.d;
            C2967kv c2967kvC = c3268qK.c();
            int iA = c2967kvC.a(8);
            if (iA != 0) {
                ((ByteBuffer) c2967kvC.d).getShort(iA + c2967kvC.a);
            }
            C0205Lf c0205Lf = (C0205Lf) interfaceC0547bi;
            c0205Lf.getClass();
            ThreadLocal threadLocal = C0205Lf.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i3) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            TextPaint textPaint = c0205Lf.a;
            String string = sb.toString();
            int i4 = Iy.a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i5 = c3268qK.c & 4;
            c3268qK.c = zHasGlyph ? i5 | 2 : i5 | 1;
        }
        return (c3268qK.c & 3) == 2;
    }

    public void H(View view) {
        ((ArrayList) this.d).add(view);
        C2827iH c2827iH = (C2827iH) this.b;
        c2827iH.getClass();
        JB jbI = RecyclerView.I(view);
        if (jbI != null) {
            int i2 = jbI.q;
            View view2 = jbI.a;
            if (i2 != -1) {
                jbI.p = i2;
            } else {
                WeakHashMap weakHashMap = UL.a;
                jbI.p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = (RecyclerView) c2827iH.b;
            if (recyclerView.L()) {
                jbI.q = 4;
                recyclerView.w0.add(jbI);
            } else {
                WeakHashMap weakHashMap2 = UL.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public void I(C2828iI c2828iI) {
        TC tc = (TC) this.b;
        tc.b();
        tc.c();
        try {
            ((C0087Eg) this.c).e(c2828iI);
            tc.h();
        } finally {
            tc.f();
        }
    }

    public boolean J(View view) {
        return ((ArrayList) this.d).contains(view);
    }

    public boolean K(int i2, C0286Qb c0286Qb, C2566dc c2566dc) {
        int[] iArr = c2566dc.o0;
        int i3 = iArr[0];
        C3417t7 c3417t7 = (C3417t7) this.c;
        c3417t7.a = i3;
        c3417t7.b = iArr[1];
        c3417t7.c = c2566dc.n();
        c3417t7.d = c2566dc.k();
        c3417t7.i = false;
        c3417t7.j = i2;
        boolean z = c3417t7.a == 3;
        boolean z2 = c3417t7.b == 3;
        boolean z3 = z && c2566dc.V > 0.0f;
        boolean z4 = z2 && c2566dc.V > 0.0f;
        int[] iArr2 = c2566dc.s;
        if (z3 && iArr2[0] == 4) {
            c3417t7.a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            c3417t7.b = 1;
        }
        c0286Qb.b(c2566dc, c3417t7);
        c2566dc.J(c3417t7.e);
        c2566dc.G(c3417t7.f);
        c2566dc.D = c3417t7.h;
        c2566dc.D(c3417t7.g);
        c3417t7.j = 0;
        return c3417t7.i;
    }

    public void N(Hr hr) {
        RunnableC2734gg runnableC2734gg = (RunnableC2734gg) this.d;
        if (runnableC2734gg != null) {
            runnableC2734gg.run();
        }
        RunnableC2734gg runnableC2734gg2 = new RunnableC2734gg((Qr) this.b, hr);
        this.d = runnableC2734gg2;
        ((Handler) this.c).postAtFrontOfQueue(runnableC2734gg2);
    }

    public Object O(CharSequence charSequence, int i2, int i3, int i4, boolean z, InterfaceC3284qi interfaceC3284qi) {
        char c;
        C3077mv c3077mv = null;
        C3391si c3391si = new C3391si((C3077mv) ((C3532vE) this.c).c, false, null);
        int iCodePointAt = Character.codePointAt(charSequence, i2);
        int i5 = 0;
        boolean zH = true;
        int iCharCount = i2;
        int i6 = iCharCount;
        while (iCharCount < i3 && i5 < i4 && zH) {
            SparseArray sparseArray = c3391si.c.a;
            C3077mv c3077mv2 = sparseArray == null ? c3077mv : (C3077mv) sparseArray.get(iCodePointAt);
            if (c3391si.a == 2) {
                if (c3077mv2 != null) {
                    c3391si.c = c3077mv2;
                    c3391si.f++;
                } else {
                    if (iCodePointAt != 65038) {
                        if (iCodePointAt != 65039) {
                            C3077mv c3077mv3 = c3391si.c;
                            if (c3077mv3.b != null) {
                                if (c3391si.f == 1) {
                                    if (c3391si.b()) {
                                        c3077mv3 = c3391si.c;
                                    }
                                }
                                c3391si.d = c3077mv3;
                                c3391si.a();
                                c = 3;
                            }
                        }
                    }
                    c3391si.a();
                    c = 1;
                }
                c = 2;
            } else if (c3077mv2 == null) {
                c3391si.a();
                c = 1;
            } else {
                c3391si.a = 2;
                c3391si.c = c3077mv2;
                c3391si.f = 1;
                c = 2;
            }
            c3391si.e = iCodePointAt;
            if (c != 1) {
                if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i3) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !G(charSequence, i6, iCharCount, c3391si.d.b)) {
                        zH = interfaceC3284qi.h(charSequence, i6, iCharCount, c3391si.d.b);
                        i5++;
                    }
                }
                c3077mv = null;
            } else {
                iCharCount = Character.charCount(Character.codePointAt(charSequence, i6)) + i6;
                if (iCharCount < i3) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                }
            }
            i6 = iCharCount;
            c3077mv = null;
        }
        if (c3391si.a == 2 && c3391si.c.b != null && ((c3391si.f > 1 || c3391si.b()) && i5 < i4 && zH && (z || !G(charSequence, i6, iCharCount, c3391si.c.b)))) {
            interfaceC3284qi.h(charSequence, i6, iCharCount, c3391si.c.b);
        }
        return interfaceC3284qi.e();
    }

    public void P() {
        ((TypedArray) this.b).recycle();
    }

    public void Q(String str) {
        TC tc = (TC) this.b;
        tc.b();
        C2881jI c2881jI = (C2881jI) this.d;
        C0497an c0497anA = c2881jI.a();
        if (str == null) {
            c0497anA.f(1);
        } else {
            c0497anA.g(1, str);
        }
        tc.c();
        try {
            c0497anA.m();
            tc.h();
        } finally {
            tc.f();
            c2881jI.c(c0497anA);
        }
    }

    public void R(InterfaceC3644xI interfaceC3644xI, C3588wG c3588wG) {
        try {
            c3588wG.c();
            throw null;
        } catch (C2594e4 e2) {
            e(interfaceC3644xI, e2);
        } catch (ThreadDeath e3) {
            throw e3;
        } catch (Throwable th) {
            synchronized (this) {
                ((ArrayList) this.c).add(new C3178om(15, interfaceC3644xI, th));
                Iterator it = l().iterator();
                while (it.hasNext()) {
                    ((InterfaceC3752zI) it.next()).addError(interfaceC3644xI, th);
                }
            }
        }
    }

    public void S(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.b = str;
    }

    public void T(Bz bz) {
        if (bz == null) {
            throw new NullPointerException("Null priority");
        }
        this.d = bz;
    }

    public void U(C2620ec c2620ec, int i2, int i3, int i4) {
        int i5 = c2620ec.a0;
        int i6 = c2620ec.b0;
        c2620ec.a0 = 0;
        c2620ec.b0 = 0;
        c2620ec.J(i3);
        c2620ec.G(i4);
        if (i5 < 0) {
            c2620ec.a0 = 0;
        } else {
            c2620ec.a0 = i5;
        }
        if (i6 < 0) {
            c2620ec.b0 = 0;
        } else {
            c2620ec.b0 = i6;
        }
        C2620ec c2620ec2 = (C2620ec) this.d;
        c2620ec2.s0 = i2;
        c2620ec2.P();
    }

    public void V(View view) {
        if (((ArrayList) this.d).remove(view)) {
            C2827iH c2827iH = (C2827iH) this.b;
            c2827iH.getClass();
            JB jbI = RecyclerView.I(view);
            if (jbI != null) {
                int i2 = jbI.p;
                RecyclerView recyclerView = (RecyclerView) c2827iH.b;
                if (recyclerView.L()) {
                    jbI.q = i2;
                    recyclerView.w0.add(jbI);
                } else {
                    WeakHashMap weakHashMap = UL.a;
                    jbI.a.setImportantForAccessibility(i2);
                }
                jbI.p = 0;
            }
        }
    }

    public void W(C2620ec c2620ec) {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.clear();
        int size = c2620ec.p0.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2566dc c2566dc = (C2566dc) c2620ec.p0.get(i2);
            int[] iArr = c2566dc.o0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c2566dc);
            }
        }
        c2620ec.r0.b = true;
    }

    @Override // defpackage.InterfaceC0079Dp
    public Uri a() {
        return (Uri) this.b;
    }

    @Override // defpackage.InterfaceC0079Dp
    public Uri c() {
        return (Uri) this.d;
    }

    @Override // defpackage.InterfaceC0079Dp
    public Object d() {
        return null;
    }

    public synchronized void e(InterfaceC3644xI interfaceC3644xI, C2594e4 c2594e4) {
        ((ArrayList) this.b).add(new C3178om(15, interfaceC3644xI, c2594e4));
        Iterator it = l().iterator();
        while (it.hasNext()) {
            ((InterfaceC3752zI) it.next()).addFailure(interfaceC3644xI, c2594e4);
        }
    }

    public void f(View view, boolean z, int i2) {
        C2827iH c2827iH = (C2827iH) this.b;
        int childCount = i2 < 0 ? ((RecyclerView) c2827iH.b).getChildCount() : B(i2);
        ((D9) this.c).e(childCount, z);
        if (z) {
            H(view);
        }
        ((RecyclerView) c2827iH.b).addView(view, childCount);
        RecyclerView.I(view);
    }

    public void g(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        C2827iH c2827iH = (C2827iH) this.b;
        int childCount = i2 < 0 ? ((RecyclerView) c2827iH.b).getChildCount() : B(i2);
        ((D9) this.c).e(childCount, z);
        if (z) {
            H(view);
        }
        c2827iH.getClass();
        JB jbI = RecyclerView.I(view);
        RecyclerView recyclerView = (RecyclerView) c2827iH.b;
        if (jbI != null) {
            if (!jbI.l() && !jbI.q()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + jbI + recyclerView.y());
            }
            jbI.j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    @Override // defpackage.InterfaceC0079Dp
    public ClipDescription getDescription() {
        return (ClipDescription) this.c;
    }

    public J6 h() {
        String strConcat = ((String) this.b) == null ? " backendName" : "";
        if (((Bz) this.d) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new J6((String) this.b, (byte[]) this.c, (Bz) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public C3299qx i() {
        UUID uuid = (UUID) this.b;
        C2834iO c2834iO = (C2834iO) this.d;
        HashSet hashSet = (HashSet) this.c;
        C3299qx c3299qx = new C3299qx();
        c3299qx.a = uuid;
        c3299qx.b = c2834iO;
        c3299qx.c = hashSet;
        C2675fc c2675fc = c2834iO.j;
        boolean z = (Build.VERSION.SDK_INT >= 24 && c2675fc.h.a.size() > 0) || c2675fc.d || c2675fc.b || c2675fc.c;
        if (((C2834iO) this.d).q && z) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.b = UUID.randomUUID();
        C2834iO c2834iO2 = (C2834iO) this.d;
        C2834iO c2834iO3 = new C2834iO();
        c2834iO3.b = 1;
        C0051Ce c0051Ce = C0051Ce.c;
        c2834iO3.e = c0051Ce;
        c2834iO3.f = c0051Ce;
        c2834iO3.j = C2675fc.i;
        c2834iO3.l = 1;
        c2834iO3.m = 30000L;
        c2834iO3.p = -1L;
        c2834iO3.r = 1;
        c2834iO3.a = c2834iO2.a;
        c2834iO3.c = c2834iO2.c;
        c2834iO3.b = c2834iO2.b;
        c2834iO3.d = c2834iO2.d;
        c2834iO3.e = new C0051Ce(c2834iO2.e);
        c2834iO3.f = new C0051Ce(c2834iO2.f);
        c2834iO3.g = c2834iO2.g;
        c2834iO3.h = c2834iO2.h;
        c2834iO3.i = c2834iO2.i;
        C2675fc c2675fc2 = c2834iO2.j;
        C2675fc c2675fc3 = new C2675fc();
        c2675fc3.a = 1;
        c2675fc3.f = -1L;
        c2675fc3.g = -1L;
        c2675fc3.h = new C3223pc();
        c2675fc3.b = c2675fc2.b;
        c2675fc3.c = c2675fc2.c;
        c2675fc3.a = c2675fc2.a;
        c2675fc3.d = c2675fc2.d;
        c2675fc3.e = c2675fc2.e;
        c2675fc3.h = c2675fc2.h;
        c2834iO3.j = c2675fc3;
        c2834iO3.k = c2834iO2.k;
        c2834iO3.l = c2834iO2.l;
        c2834iO3.m = c2834iO2.m;
        c2834iO3.n = c2834iO2.n;
        c2834iO3.o = c2834iO2.o;
        c2834iO3.p = c2834iO2.p;
        c2834iO3.q = c2834iO2.q;
        c2834iO3.r = c2834iO2.r;
        this.d = c2834iO3;
        c2834iO3.a = ((UUID) this.b).toString();
        return c3299qx;
    }

    public synchronized ArrayList l() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll((ArrayList) this.d);
        return arrayList;
    }

    public void o(int i2) {
        JB jbI;
        int iB = B(i2);
        ((D9) this.c).f(iB);
        RecyclerView recyclerView = (RecyclerView) ((C2827iH) this.b).b;
        View childAt = recyclerView.getChildAt(iB);
        if (childAt != null && (jbI = RecyclerView.I(childAt)) != null) {
            if (jbI.l() && !jbI.q()) {
                throw new IllegalArgumentException("called detach on an already detached child " + jbI + recyclerView.y());
            }
            jbI.b(UserVerificationMethods.USER_VERIFY_HANDPRINT);
        }
        recyclerView.detachViewFromParent(iB);
    }

    public void p(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = ((Context) this.d).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = (HashSet) this.c;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC3614wp.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    q((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new C0234Na(e2);
            }
        }
    }

    public Object q(Class cls, HashSet hashSet) {
        Object objCreate;
        if (AbstractC0115Ga.F()) {
            try {
                AbstractC0115Ga.c(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = (HashMap) this.b;
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC3614wp interfaceC3614wp = (InterfaceC3614wp) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = interfaceC3614wp.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            q(cls2, hashSet);
                        }
                    }
                }
                objCreate = interfaceC3614wp.create((Context) this.d);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new C0234Na(th2);
            }
        }
        Trace.endSection();
        return objCreate;
    }

    public void r(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        Map map = (Map) this.b;
        C3038mA c3038mA = new C3038mA(byteArrayOutputStream, map, (Map) this.c, (Pw) this.d);
        if (obj == null) {
            return;
        }
        Pw pw = (Pw) map.get(obj.getClass());
        if (pw != null) {
            pw.a(obj, c3038mA);
        } else {
            throw new C0191Ki("No encoder for " + obj.getClass());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.C2544d8 s() throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r1 = "GET Request URL: "
            k()
            r2 = 0
            java.lang.Object r3 = r8.c     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r4 = r8.d     // Catch: java.lang.Throwable -> Lb9
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r3 = m(r3, r4)     // Catch: java.lang.Throwable -> Lb4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lb4
            r4.append(r3)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> Lb4
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L2e
            android.util.Log.v(r0, r1, r2)     // Catch: java.lang.Throwable -> L2b
            goto L2e
        L2b:
            r0 = move-exception
            goto Lb7
        L2e:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lb4
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lb4
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lb4
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Throwable -> Lb4
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L6e
            r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = r8.b     // Catch: java.lang.Throwable -> L6e
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L6e
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L6e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6e
        L52:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L70
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L6e
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L6e
            r0.addRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L6e
            goto L52
        L6e:
            r1 = move-exception
            goto Lbb
        L70:
            r0.connect()     // Catch: java.lang.Throwable -> L6e
            int r1 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L6e
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto La6
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> La3
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> La3
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> La3
            r2.<init>(r4)     // Catch: java.lang.Throwable -> La3
            r4 = 8192(0x2000, float:1.148E-41)
            char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> La3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3
            r5.<init>()     // Catch: java.lang.Throwable -> La3
        L92:
            int r6 = r2.read(r4)     // Catch: java.lang.Throwable -> La3
            r7 = -1
            if (r6 == r7) goto L9e
            r7 = 0
            r5.append(r4, r7, r6)     // Catch: java.lang.Throwable -> La3
            goto L92
        L9e:
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> La3
            goto La6
        La3:
            r1 = move-exception
            r2 = r3
            goto Lbb
        La6:
            if (r3 == 0) goto Lab
            r3.close()
        Lab:
            r0.disconnect()
            d8 r0 = new d8
            r0.<init>(r1, r2)
            return r0
        Lb4:
            r1 = move-exception
        Lb5:
            r0 = r2
            goto Lbb
        Lb7:
            r1 = r0
            goto Lb5
        Lb9:
            r0 = move-exception
            goto Lb7
        Lbb:
            if (r2 == 0) goto Lc0
            r2.close()
        Lc0:
            if (r0 == 0) goto Lc5
            r0.disconnect()
        Lc5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.D3.s():d8");
    }

    public void t(Runnable runnable) {
        ((ExecutorC3316rE) this.b).execute(runnable);
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return ((D9) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            case 13:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                C3178om c3178om = (C3178om) ((C3178om) this.c).c;
                String str = "";
                while (c3178om != null) {
                    Object obj = c3178om.b;
                    boolean z = c3178om instanceof AbstractC3620wv;
                    sb.append(str);
                    c3178om.getClass();
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    c3178om = (C3178om) c3178om.c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public View u(int i2) {
        return ((RecyclerView) ((C2827iH) this.b).b).getChildAt(B(i2));
    }

    public int v() {
        return ((RecyclerView) ((C2827iH) this.b).b).getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList w(int i2) {
        int resourceId;
        ColorStateList colorStateListU;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListU = AbstractC0115Ga.u((Context) this.d, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListU;
    }

    public Drawable x(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : AbstractC0500aq.F((Context) this.d, resourceId);
    }

    public Drawable y(int i2) {
        int resourceId;
        Drawable drawableG;
        if (!((TypedArray) this.b).hasValue(i2) || (resourceId = ((TypedArray) this.b).getResourceId(i2, 0)) == 0) {
            return null;
        }
        I2 i2A = I2.a();
        Context context = (Context) this.d;
        synchronized (i2A) {
            drawableG = i2A.a.g(context, resourceId, true);
        }
        return drawableG;
    }

    public Typeface z(int i2, int i3, C2866j3 c2866j3) {
        int resourceId = ((TypedArray) this.b).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.c) == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.c;
        ThreadLocal threadLocal = AC.a;
        Context context = (Context) this.d;
        if (context.isRestricted()) {
            return null;
        }
        return AC.b(context, resourceId, typedValue, i3, c2866j3, true, false);
    }

    public /* synthetic */ D3(int i2) {
        this.a = i2;
    }

    public D3(C2620ec c2620ec) {
        this.a = 4;
        this.b = new ArrayList();
        this.c = new C3417t7();
        this.d = c2620ec;
    }

    public D3(C3121nk c3121nk) {
        this.a = 1;
        this.c = null;
        this.d = null;
        this.b = c3121nk;
    }

    public D3(Or or) {
        this.a = 17;
        AbstractC0500aq.m(or, "provider");
        this.b = new Qr(or);
        this.c = new Handler(Looper.getMainLooper());
    }

    public D3(TC tc) {
        this.a = 18;
        this.b = tc;
        this.c = new C0087Eg(tc, 2);
        this.d = new C2881jI(tc, 0);
    }

    public D3(C3532vE c3532vE, C3397so c3397so, C0205Lf c0205Lf, Set set) {
        this.a = 9;
        this.b = c3397so;
        this.c = c3532vE;
        this.d = c0205Lf;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            O(str, 0, str.length(), 1, true, new C3337ri(str, 0));
        }
    }

    public D3(C2827iH c2827iH) {
        this.a = 7;
        this.b = c2827iH;
        this.c = new D9();
        this.d = new ArrayList();
    }

    public D3(Context context) {
        this.a = 0;
        this.d = context.getApplicationContext();
        this.c = new HashSet();
        this.b = new HashMap();
    }

    public D3(Context context, C0607co c0607co, ExecutorService executorService) {
        this.a = 8;
        this.b = executorService;
        this.d = context;
        this.c = c0607co;
    }

    public D3(Context context, TypedArray typedArray) {
        this.a = 20;
        this.d = context;
        this.b = typedArray;
    }

    public D3(Context context, LocationManager locationManager) {
        this.a = 21;
        this.c = new C2775hK();
        this.d = context;
        this.b = locationManager;
    }

    public D3(Class cls) {
        this.a = 14;
        this.c = new HashSet();
        this.b = UUID.randomUUID();
        this.d = new C2834iO(((UUID) this.b).toString(), cls.getName());
        ((HashSet) this.c).add(cls.getName());
        ((C2834iO) this.d).d = OverwritingInputMerger.class.getName();
    }

    public /* synthetic */ D3(Object obj, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public D3(String str) {
        this.a = 13;
        C3178om c3178om = new C3178om(5, false);
        this.c = c3178om;
        this.d = c3178om;
        this.b = str;
    }

    public D3(HashMap map, String str) {
        this.a = 10;
        this.c = str;
        this.d = map;
        this.b = new HashMap();
    }

    public D3(ExecutorService executorService) {
        this.a = 22;
        this.c = new Handler(Looper.getMainLooper());
        this.d = new ExecutorC3531vD(this, 1);
        this.b = new ExecutorC3316rE(executorService);
    }

    public D3(ExecutorService executorService, ExecutorService executorService2) {
        this.a = 2;
        AbstractC0500aq.m(executorService, "backgroundExecutorService");
        AbstractC0500aq.m(executorService2, "blockingExecutorService");
        this.b = new ExecutorC0305Rd(executorService);
        this.c = new ExecutorC0305Rd(executorService);
        Tasks.forResult(null);
        this.d = new ExecutorC0305Rd(executorService2);
    }

    @Override // defpackage.InterfaceC0079Dp
    public void b() {
    }
}
