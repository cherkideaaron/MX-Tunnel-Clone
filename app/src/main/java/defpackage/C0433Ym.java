package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: Ym, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433Ym extends SQLiteOpenHelper {
    public final C0399Wm[] a;
    public final N2 b;
    public boolean c;

    public C0433Ym(Context context, String str, C0399Wm[] c0399WmArr, N2 n2) {
        super(context, str, null, n2.b, new C0416Xm(n2, c0399WmArr));
        this.b = n2;
        this.a = c0399WmArr;
    }

    public static C0399Wm a(C0399Wm[] c0399WmArr, SQLiteDatabase sQLiteDatabase) {
        C0399Wm c0399Wm = c0399WmArr[0];
        if (c0399Wm == null || ((SQLiteDatabase) c0399Wm.b) != sQLiteDatabase) {
            c0399WmArr[0] = new C0399Wm(sQLiteDatabase, 0);
        }
        return c0399WmArr[0];
    }

    public final synchronized C0399Wm b() {
        this.c = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!this.c) {
            return a(this.a, writableDatabase);
        }
        close();
        return b();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.a[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        a(this.a, sQLiteDatabase);
        this.b.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.database.sqlite.SQLiteDatabase r7) throws android.database.SQLException {
        /*
            r6 = this;
            r0 = 1
            Wm[] r1 = r6.a
            Wm r7 = a(r1, r7)
            N2 r1 = r6.b
            r1.getClass()
            java.lang.String r2 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r2 = r7.k(r2)
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L21
            r4 = 0
            if (r3 == 0) goto L23
            int r3 = r2.getInt(r4)     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L23
            r3 = r0
            goto L24
        L21:
            r7 = move-exception
            goto L75
        L23:
            r3 = r4
        L24:
            r2.close()
            java.lang.Object r2 = r1.d
            WN r2 = (defpackage.WN) r2
            r2.getClass()
            defpackage.WN.a(r7)
            if (r3 != 0) goto L54
            H7 r3 = defpackage.WN.b(r7)
            boolean r5 = r3.a
            if (r5 == 0) goto L3c
            goto L54
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r1)
            java.lang.Object r1 = r3.b
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L54:
            r1.k(r7)
            int r7 = androidx.work.impl.WorkDatabase_Impl.s
            java.lang.Object r7 = r2.a
            androidx.work.impl.WorkDatabase_Impl r7 = (androidx.work.impl.WorkDatabase_Impl) r7
            java.util.List r1 = r7.g
            if (r1 == 0) goto L74
            int r1 = r1.size()
        L65:
            if (r4 >= r1) goto L74
            java.util.List r2 = r7.g
            java.lang.Object r2 = r2.get(r4)
            SN r2 = (defpackage.SN) r2
            r2.getClass()
            int r4 = r4 + r0
            goto L65
        L74:
            return
        L75:
            r2.close()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0433Ym.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        this.c = true;
        this.b.h(a(this.a, sQLiteDatabase), i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r12) throws android.database.SQLException {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0433Ym.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        this.c = true;
        this.b.h(a(this.a, sQLiteDatabase), i, i2);
    }
}
