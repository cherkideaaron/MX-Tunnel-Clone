package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: rC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3314rC {
    public final AtomicInteger a;
    public final HashMap b;
    public final HashSet c;
    public final PriorityBlockingQueue d;
    public final PriorityBlockingQueue e;
    public final C0427Yg f;
    public final InterfaceC2695fw g;
    public final C2827iH h;
    public final C2913jw[] i;
    public C2708g8 j;
    public final ArrayList k;

    public C3314rC(C0427Yg c0427Yg, C3471u7 c3471u7) {
        C2827iH c2827iH = new C2827iH(new Handler(Looper.getMainLooper()));
        this.a = new AtomicInteger();
        this.b = new HashMap();
        this.c = new HashSet();
        this.d = new PriorityBlockingQueue();
        this.e = new PriorityBlockingQueue();
        this.k = new ArrayList();
        this.f = c0427Yg;
        this.g = c3471u7;
        this.i = new C2913jw[4];
        this.h = c2827iH;
    }

    public final void a(C3373sH c3373sH) {
        c3373sH.m = this;
        synchronized (this.c) {
            this.c.add(c3373sH);
        }
        c3373sH.f = Integer.valueOf(this.a.incrementAndGet());
        c3373sH.a("add-to-queue");
        if (!c3373sH.n) {
            this.e.add(c3373sH);
            return;
        }
        synchronized (this.b) {
            try {
                String strE = c3373sH.e();
                if (this.b.containsKey(strE)) {
                    Queue linkedList = (Queue) this.b.get(strE);
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                    }
                    linkedList.add(c3373sH);
                    this.b.put(strE, linkedList);
                    if (HM.a) {
                        HM.d("Request for cacheKey=%s is in flight, putting on hold.", strE);
                    }
                } else {
                    this.b.put(strE, null);
                    this.d.add(c3373sH);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        C2708g8 c2708g8 = this.j;
        if (c2708g8 != null) {
            c2708g8.e = true;
            c2708g8.interrupt();
        }
        int i = 0;
        while (true) {
            C2913jw[] c2913jwArr = this.i;
            if (i >= c2913jwArr.length) {
                break;
            }
            C2913jw c2913jw = c2913jwArr[i];
            if (c2913jw != null) {
                c2913jw.e = true;
                c2913jw.interrupt();
            }
            i++;
        }
        C2708g8 c2708g82 = new C2708g8(this.d, this.e, this.f, this.h);
        this.j = c2708g82;
        c2708g82.start();
        for (int i2 = 0; i2 < this.i.length; i2++) {
            C2913jw c2913jw2 = new C2913jw(this.e, this.g, this.f, this.h);
            this.i[i2] = c2913jw2;
            c2913jw2.start();
        }
    }
}
