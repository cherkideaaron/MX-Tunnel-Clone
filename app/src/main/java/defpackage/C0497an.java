package defpackage;

import android.database.sqlite.SQLiteStatement;

/* renamed from: an, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0497an extends C0399Wm {
    public final SQLiteStatement d;

    public C0497an(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement, 1);
        this.d = sQLiteStatement;
    }

    public final void m() {
        this.d.executeUpdateDelete();
    }
}
