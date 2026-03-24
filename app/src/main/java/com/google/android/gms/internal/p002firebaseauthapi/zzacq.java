package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import defpackage.AbstractC2739gl;
import defpackage.AbstractC2814i4;
import defpackage.BP;
import defpackage.C0428Yh;
import defpackage.C2827iH;
import defpackage.C3302r0;
import defpackage.C3489uP;
import defpackage.C3663xk;
import defpackage.EP;
import defpackage.GJ;
import defpackage.GP;
import defpackage.InterfaceC2616eQ;
import defpackage.LP;
import defpackage.MP;
import defpackage.MQ;
import defpackage.Py;
import defpackage.Ry;
import defpackage.Sy;
import defpackage.TP;
import defpackage.Ty;
import defpackage.ZK;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzacq extends zzafo {
    public zzacq(C3663xk c3663xk, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzaeo(c3663xk, scheduledExecutorService);
        this.zzb = executor;
    }

    public final Task<zzahr> zza() {
        return zza(new zzada());
    }

    public final Task<Void> zzb(C3663xk c3663xk, AbstractC2739gl abstractC2739gl, AbstractC2814i4 abstractC2814i4, String str, InterfaceC2616eQ interfaceC2616eQ) {
        return zza((zzadg) new zzadg(abstractC2814i4, str).zza(c3663xk).zza(abstractC2739gl).zza((zzaff<Void, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ));
    }

    public final Task<Object> zzc(C3663xk c3663xk, AbstractC2739gl abstractC2739gl, AbstractC2814i4 abstractC2814i4, String str, InterfaceC2616eQ interfaceC2616eQ) {
        return zza((zzadf) new zzadf(abstractC2814i4, str).zza(c3663xk).zza(abstractC2739gl).zza((zzaff<Object, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ));
    }

    public final Task<Void> zzd(C3663xk c3663xk, AbstractC2739gl abstractC2739gl, String str, InterfaceC2616eQ interfaceC2616eQ) {
        return zza((zzaeg) new zzaeg(str).zza(c3663xk).zza(abstractC2739gl).zza((zzaff<Void, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ));
    }

    public final Task<Void> zza(C3663xk c3663xk, C3302r0 c3302r0, String str) {
        return zza((zzadq) new zzadq(str, c3302r0).zza(c3663xk));
    }

    public final Task<Object> zzb(C3663xk c3663xk, AbstractC2739gl abstractC2739gl, C0428Yh c0428Yh, String str, InterfaceC2616eQ interfaceC2616eQ) {
        return zza((zzadh) new zzadh(c0428Yh, str).zza(c3663xk).zza(abstractC2739gl).zza((zzaff<Object, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ));
    }

    public final Task<Void> zzc(C3663xk c3663xk, AbstractC2739gl abstractC2739gl, String str, InterfaceC2616eQ interfaceC2616eQ) {
        return zza((zzaed) new zzaed(str).zza(c3663xk).zza(abstractC2739gl).zza((zzaff<Void, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ));
    }

    public final Task<String> zzd(C3663xk c3663xk, String str, String str2) {
        return zza((zzaek) new zzaek(str, str2).zza(c3663xk));
    }

    public final Task<Object> zza(C3663xk c3663xk, AbstractC2814i4 abstractC2814i4, String str, MQ mq) {
        return zza((zzadu) new zzadu(abstractC2814i4, str).zza(c3663xk).zza((zzaff<Object, MQ>) mq));
    }

    public final Task<Object> zzb(C3663xk c3663xk, AbstractC2739gl abstractC2739gl, Py py, String str, InterfaceC2616eQ interfaceC2616eQ) {
        zzagb.zza();
        return zza((zzadl) new zzadl(py, str).zza(c3663xk).zza(abstractC2739gl).zza((zzaff<Object, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ));
    }

    public final Task<Object> zzc(C3663xk c3663xk, String str, String str2) {
        return zza((zzacw) new zzacw(str, str2).zza(c3663xk));
    }

    public final Task<Object> zza(C3663xk c3663xk, C0428Yh c0428Yh, String str, MQ mq) {
        return zza((zzadv) new zzadv(c0428Yh, str).zza(c3663xk).zza((zzaff<Object, MQ>) mq));
    }

    public final Task<Object> zzb(C3663xk c3663xk, AbstractC2739gl abstractC2739gl, String str, String str2, String str3, String str4, InterfaceC2616eQ interfaceC2616eQ) {
        return zza((zzadj) new zzadj(str, str2, str3, str4).zza(c3663xk).zza(abstractC2739gl).zza((zzaff<Object, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ));
    }

    public final Task<Object> zza(C3663xk c3663xk, AbstractC2739gl abstractC2739gl, AbstractC2814i4 abstractC2814i4, String str, InterfaceC2616eQ interfaceC2616eQ) {
        Preconditions.checkNotNull(c3663xk);
        Preconditions.checkNotNull(abstractC2814i4);
        Preconditions.checkNotNull(abstractC2739gl);
        Preconditions.checkNotNull(interfaceC2616eQ);
        List list = ((BP) abstractC2739gl).f;
        if (list != null && list.contains(abstractC2814i4.b())) {
            return Tasks.forException(zzaen.zza(new Status(17015)));
        }
        if (abstractC2814i4 instanceof C0428Yh) {
            C0428Yh c0428Yh = (C0428Yh) abstractC2814i4;
            return !(TextUtils.isEmpty(c0428Yh.c) ^ true) ? zza((zzadc) new zzadc(c0428Yh, str).zza(c3663xk).zza(abstractC2739gl).zza((zzaff<Object, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ)) : zza((zzadd) new zzadd(c0428Yh).zza(c3663xk).zza(abstractC2739gl).zza((zzaff<Object, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ));
        }
        if (abstractC2814i4 instanceof Py) {
            zzagb.zza();
            return zza((zzade) new zzade((Py) abstractC2814i4).zza(c3663xk).zza(abstractC2739gl).zza((zzaff<Object, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ));
        }
        Preconditions.checkNotNull(c3663xk);
        Preconditions.checkNotNull(abstractC2814i4);
        Preconditions.checkNotNull(abstractC2739gl);
        Preconditions.checkNotNull(interfaceC2616eQ);
        return zza((zzadb) new zzadb(abstractC2814i4).zza(c3663xk).zza(abstractC2739gl).zza((zzaff<Object, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ));
    }

    public final Task<Object> zzb(C3663xk c3663xk, AbstractC2739gl abstractC2739gl, String str, InterfaceC2616eQ interfaceC2616eQ) {
        Preconditions.checkNotNull(c3663xk);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(abstractC2739gl);
        Preconditions.checkNotNull(interfaceC2616eQ);
        List list = ((BP) abstractC2739gl).f;
        if ((list != null && !list.contains(str)) || abstractC2739gl.c()) {
            return Tasks.forException(zzaen.zza(new Status(17016, str)));
        }
        str.getClass();
        return !str.equals("password") ? zza((zzaee) new zzaee(str).zza(c3663xk).zza(abstractC2739gl).zza((zzaff<Object, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ)) : zza((zzaeb) new zzaeb().zza(c3663xk).zza(abstractC2739gl).zza((zzaff<Object, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ));
    }

    public final Task<Void> zzb(C3663xk c3663xk, String str, C3302r0 c3302r0, String str2, String str3) {
        c3302r0.o = 6;
        return zza((zzadp) new zzadp(str, c3302r0, str2, str3, "sendSignInLinkToEmail").zza(c3663xk));
    }

    public final Task<Object> zzb(C3663xk c3663xk, String str, String str2) {
        return zza((zzacs) new zzacs(str, str2).zza(c3663xk));
    }

    public final Task<Void> zza(C3663xk c3663xk, AbstractC2739gl abstractC2739gl, C0428Yh c0428Yh, String str, InterfaceC2616eQ interfaceC2616eQ) {
        return zza((zzadi) new zzadi(c0428Yh, str).zza(c3663xk).zza(abstractC2739gl).zza((zzaff<Void, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ));
    }

    public final Task<Object> zzb(C3663xk c3663xk, String str, String str2, String str3, String str4, MQ mq) {
        return zza((zzadw) new zzadw(str, str2, str3, str4).zza(c3663xk).zza((zzaff<Object, MQ>) mq));
    }

    public final Task<Void> zza(C3663xk c3663xk, AbstractC2739gl abstractC2739gl, Py py, String str, InterfaceC2616eQ interfaceC2616eQ) {
        zzagb.zza();
        return zza((zzadm) new zzadm(py, str).zza(c3663xk).zza(abstractC2739gl).zza((zzaff<Void, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ));
    }

    public final Task<Void> zza(C3663xk c3663xk, AbstractC2739gl abstractC2739gl, Py py, InterfaceC2616eQ interfaceC2616eQ) {
        zzagb.zza();
        return zza((zzaef) new zzaef(py).zza(c3663xk).zza(abstractC2739gl).zza((zzaff<Void, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ));
    }

    public final Task<Object> zza(C3663xk c3663xk, AbstractC2739gl abstractC2739gl, Sy sy, String str, MQ mq) {
        zzagb.zza();
        zzacy zzacyVar = new zzacy(sy, str, null);
        zzacyVar.zza(c3663xk).zza((zzaff<Object, MQ>) mq);
        if (abstractC2739gl != null) {
            zzacyVar.zza(abstractC2739gl);
        }
        return zza(zzacyVar);
    }

    public final Task<Object> zza(C3663xk c3663xk, AbstractC2739gl abstractC2739gl, GJ gj, String str, String str2, MQ mq) {
        zzacy zzacyVar = new zzacy(gj, str, str2);
        zzacyVar.zza(c3663xk).zza((zzaff<Object, MQ>) mq);
        if (abstractC2739gl != null) {
            zzacyVar.zza(abstractC2739gl);
        }
        return zza(zzacyVar);
    }

    public final Task<Void> zza(C3663xk c3663xk, AbstractC2739gl abstractC2739gl, ZK zk, InterfaceC2616eQ interfaceC2616eQ) {
        return zza((zzaei) new zzaei(zk).zza(c3663xk).zza(abstractC2739gl).zza((zzaff<Void, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ));
    }

    public final Task<Void> zza(C3663xk c3663xk, AbstractC2739gl abstractC2739gl, String str, String str2, String str3, String str4, InterfaceC2616eQ interfaceC2616eQ) {
        return zza((zzadk) new zzadk(str, str2, str3, str4).zza(c3663xk).zza(abstractC2739gl).zza((zzaff<Void, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ));
    }

    public final Task<Void> zza(C3663xk c3663xk, AbstractC2739gl abstractC2739gl, String str, String str2, InterfaceC2616eQ interfaceC2616eQ) {
        return zza((zzaec) new zzaec(((BP) abstractC2739gl).a.zzf(), str, str2).zza(c3663xk).zza(abstractC2739gl).zza((zzaff<Void, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ));
    }

    public final Task<C2827iH> zza(C3663xk c3663xk, AbstractC2739gl abstractC2739gl, String str, InterfaceC2616eQ interfaceC2616eQ) {
        return zza((zzacx) new zzacx(str).zza(c3663xk).zza(abstractC2739gl).zza((zzaff<C2827iH, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ));
    }

    public final Task<Void> zza(C3663xk c3663xk, AbstractC2739gl abstractC2739gl, InterfaceC2616eQ interfaceC2616eQ) {
        return zza((zzado) new zzado().zza(c3663xk).zza(abstractC2739gl).zza((zzaff<Void, MQ>) interfaceC2616eQ).zza((LP) interfaceC2616eQ));
    }

    public final Task<Object> zza(C3663xk c3663xk, Py py, String str, MQ mq) {
        zzagb.zza();
        return zza((zzady) new zzady(py, str).zza(c3663xk).zza((zzaff<Object, MQ>) mq));
    }

    public final Task<Void> zza(C3663xk c3663xk, Sy sy, AbstractC2739gl abstractC2739gl, String str, MQ mq) {
        zzagb.zza();
        zzacv zzacvVar = new zzacv(sy, ((BP) abstractC2739gl).a.zzf(), str, null);
        zzacvVar.zza(c3663xk).zza((zzaff<Void, MQ>) mq);
        return zza(zzacvVar);
    }

    public final Task<Void> zza(C3663xk c3663xk, GJ gj, AbstractC2739gl abstractC2739gl, String str, String str2, MQ mq) {
        zzacv zzacvVar = new zzacv(gj, ((BP) abstractC2739gl).a.zzf(), str, str2);
        zzacvVar.zza(c3663xk).zza((zzaff<Void, MQ>) mq);
        return zza(zzacvVar);
    }

    public final Task<Void> zza(C3663xk c3663xk, String str, C3302r0 c3302r0, String str2, String str3) {
        c3302r0.o = 1;
        return zza((zzadp) new zzadp(str, c3302r0, str2, str3, "sendPasswordResetEmail").zza(c3663xk));
    }

    public final Task<Void> zza(C3663xk c3663xk, String str, String str2) {
        return zza((zzacp) new zzacp(str, str2).zza(c3663xk));
    }

    public final Task<Void> zza(C3663xk c3663xk, String str, String str2, String str3) {
        return zza((zzacr) new zzacr(str, str2, str3).zza(c3663xk));
    }

    public final Task<Object> zza(C3663xk c3663xk, String str, String str2, String str3, String str4, MQ mq) {
        return zza((zzacu) new zzacu(str, str2, str3, str4).zza(c3663xk).zza((zzaff<Object, MQ>) mq));
    }

    public final Task<Object> zza(C3663xk c3663xk, String str, String str2, MQ mq) {
        return zza((zzadt) new zzadt(str, str2).zza(c3663xk).zza((zzaff<Object, MQ>) mq));
    }

    public final Task<Object> zza(C3663xk c3663xk, MQ mq, String str) {
        return zza((zzadr) new zzadr(str).zza(c3663xk).zza((zzaff<Object, MQ>) mq));
    }

    public final Task<Void> zza(AbstractC2739gl abstractC2739gl, MP mp) {
        return zza((zzact) new zzact().zza(abstractC2739gl).zza((zzaff<Void, MP>) mp).zza((LP) mp));
    }

    public final Task<Void> zza(String str) {
        return zza(new zzads(str));
    }

    public final Task<zzahs> zza(String str, String str2) {
        return zza(new zzacz(str, str2));
    }

    public final Task<Void> zza(String str, String str2, C3302r0 c3302r0) {
        c3302r0.o = 7;
        return zza(new zzaeh(str, str2, c3302r0));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzadn(str, str2, str3, str4));
    }

    public final Task<Void> zza(GP gp, Ty ty, String str, long j, boolean z, boolean z2, String str2, String str3, String str4, boolean z3, Ry ry, Executor executor, Activity activity) {
        zzadz zzadzVar = new zzadz(ty, Preconditions.checkNotEmpty(gp.b), str, j, z, z2, str2, str3, str4, z3);
        zzadzVar.zza(ry, activity, executor, ty.a);
        return zza(zzadzVar);
    }

    public final Task<zzair> zza(GP gp, String str) {
        return zza(new zzaea(gp, str));
    }

    public final Task<Void> zza(GP gp, String str, String str2, long j, boolean z, boolean z2, String str3, String str4, String str5, boolean z3, Ry ry, Executor executor, Activity activity) {
        zzadx zzadxVar = new zzadx(gp, str, str2, j, z, z2, str3, str4, str5, z3);
        zzadxVar.zza(ry, activity, executor, str);
        return zza(zzadxVar);
    }

    public static BP zza(C3663xk c3663xk, zzahk zzahkVar) {
        Preconditions.checkNotNull(c3663xk);
        Preconditions.checkNotNull(zzahkVar);
        ArrayList arrayList = new ArrayList();
        C3489uP c3489uP = new C3489uP();
        Preconditions.checkNotNull(zzahkVar);
        Preconditions.checkNotEmpty("firebase");
        c3489uP.a = Preconditions.checkNotEmpty(zzahkVar.zzi());
        c3489uP.b = "firebase";
        c3489uP.e = zzahkVar.zzh();
        c3489uP.c = zzahkVar.zzg();
        Uri uriZzc = zzahkVar.zzc();
        if (uriZzc != null) {
            c3489uP.d = uriZzc.toString();
        }
        c3489uP.m = zzahkVar.zzm();
        c3489uP.n = null;
        c3489uP.f = zzahkVar.zzj();
        arrayList.add(c3489uP);
        List<zzaib> listZzl = zzahkVar.zzl();
        if (listZzl != null && !listZzl.isEmpty()) {
            for (int i = 0; i < listZzl.size(); i++) {
                zzaib zzaibVar = listZzl.get(i);
                C3489uP c3489uP2 = new C3489uP();
                Preconditions.checkNotNull(zzaibVar);
                c3489uP2.a = zzaibVar.zzd();
                c3489uP2.b = Preconditions.checkNotEmpty(zzaibVar.zzf());
                c3489uP2.c = zzaibVar.zzb();
                Uri uriZza = zzaibVar.zza();
                if (uriZza != null) {
                    c3489uP2.d = uriZza.toString();
                }
                c3489uP2.e = zzaibVar.zzc();
                c3489uP2.f = zzaibVar.zze();
                c3489uP2.m = false;
                c3489uP2.n = zzaibVar.zzg();
                arrayList.add(c3489uP2);
            }
        }
        BP bp = new BP(c3663xk, arrayList);
        bp.o = new EP(zzahkVar.zzb(), zzahkVar.zza());
        bp.p = zzahkVar.zzn();
        bp.q = zzahkVar.zze();
        bp.f(TP.c(zzahkVar.zzk()));
        List listZzd = zzahkVar.zzd();
        if (listZzd == null) {
            listZzd = new ArrayList();
        }
        bp.s = listZzd;
        return bp;
    }

    public final void zza(C3663xk c3663xk, zzaij zzaijVar, Ry ry, Activity activity, Executor executor) {
        zza((zzaej) new zzaej(zzaijVar).zza(c3663xk).zza(ry, activity, executor, zzaijVar.zzd()));
    }
}
