package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2811i1 implements InterfaceC2729gb, InterfaceC2892jb {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public C2811i1(Map map) {
        AbstractC0500aq.m(map, "initialState");
        this.a = Ht.b0(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new C0353Ua(this, 2);
    }

    public static C2811i1 m(SharedPreferences sharedPreferences, Executor executor) {
        C2811i1 c2811i1 = new C2811i1();
        c2811i1.d = new ArrayDeque();
        c2811i1.a = sharedPreferences;
        c2811i1.b = "topic_operation_queue";
        c2811i1.c = ",";
        c2811i1.e = executor;
        synchronized (((ArrayDeque) c2811i1.d)) {
            try {
                ((ArrayDeque) c2811i1.d).clear();
                String string = ((SharedPreferences) c2811i1.a).getString((String) c2811i1.b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) c2811i1.c)) {
                    String[] strArrSplit = string.split((String) c2811i1.c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) c2811i1.d).add(str);
                        }
                    }
                }
            } finally {
            }
        }
        return c2811i1;
    }

    public Set A(Class cls) {
        return b(KA.a(cls));
    }

    public int B(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = (ArrayList) this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2756h1 c2756h1 = (C2756h1) arrayList.get(size);
            int i9 = c2756h1.a;
            if (i9 == 8) {
                int i10 = c2756h1.b;
                int i11 = c2756h1.d;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            c2756h1.b = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            c2756h1.b = i10 - 1;
                            i6 = i11 - 1;
                        }
                        c2756h1.d = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    c2756h1.d = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    c2756h1.b = i7;
                    i--;
                }
            } else {
                int i12 = c2756h1.b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    c2756h1.b = i3;
                } else if (i9 == 1) {
                    i -= c2756h1.d;
                } else if (i9 == 2) {
                    i += c2756h1.d;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C2756h1 c2756h12 = (C2756h1) arrayList.get(size2);
            int i13 = c2756h12.a;
            C2588dz c2588dz = (C2588dz) this.a;
            if (i13 == 8) {
                int i14 = c2756h12.d;
                if (i14 == c2756h12.b || i14 < 0) {
                    arrayList.remove(size2);
                    c2756h12.c = null;
                    c2588dz.c(c2756h12);
                }
            } else if (c2756h12.d <= 0) {
                arrayList.remove(size2);
                c2756h12.c = null;
                c2588dz.c(c2756h12);
            }
        }
        return i;
    }

    @Override // defpackage.InterfaceC2729gb
    public Object a(Class cls) {
        if (!((Set) this.a).contains(KA.a(cls))) {
            throw new C0234Na("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object objA = ((InterfaceC2729gb) this.e).a(cls);
        if (!cls.equals(GA.class)) {
            return objA;
        }
        return new EC();
    }

    @Override // defpackage.InterfaceC2729gb
    public Set b(KA ka) {
        if (((Set) this.d).contains(ka)) {
            return ((InterfaceC2729gb) this.e).b(ka);
        }
        throw new C0234Na("Attempting to request an undeclared dependency Set<" + ka + ">.");
    }

    @Override // defpackage.InterfaceC2729gb
    public InterfaceC3258qA c(Class cls) {
        return f(KA.a(cls));
    }

    @Override // defpackage.InterfaceC2892jb
    public Object d(C2811i1 c2811i1) {
        return FirebaseAuthRegistrar.lambda$getComponents$0((KA) this.a, (KA) this.b, (KA) this.c, (KA) this.d, (KA) this.e, c2811i1);
    }

    @Override // defpackage.InterfaceC2729gb
    public Dy e(KA ka) {
        if (((Set) this.c).contains(ka)) {
            return ((InterfaceC2729gb) this.e).e(ka);
        }
        throw new C0234Na("Attempting to request an undeclared dependency Deferred<" + ka + ">.");
    }

    @Override // defpackage.InterfaceC2729gb
    public InterfaceC3258qA f(KA ka) {
        if (((Set) this.b).contains(ka)) {
            return ((InterfaceC2729gb) this.e).f(ka);
        }
        throw new C0234Na("Attempting to request an undeclared dependency Provider<" + ka + ">.");
    }

    @Override // defpackage.InterfaceC2729gb
    public Object g(KA ka) {
        if (((Set) this.a).contains(ka)) {
            return ((InterfaceC2729gb) this.e).g(ka);
        }
        throw new C0234Na("Attempting to request an undeclared dependency " + ka + ".");
    }

    @Override // defpackage.InterfaceC2729gb
    public Dy h(Class cls) {
        return e(KA.a(cls));
    }

    public boolean i(int i) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2756h1 c2756h1 = (C2756h1) arrayList.get(i2);
            int i3 = c2756h1.a;
            if (i3 == 8) {
                if (p(c2756h1.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c2756h1.b;
                int i5 = c2756h1.d + i4;
                while (i4 < i5) {
                    if (p(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j() {
        /*
            r8 = this;
            LA r0 = r8.q()
            java.lang.Object r1 = r8.d
            LA r1 = (defpackage.LA) r1
            r1.getClass()
            int r2 = r0.c
            int r3 = r1.c
            if (r3 <= 0) goto L15
            if (r2 <= 0) goto L15
            goto Lab
        L15:
            if (r3 == r2) goto L18
            goto L1e
        L18:
            int r1 = r1.b
            int r2 = r0.b
            if (r1 == r2) goto Lab
        L1e:
            java.lang.Object r1 = r8.e
            rased.vpn.app.service.OpenVPNService r1 = (rased.vpn.app.service.OpenVPNService) r1
            iH r2 = r1.t
            r3 = -72537054868410(0xffffbe07269c8c46, double:NaN)
            java.lang.String r3 = org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app.getString(r3)
            boolean r2 = r2.t(r3)
            java.lang.Object r3 = r8.d
            LA r3 = (defpackage.LA) r3
            int r4 = r3.c
            r5 = 0
            r6 = 1
            if (r4 > 0) goto L42
            int r7 = r3.b
            if (r7 <= 0) goto L40
            goto L42
        L40:
            r7 = r5
            goto L43
        L42:
            r7 = r6
        L43:
            if (r7 == 0) goto L6f
            int r7 = r0.c
            if (r7 > 0) goto L50
            int r7 = r0.b
            if (r7 <= 0) goto L4e
            goto L50
        L4e:
            r7 = r5
            goto L51
        L50:
            r7 = r6
        L51:
            r7 = r7 ^ r6
            if (r7 == 0) goto L6f
            boolean r2 = r1.C
            if (r2 != 0) goto Lab
            boolean r2 = r1.a
            if (r2 == 0) goto Lab
            if (r2 == 0) goto Lab
            r1.C = r6
            hy r1 = r1.s
            r2 = -97065613095866(0xffffa7b8269c8c46, double:NaN)
            java.lang.String r2 = org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app.getString(r2)
            r1.pause(r2)
            goto Lab
        L6f:
            if (r4 > 0) goto L78
            int r3 = r3.b
            if (r3 <= 0) goto L76
            goto L78
        L76:
            r3 = r5
            goto L79
        L78:
            r3 = r6
        L79:
            r3 = r3 ^ r6
            if (r3 == 0) goto L9c
            int r3 = r0.c
            if (r3 > 0) goto L84
            int r3 = r0.b
            if (r3 <= 0) goto L9c
        L84:
            boolean r3 = r1.C
            if (r3 == 0) goto Lab
            boolean r3 = r1.a
            if (r3 == 0) goto Lab
            if (r2 == 0) goto L92
            boolean r2 = r1.D
            if (r2 == 0) goto Lab
        L92:
            if (r3 == 0) goto Lab
            r1.C = r5
            hy r1 = r1.s
            r1.resume()
            goto Lab
        L9c:
            boolean r2 = r1.a
            if (r2 == 0) goto Lab
            boolean r3 = r1.C
            if (r3 != 0) goto Lab
            if (r2 == 0) goto Lab
            hy r1 = r1.s
            r1.reconnect(r6)
        Lab:
            r8.d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2811i1.j():void");
    }

    public void k() {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0607co) this.d).r((C2756h1) arrayList.get(i));
        }
        x(arrayList);
    }

    public void l() {
        k();
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2756h1 c2756h1 = (C2756h1) arrayList.get(i);
            int i2 = c2756h1.a;
            C0607co c0607co = (C0607co) this.d;
            if (i2 == 1) {
                c0607co.r(c2756h1);
                c0607co.I(c2756h1.b, c2756h1.d);
            } else if (i2 == 2) {
                c0607co.r(c2756h1);
                int i3 = c2756h1.b;
                int i4 = c2756h1.d;
                RecyclerView recyclerView = (RecyclerView) c0607co.a;
                recyclerView.O(i3, i4, true);
                recyclerView.m0 = true;
                recyclerView.j0.c += i4;
            } else if (i2 == 4) {
                c0607co.r(c2756h1);
                c0607co.H(c2756h1.b, c2756h1.d, c2756h1.c);
            } else if (i2 == 8) {
                c0607co.r(c2756h1);
                c0607co.J(c2756h1.b, c2756h1.d);
            }
        }
        x(arrayList);
    }

    public void n(C2756h1 c2756h1) {
        int i;
        C2588dz c2588dz;
        int i2 = c2756h1.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iB = B(c2756h1.b, i2);
        int i3 = c2756h1.b;
        int i4 = c2756h1.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c2756h1);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c2756h1.d;
            c2588dz = (C2588dz) this.a;
            if (i5 >= i7) {
                break;
            }
            int iB2 = B((i * i5) + c2756h1.b, c2756h1.a);
            int i8 = c2756h1.a;
            if (i8 == 2 ? iB2 != iB : !(i8 == 4 && iB2 == iB + 1)) {
                C2756h1 c2756h1T = t(i8, iB, i6, c2756h1.c);
                o(c2756h1T, i3);
                c2756h1T.c = null;
                c2588dz.c(c2756h1T);
                if (c2756h1.a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                iB = iB2;
            } else {
                i6++;
            }
            i5++;
        }
        Object obj = c2756h1.c;
        c2756h1.c = null;
        c2588dz.c(c2756h1);
        if (i6 > 0) {
            C2756h1 c2756h1T2 = t(c2756h1.a, iB, i6, obj);
            o(c2756h1T2, i3);
            c2756h1T2.c = null;
            c2588dz.c(c2756h1T2);
        }
    }

    public void o(C2756h1 c2756h1, int i) {
        C0607co c0607co = (C0607co) this.d;
        c0607co.r(c2756h1);
        int i2 = c2756h1.a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0607co.H(i, c2756h1.d, c2756h1.c);
        } else {
            int i3 = c2756h1.d;
            RecyclerView recyclerView = (RecyclerView) c0607co.a;
            recyclerView.O(i, i3, true);
            recyclerView.m0 = true;
            recyclerView.j0.c += i3;
        }
    }

    public int p(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        while (i2 < size) {
            C2756h1 c2756h1 = (C2756h1) arrayList.get(i2);
            int i3 = c2756h1.a;
            if (i3 == 8) {
                int i4 = c2756h1.b;
                if (i4 == i) {
                    i = c2756h1.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c2756h1.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c2756h1.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c2756h1.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c2756h1.d;
                }
            }
            i2++;
        }
        return i;
    }

    public LA q() {
        ConnectivityManager connectivityManagerR = r();
        LA la = new LA(1);
        la.b = 0;
        la.c = 0;
        for (Network network : connectivityManagerR.getAllNetworks()) {
            NetworkInfo networkInfo = connectivityManagerR.getNetworkInfo(network);
            if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                la.c += networkInfo.getType() == 1 ? 1 : 0;
                la.b += networkInfo.getType() != 0 ? 0 : 1;
            }
        }
        return la;
    }

    public ConnectivityManager r() {
        if (((ConnectivityManager) this.c) == null) {
            this.c = (ConnectivityManager) ((Context) this.b).getSystemService("connectivity");
        }
        return (ConnectivityManager) this.c;
    }

    public boolean s() {
        return ((ArrayList) this.b).size() > 0;
    }

    public C2756h1 t(int i, int i2, int i3, Object obj) {
        C2756h1 c2756h1 = (C2756h1) ((C2588dz) this.a).a();
        if (c2756h1 != null) {
            c2756h1.a = i;
            c2756h1.b = i2;
            c2756h1.d = i3;
            c2756h1.c = obj;
            return c2756h1;
        }
        C2756h1 c2756h12 = new C2756h1();
        c2756h12.a = i;
        c2756h12.b = i2;
        c2756h12.d = i3;
        c2756h12.c = obj;
        return c2756h12;
    }

    public String u() {
        String str;
        synchronized (((ArrayDeque) this.d)) {
            str = (String) ((ArrayDeque) this.d).peek();
        }
        return str;
    }

    public void v(C2756h1 c2756h1) {
        ((ArrayList) this.c).add(c2756h1);
        int i = c2756h1.a;
        C0607co c0607co = (C0607co) this.d;
        if (i == 1) {
            c0607co.I(c2756h1.b, c2756h1.d);
            return;
        }
        if (i == 2) {
            int i2 = c2756h1.b;
            int i3 = c2756h1.d;
            RecyclerView recyclerView = (RecyclerView) c0607co.a;
            recyclerView.O(i2, i3, false);
            recyclerView.m0 = true;
            return;
        }
        if (i == 4) {
            c0607co.H(c2756h1.b, c2756h1.d, c2756h1.c);
        } else if (i == 8) {
            c0607co.J(c2756h1.b, c2756h1.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c2756h1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x011f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015e A[PHI: r5
      0x015e: PHI (r5v28 int) = (r5v21 int), (r5v31 int) binds: [B:99:0x018b, B:86:0x015c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w() {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2811i1.w():void");
    }

    public void x(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2756h1 c2756h1 = (C2756h1) arrayList.get(i);
            c2756h1.c = null;
            ((C2588dz) this.a).c(c2756h1);
        }
        arrayList.clear();
    }

    public boolean y(String str) {
        boolean zRemove;
        synchronized (((ArrayDeque) this.d)) {
            zRemove = ((ArrayDeque) this.d).remove(str);
            if (zRemove) {
                ((Executor) this.e).execute(new H0(this, 13));
            }
        }
        return zRemove;
    }

    public void z(Object obj, String str) {
        AbstractC0500aq.m(str, "key");
        ((LinkedHashMap) this.a).put(str, obj);
        Sv sv = (Sv) ((LinkedHashMap) this.c).get(str);
        if (sv != null) {
            ((WG) sv).c(obj);
        }
        Sv sv2 = (Sv) ((LinkedHashMap) this.d).get(str);
        if (sv2 != null) {
            ((WG) sv2).c(obj);
        }
    }
}
