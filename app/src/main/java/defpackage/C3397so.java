package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.cardview.widget.CardView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: so, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3397so implements InterfaceC0151Ic, InterfaceC2892jb, InterfaceC3478uE, InterfaceC0464a8, InterfaceC0209Lj, InterfaceC0192Kj, InterfaceC2612eM, InterfaceC0406Xc, InterfaceC0048Cb, JG, InterfaceC2605eF, InterfaceC3627x1 {
    public static final /* synthetic */ C3397so b = new C3397so(1);
    public static final C3397so c = new C3397so(2);
    public static final C3397so d = new C3397so(4);
    public static final C3397so e = new C3397so(5);
    public static final C3397so f = new C3397so(6);
    public static final C3397so m = new C3397so(7);
    public static C3397so n;
    public final /* synthetic */ int a;

    public /* synthetic */ C3397so(int i) {
        this.a = i;
    }

    public static C3658xf e(InterfaceC3478uE interfaceC3478uE, C2827iH c2827iH, C3385sc c3385sc, InterfaceC0606cn interfaceC0606cn) {
        C0055Ci c0055Ci = C0055Ci.a;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new C3658xf(new C2847ik(interfaceC3478uE, new C3388sf(c3385sc, 1), interfaceC0606cn), AbstractC0115Ga.I(new C0187Ke(c0055Ci, null)), c2827iH, c3385sc);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return AbstractC2883jK.p(interfaceC3478uE, c2827iH, c0055Ci, c3385sc, interfaceC0606cn);
        }
    }

    public static float i(Zr zr, C0502as c0502as) {
        float yChartMax = zr.getYChartMax();
        float yChartMin = zr.getYChartMin();
        Yr lineData = zr.getLineData();
        if (c0502as.n > 0.0f && c0502as.o < 0.0f) {
            return 0.0f;
        }
        if (lineData.a > 0.0f) {
            yChartMax = 0.0f;
        }
        if (lineData.b < 0.0f) {
            yChartMin = 0.0f;
        }
        return c0502as.o >= 0.0f ? yChartMin : yChartMax;
    }

    public static void j(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && AbstractC0500aq.b(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            throw new IOException("Failed to delete conflicting file: " + parentFile);
        }
        if (parentFile.isDirectory()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                return;
            } catch (Exception e2) {
                throw new IOException("Failed to create directory: " + parentFile, e2);
            }
        }
        if (parentFile.mkdirs() || parentFile.isDirectory()) {
            return;
        }
        throw new IOException("Failed to create directory: " + parentFile);
    }

    public static SharedPreferences o(Context context, String str) {
        return context.getSharedPreferences("com.google.firebase.auth.internal.browserSignInSessionStore." + str, 0);
    }

    public static void p(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            r3 = r1
            r4 = r2
        L5:
            if (r3 >= r8) goto L23
            if (r4 != r2) goto L23
            char r4 = r7.charAt(r3)
            byte r4 = java.lang.Character.getDirectionality(r4)
            H7 r5 = defpackage.FI.a
            if (r4 == 0) goto L20
            if (r4 == r0) goto L1e
            if (r4 == r2) goto L1e
            switch(r4) {
                case 14: goto L20;
                case 15: goto L20;
                case 16: goto L1e;
                case 17: goto L1e;
                default: goto L1c;
            }
        L1c:
            r4 = r2
            goto L21
        L1e:
            r4 = r1
            goto L21
        L20:
            r4 = r0
        L21:
            int r3 = r3 + r0
            goto L5
        L23:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3397so.a(java.lang.CharSequence, int):int");
    }

    @Override // defpackage.InterfaceC2612eM
    public AbstractC0478aM b(Class cls) {
        return new Qs();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // defpackage.JG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.StackTraceElement[] c(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 1
            r3 = 0
            r6 = r2
            r4 = r3
            r5 = r4
        Ld:
            int r7 = r15.length
            if (r4 >= r7) goto L61
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L4f
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L26
            goto L4f
        L26:
            r11 = r3
        L27:
            if (r11 >= r10) goto L3b
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L38
            goto L4f
        L38:
            int r11 = r11 + 1
            goto L27
        L3b:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 10
            if (r6 >= r9) goto L4b
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L4b:
            int r8 = r8 + (-1)
            int r8 = r8 + r4
            goto L57
        L4f:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r6 = r2
            r8 = r4
        L57:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto Ld
        L61:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r3, r0, r3, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L6a
            return r0
        L6a:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3397so.c(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    @Override // defpackage.InterfaceC2892jb
    public Object d(C2811i1 c2811i1) {
        Object objG = c2811i1.g(new KA(Tr.class, Executor.class));
        AbstractC0500aq.l(objG, "get(...)");
        return new C3010lj((Executor) objG);
    }

    @Override // defpackage.InterfaceC0464a8
    public byte[] f(int i, byte[] bArr, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // defpackage.InterfaceC2612eM
    public AbstractC0478aM g(Class cls, Pv pv) {
        return b(cls);
    }

    @Override // defpackage.InterfaceC3203pA
    public Object get() {
        switch (this.a) {
            case 14:
                return "com.google.android.datatransport.events";
            case 15:
                return new ExecutorC3531vD(Executors.newSingleThreadExecutor(), 0);
            case 16:
                return YI.a;
            default:
                return new VK(0);
        }
    }

    @Override // defpackage.InterfaceC3478uE
    public Object getDefaultValue() {
        return new Rv(true);
    }

    @Override // defpackage.InterfaceC2612eM
    public AbstractC0478aM k(R9 r9, Pv pv) {
        return g(AbstractC0115Ga.y(r9), pv);
    }

    public void l(R2 r2, float f2) {
        VC vc = (VC) ((Drawable) r2.b);
        CardView cardView = (CardView) r2.c;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f2 != vc.e || vc.f != useCompatPadding || vc.g != preventCornerOverlap) {
            vc.e = f2;
            vc.f = useCompatPadding;
            vc.g = preventCornerOverlap;
            vc.b(null);
            vc.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            r2.E(0, 0, 0, 0);
            return;
        }
        VC vc2 = (VC) ((Drawable) r2.b);
        float f3 = vc2.e;
        float f4 = vc2.a;
        int iCeil = (int) Math.ceil(WC.a(f3, f4, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(WC.b(f3, f4, cardView.getPreventCornerOverlap()));
        r2.E(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // defpackage.InterfaceC2605eF
    public XE m(C0360Uh c0360Uh, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        C3130nt c3130nt = jSONObject.has("session") ? new C3130nt(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new C3130nt(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        WE we = new WE(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            c0360Uh.getClass();
            jCurrentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new XE(jCurrentTimeMillis, c3130nt, we, dOptDouble, dOptDouble2, iOptInt2);
    }

    @Override // defpackage.InterfaceC3627x1
    public void n(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // defpackage.InterfaceC3478uE
    public Object readFrom(InputStream inputStream, InterfaceC3493uc interfaceC3493uc) throws C0389Wc {
        C3081mz c3081mz;
        Object objValueOf;
        try {
            C3408sz c3408szR = C3408sz.r((FileInputStream) inputStream);
            Rv rv = new Rv(false);
            AbstractC3136nz[] abstractC3136nzArr = (AbstractC3136nz[]) Arrays.copyOf(new AbstractC3136nz[0], 0);
            AbstractC0500aq.m(abstractC3136nzArr, "pairs");
            rv.b();
            if (abstractC3136nzArr.length > 0) {
                AbstractC3136nz abstractC3136nz = abstractC3136nzArr[0];
                throw null;
            }
            Map mapP = c3408szR.p();
            AbstractC0500aq.l(mapP, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapP.entrySet()) {
                String str = (String) entry.getKey();
                C3624wz c3624wz = (C3624wz) entry.getValue();
                AbstractC0500aq.l(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                AbstractC0500aq.l(c3624wz, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                int iF = c3624wz.F();
                switch (iF == 0 ? -1 : AbstractC3191oz.a[AbstractC3264qG.A(iF)]) {
                    case -1:
                        throw new C0389Wc("Value case is null.", null);
                    case 0:
                    default:
                        throw new C0234Na();
                    case 1:
                        c3081mz = new C3081mz(str);
                        objValueOf = Boolean.valueOf(c3624wz.w());
                        break;
                    case 2:
                        c3081mz = new C3081mz(str);
                        objValueOf = Float.valueOf(c3624wz.A());
                        break;
                    case 3:
                        c3081mz = new C3081mz(str);
                        objValueOf = Double.valueOf(c3624wz.z());
                        break;
                    case 4:
                        c3081mz = new C3081mz(str);
                        objValueOf = Integer.valueOf(c3624wz.B());
                        break;
                    case 5:
                        c3081mz = new C3081mz(str);
                        objValueOf = Long.valueOf(c3624wz.C());
                        break;
                    case 6:
                        c3081mz = new C3081mz(str);
                        objValueOf = c3624wz.D();
                        AbstractC0500aq.l(objValueOf, "value.string");
                        break;
                    case 7:
                        C3081mz c3081mzD0 = AbstractC0069Df.d0(str);
                        InterfaceC0351Tp interfaceC0351TpQ = c3624wz.E().q();
                        AbstractC0500aq.l(interfaceC0351TpQ, "value.stringSet.stringsList");
                        rv.e(c3081mzD0, AbstractC3383sa.l0(interfaceC0351TpQ));
                        continue;
                    case 8:
                        c3081mz = new C3081mz(str);
                        C0519b8 c0519b8X = c3624wz.x();
                        int size = c0519b8X.size();
                        if (size == 0) {
                            objValueOf = AbstractC0368Up.b;
                        } else {
                            byte[] bArr = new byte[size];
                            c0519b8X.d(size, bArr);
                            objValueOf = bArr;
                        }
                        AbstractC0500aq.l(objValueOf, "value.bytes.toByteArray()");
                        break;
                    case 9:
                        throw new C0389Wc("Value not set.", null);
                }
                rv.e(c3081mz, objValueOf);
            }
            return new Rv(Ht.b0(rv.a()), true);
        } catch (C2744gq e2) {
            throw new C0389Wc("Unable to parse preferences proto.", e2);
        }
    }

    @Override // defpackage.InterfaceC3478uE
    public Object writeTo(Object obj, OutputStream outputStream, InterfaceC3493uc interfaceC3493uc) {
        C3570vz c3570vzG;
        Map mapA = ((Rv) obj).a();
        C3301qz c3301qzQ = C3408sz.q();
        for (Map.Entry entry : mapA.entrySet()) {
            C3081mz c3081mz = (C3081mz) entry.getKey();
            Object value = entry.getValue();
            String str = c3081mz.a;
            if (value instanceof Boolean) {
                c3570vzG = C3624wz.G();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                c3570vzG.c();
                C3624wz.t((C3624wz) c3570vzG.b, zBooleanValue);
            } else if (value instanceof Float) {
                c3570vzG = C3624wz.G();
                float fFloatValue = ((Number) value).floatValue();
                c3570vzG.c();
                C3624wz.u((C3624wz) c3570vzG.b, fFloatValue);
            } else if (value instanceof Double) {
                c3570vzG = C3624wz.G();
                double dDoubleValue = ((Number) value).doubleValue();
                c3570vzG.c();
                C3624wz.r((C3624wz) c3570vzG.b, dDoubleValue);
            } else if (value instanceof Integer) {
                c3570vzG = C3624wz.G();
                int iIntValue = ((Number) value).intValue();
                c3570vzG.c();
                C3624wz.v((C3624wz) c3570vzG.b, iIntValue);
            } else if (value instanceof Long) {
                c3570vzG = C3624wz.G();
                long jLongValue = ((Number) value).longValue();
                c3570vzG.c();
                C3624wz.o((C3624wz) c3570vzG.b, jLongValue);
            } else if (value instanceof String) {
                c3570vzG = C3624wz.G();
                c3570vzG.c();
                C3624wz.p((C3624wz) c3570vzG.b, (String) value);
            } else if (value instanceof Set) {
                c3570vzG = C3624wz.G();
                C3462tz c3462tzR = C3516uz.r();
                AbstractC0500aq.k(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                c3462tzR.c();
                C3516uz.o((C3516uz) c3462tzR.b, (Set) value);
                c3570vzG.c();
                C3624wz.q((C3624wz) c3570vzG.b, (C3516uz) c3462tzR.a());
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                c3570vzG = C3624wz.G();
                byte[] bArr = (byte[]) value;
                C0519b8 c0519b8 = C0519b8.c;
                C0519b8 c0519b8C = C0519b8.c(0, bArr, bArr.length);
                c3570vzG.c();
                C3624wz.s((C3624wz) c3570vzG.b, c0519b8C);
            }
            C3624wz c3624wz = (C3624wz) c3570vzG.a();
            c3301qzQ.getClass();
            str.getClass();
            c3301qzQ.c();
            C3408sz.o((C3408sz) c3301qzQ.b).put(str, c3624wz);
        }
        C3408sz c3408sz = (C3408sz) c3301qzQ.a();
        int iB = c3408sz.b(null);
        Logger logger = C3221pa.o;
        if (iB > 4096) {
            iB = 4096;
        }
        C3221pa c3221pa = new C3221pa((C3646xK) outputStream, iB);
        c3408sz.c(c3221pa);
        if (c3221pa.m > 0) {
            c3221pa.B0();
        }
        return DK.a;
    }

    @Override // defpackage.InterfaceC0406Xc
    public Object h(C0389Wc c0389Wc) throws C0389Wc {
        throw c0389Wc;
    }

    @Override // defpackage.InterfaceC0048Cb
    public void onConsentInfoUpdateFailure(C0551bm c0551bm) {
    }
}
