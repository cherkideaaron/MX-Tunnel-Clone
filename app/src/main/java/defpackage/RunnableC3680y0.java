package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.f;
import androidx.fragment.app.z;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.mxtunnel.pro.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNClient;
import rased.vpn.app.view.CircleProgressBar;
import xyz.hasnat.sweettoast.SweetToast;

/* renamed from: y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3680y0 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ RunnableC3680y0(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    private final void a() {
        try {
            b();
        } catch (Error e) {
            synchronized (((ExecutorC3152oE) this.c).b) {
                ((ExecutorC3152oE) this.c).c = 1;
                throw e;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        ((java.lang.Runnable) r10.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        defpackage.ExecutorC3152oE.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        r10.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.c     // Catch: java.lang.Throwable -> L5e
            oE r2 = (defpackage.ExecutorC3152oE) r2     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayDeque r2 = r2.b     // Catch: java.lang.Throwable -> L5e
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5e
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.c     // Catch: java.lang.Throwable -> L20
            oE r0 = (defpackage.ExecutorC3152oE) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.c     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L1f
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1f:
            return
        L20:
            r0 = move-exception
            goto L83
        L22:
            long r6 = r0.d     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.d = r6     // Catch: java.lang.Throwable -> L20
            r0.c = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.c     // Catch: java.lang.Throwable -> L20
            oE r4 = (defpackage.ExecutorC3152oE) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.b = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L4d
            java.lang.Object r0 = r10.c     // Catch: java.lang.Throwable -> L20
            oE r0 = (defpackage.ExecutorC3152oE) r0     // Catch: java.lang.Throwable -> L20
            r0.c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L4c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L4c:
            return
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5e
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.b     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            r3.run()     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
        L5b:
            r10.b = r2     // Catch: java.lang.Throwable -> L5e
            goto L2
        L5e:
            r0 = move-exception
            goto L85
        L60:
            r0 = move-exception
            goto L80
        L62:
            r3 = move-exception
            java.util.logging.Logger r4 = defpackage.ExecutorC3152oE.f     // Catch: java.lang.Throwable -> L60
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r6.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L60
            java.lang.Object r7 = r10.b     // Catch: java.lang.Throwable -> L60
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L60
            r6.append(r7)     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L60
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L60
            goto L5b
        L80:
            r10.b = r2     // Catch: java.lang.Throwable -> L5e
            throw r0     // Catch: java.lang.Throwable -> L5e
        L83:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L5e
        L85:
            if (r1 == 0) goto L8e
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L8e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC3680y0.b():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [eQ, zk] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        InterfaceC3403su interfaceC3403su;
        Throwable e;
        CircleProgressBar circleProgressBar;
        String string;
        Task<C2827iH> taskZza;
        int i = 0;
        switch (this.a) {
            case 0:
                A0 a0 = (A0) this.c;
                MenuC3511uu menuC3511uu = a0.c;
                if (menuC3511uu != null && (interfaceC3403su = menuC3511uu.e) != null) {
                    interfaceC3403su.k(menuC3511uu);
                }
                View view = (View) a0.n;
                if (view != null && view.getWindowToken() != null) {
                    C3572w0 c3572w0 = (C3572w0) this.b;
                    if (c3572w0.b()) {
                        a0.y = c3572w0;
                    } else if (c3572w0.f != null) {
                        c3572w0.d(0, 0, false, false);
                        a0.y = c3572w0;
                    }
                }
                a0.A = null;
                return;
            case 1:
                ((J0) this.b).a = this.c;
                return;
            case 2:
                ((Application) this.b).unregisterActivityLifecycleCallbacks((J0) this.c);
                return;
            case 3:
                try {
                    Method method = K0.d;
                    Object obj = this.c;
                    Object obj2 = this.b;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        K0.e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 4:
                try {
                    ((C2708g8) this.c).b.put((C3373sH) this.b);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 5:
                AbstractC3296qu abstractC3296qu = (AbstractC3296qu) ((C3588wG) this.b).a;
                if (abstractC3296qu != null) {
                    abstractC3296qu.L((Typeface) this.c);
                    return;
                }
                return;
            case 6:
                for (AbstractC0218Mb abstractC0218Mb : (List) this.b) {
                    Object obj3 = ((AbstractC0595cc) this.c).e;
                    abstractC0218Mb.b = obj3;
                    abstractC0218Mb.d(abstractC0218Mb.d, obj3);
                }
                return;
            case 7:
                synchronized (((ConstraintTrackingWorker) this.c).b) {
                    if (((ConstraintTrackingWorker) this.c).c) {
                        ((ConstraintTrackingWorker) this.c).d.i(new Cs());
                    } else {
                        ((ConstraintTrackingWorker) this.c).d.k((As) this.b);
                    }
                }
                return;
            case 8:
                ((C2789hg) this.b).a();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Transition for operation " + ((z) this.c) + "has completed");
                    return;
                }
                return;
            case 9:
                C3130nt c3130ntD = C3130nt.d();
                String str = C3335rg.d;
                C2834iO c2834iO = (C2834iO) this.b;
                c3130ntD.a(str, AbstractC3264qG.w("Scheduling work ", c2834iO.a), new Throwable[0]);
                ((C3335rg) this.c).a.e(c2834iO);
                return;
            case 10:
                ((AdListener) this.b).onError((Ad) this.c, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network folder is inside of assets folder."));
                return;
            case 11:
                InterfaceC0128Gn interfaceC0128Gn = (InterfaceC0128Gn) this.c;
                try {
                    interfaceC0128Gn.onSuccess(AbstractC3279qd.x((Future) this.b));
                    return;
                } catch (Error e3) {
                    e = e3;
                    interfaceC0128Gn.onFailure(e);
                    return;
                } catch (RuntimeException e4) {
                    e = e4;
                    interfaceC0128Gn.onFailure(e);
                    return;
                } catch (ExecutionException e5) {
                    e = e5.getCause();
                    interfaceC0128Gn.onFailure(e);
                    return;
                }
            case 12:
                ((InterfaceC3742z8) this.b).a((C3125no) this.c);
                return;
            case 13:
                break;
            case 14:
                OpenVPNClient openVPNClient = (OpenVPNClient) this.c;
                EnumC2587dy enumC2587dy = openVPNClient.v;
                if (enumC2587dy != EnumC2587dy.d && enumC2587dy != EnumC2587dy.a) {
                    ((AbstractActivityC2592e2) this.b).finish();
                }
                openVPNClient.v = EnumC2587dy.a;
                return;
            case 15:
                OpenVPNClient openVPNClient2 = (OpenVPNClient) this.c;
                boolean zBooleanValue = openVPNClient2.g0.p().booleanValue();
                String str2 = (String) this.b;
                if (!zBooleanValue) {
                    openVPNClient2.y0 = str2;
                }
                if (str2.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-30416310596538L))) {
                    if (openVPNClient2.g0.p().booleanValue()) {
                        string = Deobfuscator$MHRTUNNELVPN$app.getString(-30519389811642L);
                        openVPNClient2.y0 = string;
                    }
                } else if (str2.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-30553749550010L))) {
                    openVPNClient2.s0.setProgressWithAnimation(0.0f);
                    openVPNClient2.s0.setColor(-65536);
                    if (openVPNClient2.g0.p().booleanValue()) {
                        string = Deobfuscator$MHRTUNNELVPN$app.getString(-30609584124858L);
                        openVPNClient2.y0 = string;
                    }
                } else {
                    if (str2.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-30665418699706L))) {
                        openVPNClient2.s0.setProgressWithAnimation(60.0f);
                        circleProgressBar = openVPNClient2.s0;
                    } else if (str2.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-30772792882106L)) || str2.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-30841512358842L))) {
                        openVPNClient2.s0.setProgressWithAnimation(30.0f);
                        circleProgressBar = openVPNClient2.s0;
                    } else {
                        if (!str2.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-30888756999098L))) {
                            if (str2.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-30936001639354L))) {
                                openVPNClient2.s0.setProgressWithAnimation(100.0f);
                                openVPNClient2.s0.setColor(-16711936);
                                openVPNClient2.B0 = true;
                                return;
                            }
                            if (str2.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-31000426148794L))) {
                                openVPNClient2.s0.setProgressWithAnimation(100.0f);
                                openVPNClient2.s0.setColor(-16711936);
                                openVPNClient2.Q();
                                if (openVPNClient2.g0.p().booleanValue()) {
                                    openVPNClient2.y0 = Deobfuscator$MHRTUNNELVPN$app.getString(-31043375821754L);
                                }
                                openVPNClient2.B0 = true;
                                long j = openVPNClient2.S0.getLong(Deobfuscator$MHRTUNNELVPN$app.getString(-31086325494714L), 0L);
                                if (j == 0 || (j != 0 && System.currentTimeMillis() >= j + 60000)) {
                                    openVPNClient2.M();
                                }
                                SweetToast.success(openVPNClient2.getApplicationContext(), openVPNClient2.getString(R.string.connected_toast));
                                XD xd = openVPNClient2.g0.b;
                                xd.putBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-169470171771834L), false);
                                xd.apply();
                                return;
                            }
                            return;
                        }
                        openVPNClient2.s0.setProgressWithAnimation(60.0f);
                        circleProgressBar = openVPNClient2.s0;
                    }
                    circleProgressBar.setColor(-65536);
                }
                openVPNClient2.B0 = false;
                return;
            case 16:
                ((InterfaceC2840ic) this.b).a(this.c);
                return;
            case 17:
                ((InterfaceC3742z8) this.c).a((AbstractC0219Mc) this.b);
                return;
            case 18:
                a();
                return;
            case 19:
                ExecutorC3316rE executorC3316rE = (ExecutorC3316rE) this.b;
                try {
                    ((Runnable) this.c).run();
                    return;
                } finally {
                    executorC3316rE.b();
                }
            case 20:
                f fVar = (f) this.c;
                ArrayList arrayList = fVar.b;
                z zVar = (z) this.b;
                arrayList.remove(zVar);
                fVar.c.remove(zVar);
                return;
            default:
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C3663xk.e((String) this.b));
                AbstractC2739gl abstractC2739gl = firebaseAuth.f;
                if (abstractC2739gl != null) {
                    if (abstractC2739gl == null) {
                        taskZza = Tasks.forException(zzaen.zza(new Status(17495)));
                    } else {
                        zzahv zzahvVar = ((BP) abstractC2739gl).a;
                        zzahvVar.zzg();
                        taskZza = firebaseAuth.e.zza(firebaseAuth.a, abstractC2739gl, zzahvVar.zzd(), (InterfaceC2616eQ) new C3771zk(firebaseAuth, 1));
                    }
                    KP.e.v("Token refreshing started", new Object[0]);
                    C3588wG c3588wG = new C3588wG();
                    Objects.requireNonNull(this);
                    c3588wG.a = this;
                    taskZza.addOnFailureListener(c3588wG);
                    return;
                }
                return;
        }
        while (true) {
            try {
                ((Runnable) this.b).run();
            } catch (Throwable th2) {
                AbstractC3279qd.J(C0021Ai.a, th2);
            }
            Vr vr = (Vr) this.c;
            Runnable runnableH = vr.h();
            if (runnableH == null) {
                return;
            }
            this.b = runnableH;
            i++;
            if (i >= 16 && vr.d.f(vr)) {
                vr.d.e(vr, this);
                return;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 11:
                D3 d3N = AbstractC0136He.N(this);
                C3178om c3178om = new C3178om(5, false);
                ((C3178om) d3N.d).c = c3178om;
                d3N.d = c3178om;
                c3178om.b = (InterfaceC0128Gn) this.c;
                return d3N.toString();
            case 18:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                return "SequentialExecutorWorker{state=" + Vs.E(((ExecutorC3152oE) this.c).c) + "}";
            default:
                return super.toString();
        }
    }

    public RunnableC3680y0(ExecutorC3152oE executorC3152oE) {
        this.a = 18;
        this.c = executorC3152oE;
    }

    public /* synthetic */ RunnableC3680y0(Object obj, Object obj2, int i, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public RunnableC3680y0(KP kp, String str) {
        this.a = 21;
        Objects.requireNonNull(kp);
        this.c = kp;
        this.b = Preconditions.checkNotEmpty(str);
    }
}
