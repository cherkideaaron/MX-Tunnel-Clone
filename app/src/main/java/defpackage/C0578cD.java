package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: cD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0578cD implements InterfaceC2658fD {
    public final /* synthetic */ long a;
    public final /* synthetic */ J6 b;

    public /* synthetic */ C0578cD(long j, J6 j6) {
        this.a = j;
        this.b = j6;
    }

    @Override // defpackage.InterfaceC2658fD
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.a));
        J6 j6 = this.b;
        String str = j6.a;
        Bz bz = j6.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(Dz.a(bz))}) < 1) {
            contentValues.put("backend_name", j6.a);
            contentValues.put("priority", Integer.valueOf(Dz.a(bz)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
