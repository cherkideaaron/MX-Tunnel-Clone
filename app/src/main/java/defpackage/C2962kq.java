package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: kq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2962kq {
    public static final String[] j = {"UPDATE", "DELETE", "INSERT"};
    public final String[] b;
    public final TC c;
    public volatile C0497an f;
    public final C2853iq g;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public volatile boolean e = false;
    public final C3423tD h = new C3423tD();
    public final RunnableC2705g5 i = new RunnableC2705g5(this, 16);
    public final HashMap a = new HashMap();

    public C2962kq(TC tc, HashMap map, HashMap map2, String... strArr) {
        this.c = tc;
        this.g = new C2853iq(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.a.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) map.get(strArr[i]);
            if (str2 != null) {
                this.b[i] = str2.toLowerCase(locale);
            } else {
                this.b[i] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap map3 = this.a;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        C0399Wm c0399Wm = this.c.a;
        if (!(c0399Wm != null && ((SQLiteDatabase) c0399Wm.b).isOpen())) {
            return false;
        }
        if (!this.e) {
            this.c.c.d();
        }
        if (this.e) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(C0399Wm c0399Wm, int i) throws SQLException {
        c0399Wm.i(Vs.l(i, "INSERT OR IGNORE INTO room_table_modification_log VALUES(", ", 0)"));
        String str = this.b[i];
        StringBuilder sb = new StringBuilder();
        String[] strArr = j;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            AbstractC3264qG.v(sb, str, "_", str2, "`");
            AbstractC3264qG.v(sb, " AFTER ", str2, " ON `", str);
            AbstractC3264qG.v(sb, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            AbstractC3264qG.v(sb, " = 1", " WHERE ", "table_id", " = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            c0399Wm.i(sb.toString());
        }
    }

    public final void c(C0399Wm c0399Wm) {
        if (((SQLiteDatabase) c0399Wm.b).inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock lock = this.c.h.readLock();
                lock.lock();
                try {
                    int[] iArrA = this.g.a();
                    if (iArrA == null) {
                        lock.unlock();
                        return;
                    }
                    int length = iArrA.length;
                    c0399Wm.a();
                    for (int i = 0; i < length; i++) {
                        try {
                            int i2 = iArrA[i];
                            if (i2 == 1) {
                                b(c0399Wm, i);
                            } else if (i2 == 2) {
                                String str = this.b[i];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = j;
                                for (int i3 = 0; i3 < 3; i3++) {
                                    String str2 = strArr[i3];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    c0399Wm.i(sb.toString());
                                }
                            }
                        } catch (Throwable th) {
                            c0399Wm.h();
                            throw th;
                        }
                    }
                    c0399Wm.l();
                    c0399Wm.h();
                    C2853iq c2853iq = this.g;
                    synchronized (c2853iq) {
                        c2853iq.e = false;
                    }
                    lock.unlock();
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                return;
            }
        }
    }
}
