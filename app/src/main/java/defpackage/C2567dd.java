package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* renamed from: dd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2567dd {
    public static final C0423Yc r = new C0423Yc(1);
    public static final Charset s = Charset.forName("UTF-8");
    public final Context a;
    public final C0102Fe b;
    public final R2 c;
    public final C3429tJ d;
    public final D3 e;
    public final C2578dp f;
    public final C3121nk g;
    public final C3 h;
    public final R2 i;
    public final C2949kd j;
    public final InterfaceC3627x1 k;
    public final C0487ad l;
    public final H2 m;
    public C0288Qd n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public C2567dd(Context context, C2578dp c2578dp, C0102Fe c0102Fe, C3121nk c3121nk, R2 r2, C3 c3, C3429tJ c3429tJ, R2 r22, H2 h2, C2949kd c2949kd, InterfaceC3627x1 interfaceC3627x1, C0487ad c0487ad, D3 d3) {
        new AtomicBoolean(false);
        this.a = context;
        this.f = c2578dp;
        this.b = c0102Fe;
        this.g = c3121nk;
        this.c = r2;
        this.h = c3;
        this.d = c3429tJ;
        this.i = r22;
        this.j = c2949kd;
        this.k = interfaceC3627x1;
        this.l = c0487ad;
        this.m = h2;
        this.e = d3;
    }

    public static Task a(C2567dd c2567dd) {
        Task taskCall;
        c2567dd.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : C3121nk.k(((File) c2567dd.g.c).listFiles(r))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    taskCall = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new CallableC0596cd(c2567dd, j));
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0407 A[PHI: r0 r29
      0x0407: PHI (r0v84 java.lang.String) = (r0v83 java.lang.String), (r0v90 java.lang.String) binds: [B:137:0x041d, B:134:0x0405] A[DONT_GENERATE, DONT_INLINE]
      0x0407: PHI (r29v3 java.util.ArrayList) = (r29v2 java.util.ArrayList), (r29v4 java.util.ArrayList) binds: [B:137:0x041d, B:134:0x0405] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d7  */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
    /* JADX WARN: Type inference failed for: r31v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r31, defpackage.C3308r6 r32, boolean r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2567dd.b(boolean, r6, boolean):void");
    }

    public final void c(String str, Boolean bool) throws IOException {
        Locale locale;
        Integer num;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strW = AbstractC3264qG.w("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strW, null);
        }
        Locale locale2 = Locale.US;
        C2578dp c2578dp = this.f;
        C3 c3 = this.h;
        F6 f6 = new F6(c2578dp.c, c3.f, c3.g, c2578dp.c().a, AbstractC3264qG.b(c3.d != null ? 4 : 1), c3.h);
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        H6 h6 = new H6(str2, str3, AbstractC0115Ga.G());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        EnumC0098Fa enumC0098Fa = EnumC0098Fa.a;
        String str4 = Build.CPU_ABI;
        boolean zIsEmpty = TextUtils.isEmpty(str4);
        EnumC0098Fa enumC0098Fa2 = EnumC0098Fa.a;
        if (!zIsEmpty) {
            EnumC0098Fa enumC0098Fa3 = (EnumC0098Fa) EnumC0098Fa.b.get(str4.toLowerCase(locale2));
            if (enumC0098Fa3 != null) {
                enumC0098Fa2 = enumC0098Fa3;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = enumC0098Fa2.ordinal();
        String str5 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jG = AbstractC0115Ga.g(context);
        boolean zE = AbstractC0115Ga.E();
        int iV = AbstractC0115Ga.v();
        String str6 = Build.MANUFACTURER;
        String str7 = Build.PRODUCT;
        this.j.d(str, "Crashlytics Android SDK/20.0.4", jCurrentTimeMillis, new E6(f6, h6, new G6(iOrdinal, str5, iAvailableProcessors, jG, blockCount, zE, iV, str6, str7)));
        if (!bool.booleanValue() || str == null) {
            locale = locale2;
        } else {
            C3429tJ c3429tJ = this.d;
            synchronized (((String) c3429tJ.c)) {
                c3429tJ.c = str;
                locale = locale2;
                ((ExecutorC0305Rd) ((D3) c3429tJ.b).c).a(new RunnableC0490ag(c3429tJ, str, ((C3293qr) ((AtomicMarkableReference) ((C0312Rk) c3429tJ.d).b).getReference()).a(), ((C3249q1) c3429tJ.f).d(), 1));
            }
        }
        R2 r2 = this.i;
        ((InterfaceC2574dk) r2.c).c();
        r2.c = R2.m;
        if (str != null) {
            r2.c = new PA(((C3121nk) r2.b).b(str, "userlog"));
        }
        this.l.b(str);
        H2 h2 = this.m;
        C0203Ld c0203Ld = (C0203Ld) h2.a;
        c0203Ld.getClass();
        Charset charset = AbstractC0186Kd.a;
        C3415t5 c3415t5 = new C3415t5();
        c3415t5.a = "20.0.4";
        C3 c32 = c0203Ld.c;
        String str8 = c32.a;
        if (str8 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        c3415t5.b = str8;
        C2578dp c2578dp2 = c0203Ld.b;
        String str9 = c2578dp2.c().a;
        if (str9 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        c3415t5.d = str9;
        c3415t5.e = c2578dp2.c().b;
        c3415t5.f = c2578dp2.c().c;
        String str10 = c32.f;
        if (str10 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        c3415t5.h = str10;
        String str11 = c32.g;
        if (str11 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        c3415t5.i = str11;
        c3415t5.c = 4;
        c3415t5.m = (byte) (c3415t5.m | 1);
        C5 c5 = new C5();
        c5.f = false;
        byte b = (byte) (c5.m | 2);
        c5.d = jCurrentTimeMillis;
        c5.m = (byte) (b | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        c5.b = str;
        String str12 = C0203Ld.g;
        if (str12 == null) {
            throw new NullPointerException("Null generator");
        }
        c5.a = str12;
        String str13 = c2578dp2.c;
        if (str13 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str14 = c2578dp2.c().a;
        R2 r22 = c32.h;
        if (((C0172Jg) r22.c) == null) {
            r22.c = new C0172Jg(r22);
        }
        C0172Jg c0172Jg = (C0172Jg) r22.c;
        String str15 = c0172Jg.a;
        if (c0172Jg == null) {
            r22.c = new C0172Jg(r22);
        }
        c5.g = new E5(str13, str10, str11, str14, str15, ((C0172Jg) r22.c).b);
        C0517b6 c0517b6 = new C0517b6();
        c0517b6.a = 3;
        c0517b6.e = (byte) (c0517b6.e | 1);
        c0517b6.b = str2;
        c0517b6.c = str3;
        c0517b6.d = AbstractC0115Ga.G();
        c0517b6.e = (byte) (c0517b6.e | 2);
        c5.i = c0517b6.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str4) && (num = (Integer) C0203Ld.f.get(str4.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jG2 = AbstractC0115Ga.g(c0203Ld.a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean zE2 = AbstractC0115Ga.E();
        int iV2 = AbstractC0115Ga.v();
        G5 g5 = new G5();
        g5.a = iIntValue;
        byte b2 = (byte) (g5.j | 1);
        g5.b = str5;
        g5.c = iAvailableProcessors2;
        g5.d = jG2;
        g5.e = blockCount2;
        g5.f = zE2;
        g5.g = iV2;
        g5.j = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
        g5.h = str6;
        g5.i = str7;
        c5.j = g5.a();
        c5.l = 3;
        c5.m = (byte) (c5.m | 4);
        c3415t5.j = c5.a();
        C3469u5 c3469u5A = c3415t5.a();
        C3121nk c3121nk = ((C0254Od) h2.b).b;
        AbstractC0169Jd abstractC0169Jd = c3469u5A.k;
        if (abstractC0169Jd == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str16 = ((D5) abstractC0169Jd).b;
        try {
            C0254Od.g.getClass();
            C0254Od.f(c3121nk.b(str16, "report"), C0237Nd.a.s(c3469u5A));
            File fileB = c3121nk.b(str16, "start-time");
            long j = ((D5) abstractC0169Jd).d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileB), C0254Od.e);
            try {
                outputStreamWriter.write("");
                fileB.setLastModified(j * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e) {
            String strW2 = AbstractC3264qG.w("Could not persist report for session ", str16);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strW2, e);
            }
        }
    }

    public final boolean d(C3308r6 c3308r6) throws Throwable {
        D3.j();
        C0288Qd c0288Qd = this.n;
        if (c0288Qd != null && c0288Qd.e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            b(true, c3308r6, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final String e() throws Resources.NotFoundException, IOException {
        InputStream resourceAsStream;
        Context context = this.a;
        int iA = AbstractC0115Ga.A(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iA == 0 ? null : context.getResources().getString(iA);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(s), 0);
        }
        ClassLoader classLoader = C2567dd.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                while (true) {
                    int i = resourceAsStream.read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                resourceAsStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f() throws Resources.NotFoundException {
        try {
            String strE = e();
            if (strE != null) {
                try {
                    this.d.a(strE);
                } catch (IllegalArgumentException e) {
                    Context context = this.a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e2);
        }
    }

    public final void g(Task task) {
        Task task2;
        Task taskW;
        C3121nk c3121nk = ((C0254Od) this.m.b).b;
        boolean zIsEmpty = C3121nk.k(((File) c3121nk.e).listFiles()).isEmpty();
        TaskCompletionSource taskCompletionSource = this.o;
        if (zIsEmpty && C3121nk.k(((File) c3121nk.f).listFiles()).isEmpty() && C3121nk.k(((File) c3121nk.g).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        C0360Uh c0360Uh = C0360Uh.f;
        c0360Uh.z("Crash reports are available to be sent.");
        C0102Fe c0102Fe = this.b;
        if (c0102Fe.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            taskW = Tasks.forResult(Boolean.TRUE);
        } else {
            c0360Uh.t("Automatic data collection is disabled.");
            c0360Uh.z("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (c0102Fe.c) {
                task2 = ((TaskCompletionSource) c0102Fe.d).getTask();
            }
            Task taskOnSuccessTask = task2.onSuccessTask(new C0360Uh(11));
            c0360Uh.t("Waiting for send/deleteUnsentReports to be called.");
            taskW = AbstractC3279qd.W(taskOnSuccessTask, this.p.getTask());
        }
        taskW.onSuccessTask((ExecutorC0305Rd) this.e.b, new R2(18, this, task));
    }
}
