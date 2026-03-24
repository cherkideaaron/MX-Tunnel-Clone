package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* renamed from: Dq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080Dq {
    public final Context a;
    public final InterfaceC2682fj b;
    public final B6 c;

    public C0080Dq(Context context, InterfaceC2682fj interfaceC2682fj, B6 b6) {
        this.a = context;
        this.b = interfaceC2682fj;
        this.c = b6;
    }

    public final void a(J6 j6, int i, boolean z) {
        Context context = this.a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(j6.a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        Bz bz = j6.c;
        adler32.update(byteBufferAllocate.putInt(Dz.a(bz)).array());
        byte[] bArr = j6.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        AbstractC3279qd.s("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", j6);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase sQLiteDatabaseA = ((C2768hD) this.b).a();
        String strValueOf = String.valueOf(Dz.a(bz));
        String str = j6.a;
        Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, strValueOf});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            B6 b6 = this.c;
            Long l = lValueOf;
            builder.setMinimumLatency(b6.a(bz, jLongValue, i));
            Set set = ((C6) b6.b.get(bz)).c;
            builder.setRequiredNetworkType(set.contains(MD.a) ? 2 : 1);
            if (set.contains(MD.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(MD.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", Dz.a(bz));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {j6, Integer.valueOf(value), Long.valueOf(b6.a(bz, jLongValue, i)), l, Integer.valueOf(i)};
            String strI = AbstractC3279qd.I("JobInfoScheduler");
            if (Log.isLoggable(strI, 3)) {
                Log.d(strI, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }
}
