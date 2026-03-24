package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Trace;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* renamed from: kb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2947kb implements InterfaceC2892jb, InterfaceC3091n8, OnCompleteListener, InterfaceC3062mg, Continuation, InterfaceC2658fD, InterfaceC0474aI {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C2947kb(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.InterfaceC2658fD
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C2768hD c2768hD = (C2768hD) this.b;
        C2816i6 c2816i6 = c2768hD.d;
        int i = c2816i6.b;
        J6 j6 = (J6) this.c;
        ArrayList arrayListE = c2768hD.e(sQLiteDatabase, j6, i);
        for (Bz bz : Bz.values()) {
            if (bz != j6.c) {
                int size = c2816i6.b - arrayListE.size();
                if (size <= 0) {
                    break;
                }
                arrayListE.addAll(c2768hD.e(sQLiteDatabase, j6.b(bz), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < arrayListE.size(); i2++) {
            sb.append(((C3578w6) arrayListE.get(i2)).a);
            if (i2 < arrayListE.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new C2713gD(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListE.listIterator();
        while (listIterator.hasNext()) {
            C3578w6 c3578w6 = (C3578w6) listIterator.next();
            if (map.containsKey(Long.valueOf(c3578w6.a))) {
                C2706g6 c2706g6C = c3578w6.c.c();
                long j2 = c3578w6.a;
                for (C2713gD c2713gD : (Set) map.get(Long.valueOf(j2))) {
                    c2706g6C.a(c2713gD.a, c2713gD.b);
                }
                listIterator.set(new C3578w6(j2, c3578w6.b, c2706g6C.b()));
            }
        }
        return arrayListE;
    }

    @Override // defpackage.InterfaceC3091n8
    public Object attachCompleter(C3036m8 c3036m8) {
        InterfaceC3117ng interfaceC3117ng = (InterfaceC3117ng) this.b;
        AbstractC0500aq.m(interfaceC3117ng, "$this_asListenableFuture");
        interfaceC3117ng.invokeOnCompletion(new C0117Gc(0, c3036m8, interfaceC3117ng));
        return this.c;
    }

    @Override // defpackage.InterfaceC3062mg
    public void b(InterfaceC3258qA interfaceC3258qA) {
        ((InterfaceC3062mg) this.b).b(interfaceC3258qA);
        ((InterfaceC3062mg) this.c).b(interfaceC3258qA);
    }

    @Override // defpackage.InterfaceC2892jb
    public Object d(C2811i1 c2811i1) {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                C0319Sa c0319Sa = (C0319Sa) this.c;
                try {
                    Trace.beginSection(str);
                    return c0319Sa.f.d(c2811i1);
                } finally {
                    Trace.endSection();
                }
            default:
                return new C3254q6((String) this.b, ((C0220Md) this.c).a((Context) c2811i1.a(Context.class)));
        }
    }

    @Override // defpackage.InterfaceC0474aI
    public Object e() {
        switch (this.a) {
            case 7:
                C2768hD c2768hD = (C2768hD) ((UK) this.b).c;
                c2768hD.getClass();
                Iterable iterable = (Iterable) this.c;
                if (iterable.iterator().hasNext()) {
                    c2768hD.a().compileStatement("DELETE FROM events WHERE _id in " + C2768hD.h(iterable)).execute();
                    break;
                }
                break;
            default:
                UK uk = (UK) this.b;
                uk.getClass();
                Iterator it = ((Map) this.c).entrySet().iterator();
                while (it.hasNext()) {
                    ((C2768hD) uk.i).f(((Integer) r2.getValue()).intValue(), EnumC2802ht.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((AbstractServiceC0293Qi) this.b).a((Intent) this.c);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        C3178om c3178om = (C3178om) this.c;
        String str = (String) this.b;
        synchronized (c3178om) {
            ((Z3) c3178om.c).remove(str);
        }
        return task;
    }

    public /* synthetic */ C2947kb(C3178om c3178om, String str) {
        this.a = 5;
        this.c = c3178om;
        this.b = str;
    }
}
