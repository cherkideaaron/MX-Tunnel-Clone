package com.google.firebase.auth;

import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.recaptcha.RecaptchaAction;
import defpackage.AbstractC2739gl;
import defpackage.AbstractC3264qG;
import defpackage.BP;
import defpackage.C0402Wp;
import defpackage.C0482aQ;
import defpackage.C0537bQ;
import defpackage.C2671fQ;
import defpackage.C3663xk;
import defpackage.H2;
import defpackage.InterfaceC0385Vp;
import defpackage.InterfaceC3258qA;
import defpackage.KP;
import defpackage.RunnableC3000lR;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class FirebaseAuth implements InterfaceC0385Vp {
    public final C3663xk a;
    public final CopyOnWriteArrayList b;
    public final CopyOnWriteArrayList c;
    public final CopyOnWriteArrayList d;
    public final zzacq e;
    public AbstractC2739gl f;
    public final Object g;
    public final Object h;
    public final String i;
    public H2 j;
    public final RecaptchaAction k;
    public final RecaptchaAction l;
    public final RecaptchaAction m;
    public final C0537bQ n;
    public final C2671fQ o;
    public final InterfaceC3258qA p;
    public final InterfaceC3258qA q;
    public C0482aQ r;
    public final Executor s;
    public final Executor t;
    public final Executor u;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x00d2  */
    /* JADX WARN: Type inference failed for: r6v0, types: [eQ, zk] */
    /* JADX WARN: Type inference failed for: r6v1, types: [eQ, zk] */
    /* JADX WARN: Type inference failed for: r6v3, types: [eQ, zk] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FirebaseAuth(defpackage.C3663xk r9, defpackage.InterfaceC3258qA r10, defpackage.InterfaceC3258qA r11, java.util.concurrent.Executor r12, java.util.concurrent.Executor r13, java.util.concurrent.ScheduledExecutorService r14, java.util.concurrent.Executor r15) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 987
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(xk, qA, qA, java.util.concurrent.Executor, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService, java.util.concurrent.Executor):void");
    }

    public static void d(FirebaseAuth firebaseAuth, AbstractC2739gl abstractC2739gl) {
        String str;
        if (abstractC2739gl != null) {
            str = "Notifying auth state listeners about user ( " + ((BP) abstractC2739gl).b.a + " ).";
        } else {
            str = "Notifying auth state listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.u.execute(new RunnableC3000lR(firebaseAuth));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(com.google.firebase.auth.FirebaseAuth r18, defpackage.AbstractC2739gl r19, com.google.android.gms.internal.p002firebaseauthapi.zzahv r20, boolean r21, boolean r22) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 891
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.e(com.google.firebase.auth.FirebaseAuth, gl, com.google.android.gms.internal.firebase-auth-api.zzahv, boolean, boolean):void");
    }

    public static void g(FirebaseAuth firebaseAuth, AbstractC2739gl abstractC2739gl) {
        String str;
        if (abstractC2739gl != null) {
            str = "Notifying id token listeners about user ( " + ((BP) abstractC2739gl).b.a + " ).";
        } else {
            str = "Notifying id token listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        String strZzc = abstractC2739gl != null ? ((BP) abstractC2739gl).a.zzc() : null;
        C0402Wp c0402Wp = new C0402Wp();
        c0402Wp.a = strZzc;
        firebaseAuth.u.execute(new RunnableC3000lR(firebaseAuth, c0402Wp));
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) C3663xk.d().b(FirebaseAuth.class);
    }

    public final void a() {
        synchronized (this.g) {
        }
    }

    public final String b() {
        String str;
        synchronized (this.h) {
            str = this.i;
        }
        return str;
    }

    public final void c() {
        C0537bQ c0537bQ = this.n;
        Preconditions.checkNotNull(c0537bQ);
        AbstractC2739gl abstractC2739gl = this.f;
        if (abstractC2739gl != null) {
            c0537bQ.getClass();
            Preconditions.checkNotNull(abstractC2739gl);
            c0537bQ.c.edit().remove(AbstractC3264qG.w("com.google.firebase.auth.GET_TOKEN_RESPONSE.", ((BP) abstractC2739gl).b.a)).apply();
            this.f = null;
        }
        c0537bQ.c.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        g(this, null);
        d(this, null);
        C0482aQ c0482aQ = this.r;
        if (c0482aQ != null) {
            KP kp = c0482aQ.a;
            kp.c.removeCallbacks(kp.d);
        }
    }

    public final synchronized H2 f() {
        return this.j;
    }

    @Keep
    public static FirebaseAuth getInstance(C3663xk c3663xk) {
        return (FirebaseAuth) c3663xk.b(FirebaseAuth.class);
    }
}
