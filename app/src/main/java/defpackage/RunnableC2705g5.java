package defpackage;

import android.animation.ValueAnimator;
import android.database.Cursor;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.f;
import androidx.fragment.app.g;
import androidx.fragment.app.t;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.mxtunnel.pro.R;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import rased.vpn.app.activities.LogActivity;
import rased.vpn.app.activities.SplashActivity;
import rased.vpn.app.fragment.GraphFragment;
import rased.vpn.app.service.InjectorService;
import rased.vpn.app.service.PsiphonDNSService;
import rased.vpn.app.service.SocksDNSService;
import rased.vpn.app.service.vpn.TunnelManagerThread;
import rased.vpn.app.service.vpn.TunnelUtils;
import rased.vpn.app.service.vpn.logger.SkStatus;
import rased.vpn.app.tethering.ProxyService;

/* renamed from: g5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2705g5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC2705g5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void b() throws InterruptedException {
        while (true) {
            GraphFragment graphFragment = (GraphFragment) this.b;
            if (!graphFragment.b || graphFragment.getActivity() == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (AbstractC3279qd.u == 0) {
                AbstractC3279qd.u = TrafficStats.getTotalRxBytes();
            }
            if (AbstractC3279qd.t == 0) {
                AbstractC3279qd.t = TrafficStats.getTotalTxBytes();
            }
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long j = totalRxBytes - AbstractC3279qd.u;
            long totalTxBytes = TrafficStats.getTotalTxBytes();
            long j2 = totalTxBytes - AbstractC3279qd.t;
            AbstractC3279qd.u = totalRxBytes;
            AbstractC3279qd.t = totalTxBytes;
            arrayList.add(Long.valueOf(j));
            arrayList.add(Long.valueOf(j2));
            Long l = (Long) arrayList.get(0);
            Long l2 = (Long) arrayList.get(1);
            l.getClass();
            l2.getClass();
            C2772hH c2772hH = ((GraphFragment) this.b).c;
            long jLongValue = l.longValue();
            synchronized (c2772hH) {
                c2772hH.d();
                ArrayList arrayList2 = c2772hH.c;
                ((C2717gH) arrayList2.get(arrayList2.size() - 1)).b += jLongValue;
                ArrayList arrayList3 = c2772hH.e;
                ((C2717gH) arrayList3.get(arrayList3.size() - 1)).b += jLongValue;
            }
            ((GraphFragment) this.b).c.a(l2.longValue());
            ((GraphFragment) this.b).getActivity().runOnUiThread(new RunnableC2705g5(this, 13));
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.b
            kq r0 = (defpackage.C2962kq) r0
            TC r0 = r0.c
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.h
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r1 = 1
            r2 = 0
            r3 = 0
            r0.lock()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            java.lang.Object r4 = r5.b     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            kq r4 = (defpackage.C2962kq) r4     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            boolean r4 = r4.a()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            if (r4 != 0) goto L20
            r0.unlock()
            return
        L20:
            java.lang.Object r4 = r5.b     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            kq r4 = (defpackage.C2962kq) r4     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.d     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            boolean r1 = r4.compareAndSet(r1, r2)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            if (r1 != 0) goto L30
            r0.unlock()
            return
        L30:
            java.lang.Object r1 = r5.b     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            kq r1 = (defpackage.C2962kq) r1     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            TC r1 = r1.c     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            UH r1 = r1.c     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            Wm r1 = r1.d()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            android.database.sqlite.SQLiteClosable r1 = r1.b     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            android.database.sqlite.SQLiteDatabase r1 = (android.database.sqlite.SQLiteDatabase) r1     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            boolean r1 = r1.inTransaction()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            if (r1 == 0) goto L4a
            r0.unlock()
            return
        L4a:
            java.lang.Object r1 = r5.b     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            kq r1 = (defpackage.C2962kq) r1     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            TC r1 = r1.c     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            boolean r2 = r1.f     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            if (r2 == 0) goto L73
            UH r1 = r1.c     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            Wm r1 = r1.d()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            r1.a()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            java.util.HashSet r3 = r5.a()     // Catch: java.lang.Throwable -> L6e
            r1.l()     // Catch: java.lang.Throwable -> L6e
            r1.h()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            goto L77
        L68:
            r1 = move-exception
            goto Lbc
        L6a:
            r1 = move-exception
            goto L7b
        L6c:
            r1 = move-exception
            goto L7b
        L6e:
            r2 = move-exception
            r1.h()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            throw r2     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
        L73:
            java.util.HashSet r3 = r5.a()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
        L77:
            r0.unlock()
            goto L83
        L7b:
            java.lang.String r2 = "ROOM"
            java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r2, r4, r1)     // Catch: java.lang.Throwable -> L68
            goto L77
        L83:
            if (r3 == 0) goto Lbb
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lbb
            java.lang.Object r0 = r5.b
            kq r0 = (defpackage.C2962kq) r0
            tD r0 = r0.h
            monitor-enter(r0)
            java.lang.Object r1 = r5.b     // Catch: java.lang.Throwable -> La6
            kq r1 = (defpackage.C2962kq) r1     // Catch: java.lang.Throwable -> La6
            tD r1 = r1.h     // Catch: java.lang.Throwable -> La6
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La6
            pD r1 = (defpackage.C3206pD) r1     // Catch: java.lang.Throwable -> La6
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> La6
            if (r2 != 0) goto La8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            goto Lbb
        La6:
            r1 = move-exception
            goto Lb9
        La8:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> La6
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> La6
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> La6
            jq r1 = (defpackage.AbstractC2907jq) r1     // Catch: java.lang.Throwable -> La6
            r1.getClass()     // Catch: java.lang.Throwable -> La6
            r1 = 0
            throw r1     // Catch: java.lang.Throwable -> La6
        Lb9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            throw r1
        Lbb:
            return
        Lbc:
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC2705g5.c():void");
    }

    private final void d() {
        Object obj;
        synchronized (((Is) this.b).a) {
            obj = ((Is) this.b).f;
            ((Is) this.b).f = Is.k;
        }
        ((Is) this.b).h(obj);
    }

    private final void e() {
        PsiphonDNSService psiphonDNSService = (PsiphonDNSService) this.b;
        synchronized (psiphonDNSService) {
            SkStatus.updateStateString(SkStatus.SSH_STARTING, psiphonDNSService.getString(R.string.starting_service_ssh));
            psiphonDNSService.d();
            NetworkInfo activeNetworkInfo = psiphonDNSService.c.getActiveNetworkInfo();
            SkStatus.logInfo("Local IP: " + ((activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) ? "Indisponivel" : TunnelUtils.getLocalIpAddress()));
            try {
                psiphonDNSService.f();
            } catch (Exception e) {
                SkStatus.logException(e);
                psiphonDNSService.b.post(new RunnableC3636xA(psiphonDNSService));
            }
        }
    }

    private final void f() {
        SocksDNSService socksDNSService = (SocksDNSService) this.b;
        synchronized (socksDNSService) {
            SocksDNSService.t = true;
            SkStatus.updateStateString(SkStatus.SSH_STARTING, socksDNSService.getString(R.string.starting_service_ssh));
            socksDNSService.d();
            NetworkInfo activeNetworkInfo = socksDNSService.c.getActiveNetworkInfo();
            SkStatus.logInfo("Local IP: " + ((activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) ? "Indisponivel" : TunnelUtils.getLocalIpAddress()));
            try {
                C3430tK c3430tK = new C3430tK();
                c3430tK.a = socksDNSService;
                c3430tK.d = C3492ub.c(socksDNSService);
                socksDNSService.e = c3430tK;
                c3430tK.start();
                TunnelManagerThread tunnelManagerThread = new TunnelManagerThread(socksDNSService.b, socksDNSService);
                SocksDNSService.s = tunnelManagerThread;
                tunnelManagerThread.setOnStopClienteListener(new C2989lG(socksDNSService));
                SocksDNSService.q = new Date().getTime();
            } catch (Exception e) {
                SkStatus.logException(e);
                socksDNSService.b.post(new RunnableC3044mG(socksDNSService));
            }
        }
    }

    public HashSet a() {
        HashSet hashSet = new HashSet();
        Cursor cursorG = ((C2962kq) this.b).c.g(new C3337ri("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 2));
        while (cursorG.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(cursorG.getInt(0)));
            } catch (Throwable th) {
                cursorG.close();
                throw th;
            }
        }
        cursorG.close();
        if (!hashSet.isEmpty()) {
            ((C2962kq) this.b).f.m();
        }
        return hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, IOException {
        Bs bs;
        View viewD;
        int width;
        int i;
        Selector selector;
        boolean z;
        A0 a0;
        switch (this.a) {
            case 0:
                ViewOnTouchListenerC3779zs viewOnTouchListenerC3779zs = (ViewOnTouchListenerC3779zs) this.b;
                if (viewOnTouchListenerC3779zs.u) {
                    boolean z2 = viewOnTouchListenerC3779zs.s;
                    C2650f5 c2650f5 = viewOnTouchListenerC3779zs.a;
                    if (z2) {
                        viewOnTouchListenerC3779zs.s = false;
                        c2650f5.getClass();
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c2650f5.e = jCurrentAnimationTimeMillis;
                        c2650f5.g = -1L;
                        c2650f5.f = jCurrentAnimationTimeMillis;
                        c2650f5.h = 0.5f;
                    }
                    if ((c2650f5.g > 0 && AnimationUtils.currentAnimationTimeMillis() > c2650f5.g + c2650f5.i) || !viewOnTouchListenerC3779zs.e()) {
                        viewOnTouchListenerC3779zs.u = false;
                        return;
                    }
                    boolean z3 = viewOnTouchListenerC3779zs.t;
                    View view = viewOnTouchListenerC3779zs.c;
                    if (z3) {
                        viewOnTouchListenerC3779zs.t = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        view.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c2650f5.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = c2650f5.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - c2650f5.f;
                    c2650f5.f = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC3779zs.w.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * c2650f5.d));
                    WeakHashMap weakHashMap = UL.a;
                    view.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                K7 k7 = (K7) this.b;
                k7.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) k7.e;
                WL wl = bottomSheetBehavior.O;
                if (wl != null && wl.g()) {
                    k7.a(k7.b);
                    return;
                } else {
                    if (bottomSheetBehavior.N == 2) {
                        bottomSheetBehavior.D(k7.b);
                        return;
                    }
                    return;
                }
            case 2:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
            case 3:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.b;
                String strB = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                if (TextUtils.isEmpty(strB)) {
                    C3130nt.d().b(ConstraintTrackingWorker.f, "No worker to delegate to.", new Throwable[0]);
                    bs = new Bs();
                } else {
                    ListenableWorker listenableWorkerA = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), strB, constraintTrackingWorker.a);
                    constraintTrackingWorker.e = listenableWorkerA;
                    if (listenableWorkerA != null) {
                        C2834iO c2834iOJ = C0589cO.S(constraintTrackingWorker.getApplicationContext()).y.n().j(constraintTrackingWorker.getId().toString());
                        if (c2834iOJ == null) {
                            constraintTrackingWorker.d.i(new Bs());
                            return;
                        }
                        QN qn = new QN(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
                        qn.c(Collections.singletonList(c2834iOJ));
                        if (!qn.a(constraintTrackingWorker.getId().toString())) {
                            C3130nt.d().a(ConstraintTrackingWorker.f, AbstractC3264qG.x("Constraints not met for delegate ", strB, ". Requesting retry."), new Throwable[0]);
                            constraintTrackingWorker.d.i(new Cs());
                            return;
                        }
                        C3130nt.d().a(ConstraintTrackingWorker.f, AbstractC3264qG.w("Constraints met for delegate ", strB), new Throwable[0]);
                        try {
                            As asStartWork = constraintTrackingWorker.e.startWork();
                            asStartWork.addListener(new RunnableC3680y0(7, constraintTrackingWorker, asStartWork), constraintTrackingWorker.getBackgroundExecutor());
                            return;
                        } catch (Throwable th) {
                            C3130nt c3130ntD = C3130nt.d();
                            String str = ConstraintTrackingWorker.f;
                            c3130ntD.a(str, AbstractC3264qG.x("Delegated worker ", strB, " threw exception in startWork."), th);
                            synchronized (constraintTrackingWorker.b) {
                                try {
                                    if (constraintTrackingWorker.c) {
                                        C3130nt.d().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                                        constraintTrackingWorker.d.i(new Cs());
                                    } else {
                                        constraintTrackingWorker.d.i(new Bs());
                                    }
                                    return;
                                } finally {
                                }
                            }
                        }
                    }
                    C3130nt.d().a(ConstraintTrackingWorker.f, "No worker to delegate to.", new Throwable[0]);
                    bs = new Bs();
                }
                constraintTrackingWorker.d.i(bs);
                return;
            case 4:
                AnimationAnimationListenerC2679fg animationAnimationListenerC2679fg = (AnimationAnimationListenerC2679fg) this.b;
                animationAnimationListenerC2679fg.b.endViewTransition(animationAnimationListenerC2679fg.c);
                animationAnimationListenerC2679fg.d.a();
                return;
            case 5:
                AbstractC0144Hm.a((ArrayList) this.b, 4);
                return;
            case 6:
                g gVar = (g) this.b;
                gVar.mOnDismissListener.onDismiss(gVar.mDialog);
                return;
            case 7:
                K1 k1 = (K1) this.b;
                k1.a(true);
                k1.invalidateSelf();
                return;
            case 8:
                C3606wh c3606wh = (C3606wh) this.b;
                int i2 = c3606wh.l.o;
                int i3 = c3606wh.k;
                boolean z4 = i3 == 3;
                DrawerLayout drawerLayout = c3606wh.n;
                if (z4) {
                    viewD = drawerLayout.d(3);
                    width = (viewD != null ? -viewD.getWidth() : 0) + i2;
                } else {
                    viewD = drawerLayout.d(5);
                    width = drawerLayout.getWidth() - i2;
                }
                if (viewD != null) {
                    if (((!z4 || viewD.getLeft() >= width) && (z4 || viewD.getLeft() <= width)) || drawerLayout.g(viewD) != 0) {
                        return;
                    }
                    C3498uh c3498uh = (C3498uh) viewD.getLayoutParams();
                    c3606wh.l.s(viewD, width, viewD.getTop());
                    c3498uh.c = true;
                    drawerLayout.invalidate();
                    View viewD2 = drawerLayout.d(i3 == 3 ? 5 : 3);
                    if (viewD2 != null) {
                        drawerLayout.b(viewD2);
                    }
                    if (drawerLayout.x) {
                        return;
                    }
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        drawerLayout.getChildAt(i4).dispatchTouchEvent(motionEventObtain2);
                    }
                    motionEventObtain2.recycle();
                    drawerLayout.x = true;
                    return;
                }
                return;
            case 9:
                C0054Ch c0054Ch = (C0054Ch) this.b;
                c0054Ch.r = null;
                c0054Ch.drawableStateChanged();
                return;
            case 10:
                C0362Uj c0362Uj = (C0362Uj) this.b;
                int i5 = c0362Uj.A;
                ValueAnimator valueAnimator = c0362Uj.z;
                if (i5 != 1) {
                    i = 2;
                    if (i5 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c0362Uj.A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 11:
                ((f) this.b).d();
                return;
            case 12:
                ((t) this.b).x(true);
                return;
            case 13:
                boolean zIsTunnelActive = SkStatus.isTunnelActive();
                RunnableC2705g5 runnableC2705g5 = (RunnableC2705g5) this.b;
                if (zIsTunnelActive) {
                    try {
                        ((GraphFragment) runnableC2705g5.b).a();
                    } catch (Exception unused) {
                    }
                }
                if (InjectorService.s) {
                    try {
                        ((GraphFragment) runnableC2705g5.b).a();
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 14:
                b();
                return;
            case 15:
                boolean z5 = InjectorService.s;
                InjectorService injectorService = (InjectorService) this.b;
                injectorService.getClass();
                try {
                    ServerSocket serverSocket = injectorService.d;
                    if (serverSocket != null) {
                        serverSocket.close();
                        injectorService.d = null;
                    }
                    Socket socket = injectorService.e;
                    if (socket != null) {
                        socket.close();
                    }
                    Socket socket2 = injectorService.f;
                    if (socket2 != null) {
                        socket2.close();
                        injectorService.f = null;
                    }
                    SSLSocket sSLSocket = injectorService.q;
                    if (sSLSocket != null) {
                        sSLSocket.close();
                        injectorService.q = null;
                    }
                    Thread thread = injectorService.a;
                    if (thread != null) {
                        thread.interrupt();
                    }
                    HttpsURLConnection httpsURLConnection = injectorService.o;
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    S6 s6 = injectorService.p;
                    if (s6 != null) {
                        ServerSocket serverSocket2 = s6.a;
                        if (serverSocket2 != null) {
                            serverSocket2.close();
                        }
                        Socket socket3 = s6.b;
                        if (socket3 != null) {
                            socket3.close();
                        }
                        s6.c = false;
                        s6.interrupt();
                        injectorService.p = null;
                        return;
                    }
                    return;
                } catch (Exception unused3) {
                    return;
                }
            case 16:
                c();
                return;
            case 17:
                d();
                return;
            case 18:
                LogActivity logActivity = (LogActivity) this.b;
                logActivity.m.smoothScrollToPosition(logActivity.n.size());
                return;
            case 19:
                ProxyService proxyService = (ProxyService) this.b;
                proxyService.getClass();
                Log.d("ProxyService", "do proxy server start");
                while (proxyService.f != null && (selector = proxyService.e) != null) {
                    try {
                        selector.select();
                    } catch (Exception e3) {
                        Log.e("ProxyService", "selector select exception", e3);
                    }
                    if (!proxyService.e.isOpen()) {
                        Log.d("ProxyService", "do proxy server finish");
                        ProxyService.o = false;
                        return;
                    }
                    Iterator<SelectionKey> it = proxyService.e.selectedKeys().iterator();
                    while (it.hasNext()) {
                        SelectionKey next = it.next();
                        it.remove();
                        Object objAttachment = next.attachment();
                        try {
                            (objAttachment instanceof C2545d9 ? (C2545d9) objAttachment : new C2545d9()).c(next);
                        } catch (Exception unused4) {
                        }
                    }
                }
                Log.d("ProxyService", "do proxy server finish");
                ProxyService.o = false;
                return;
            case 20:
                e();
                return;
            case 21:
                RecyclerView recyclerView = (RecyclerView) this.b;
                AbstractC3367sB abstractC3367sB = recyclerView.O;
                if (abstractC3367sB != null) {
                    C0392Wf c0392Wf = (C0392Wf) abstractC3367sB;
                    ArrayList arrayList = c0392Wf.h;
                    boolean z6 = !arrayList.isEmpty();
                    ArrayList arrayList2 = c0392Wf.j;
                    boolean z7 = !arrayList2.isEmpty();
                    ArrayList arrayList3 = c0392Wf.k;
                    boolean z8 = !arrayList3.isEmpty();
                    ArrayList arrayList4 = c0392Wf.i;
                    boolean z9 = !arrayList4.isEmpty();
                    if (z6 || z7 || z9 || z8) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it2.hasNext();
                            long j2 = c0392Wf.d;
                            if (zHasNext) {
                                JB jb = (JB) it2.next();
                                View view2 = jb.a;
                                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                                c0392Wf.q.add(jb);
                                viewPropertyAnimatorAnimate.setDuration(j2).alpha(0.0f).setListener(new C0307Rf(c0392Wf, jb, viewPropertyAnimatorAnimate, view2)).start();
                            } else {
                                arrayList.clear();
                                if (z7) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0392Wf.m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0290Qf runnableC0290Qf = new RunnableC0290Qf(c0392Wf, arrayList5, 0);
                                    if (z6) {
                                        View view3 = ((C0375Vf) arrayList5.get(0)).a.a;
                                        WeakHashMap weakHashMap2 = UL.a;
                                        view3.postOnAnimationDelayed(runnableC0290Qf, j2);
                                    } else {
                                        runnableC0290Qf.run();
                                    }
                                }
                                if (z8) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0392Wf.n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0290Qf runnableC0290Qf2 = new RunnableC0290Qf(c0392Wf, arrayList6, 1);
                                    if (z6) {
                                        View view4 = ((C0358Uf) arrayList6.get(0)).a.a;
                                        WeakHashMap weakHashMap3 = UL.a;
                                        view4.postOnAnimationDelayed(runnableC0290Qf2, j2);
                                    } else {
                                        runnableC0290Qf2.run();
                                    }
                                }
                                if (z9) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0392Wf.l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0290Qf runnableC0290Qf3 = new RunnableC0290Qf(c0392Wf, arrayList7, 2);
                                    if (z6 || z7 || z8) {
                                        if (!z6) {
                                            j2 = 0;
                                        }
                                        long jMax = Math.max(z7 ? c0392Wf.e : 0L, z8 ? c0392Wf.f : 0L) + j2;
                                        View view5 = ((JB) arrayList7.get(0)).a;
                                        WeakHashMap weakHashMap4 = UL.a;
                                        view5.postOnAnimationDelayed(runnableC0290Qf3, jMax);
                                    } else {
                                        runnableC0290Qf3.run();
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                recyclerView.p0 = z;
                return;
            case 22:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.b;
                if (searchView$SearchAutoComplete.f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f = false;
                    return;
                }
                return;
            case ConnectionResult.API_DISABLED /* 23 */:
                f();
                return;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                ((SplashActivity) ((C3178om) this.b).c).finish();
                return;
            case 25:
                ((SplashActivity) ((C3588wG) this.b).a).finish();
                return;
            case 26:
                ((StaggeredGridLayoutManager) this.b).D0();
                return;
            case 27:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.b).c.m;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            default:
                ActionMenuView actionMenuView = ((Toolbar) this.b).a;
                if (actionMenuView == null || (a0 = actionMenuView.z) == null) {
                    return;
                }
                a0.l();
                return;
        }
    }
}
