package defpackage;

import android.content.Context;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: xo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3667xo {
    public static final C3081mz b = new C3081mz("fire-global");
    public static final C3081mz c = new C3081mz("fire-count");
    public static final C3081mz d = new C3081mz("last-used-date");
    public final C3615wq a;

    public C3667xo(Context context, String str) {
        this.a = new C3615wq(context, AbstractC3264qG.w("FirebaseHeartBeat", str));
    }

    public final synchronized long a(Rv rv) {
        long j;
        try {
            long jLongValue = ((Long) AbstractC0500aq.H(rv, c, 0L)).longValue();
            String str = "";
            Set hashSet = new HashSet();
            String str2 = null;
            for (Map.Entry entry : rv.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str3 : set) {
                        if (str2 == null || str2.compareTo(str3) > 0) {
                            str = ((C3081mz) entry.getKey()).a;
                            hashSet = set;
                            str2 = str3;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str2);
            rv.e(AbstractC0069Df.d0(str), hashSet2);
            j = jLongValue - 1;
            rv.d(c, Long.valueOf(j));
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    public final synchronized void b() {
        this.a.a(new C2809i(this, 2));
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strD = d(System.currentTimeMillis());
            C3615wq c3615wq = this.a;
            c3615wq.getClass();
            for (Map.Entry entry : ((Map) AbstractC0136He.I(new C3399sq(c3615wq, null))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strD);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new C3034m6(((C3081mz) entry.getKey()).a, new ArrayList(hashSet)));
                    }
                }
            }
            l(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized C3081mz e(Rv rv, String str) {
        for (Map.Entry entry : rv.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return AbstractC0069Df.d0(((C3081mz) entry.getKey()).a);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized boolean f(long j, long j2) {
        return d(j).equals(d(j2));
    }

    public final synchronized void g() {
        this.a.a(new C3070mo(1, this, d(System.currentTimeMillis())));
    }

    public final synchronized void h(Rv rv, String str) {
        try {
            C3081mz c3081mzE = e(rv, str);
            if (c3081mzE == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) AbstractC0500aq.H(rv, c3081mzE, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                rv.c(c3081mzE);
            } else {
                rv.e(c3081mzE, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean i(long j) {
        return j(b, j);
    }

    public final synchronized boolean j(C3081mz c3081mz, long j) {
        C3615wq c3615wq = this.a;
        c3615wq.getClass();
        AbstractC0500aq.m(c3081mz, "key");
        if (f(((Long) AbstractC0136He.I(new C3453tq(c3615wq, c3081mz, -1L, null))).longValue(), j)) {
            return false;
        }
        C3615wq c3615wq2 = this.a;
        Long lValueOf = Long.valueOf(j);
        c3615wq2.getClass();
        return true;
    }

    public final synchronized void k(long j, final String str) {
        final String strD = d(j);
        final C3081mz c3081mzD0 = AbstractC0069Df.d0(str);
        this.a.a(new InterfaceC2631en() { // from class: vo
            @Override // defpackage.InterfaceC2631en
            public final Object invoke(Object obj) {
                C3667xo c3667xo = this.a;
                String str2 = strD;
                String str3 = str;
                C3081mz c3081mz = c3081mzD0;
                Rv rv = (Rv) obj;
                c3667xo.getClass();
                C3081mz c3081mz2 = C3667xo.d;
                if (((String) AbstractC0500aq.H(rv, c3081mz2, "")).equals(str2)) {
                    C3081mz c3081mzE = c3667xo.e(rv, str2);
                    if (c3081mzE == null || c3081mzE.a.equals(str3)) {
                        return null;
                    }
                    synchronized (c3667xo) {
                        c3667xo.h(rv, str2);
                        HashSet hashSet = new HashSet((Collection) AbstractC0500aq.H(rv, c3081mz, new HashSet()));
                        hashSet.add(str2);
                        rv.e(c3081mz, hashSet);
                    }
                    return null;
                }
                C3081mz c3081mz3 = C3667xo.c;
                long jLongValue = ((Long) AbstractC0500aq.H(rv, c3081mz3, 0L)).longValue();
                if (jLongValue + 1 == 30) {
                    jLongValue = c3667xo.a(rv);
                }
                HashSet hashSet2 = new HashSet((Collection) AbstractC0500aq.H(rv, c3081mz, new HashSet()));
                hashSet2.add(str2);
                rv.e(c3081mz, hashSet2);
                rv.e(c3081mz3, Long.valueOf(jLongValue + 1));
                rv.e(c3081mz2, str2);
                return null;
            }
        });
    }

    public final synchronized void l(final long j) {
        this.a.a(new InterfaceC2631en() { // from class: wo
            @Override // defpackage.InterfaceC2631en
            public final Object invoke(Object obj) {
                ((Rv) obj).d(C3667xo.b, Long.valueOf(j));
                return null;
            }
        });
    }
}
