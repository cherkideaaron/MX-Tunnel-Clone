package defpackage;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: wq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3615wq {
    public static final /* synthetic */ InterfaceC2908jr[] d;
    public final String a;
    public final ThreadLocal b;
    public final C2916jz c;

    static {
        C2546dA c2546dA = new C2546dA(AbstractC2981l8.NO_RECEIVER, C3615wq.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        PB.a.getClass();
        d = new InterfaceC2908jr[]{c2546dA};
    }

    public C3615wq(Context context, String str) {
        C2916jz c2916jz;
        AbstractC0500aq.m(context, "context");
        AbstractC0500aq.m(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.a = str;
        this.b = new ThreadLocal();
        final int i = 0;
        C2827iH c2827iH = new C2827iH(new InterfaceC2631en(this) { // from class: pq
            public final /* synthetic */ C3615wq b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC2631en
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        C0389Wc c0389Wc = (C0389Wc) obj;
                        AbstractC0500aq.m(c0389Wc, "ex");
                        Log.w(PB.a(C3615wq.class).b(), "CorruptionException in " + this.b.a + " DataStore running in process " + Process.myPid(), c0389Wc);
                        return new Rv(true);
                    default:
                        Context context2 = (Context) obj;
                        AbstractC0500aq.m(context2, "it");
                        String str2 = this.b.a;
                        LinkedHashSet linkedHashSet = DF.a;
                        AbstractC0500aq.m(str2, "sharedPreferencesName");
                        AbstractC0500aq.m(linkedHashSet, "keysToMigrate");
                        return AbstractC0115Ga.I(new AF(context2, str2, EF.a, new CF(linkedHashSet, null), new BF(3, null)));
                }
            }
        }, 26);
        final int i2 = 1;
        InterfaceC2631en interfaceC2631en = new InterfaceC2631en(this) { // from class: pq
            public final /* synthetic */ C3615wq b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC2631en
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        C0389Wc c0389Wc = (C0389Wc) obj;
                        AbstractC0500aq.m(c0389Wc, "ex");
                        Log.w(PB.a(C3615wq.class).b(), "CorruptionException in " + this.b.a + " DataStore running in process " + Process.myPid(), c0389Wc);
                        return new Rv(true);
                    default:
                        Context context2 = (Context) obj;
                        AbstractC0500aq.m(context2, "it");
                        String str2 = this.b.a;
                        LinkedHashSet linkedHashSet = DF.a;
                        AbstractC0500aq.m(str2, "sharedPreferencesName");
                        AbstractC0500aq.m(linkedHashSet, "keysToMigrate");
                        return AbstractC0115Ga.I(new AF(context2, str2, EF.a, new CF(linkedHashSet, null), new BF(3, null)));
                }
            }
        };
        C0545bg c0545bg = AbstractC0600ch.a;
        ExecutorC0273Pf executorC0273Pf = ExecutorC0273Pf.c;
        IH ih = new IH(null);
        executorC0273Pf.getClass();
        C3385sc c3385scA = AbstractC0136He.a(AbstractC2883jK.I(executorC0273Pf, ih));
        C3026lz c3026lz = new C3026lz(str, c2827iH, interfaceC2631en, c3385scA);
        AbstractC0500aq.m(d[0], "property");
        C2916jz c2916jz2 = c3026lz.c;
        if (c2916jz2 == null) {
            synchronized (c3026lz.b) {
                try {
                    if (c3026lz.c == null) {
                        Context applicationContext = context.getApplicationContext();
                        AbstractC0500aq.l(applicationContext, "applicationContext");
                        List list = (List) interfaceC2631en.invoke(applicationContext);
                        C2971kz c2971kz = new C2971kz(i, applicationContext, c3026lz);
                        c3026lz.c = new C2916jz(new C2916jz(new C3658xf(new C2847ik(C3397so.e, C2738gk.b, new C2793hk(c2971kz, 2)), AbstractC0115Ga.I(new C0187Ke(list, null)), c2827iH, c3385scA)));
                    }
                    c2916jz = c3026lz.c;
                    AbstractC0500aq.j(c2916jz);
                } catch (Throwable th) {
                    throw th;
                }
            }
            c2916jz2 = c2916jz;
        }
        this.c = c2916jz2;
    }

    public final void a(InterfaceC2631en interfaceC2631en) {
    }
}
