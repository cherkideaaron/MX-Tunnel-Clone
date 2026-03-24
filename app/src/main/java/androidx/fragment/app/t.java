package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mxtunnel.pro.R;
import defpackage.AbstractC0076Dm;
import defpackage.AbstractC3013lm;
import defpackage.AbstractC3123nm;
import defpackage.AbstractC3264qG;
import defpackage.C0110Fm;
import defpackage.C2532cx;
import defpackage.C3075mt;
import defpackage.C3178om;
import defpackage.C3233pm;
import defpackage.C3288qm;
import defpackage.C3341rm;
import defpackage.C3395sm;
import defpackage.C3397so;
import defpackage.C3719ym;
import defpackage.InterfaceC0606cn;
import defpackage.InterfaceC2722gM;
import defpackage.InterfaceC2806hx;
import defpackage.InterfaceC2840ic;
import defpackage.InterfaceC3024lx;
import defpackage.InterfaceC3079mx;
import defpackage.InterfaceC3189ox;
import defpackage.InterfaceC3557vm;
import defpackage.InterfaceC3619wu;
import defpackage.InterfaceC3688y8;
import defpackage.Ir;
import defpackage.RunnableC2705g5;
import defpackage.S0;
import defpackage.T6;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class t {
    public S0 A;
    public S0 B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public u L;
    public final RunnableC2705g5 M;
    public boolean b;
    public ArrayList d;
    public ArrayList e;
    public C2532cx g;
    public final C3178om l;
    public final CopyOnWriteArrayList m;
    public final C3233pm n;
    public final C3233pm o;
    public final C3233pm p;
    public final C3233pm q;
    public final C3341rm r;
    public int s;
    public AbstractC3123nm t;
    public AbstractC3013lm u;
    public l v;
    public l w;
    public final C3395sm x;
    public final C3397so y;
    public S0 z;
    public final ArrayList a = new ArrayList();
    public final x c = new x();
    public final s f = new s(this);
    public final C3288qm h = new C3288qm(this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());
    public final Map k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [pm] */
    /* JADX WARN: Type inference failed for: r0v13, types: [pm] */
    /* JADX WARN: Type inference failed for: r0v14, types: [pm] */
    /* JADX WARN: Type inference failed for: r0v15, types: [pm] */
    public t() {
        Collections.synchronizedMap(new HashMap());
        this.l = new C3178om(this);
        this.m = new CopyOnWriteArrayList();
        final int i = 0;
        this.n = new InterfaceC2840ic(this) { // from class: pm
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC2840ic
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        t tVar = this.b;
                        if (tVar.H()) {
                            tVar.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        t tVar2 = this.b;
                        if (tVar2.H() && num.intValue() == 80) {
                            tVar2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        Mv mv = (Mv) obj;
                        t tVar3 = this.b;
                        if (tVar3.H()) {
                            tVar3.m(mv.a, false);
                            break;
                        }
                        break;
                    default:
                        Vy vy = (Vy) obj;
                        t tVar4 = this.b;
                        if (tVar4.H()) {
                            tVar4.r(vy.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.o = new InterfaceC2840ic(this) { // from class: pm
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC2840ic
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        t tVar = this.b;
                        if (tVar.H()) {
                            tVar.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        t tVar2 = this.b;
                        if (tVar2.H() && num.intValue() == 80) {
                            tVar2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        Mv mv = (Mv) obj;
                        t tVar3 = this.b;
                        if (tVar3.H()) {
                            tVar3.m(mv.a, false);
                            break;
                        }
                        break;
                    default:
                        Vy vy = (Vy) obj;
                        t tVar4 = this.b;
                        if (tVar4.H()) {
                            tVar4.r(vy.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.p = new InterfaceC2840ic(this) { // from class: pm
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC2840ic
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        t tVar = this.b;
                        if (tVar.H()) {
                            tVar.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        t tVar2 = this.b;
                        if (tVar2.H() && num.intValue() == 80) {
                            tVar2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        Mv mv = (Mv) obj;
                        t tVar3 = this.b;
                        if (tVar3.H()) {
                            tVar3.m(mv.a, false);
                            break;
                        }
                        break;
                    default:
                        Vy vy = (Vy) obj;
                        t tVar4 = this.b;
                        if (tVar4.H()) {
                            tVar4.r(vy.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.q = new InterfaceC2840ic(this) { // from class: pm
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC2840ic
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        t tVar = this.b;
                        if (tVar.H()) {
                            tVar.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        t tVar2 = this.b;
                        if (tVar2.H() && num.intValue() == 80) {
                            tVar2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        Mv mv = (Mv) obj;
                        t tVar3 = this.b;
                        if (tVar3.H()) {
                            tVar3.m(mv.a, false);
                            break;
                        }
                        break;
                    default:
                        Vy vy = (Vy) obj;
                        t tVar4 = this.b;
                        if (tVar4.H()) {
                            tVar4.r(vy.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.r = new C3341rm(this);
        this.s = -1;
        this.x = new C3395sm(this);
        this.y = new C3397so(17);
        this.C = new ArrayDeque();
        this.M = new RunnableC2705g5(this, 12);
    }

    public static boolean G(l lVar) {
        if (!lVar.mHasMenu || !lVar.mMenuVisible) {
            Iterator it = lVar.mChildFragmentManager.c.e().iterator();
            boolean zG = false;
            while (it.hasNext()) {
                l lVar2 = (l) it.next();
                if (lVar2 != null) {
                    zG = G(lVar2);
                }
                if (zG) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean I(l lVar) {
        if (lVar == null) {
            return true;
        }
        t tVar = lVar.mFragmentManager;
        return lVar.equals(tVar.w) && I(tVar.v);
    }

    public static void X(l lVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + lVar);
        }
        if (lVar.mHidden) {
            lVar.mHidden = false;
            lVar.mHiddenChanged = !lVar.mHiddenChanged;
        }
    }

    public final l A(int i) {
        x xVar = this.c;
        ArrayList arrayList = xVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            l lVar = (l) arrayList.get(size);
            if (lVar != null && lVar.mFragmentId == i) {
                return lVar;
            }
        }
        for (w wVar : xVar.b.values()) {
            if (wVar != null) {
                l lVar2 = wVar.c;
                if (lVar2.mFragmentId == i) {
                    return lVar2;
                }
            }
        }
        return null;
    }

    public final l B(String str) {
        x xVar = this.c;
        ArrayList arrayList = xVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            l lVar = (l) arrayList.get(size);
            if (lVar != null && str.equals(lVar.mTag)) {
                return lVar;
            }
        }
        for (w wVar : xVar.b.values()) {
            if (wVar != null) {
                l lVar2 = wVar.c;
                if (str.equals(lVar2.mTag)) {
                    return lVar2;
                }
            }
        }
        return null;
    }

    public final ViewGroup C(l lVar) {
        ViewGroup viewGroup = lVar.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (lVar.mContainerId > 0 && this.u.c()) {
            View viewB = this.u.b(lVar.mContainerId);
            if (viewB instanceof ViewGroup) {
                return (ViewGroup) viewB;
            }
        }
        return null;
    }

    public final C3395sm D() {
        l lVar = this.v;
        return lVar != null ? lVar.mFragmentManager.D() : this.x;
    }

    public final C3397so E() {
        l lVar = this.v;
        return lVar != null ? lVar.mFragmentManager.E() : this.y;
    }

    public final void F(l lVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + lVar);
        }
        if (lVar.mHidden) {
            return;
        }
        lVar.mHidden = true;
        lVar.mHiddenChanged = true ^ lVar.mHiddenChanged;
        W(lVar);
    }

    public final boolean H() {
        l lVar = this.v;
        if (lVar == null) {
            return true;
        }
        return lVar.isAdded() && this.v.getParentFragmentManager().H();
    }

    public final void J(int i, boolean z) {
        HashMap map;
        AbstractC3123nm abstractC3123nm;
        if (this.t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.s) {
            this.s = i;
            x xVar = this.c;
            Iterator it = xVar.a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = xVar.b;
                if (!zHasNext) {
                    break;
                }
                w wVar = (w) map.get(((l) it.next()).mWho);
                if (wVar != null) {
                    wVar.j();
                }
            }
            for (w wVar2 : map.values()) {
                if (wVar2 != null) {
                    wVar2.j();
                    l lVar = wVar2.c;
                    if (lVar.mRemoving && !lVar.isInBackStack()) {
                        if (lVar.mBeingSaved && !xVar.c.containsKey(lVar.mWho)) {
                            wVar2.m();
                        }
                        xVar.h(wVar2);
                    }
                }
            }
            Iterator it2 = xVar.d().iterator();
            while (it2.hasNext()) {
                w wVar3 = (w) it2.next();
                l lVar2 = wVar3.c;
                if (lVar2.mDeferStart) {
                    if (this.b) {
                        this.H = true;
                    } else {
                        lVar2.mDeferStart = false;
                        wVar3.j();
                    }
                }
            }
            if (this.D && (abstractC3123nm = this.t) != null && this.s == 7) {
                ((p) abstractC3123nm).e.invalidateOptionsMenu();
                this.D = false;
            }
        }
    }

    public final void K() {
        if (this.t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.g = false;
        for (l lVar : this.c.f()) {
            if (lVar != null) {
                lVar.noteStateNotSaved();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i, int i2) {
        x(false);
        w(true);
        l lVar = this.w;
        if (lVar != null && i < 0 && lVar.getChildFragmentManager().L()) {
            return true;
        }
        boolean zN = N(this.I, this.J, i, i2);
        if (zN) {
            this.b = true;
            try {
                P(this.I, this.J);
            } finally {
                d();
            }
        }
        Z();
        boolean z = this.H;
        x xVar = this.c;
        if (z) {
            this.H = false;
            Iterator it = xVar.d().iterator();
            while (it.hasNext()) {
                w wVar = (w) it.next();
                l lVar2 = wVar.c;
                if (lVar2.mDeferStart) {
                    if (this.b) {
                        this.H = true;
                    } else {
                        lVar2.mDeferStart = false;
                        wVar.j();
                    }
                }
            }
        }
        xVar.b.values().removeAll(Collections.singleton(null));
        return zN;
    }

    public final boolean N(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.d.size() - 1;
            } else {
                int size2 = this.d.size() - 1;
                while (size2 >= 0) {
                    a aVar = (a) this.d.get(size2);
                    if (i >= 0 && i == aVar.r) {
                        break;
                    }
                    size2--;
                }
                if (size2 >= 0) {
                    if (z) {
                        while (size2 > 0) {
                            a aVar2 = (a) this.d.get(size2 - 1);
                            if (i < 0 || i != aVar2.r) {
                                break;
                            }
                            size2--;
                        }
                    } else if (size2 != this.d.size() - 1) {
                        size2++;
                    }
                    size = size2;
                } else {
                    size = size2;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.d.size() - 1; size3 >= size; size3--) {
            arrayList.add((a) this.d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void O(l lVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + lVar + " nesting=" + lVar.mBackStackNesting);
        }
        boolean z = !lVar.isInBackStack();
        if (!lVar.mDetached || z) {
            x xVar = this.c;
            synchronized (xVar.a) {
                xVar.a.remove(lVar);
            }
            lVar.mAdded = false;
            if (G(lVar)) {
                this.D = true;
            }
            lVar.mRemoving = true;
            W(lVar);
        }
    }

    public final void P(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((a) arrayList.get(i)).o) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((a) arrayList.get(i2)).o) {
                        i2++;
                    }
                }
                z(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            z(arrayList, arrayList2, i2, size);
        }
    }

    public final void Q(Parcelable parcelable) {
        int i;
        C3178om c3178om;
        int i2;
        w wVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.t.b.getClassLoader());
                this.k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.t.b.getClassLoader());
                arrayList.add((v) bundle.getParcelable("state"));
            }
        }
        x xVar = this.c;
        HashMap map = xVar.c;
        map.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            map.put(vVar.b, vVar);
        }
        C3719ym c3719ym = (C3719ym) bundle3.getParcelable("state");
        if (c3719ym == null) {
            return;
        }
        HashMap map2 = xVar.b;
        map2.clear();
        Iterator it2 = c3719ym.a.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            i = 2;
            c3178om = this.l;
            if (!zHasNext) {
                break;
            }
            v vVar2 = (v) xVar.c.remove((String) it2.next());
            if (vVar2 != null) {
                l lVar = (l) this.L.b.get(vVar2.b);
                if (lVar != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + lVar);
                    }
                    wVar = new w(c3178om, xVar, lVar, vVar2);
                } else {
                    wVar = new w(this.l, this.c, this.t.b.getClassLoader(), D(), vVar2);
                }
                l lVar2 = wVar.c;
                lVar2.mFragmentManager = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + lVar2.mWho + "): " + lVar2);
                }
                wVar.k(this.t.b.getClassLoader());
                xVar.g(wVar);
                wVar.e = this.s;
            }
        }
        u uVar = this.L;
        uVar.getClass();
        Iterator it3 = new ArrayList(uVar.b.values()).iterator();
        while (it3.hasNext()) {
            l lVar3 = (l) it3.next();
            if (map2.get(lVar3.mWho) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + lVar3 + " that was not found in the set of active Fragments " + c3719ym.a);
                }
                this.L.f(lVar3);
                lVar3.mFragmentManager = this;
                w wVar2 = new w(c3178om, xVar, lVar3);
                wVar2.e = 1;
                wVar2.j();
                lVar3.mRemoving = true;
                wVar2.j();
            }
        }
        ArrayList<String> arrayList2 = c3719ym.b;
        xVar.a.clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                l lVarB = xVar.b(str3);
                if (lVarB == null) {
                    throw new IllegalStateException(AbstractC3264qG.x("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + lVarB);
                }
                xVar.a(lVarB);
            }
        }
        if (c3719ym.c != null) {
            this.d = new ArrayList(c3719ym.c.length);
            int i3 = 0;
            while (true) {
                b[] bVarArr = c3719ym.c;
                if (i3 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i3];
                bVar.getClass();
                a aVar = new a(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = bVar.a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    C0110Fm c0110Fm = new C0110Fm();
                    int i6 = i4 + 1;
                    c0110Fm.a = iArr[i4];
                    if (Log.isLoggable("FragmentManager", i)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    c0110Fm.h = Ir.values()[bVar.c[i5]];
                    c0110Fm.i = Ir.values()[bVar.d[i5]];
                    int i7 = i4 + 2;
                    c0110Fm.c = iArr[i6] != 0;
                    int i8 = iArr[i7];
                    c0110Fm.d = i8;
                    int i9 = iArr[i4 + 3];
                    c0110Fm.e = i9;
                    int i10 = i4 + 5;
                    int i11 = iArr[i4 + 4];
                    c0110Fm.f = i11;
                    i4 += 6;
                    int i12 = iArr[i10];
                    c0110Fm.g = i12;
                    aVar.b = i8;
                    aVar.c = i9;
                    aVar.d = i11;
                    aVar.e = i12;
                    aVar.b(c0110Fm);
                    i5++;
                    i = 2;
                }
                aVar.f = bVar.e;
                aVar.h = bVar.f;
                aVar.g = true;
                aVar.i = bVar.n;
                aVar.j = bVar.o;
                aVar.k = bVar.p;
                aVar.l = bVar.q;
                aVar.m = bVar.r;
                aVar.n = bVar.s;
                aVar.o = bVar.t;
                aVar.r = bVar.m;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = bVar.b;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i13);
                    if (str4 != null) {
                        ((C0110Fm) aVar.a.get(i13)).b = xVar.b(str4);
                    }
                    i13++;
                }
                aVar.d(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + aVar.r + "): " + aVar);
                    PrintWriter printWriter = new PrintWriter(new C3075mt());
                    aVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i3++;
                i = 2;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = null;
        }
        this.i.set(c3719ym.d);
        String str5 = c3719ym.e;
        if (str5 != null) {
            l lVarB2 = xVar.b(str5);
            this.w = lVarB2;
            q(lVarB2);
        }
        ArrayList arrayList4 = c3719ym.f;
        if (arrayList4 != null) {
            for (int i14 = i2; i14 < arrayList4.size(); i14++) {
                this.j.put((String) arrayList4.get(i14), (T6) c3719ym.m.get(i14));
            }
        }
        this.C = new ArrayDeque(c3719ym.n);
    }

    public final Bundle R() {
        int i;
        ArrayList arrayList;
        b[] bVarArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            f fVar = (f) it.next();
            if (fVar.e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                fVar.e = false;
                fVar.d();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((f) it2.next()).g();
        }
        x(true);
        this.E = true;
        this.L.g = true;
        x xVar = this.c;
        xVar.getClass();
        HashMap map = xVar.b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (w wVar : map.values()) {
            if (wVar != null) {
                wVar.m();
                l lVar = wVar.c;
                arrayList2.add(lVar.mWho);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + lVar + ": " + lVar.mSavedFragmentState);
                }
            }
        }
        x xVar2 = this.c;
        xVar2.getClass();
        ArrayList arrayList3 = new ArrayList(xVar2.c.values());
        if (!arrayList3.isEmpty()) {
            x xVar3 = this.c;
            synchronized (xVar3.a) {
                try {
                    if (xVar3.a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(xVar3.a.size());
                        Iterator it3 = xVar3.a.iterator();
                        while (it3.hasNext()) {
                            l lVar2 = (l) it3.next();
                            arrayList.add(lVar2.mWho);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + lVar2.mWho + "): " + lVar2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList4 = this.d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                bVarArr = null;
            } else {
                bVarArr = new b[size];
                for (i = 0; i < size; i++) {
                    bVarArr[i] = new b((a) this.d.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.d.get(i));
                    }
                }
            }
            C3719ym c3719ym = new C3719ym();
            c3719ym.e = null;
            ArrayList arrayList5 = new ArrayList();
            c3719ym.f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            c3719ym.m = arrayList6;
            c3719ym.a = arrayList2;
            c3719ym.b = arrayList;
            c3719ym.c = bVarArr;
            c3719ym.d = this.i.get();
            l lVar3 = this.w;
            if (lVar3 != null) {
                c3719ym.e = lVar3.mWho;
            }
            arrayList5.addAll(this.j.keySet());
            arrayList6.addAll(this.j.values());
            c3719ym.n = new ArrayList(this.C);
            bundle.putParcelable("state", c3719ym);
            for (String str : this.k.keySet()) {
                bundle.putBundle(AbstractC3264qG.w("result_", str), (Bundle) this.k.get(str));
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                v vVar = (v) it4.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", vVar);
                bundle.putBundle("fragment_" + vVar.b, bundle2);
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void S() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.t.c.removeCallbacks(this.M);
                    this.t.c.post(this.M);
                    Z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void T(l lVar, boolean z) {
        ViewGroup viewGroupC = C(lVar);
        if (viewGroupC == null || !(viewGroupC instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupC).setDrawDisappearingViewsLast(!z);
    }

    public final void U(l lVar, Ir ir) {
        if (lVar.equals(this.c.b(lVar.mWho)) && (lVar.mHost == null || lVar.mFragmentManager == this)) {
            lVar.mMaxState = ir;
            return;
        }
        throw new IllegalArgumentException("Fragment " + lVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(l lVar) {
        if (lVar != null) {
            if (!lVar.equals(this.c.b(lVar.mWho)) || (lVar.mHost != null && lVar.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + lVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        l lVar2 = this.w;
        this.w = lVar;
        q(lVar2);
        q(this.w);
    }

    public final void W(l lVar) {
        ViewGroup viewGroupC = C(lVar);
        if (viewGroupC != null) {
            if (lVar.getPopExitAnim() + lVar.getPopEnterAnim() + lVar.getExitAnim() + lVar.getEnterAnim() > 0) {
                if (viewGroupC.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupC.setTag(R.id.visible_removing_fragment_view_tag, lVar);
                }
                ((l) viewGroupC.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(lVar.getPopDirection());
            }
        }
    }

    public final void Y(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C3075mt());
        AbstractC3123nm abstractC3123nm = this.t;
        try {
            if (abstractC3123nm != null) {
                ((p) abstractC3123nm).e.dump("  ", null, printWriter, new String[0]);
            } else {
                u("  ", null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception e) {
            Log.e("FragmentManager", "Failed dumping state", e);
            throw illegalStateException;
        }
    }

    public final void Z() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    C3288qm c3288qm = this.h;
                    c3288qm.a = true;
                    InterfaceC0606cn interfaceC0606cn = c3288qm.c;
                    if (interfaceC0606cn != null) {
                        interfaceC0606cn.invoke();
                    }
                    return;
                }
                C3288qm c3288qm2 = this.h;
                ArrayList arrayList = this.d;
                c3288qm2.a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.v);
                InterfaceC0606cn interfaceC0606cn2 = c3288qm2.c;
                if (interfaceC0606cn2 != null) {
                    interfaceC0606cn2.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final w a(l lVar) {
        String str = lVar.mPreviousWho;
        if (str != null) {
            AbstractC0076Dm.c(lVar, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + lVar);
        }
        w wVarF = f(lVar);
        lVar.mFragmentManager = this;
        x xVar = this.c;
        xVar.g(wVarF);
        if (!lVar.mDetached) {
            xVar.a(lVar);
            lVar.mRemoving = false;
            if (lVar.mView == null) {
                lVar.mHiddenChanged = false;
            }
            if (G(lVar)) {
                this.D = true;
            }
        }
        return wVarF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.AbstractC3123nm r10, defpackage.AbstractC3013lm r11, androidx.fragment.app.l r12) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.t.b(nm, lm, androidx.fragment.app.l):void");
    }

    public final void c(l lVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + lVar);
        }
        if (lVar.mDetached) {
            lVar.mDetached = false;
            if (lVar.mAdded) {
                return;
            }
            this.c.a(lVar);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + lVar);
            }
            if (G(lVar)) {
                this.D = true;
            }
        }
    }

    public final void d() {
        this.b = false;
        this.J.clear();
        this.I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((w) it.next()).c.mContainer;
            if (viewGroup != null) {
                hashSet.add(f.h(viewGroup, E()));
            }
        }
        return hashSet;
    }

    public final w f(l lVar) {
        String str = lVar.mWho;
        x xVar = this.c;
        w wVar = (w) xVar.b.get(str);
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this.l, xVar, lVar);
        wVar2.k(this.t.b.getClassLoader());
        wVar2.e = this.s;
        return wVar2;
    }

    public final void g(l lVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + lVar);
        }
        if (lVar.mDetached) {
            return;
        }
        lVar.mDetached = true;
        if (lVar.mAdded) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + lVar);
            }
            x xVar = this.c;
            synchronized (xVar.a) {
                xVar.a.remove(lVar);
            }
            lVar.mAdded = false;
            if (G(lVar)) {
                this.D = true;
            }
            W(lVar);
        }
    }

    public final void h(boolean z, Configuration configuration) {
        if (z && (this.t instanceof InterfaceC2806hx)) {
            Y(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (l lVar : this.c.f()) {
            if (lVar != null) {
                lVar.performConfigurationChanged(configuration);
                if (z) {
                    lVar.mChildFragmentManager.h(true, configuration);
                }
            }
        }
    }

    public final boolean i(MenuItem menuItem) {
        if (this.s < 1) {
            return false;
        }
        for (l lVar : this.c.f()) {
            if (lVar != null && lVar.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(Menu menu, MenuInflater menuInflater) {
        if (this.s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (l lVar : this.c.f()) {
            if (lVar != null && lVar.isMenuVisible() && lVar.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                l lVar2 = (l) this.e.get(i);
                if (arrayList == null || !arrayList.contains(lVar2)) {
                    lVar2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void k() {
        boolean zIsChangingConfigurations = true;
        this.G = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((f) it.next()).g();
        }
        AbstractC3123nm abstractC3123nm = this.t;
        boolean z = abstractC3123nm instanceof InterfaceC2722gM;
        x xVar = this.c;
        if (z) {
            zIsChangingConfigurations = xVar.d.f;
        } else {
            Context context = abstractC3123nm.b;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((T6) it2.next()).a) {
                    u uVar = xVar.d;
                    uVar.getClass();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    uVar.e(str);
                }
            }
        }
        t(-1);
        Object obj = this.t;
        if (obj instanceof InterfaceC3189ox) {
            ((InterfaceC3189ox) obj).removeOnTrimMemoryListener(this.o);
        }
        Object obj2 = this.t;
        if (obj2 instanceof InterfaceC2806hx) {
            ((InterfaceC2806hx) obj2).removeOnConfigurationChangedListener(this.n);
        }
        Object obj3 = this.t;
        if (obj3 instanceof InterfaceC3024lx) {
            ((InterfaceC3024lx) obj3).removeOnMultiWindowModeChangedListener(this.p);
        }
        Object obj4 = this.t;
        if (obj4 instanceof InterfaceC3079mx) {
            ((InterfaceC3079mx) obj4).removeOnPictureInPictureModeChangedListener(this.q);
        }
        Object obj5 = this.t;
        if (obj5 instanceof InterfaceC3619wu) {
            ((InterfaceC3619wu) obj5).removeMenuProvider(this.r);
        }
        this.t = null;
        this.u = null;
        this.v = null;
        if (this.g != null) {
            Iterator it3 = this.h.b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC3688y8) it3.next()).cancel();
            }
            this.g = null;
        }
        S0 s0 = this.z;
        if (s0 != null) {
            s0.b();
            this.A.b();
            this.B.b();
        }
    }

    public final void l(boolean z) {
        if (z && (this.t instanceof InterfaceC3189ox)) {
            Y(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (l lVar : this.c.f()) {
            if (lVar != null) {
                lVar.performLowMemory();
                if (z) {
                    lVar.mChildFragmentManager.l(true);
                }
            }
        }
    }

    public final void m(boolean z, boolean z2) {
        if (z2 && (this.t instanceof InterfaceC3024lx)) {
            Y(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (l lVar : this.c.f()) {
            if (lVar != null) {
                lVar.performMultiWindowModeChanged(z);
                if (z2) {
                    lVar.mChildFragmentManager.m(z, true);
                }
            }
        }
    }

    public final void n() {
        Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            if (lVar != null) {
                lVar.onHiddenChanged(lVar.isHidden());
                lVar.mChildFragmentManager.n();
            }
        }
    }

    public final boolean o(MenuItem menuItem) {
        if (this.s < 1) {
            return false;
        }
        for (l lVar : this.c.f()) {
            if (lVar != null && lVar.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void p(Menu menu) {
        if (this.s < 1) {
            return;
        }
        for (l lVar : this.c.f()) {
            if (lVar != null) {
                lVar.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void q(l lVar) {
        if (lVar != null) {
            if (lVar.equals(this.c.b(lVar.mWho))) {
                lVar.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void r(boolean z, boolean z2) {
        if (z2 && (this.t instanceof InterfaceC3079mx)) {
            Y(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (l lVar : this.c.f()) {
            if (lVar != null) {
                lVar.performPictureInPictureModeChanged(z);
                if (z2) {
                    lVar.mChildFragmentManager.r(z, true);
                }
            }
        }
    }

    public final boolean s(Menu menu) {
        boolean z = false;
        if (this.s < 1) {
            return false;
        }
        for (l lVar : this.c.f()) {
            if (lVar != null && lVar.isMenuVisible() && lVar.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void t(int i) {
        try {
            this.b = true;
            for (w wVar : this.c.b.values()) {
                if (wVar != null) {
                    wVar.e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((f) it.next()).g();
            }
            this.b = false;
            x(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        l lVar = this.v;
        if (lVar != null) {
            sb.append(lVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.v;
        } else {
            AbstractC3123nm abstractC3123nm = this.t;
            if (abstractC3123nm == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(abstractC3123nm.getClass().getSimpleName());
            sb.append("{");
            obj = this.t;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strG = AbstractC3264qG.g(str, "    ");
        x xVar = this.c;
        xVar.getClass();
        String str2 = str + "    ";
        HashMap map = xVar.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (w wVar : map.values()) {
                printWriter.print(str);
                if (wVar != null) {
                    l lVar = wVar.c;
                    printWriter.println(lVar);
                    lVar.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = xVar.a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                l lVar2 = (l) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(lVar2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                l lVar3 = (l) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(lVar3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = (a) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.f(strG, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (InterfaceC3557vm) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.u);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void v(InterfaceC3557vm interfaceC3557vm, boolean z) {
        if (!z) {
            if (this.t == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            try {
                if (this.t == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(interfaceC3557vm);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.t == null) {
            if (!this.G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.t.c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && (this.E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.I == null) {
            this.I = new ArrayList();
            this.J = new ArrayList();
        }
    }

    public final boolean x(boolean z) {
        boolean zA;
        w(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.I;
            ArrayList arrayList2 = this.J;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        zA = false;
                        for (int i = 0; i < size; i++) {
                            zA |= ((InterfaceC3557vm) this.a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                break;
            }
            this.b = true;
            try {
                P(this.I, this.J);
                d();
                z2 = true;
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        Z();
        if (this.H) {
            this.H = false;
            Iterator it = this.c.d().iterator();
            while (it.hasNext()) {
                w wVar = (w) it.next();
                l lVar = wVar.c;
                if (lVar.mDeferStart) {
                    if (this.b) {
                        this.H = true;
                    } else {
                        lVar.mDeferStart = false;
                        wVar.j();
                    }
                }
            }
        }
        this.c.b.values().removeAll(Collections.singleton(null));
        return z2;
    }

    public final void y(InterfaceC3557vm interfaceC3557vm, boolean z) {
        if (z && (this.t == null || this.G)) {
            return;
        }
        w(z);
        if (interfaceC3557vm.a(this.I, this.J)) {
            this.b = true;
            try {
                P(this.I, this.J);
            } finally {
                d();
            }
        }
        Z();
        boolean z2 = this.H;
        x xVar = this.c;
        if (z2) {
            this.H = false;
            Iterator it = xVar.d().iterator();
            while (it.hasNext()) {
                w wVar = (w) it.next();
                l lVar = wVar.c;
                if (lVar.mDeferStart) {
                    if (this.b) {
                        this.H = true;
                    } else {
                        lVar.mDeferStart = false;
                        wVar.j();
                    }
                }
            }
        }
        xVar.b.values().removeAll(Collections.singleton(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0224 A[PHI: r13
      0x0224: PHI (r13v9 int) = (r13v8 int), (r13v10 int) binds: [B:103:0x0214, B:108:0x0220] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(java.util.ArrayList r23, java.util.ArrayList r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 1188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.t.z(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }
}
