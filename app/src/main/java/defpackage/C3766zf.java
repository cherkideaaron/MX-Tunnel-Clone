package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: zf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3766zf {
    public final TH a;
    public final Context b;
    public final String c;
    public final C0607co d;
    public final List e;
    public final Executor f;
    public final Executor g;
    public final boolean h;
    public final boolean i;

    public C3766zf(Context context, String str, TH th, C0607co c0607co, ArrayList arrayList, boolean z, int i, Executor executor, Executor executor2, boolean z2, boolean z3) {
        this.a = th;
        this.b = context;
        this.c = str;
        this.d = c0607co;
        this.f = executor;
        this.g = executor2;
        this.h = z2;
        this.i = z3;
    }

    public final boolean a(int i, int i2) {
        if (i <= i2 || !this.i) {
            return this.h;
        }
        return false;
    }
}
