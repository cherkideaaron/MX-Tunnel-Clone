package defpackage;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: Xm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416Xm implements DatabaseErrorHandler {
    public final /* synthetic */ N2 a;
    public final /* synthetic */ C0399Wm[] b;

    public C0416Xm(N2 n2, C0399Wm[] c0399WmArr) {
        this.a = n2;
        this.b = c0399WmArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        C0399Wm c0399WmA = C0433Ym.a(this.b, sQLiteDatabase);
        this.a.getClass();
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + ((SQLiteDatabase) c0399WmA.b).getPath());
        SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) c0399WmA.b;
        if (sQLiteDatabase2.isOpen()) {
            List<Pair<String, String>> attachedDbs = null;
            try {
                try {
                    attachedDbs = sQLiteDatabase2.getAttachedDbs();
                } catch (Throwable th) {
                    if (attachedDbs != null) {
                        Iterator<Pair<String, String>> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            N2.d((String) it.next().second);
                        }
                    } else {
                        N2.d(sQLiteDatabase2.getPath());
                    }
                    throw th;
                }
            } catch (SQLiteException unused) {
            }
            try {
                c0399WmA.close();
            } catch (IOException unused2) {
            }
            if (attachedDbs != null) {
                Iterator<Pair<String, String>> it2 = attachedDbs.iterator();
                while (it2.hasNext()) {
                    N2.d((String) it2.next().second);
                }
                return;
            }
        }
        N2.d(sQLiteDatabase2.getPath());
    }
}
