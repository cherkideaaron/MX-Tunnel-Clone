package com.facebook.ads.redexgen.core;

import android.database.Cursor;

/* renamed from: com.facebook.ads.redexgen.X.o4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2324o4 implements InterfaceC0867Bo {
    public final Cursor A00;

    public final /* synthetic */ boolean A01() {
        return AbstractC0866Bn.A00(this);
    }

    public C2324o4(Cursor cursor) {
        this.A00 = cursor;
    }

    public final C0863Bk A00() {
        return C9w.A01(this.A00);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0867Bo
    public final int getPosition() {
        return this.A00.getPosition();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0867Bo
    public final boolean moveToPosition(int i) {
        return this.A00.moveToPosition(i);
    }
}
