package defpackage;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Pd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0271Pd implements Continuation, InterfaceC0474aI, SuccessContinuation, C8, InterfaceC2658fD {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C0271Pd(PJ pj, RunnableC3680y0 runnableC3680y0) {
        this.a = 3;
        this.b = null;
        this.c = pj;
        this.d = runnableC3680y0;
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.InterfaceC2658fD
    public Object apply(Object obj) {
        long jInsert;
        C2768hD c2768hD;
        EnumC2802ht enumC2802ht;
        EnumC2802ht enumC2802ht2;
        int i = 5;
        int i2 = 4;
        int i3 = 3;
        EnumC2802ht enumC2802ht3 = EnumC2802ht.CACHE_FULL;
        int i4 = 2;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i5 = 0;
        Object obj4 = this.b;
        int i6 = 1;
        switch (this.a) {
            case 4:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                C2768hD c2768hD2 = (C2768hD) obj4;
                long jSimpleQueryForLong = c2768hD2.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * c2768hD2.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C2816i6 c2816i6 = c2768hD2.d;
                C2761h6 c2761h6 = (C2761h6) obj3;
                if (jSimpleQueryForLong >= c2816i6.a) {
                    c2768hD2.f(1L, enumC2802ht3, c2761h6.a);
                    return -1L;
                }
                J6 j6 = (J6) obj2;
                Long lB = C2768hD.b(sQLiteDatabase, j6);
                if (lB != null) {
                    jInsert = lB.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", j6.a);
                    contentValues.put("priority", Integer.valueOf(Dz.a(j6.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = j6.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                byte[] bArr2 = c2761h6.c.b;
                int length = bArr2.length;
                int i7 = c2816i6.e;
                boolean z = length <= i7;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", c2761h6.a);
                contentValues2.put("timestamp_ms", Long.valueOf(c2761h6.d));
                contentValues2.put("uptime_ms", Long.valueOf(c2761h6.e));
                contentValues2.put("payload_encoding", c2761h6.c.a.a);
                contentValues2.put("code", c2761h6.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", c2761h6.g);
                contentValues2.put("pseudonymous_id", c2761h6.h);
                contentValues2.put("experiment_ids_clear_blob", c2761h6.i);
                contentValues2.put("experiment_ids_encrypted_blob", c2761h6.j);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(bArr2.length / i7);
                    for (int i8 = 1; i8 <= iCeil; i8++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i8 - 1) * i7, Math.min(i8 * i7, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i8));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(c2761h6.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) entry.getKey());
                    contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 5:
                Cursor cursor = (Cursor) obj;
                C2768hD c2768hD3 = (C2768hD) obj4;
                c2768hD3.getClass();
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    int i9 = cursor.getInt(7) != 0 ? i6 : 0;
                    C2706g6 c2706g6 = new C2706g6();
                    c2706g6.f = new HashMap();
                    String string = cursor.getString(i6);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    c2706g6.a = string;
                    c2706g6.d = Long.valueOf(cursor.getLong(i4));
                    c2706g6.e = Long.valueOf(cursor.getLong(3));
                    if (i9 != 0) {
                        String string2 = cursor.getString(4);
                        c2706g6.c(new C0123Gi(string2 == null ? C2768hD.f : new C0174Ji(string2), cursor.getBlob(5)));
                        c2768hD = c2768hD3;
                    } else {
                        String string3 = cursor.getString(4);
                        C0174Ji c0174Ji = string3 == null ? C2768hD.f : new C0174Ji(string3);
                        Cursor cursorQuery = c2768hD3.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList = new ArrayList();
                            int length2 = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList.add(blob);
                                length2 += blob.length;
                            }
                            byte[] bArr3 = new byte[length2];
                            int i10 = 0;
                            int length3 = 0;
                            while (i10 < arrayList.size()) {
                                byte[] bArr4 = (byte[]) arrayList.get(i10);
                                ArrayList arrayList2 = arrayList;
                                C2768hD c2768hD4 = c2768hD3;
                                System.arraycopy(bArr4, 0, bArr3, length3, bArr4.length);
                                length3 += bArr4.length;
                                i10++;
                                arrayList = arrayList2;
                                c2768hD3 = c2768hD4;
                            }
                            c2768hD = c2768hD3;
                            cursorQuery.close();
                            c2706g6.c(new C0123Gi(c0174Ji, bArr3));
                        } catch (Throwable th) {
                            cursorQuery.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        c2706g6.b = Integer.valueOf(cursor.getInt(6));
                    }
                    if (!cursor.isNull(8)) {
                        c2706g6.g = Integer.valueOf(cursor.getInt(8));
                    }
                    if (!cursor.isNull(9)) {
                        c2706g6.h = cursor.getString(9);
                    }
                    if (!cursor.isNull(10)) {
                        c2706g6.i = cursor.getBlob(10);
                    }
                    if (!cursor.isNull(11)) {
                        c2706g6.j = cursor.getBlob(11);
                    }
                    ((List) obj3).add(new C3578w6(j, (J6) obj2, c2706g6.b()));
                    c2768hD3 = c2768hD;
                    i4 = 2;
                    i6 = 1;
                }
                return null;
            default:
                Cursor cursor2 = (Cursor) obj;
                C2768hD c2768hD5 = (C2768hD) obj4;
                c2768hD5.getClass();
                while (true) {
                    Map map = (Map) obj3;
                    if (cursor2.moveToNext()) {
                        String string4 = cursor2.getString(i5);
                        int i11 = cursor2.getInt(1);
                        EnumC2802ht enumC2802ht4 = EnumC2802ht.REASON_UNKNOWN;
                        if (i11 != 0) {
                            if (i11 == 1) {
                                enumC2802ht4 = EnumC2802ht.MESSAGE_TOO_OLD;
                            } else if (i11 == 2) {
                                enumC2802ht = enumC2802ht3;
                                enumC2802ht2 = enumC2802ht;
                            } else if (i11 == i3) {
                                enumC2802ht4 = EnumC2802ht.PAYLOAD_TOO_BIG;
                            } else if (i11 == i2) {
                                enumC2802ht4 = EnumC2802ht.MAX_RETRIES_REACHED;
                            } else if (i11 == i) {
                                enumC2802ht4 = EnumC2802ht.INVALID_PAYLOD;
                            } else if (i11 == 6) {
                                enumC2802ht4 = EnumC2802ht.SERVER_ERROR;
                            } else {
                                AbstractC3279qd.s("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i11));
                            }
                            enumC2802ht2 = enumC2802ht3;
                            enumC2802ht = enumC2802ht4;
                        } else {
                            enumC2802ht2 = enumC2802ht3;
                            enumC2802ht = enumC2802ht4;
                        }
                        long j2 = cursor2.getLong(2);
                        if (!map.containsKey(string4)) {
                            map.put(string4, new ArrayList());
                        }
                        ((List) map.get(string4)).add(new C2910jt(j2, enumC2802ht));
                        enumC2802ht3 = enumC2802ht2;
                        i = 5;
                        i2 = 4;
                        i3 = 3;
                        i5 = 0;
                    } else {
                        Iterator it = map.entrySet().iterator();
                        while (true) {
                            C3532vE c3532vE = (C3532vE) obj2;
                            if (!it.hasNext()) {
                                final long jA = c2768hD5.b.a();
                                SQLiteDatabase sQLiteDatabaseA = c2768hD5.a();
                                sQLiteDatabaseA.beginTransaction();
                                try {
                                    C0475aJ c0475aJ = (C0475aJ) C2768hD.i(sQLiteDatabaseA.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new InterfaceC2658fD() { // from class: eD
                                        @Override // defpackage.InterfaceC2658fD
                                        public final Object apply(Object obj5) {
                                            Cursor cursor3 = (Cursor) obj5;
                                            cursor3.moveToNext();
                                            return new C0475aJ(cursor3.getLong(0), jA);
                                        }
                                    });
                                    sQLiteDatabaseA.setTransactionSuccessful();
                                    sQLiteDatabaseA.endTransaction();
                                    c3532vE.b = c0475aJ;
                                    c3532vE.d = new Cdo(new C2990lH(c2768hD5.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * c2768hD5.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), C2816i6.f.a));
                                    c3532vE.a = (String) c2768hD5.e.get();
                                    return new C2564da((C0475aJ) c3532vE.b, Collections.unmodifiableList((ArrayList) c3532vE.c), (Cdo) c3532vE.d, (String) c3532vE.a);
                                } catch (Throwable th2) {
                                    sQLiteDatabaseA.endTransaction();
                                    throw th2;
                                }
                            }
                            Map.Entry entry2 = (Map.Entry) it.next();
                            int i12 = C3020lt.c;
                            new ArrayList();
                            ((ArrayList) c3532vE.c).add(new C3020lt((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                        }
                    }
                }
        }
    }

    @Override // defpackage.InterfaceC0474aI
    public Object e() {
        C0599cg c0599cg = (C0599cg) this.b;
        C2768hD c2768hD = (C2768hD) c0599cg.d;
        c2768hD.getClass();
        J6 j6 = (J6) this.c;
        Bz bz = j6.c;
        C2761h6 c2761h6 = (C2761h6) this.d;
        String str = c2761h6.a;
        String strI = AbstractC3279qd.I("SQLiteEventStore");
        if (Log.isLoggable(strI, 3)) {
            Log.d(strI, "Storing event with priority=" + bz + ", name=" + str + " for destination " + j6.a);
        }
        ((Long) c2768hD.c(new C0271Pd(c2768hD, c2761h6, j6, 4))).getClass();
        c0599cg.a.a(j6, 1, false);
        return null;
    }

    @Override // defpackage.C8
    public void f() {
        Runnable runnable = (Runnable) this.b;
        if (runnable == null) {
            ((PJ) this.c).d();
            runnable = (Runnable) this.d;
        }
        runnable.run();
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        C3100nH c3100nH = (C3100nH) this.d;
        String str2 = (String) obj;
        C2524cp c2524cpC = FirebaseMessaging.c(firebaseMessaging.b);
        C3663xk c3663xk = firebaseMessaging.a;
        c3663xk.a();
        String strF = "[DEFAULT]".equals(c3663xk.b) ? "" : c3663xk.f();
        String strA = firebaseMessaging.h.a();
        synchronized (c2524cpC) {
            String strA2 = C3100nH.a(str2, strA, System.currentTimeMillis());
            if (strA2 != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) c2524cpC.b).edit();
                editorEdit.putString(strF + "|T|" + str + "|*", strA2);
                editorEdit.commit();
            }
        }
        if (c3100nH == null || !str2.equals(c3100nH.a)) {
            C3663xk c3663xk2 = firebaseMessaging.a;
            c3663xk2.a();
            if ("[DEFAULT]".equals(c3663xk2.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    c3663xk2.a();
                    sb.append(c3663xk2.b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new R2(firebaseMessaging.b, 1).B(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    public /* synthetic */ C0271Pd(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean zIsSuccessful = task.isSuccessful();
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.b;
        if (zIsSuccessful) {
            taskCompletionSource.trySetResult(task.getResult());
        } else if (task.getException() != null) {
            taskCompletionSource.trySetException(task.getException());
        } else if (((AtomicBoolean) this.c).getAndSet(true)) {
            ((CancellationTokenSource) this.d).cancel();
        }
        return Tasks.forResult(null);
    }
}
