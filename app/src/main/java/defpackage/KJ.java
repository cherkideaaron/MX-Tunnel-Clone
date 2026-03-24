package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class KJ implements InterfaceC3681y1, InterfaceC3627x1, E0, InterfaceC0209Lj, Continuation {
    public static KJ e;
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ KJ(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public static synchronized KJ i(Context context, InterfaceC3482uI interfaceC3482uI) {
        try {
            if (e == null) {
                KJ kj = new KJ();
                Context applicationContext = context.getApplicationContext();
                kj.a = new C3633x7(applicationContext, interfaceC3482uI);
                kj.b = new C3687y7(applicationContext, interfaceC3482uI);
                kj.c = new C3298qw(applicationContext, interfaceC3482uI);
                kj.d = new C3045mH(applicationContext, interfaceC3482uI);
                e = kj;
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    @Override // defpackage.E0
    public boolean a(F0 f0, MenuItem menuItem) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(h(f0), new Gu((Context) this.b, (SH) menuItem));
    }

    public void b(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((WF) this.b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                b(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    @Override // defpackage.E0
    public void c(F0 f0) {
        ((ActionMode.Callback) this.a).onDestroyActionMode(h(f0));
    }

    @Override // defpackage.E0
    public boolean d(F0 f0, MenuC3511uu menuC3511uu) {
        OH ohH = h(f0);
        WF wf = (WF) this.d;
        Menu tu = (Menu) wf.get(menuC3511uu);
        if (tu == null) {
            tu = new Tu((Context) this.b, menuC3511uu);
            wf.put(menuC3511uu, tu);
        }
        return ((ActionMode.Callback) this.a).onCreateActionMode(ohH, tu);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(defpackage.InterfaceC3493uc r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C0289Qe
            if (r0 == 0) goto L13
            r0 = r7
            Qe r0 = (defpackage.C0289Qe) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            Qe r0 = new Qe
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 == r4) goto L26
            if (r2 != r3) goto L2c
        L26:
            KJ r0 = r0.a
            defpackage.AbstractC0115Ga.U(r7)
            goto L5e
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            defpackage.AbstractC0115Ga.U(r7)
            java.lang.Object r7 = r6.c
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r2 = r6.d
            xf r2 = (defpackage.C3658xf) r2
            if (r7 == 0) goto L61
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L48
            goto L61
        L48:
            Sp r7 = r2.g()
            Te r4 = new Te
            r5 = 0
            r4.<init>(r2, r6, r5)
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = r7.c(r4, r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r0 = r6
        L5e:
            De r7 = (defpackage.C0068De) r7
            goto L6d
        L61:
            r0.a = r6
            r0.d = r4
            r7 = 0
            java.lang.Object r7 = defpackage.C3658xf.f(r2, r7, r0)
            if (r7 != r1) goto L5d
            return r1
        L6d:
            java.lang.Object r0 = r0.d
            xf r0 = (defpackage.C3658xf) r0
            co r0 = r0.h
            r0.M(r7)
            DK r7 = defpackage.DK.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.KJ.e(uc):java.lang.Object");
    }

    @Override // defpackage.InterfaceC3681y1
    public void f(Bundle bundle, String str) {
        CountDownLatch countDownLatch = (CountDownLatch) this.d;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // defpackage.E0
    public boolean g(F0 f0, MenuC3511uu menuC3511uu) {
        OH ohH = h(f0);
        WF wf = (WF) this.d;
        Menu tu = (Menu) wf.get(menuC3511uu);
        if (tu == null) {
            tu = new Tu((Context) this.b, menuC3511uu);
            wf.put(menuC3511uu, tu);
        }
        return ((ActionMode.Callback) this.a).onPrepareActionMode(ohH, tu);
    }

    @Override // defpackage.InterfaceC3203pA
    public Object get() {
        return new C0535bO((Executor) ((InterfaceC3203pA) this.a).get(), (InterfaceC2682fj) ((InterfaceC3203pA) this.b).get(), (C0080Dq) ((InterfaceC3203pA) this.c).get(), (InterfaceC0529bI) ((InterfaceC3203pA) this.d).get());
    }

    public OH h(F0 f0) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            OH oh = (OH) arrayList.get(i);
            if (oh != null && oh.b == f0) {
                return oh;
            }
        }
        OH oh2 = new OH((Context) this.b, f0);
        arrayList.add(oh2);
        return oh2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v5, types: [Tv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(defpackage.InterfaceC3493uc r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.C0469aD
            if (r0 == 0) goto L13
            r0 = r8
            aD r0 = (defpackage.C0469aD) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            aD r0 = new aD
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.e
            DK r3 = defpackage.DK.a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            Tv r1 = r0.b
            KJ r0 = r0.a
            defpackage.AbstractC0115Ga.U(r8)     // Catch: java.lang.Throwable -> L31
            goto L83
        L31:
            r8 = move-exception
            goto L93
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            Tv r2 = r0.b
            KJ r5 = r0.a
            defpackage.AbstractC0115Ga.U(r8)
            r8 = r2
            goto L64
        L44:
            defpackage.AbstractC0115Ga.U(r8)
            java.lang.Object r8 = r7.b
            Ja r8 = (defpackage.C0166Ja) r8
            boolean r8 = r8.isCompleted()
            if (r8 == 0) goto L52
            return r3
        L52:
            r0.a = r7
            java.lang.Object r8 = r7.a
            Vv r8 = (defpackage.Vv) r8
            r0.b = r8
            r0.e = r5
            java.lang.Object r2 = r8.d(r0)
            if (r2 != r1) goto L63
            return r1
        L63:
            r5 = r7
        L64:
            java.lang.Object r2 = r5.b     // Catch: java.lang.Throwable -> L90
            Ja r2 = (defpackage.C0166Ja) r2     // Catch: java.lang.Throwable -> L90
            boolean r2 = r2.isCompleted()     // Catch: java.lang.Throwable -> L90
            if (r2 == 0) goto L74
            Vv r8 = (defpackage.Vv) r8
            r8.f(r6)
            return r3
        L74:
            r0.a = r5     // Catch: java.lang.Throwable -> L90
            r0.b = r8     // Catch: java.lang.Throwable -> L90
            r0.e = r4     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r5.e(r0)     // Catch: java.lang.Throwable -> L90
            if (r0 != r1) goto L81
            return r1
        L81:
            r1 = r8
            r0 = r5
        L83:
            java.lang.Object r8 = r0.b     // Catch: java.lang.Throwable -> L31
            Ja r8 = (defpackage.C0166Ja) r8     // Catch: java.lang.Throwable -> L31
            r8.E(r3)     // Catch: java.lang.Throwable -> L31
            Vv r1 = (defpackage.Vv) r1
            r1.f(r6)
            return r3
        L90:
            r0 = move-exception
            r1 = r8
            r8 = r0
        L93:
            Vv r1 = (defpackage.Vv) r1
            r1.f(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.KJ.j(uc):java.lang.Object");
    }

    @Override // defpackage.InterfaceC3627x1
    public void n(Bundle bundle) {
        synchronized (this.c) {
            try {
                C0360Uh c0360Uh = C0360Uh.f;
                c0360Uh.z("Logging event _ae to Firebase Analytics with params " + bundle);
                this.d = new CountDownLatch(1);
                ((C2827iH) this.a).n(bundle);
                c0360Uh.z("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.d).await(500, (TimeUnit) this.b)) {
                        c0360Uh.z("App exception callback received from Analytics listener.");
                    } else {
                        c0360Uh.A("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        RecaptchaAction recaptchaAction = (RecaptchaAction) this.a;
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.b;
        String str = (String) this.c;
        Continuation continuation = (Continuation) this.d;
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exc = (Exception) Preconditions.checkNotNull(task.getException());
        if (!zzaen.zzd(exc)) {
            Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exc.getMessage());
            return Tasks.forException(exc);
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(recaptchaAction)));
        }
        if (firebaseAuth.f() == null) {
            C3663xk c3663xk = firebaseAuth.a;
            C0587cM c0587cM = new C0587cM();
            H2 h2 = new H2();
            h2.a = new Object();
            h2.b = new HashMap();
            h2.d = c3663xk;
            h2.e = firebaseAuth;
            h2.f = c0587cM;
            synchronized (firebaseAuth) {
                firebaseAuth.j = h2;
            }
        }
        H2 h2F = firebaseAuth.f();
        return h2F.u(str, Boolean.FALSE, recaptchaAction).continueWithTask(continuation).continueWithTask(new C3532vE(str, h2F, recaptchaAction, continuation));
    }
}
