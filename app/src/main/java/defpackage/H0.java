package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.mxtunnel.pro.R;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.service.vpn.TunnelManagerHelper;
import rased.vpn.app.service.vpn.TunnelUtils;
import rased.vpn.app.service.vpn.logger.SkStatus;

/* loaded from: classes.dex */
public final /* synthetic */ class H0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ H0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        C2811i1 c2811i1 = (C2811i1) this.b;
        synchronized (((ArrayDeque) c2811i1.d)) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) c2811i1.a).edit();
            String str = (String) c2811i1.b;
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayDeque) c2811i1.d).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append((String) c2811i1.c);
            }
            editorEdit.putString(str, sb.toString()).commit();
        }
    }

    private final void b() {
        C0312Rk c0312Rk = (C0312Rk) this.b;
        Map mapA = null;
        ((AtomicReference) c0312Rk.c).set(null);
        synchronized (c0312Rk) {
            try {
                if (((AtomicMarkableReference) c0312Rk.b).isMarked()) {
                    mapA = ((C3293qr) ((AtomicMarkableReference) c0312Rk.b).getReference()).a();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) c0312Rk.b;
                    atomicMarkableReference.set((C3293qr) atomicMarkableReference.getReference(), false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mapA != null) {
            C3429tJ c3429tJ = (C3429tJ) c0312Rk.d;
            ((C2694fv) c3429tJ.a).h((String) c3429tJ.c, mapA, c0312Rk.a);
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        Object obj;
        C0207Lh c0207LhA;
        int i;
        int i2;
        int i3;
        C3430tK c3430tK;
        int i4 = 2;
        int i5 = 1;
        boolean z = false;
        switch (this.a) {
            case 0:
                Activity activity = (Activity) this.b;
                if (activity.isFinishing()) {
                    return;
                }
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 28) {
                    Class cls = K0.a;
                    activity.recreate();
                    return;
                }
                Class cls2 = K0.a;
                boolean z2 = i6 == 26 || i6 == 27;
                Method method = K0.f;
                if ((!z2 || method != null) && (K0.e != null || K0.d != null)) {
                    try {
                        Object obj2 = K0.c.get(activity);
                        if (obj2 != null && (obj = K0.b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            J0 j0 = new J0(activity);
                            application.registerActivityLifecycleCallbacks(j0);
                            Handler handler = K0.g;
                            handler.post(new RunnableC3680y0(j0, obj2, 1, false));
                            try {
                                if (i6 == 26 || i6 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new RunnableC3680y0(application, j0, i4, false));
                                return;
                            } finally {
                                handler.post(new RunnableC3680y0(application, j0, i4, false));
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 1:
                C2524cp c2524cp = ((R1) this.b).c;
                c2524cp.getClass();
                long jUptimeMillis = SystemClock.uptimeMillis();
                R1 r1 = (R1) c2524cp.b;
                r1.getClass();
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = r1.b;
                    if (i7 >= arrayList.size()) {
                        int i8 = i5;
                        if (r1.f) {
                            for (int size = arrayList.size() - i8; size >= 0; size--) {
                                if (arrayList.get(size) == null) {
                                    arrayList.remove(size);
                                }
                            }
                            if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                                R2 r2 = r1.h;
                                ValueAnimator.unregisterDurationScaleChangeListener((P1) r2.b);
                                r2.b = null;
                            }
                            r1.f = false;
                        }
                        if (arrayList.size() > 0) {
                            R2 r22 = r1.e;
                            r22.getClass();
                            ((Choreographer) r22.b).postFrameCallback(new Q1(r1.d));
                            return;
                        }
                        return;
                    }
                    C3642xG c3642xG = (C3642xG) arrayList.get(i7);
                    if (c3642xG == null) {
                        i3 = i5;
                    } else {
                        WF wf = r1.a;
                        Long l = (Long) wf.get(c3642xG);
                        if (l != null) {
                            if (l.longValue() < jUptimeMillis2) {
                                wf.remove(c3642xG);
                            }
                            i3 = i5;
                        }
                        long j = c3642xG.f;
                        if (j == 0) {
                            c3642xG.f = jUptimeMillis;
                            c3642xG.c(c3642xG.b);
                        } else {
                            long j2 = jUptimeMillis - j;
                            c3642xG.f = jUptimeMillis;
                            float f = C3642xG.b().g;
                            long j3 = f == 0.0f ? 2147483647L : (long) (j2 / f);
                            if (c3642xG.l) {
                                float f2 = c3642xG.k;
                                if (f2 != Float.MAX_VALUE) {
                                    c3642xG.j.i = f2;
                                    c3642xG.k = Float.MAX_VALUE;
                                }
                                c3642xG.b = (float) c3642xG.j.i;
                                c3642xG.a = 0.0f;
                                c3642xG.l = z;
                                i = i5;
                            } else {
                                if (c3642xG.k != Float.MAX_VALUE) {
                                    long j4 = j3 / 2;
                                    C0207Lh c0207LhA2 = c3642xG.j.a(c3642xG.b, c3642xG.a, j4);
                                    C3696yG c3696yG = c3642xG.j;
                                    c3696yG.i = c3642xG.k;
                                    c3642xG.k = Float.MAX_VALUE;
                                    c0207LhA = c3696yG.a(c0207LhA2.a, c0207LhA2.b, j4);
                                } else {
                                    c0207LhA = c3642xG.j.a(c3642xG.b, c3642xG.a, j3);
                                }
                                c3642xG.b = c0207LhA.a;
                                c3642xG.a = c0207LhA.b;
                                float fMax = Math.max(c3642xG.b, -3.4028235E38f);
                                c3642xG.b = fMax;
                                c3642xG.b = Math.min(fMax, Float.MAX_VALUE);
                                float f3 = c3642xG.a;
                                C3696yG c3696yG2 = c3642xG.j;
                                c3696yG2.getClass();
                                if (Math.abs(f3) >= c3696yG2.e || Math.abs(r0 - ((float) c3696yG2.i)) >= c3696yG2.d) {
                                    i = 0;
                                } else {
                                    c3642xG.b = (float) c3642xG.j.i;
                                    c3642xG.a = 0.0f;
                                    i = 1;
                                }
                            }
                            float fMin = Math.min(c3642xG.b, Float.MAX_VALUE);
                            c3642xG.b = fMin;
                            float fMax2 = Math.max(fMin, -3.4028235E38f);
                            c3642xG.b = fMax2;
                            c3642xG.c(fMax2);
                            if (i != 0) {
                                c3642xG.e = false;
                                R1 r1B = C3642xG.b();
                                r1B.a.remove(c3642xG);
                                ArrayList arrayList2 = r1B.b;
                                int iIndexOf = arrayList2.indexOf(c3642xG);
                                if (iIndexOf >= 0) {
                                    arrayList2.set(iIndexOf, null);
                                    i2 = 1;
                                    r1B.f = true;
                                } else {
                                    i2 = 1;
                                }
                                c3642xG.f = 0L;
                                int i9 = 0;
                                while (true) {
                                    ArrayList arrayList3 = c3642xG.h;
                                    if (i9 >= arrayList3.size()) {
                                        for (int size2 = arrayList3.size() - i2; size2 >= 0; size2--) {
                                            if (arrayList3.get(size2) == null) {
                                                arrayList3.remove(size2);
                                            }
                                        }
                                    } else {
                                        if (arrayList3.get(i9) != null) {
                                            Vs.u(arrayList3.get(i9));
                                            throw null;
                                        }
                                        i9 += i2;
                                    }
                                }
                            }
                        }
                        i3 = 1;
                    }
                    i7 += i3;
                    i5 = i3;
                    z = false;
                }
                break;
            case 2:
                ((CarouselLayoutManager) this.b).h0();
                return;
            case 3:
                ((Z9) this.b).t(true);
                return;
            case 4:
                ((AbstractActivityC2619eb) this.b).invalidateMenu();
                return;
            case 5:
                ViewTreeObserverOnDrawListenerC0594cb viewTreeObserverOnDrawListenerC0594cb = (ViewTreeObserverOnDrawListenerC0594cb) this.b;
                Runnable runnable = viewTreeObserverOnDrawListenerC0594cb.b;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0594cb.b = null;
                    return;
                }
                return;
            case 6:
                DialogC2784hb.a((DialogC2784hb) this.b);
                return;
            case 7:
                C0122Gh c0122Gh = (C0122Gh) this.b;
                boolean zIsPopupShowing = c0122Gh.h.isPopupShowing();
                c0122Gh.t(zIsPopupShowing);
                c0122Gh.m = zIsPopupShowing;
                return;
            case 8:
                ((C0210Lk) this.b).b(false);
                return;
            case 9:
                C0211Ll c0211Ll = (C0211Ll) this.b;
                synchronized (c0211Ll.d) {
                    try {
                        if (c0211Ll.h == null) {
                            return;
                        }
                        try {
                            C0381Vl c0381VlD = c0211Ll.d();
                            int i10 = c0381VlD.e;
                            if (i10 == 2) {
                                synchronized (c0211Ll.d) {
                                }
                            }
                            if (i10 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                            }
                            try {
                                int i11 = JJ.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C0108Fk c0108Fk = c0211Ll.c;
                                Context context = c0211Ll.a;
                                c0108Fk.getClass();
                                C0381Vl[] c0381VlArr = {c0381VlD};
                                AbstractC0069Df abstractC0069Df = AbstractC2938kK.a;
                                AbstractC0115Ga.c("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceK = AbstractC2938kK.a.k(context, c0381VlArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferR = AbstractC0500aq.R(c0211Ll.a, c0381VlD.a);
                                    if (mappedByteBufferR == null || typefaceK == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        C3532vE c3532vE = new C3532vE(typefaceK, AbstractC3279qd.X(mappedByteBufferR));
                                        Trace.endSection();
                                        synchronized (c0211Ll.d) {
                                            try {
                                                AbstractC0136He abstractC0136He = c0211Ll.h;
                                                if (abstractC0136He != null) {
                                                    abstractC0136He.C(c3532vE);
                                                }
                                            } finally {
                                            }
                                        }
                                        c0211Ll.b();
                                        return;
                                    } finally {
                                        int i12 = JJ.a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            synchronized (c0211Ll.d) {
                                try {
                                    AbstractC0136He abstractC0136He2 = c0211Ll.h;
                                    if (abstractC0136He2 != null) {
                                        abstractC0136He2.B(th);
                                    }
                                    c0211Ll.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 10:
                MaterialButton.a((MaterialButton) this.b);
                return;
            case 11:
                Mz mz = (Mz) this.b;
                int i13 = mz.b;
                Qr qr = mz.f;
                if (i13 == 0) {
                    mz.c = true;
                    qr.e(Hr.ON_PAUSE);
                }
                if (mz.a == 0 && mz.c) {
                    qr.e(Hr.ON_STOP);
                    mz.d = true;
                    return;
                }
                return;
            case 12:
                ((AbstractC2601eB) this.b).m();
                return;
            case 13:
                a();
                return;
            case 14:
                K7 k7 = (K7) this.b;
                k7.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) k7.e;
                WL wl = sideSheetBehavior.i;
                if (wl != null && wl.g()) {
                    k7.a(k7.b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.s(k7.b);
                        return;
                    }
                    return;
                }
            case 15:
                View view = (View) this.b;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 16:
                ((TextInputLayout) this.b).e.requestLayout();
                return;
            case 17:
                int i14 = 0;
                while (true) {
                    c3430tK = (C3430tK) ((C0607co) this.b).a;
                    if (!TunnelUtils.isNetworkOnline(c3430tK.a) && i14 < 60) {
                        SkStatus.updateStateString(Deobfuscator$MHRTUNNELVPN$app.getString(-111771581117370L), Deobfuscator$MHRTUNNELVPN$app.getString(-111805940855738L));
                        SkStatus.logInfo(R.string.state_nonetwork, new Object[0]);
                        C3430tK.v.addStatus(Deobfuscator$MHRTUNNELVPN$app.getString(-111891840201658L));
                        try {
                            Thread.sleep(2000L);
                            i14 += 2;
                        } catch (InterruptedException unused2) {
                            return;
                        }
                    }
                }
                Context context2 = c3430tK.a;
                if (TunnelUtils.isNetworkOnline(context2)) {
                    InterfaceC3376sK interfaceC3376sK = C3430tK.v;
                    if (interfaceC3376sK != null) {
                        interfaceC3376sK.restartSocksOpenVPN();
                        return;
                    }
                    return;
                }
                C3430tK.v.addStatus(Deobfuscator$MHRTUNNELVPN$app.getString(-111939084841914L));
                InterfaceC3376sK interfaceC3376sK2 = C3430tK.v;
                if (interfaceC3376sK2 != null) {
                    interfaceC3376sK2.stopSocksOpenVPN();
                } else {
                    AbstractC3279qd.j0(context2, Deobfuscator$MHRTUNNELVPN$app.getString(-111994919416762L));
                }
                TunnelManagerHelper.stopSocksHttp(context2);
                return;
            case 18:
                b();
                return;
            case 19:
                StringBuilder sb = new StringBuilder("Service took too long to process intent: ");
                NN nn = (NN) this.b;
                sb.append(nn.a.getAction());
                sb.append(" finishing.");
                Log.w("FirebaseMessaging", sb.toString());
                nn.b.trySetResult(null);
                return;
            default:
                C0535bO c0535bO = (C0535bO) this.b;
                c0535bO.getClass();
                ((C2768hD) c0535bO.d).g(new C0285Qa(c0535bO, 20));
                return;
        }
    }
}
