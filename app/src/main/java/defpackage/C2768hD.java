package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: hD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2768hD implements InterfaceC2682fj, InterfaceC0529bI, InterfaceC0484aa {
    public static final C0174Ji f = new C0174Ji("proto");
    public final RD a;
    public final VK b;
    public final VK c;
    public final C2816i6 d;
    public final InterfaceC3203pA e;

    public C2768hD(VK vk, VK vk2, C2816i6 c2816i6, RD rd, InterfaceC3203pA interfaceC3203pA) {
        this.a = rd;
        this.b = vk;
        this.c = vk2;
        this.d = c2816i6;
        this.e = interfaceC3203pA;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, J6 j6) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(j6.a, String.valueOf(Dz.a(j6.c))));
        byte[] bArr = j6.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String h(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C3578w6) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object i(Cursor cursor, InterfaceC2658fD interfaceC2658fD) {
        try {
            return interfaceC2658fD.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        RD rd = this.a;
        Objects.requireNonNull(rd);
        VK vk = this.c;
        long jA = vk.a();
        while (true) {
            try {
                return rd.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (vk.a() >= this.d.c + jA) {
                    throw new ZH("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object c(InterfaceC2658fD interfaceC2658fD) {
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            Object objApply = interfaceC2658fD.apply(sQLiteDatabaseA);
            sQLiteDatabaseA.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final ArrayList e(SQLiteDatabase sQLiteDatabase, J6 j6, int i) {
        ArrayList arrayList = new ArrayList();
        Long lB = b(sQLiteDatabase, j6);
        if (lB == null) {
            return arrayList;
        }
        i(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lB.toString()}, null, null, null, String.valueOf(i)), new C0271Pd(this, arrayList, j6, 5));
        return arrayList;
    }

    public final void f(long j, EnumC2802ht enumC2802ht, String str) {
        c(new C2549dD(str, j, enumC2802ht));
    }

    public final Object g(InterfaceC0474aI interfaceC0474aI) {
        SQLiteDatabase sQLiteDatabaseA = a();
        VK vk = this.c;
        long jA = vk.a();
        while (true) {
            try {
                sQLiteDatabaseA.beginTransaction();
                try {
                    Object objE = interfaceC0474aI.e();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return objE;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (vk.a() >= this.d.c + jA) {
                    throw new ZH("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
