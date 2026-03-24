package defpackage;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: dD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2549dD implements InterfaceC2658fD, InterfaceC0474aI {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C2549dD(Object obj, long j, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }

    @Override // defpackage.InterfaceC2658fD
    public Object apply(Object obj) throws SQLException {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        EnumC2802ht enumC2802ht = (EnumC2802ht) this.c;
        String string = Integer.toString(enumC2802ht.a);
        String str = (String) this.b;
        boolean zBooleanValue = ((Boolean) C2768hD.i(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, string}), new C0220Md(29))).booleanValue();
        long j = this.a;
        int i = enumC2802ht.a;
        if (zBooleanValue) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    @Override // defpackage.InterfaceC0474aI
    public Object e() {
        UK uk = (UK) this.b;
        long jA = uk.g.a() + this.a;
        C2768hD c2768hD = (C2768hD) uk.c;
        c2768hD.getClass();
        c2768hD.c(new C0578cD(jA, (J6) this.c));
        return null;
    }
}
