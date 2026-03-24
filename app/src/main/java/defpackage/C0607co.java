package defpackage;

import android.content.ClipData;
import android.content.ContentProviderClient;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.l;
import androidx.fragment.app.t;
import androidx.fragment.app.x;
import androidx.fragment.app.z;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.internal.api.AdComponentViewParentApi;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.mxtunnel.pro.R;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.service.SocksDNSService;
import rased.vpn.app.service.vpn.TunnelManagerHelper;
import rased.vpn.app.service.vpn.logger.SkStatus;

/* renamed from: co, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0607co implements Ou, AdComponentViewParentApi, Bu, InterfaceC2948kc, InterfaceC2918k0, MediaViewListener, InterfaceC0143Hl, N0, OnSuccessListener, Uz, GL, C8, D0, InterfaceC3155oH {
    public static volatile C0607co b;
    public static final C0196Kn c = new C0196Kn(1);
    public Object a;

    public C0607co(int i) {
        switch (i) {
            case 1:
                C2928kA c2928kA = C2928kA.c;
                Object obj = c;
                try {
                    obj = (Vu) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                }
                Vu[] vuArr = {C0196Kn.b, obj};
                C3618wt c3618wt = new C3618wt();
                c3618wt.a = vuArr;
                Charset charset = AbstractC0368Up.a;
                this.a = c3618wt;
                break;
            case 4:
                this.a = new AtomicInteger(0);
                break;
            case 9:
                this.a = new WG(C3592wK.b);
                break;
            default:
                this.a = new HashSet();
                break;
        }
    }

    public static boolean G(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String N(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public String A(String str) {
        return E(str.concat("_loc_key"));
    }

    public Long B() {
        String strE = E("gcm.n.event_time");
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strE));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + N("gcm.n.event_time") + "(" + strE + ") into a long");
            return null;
        }
    }

    public String C(String str, Resources resources, String str2) {
        String strE = E(str2);
        if (!TextUtils.isEmpty(strE)) {
            return strE;
        }
        String strA = A(str2);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        int identifier = resources.getIdentifier(strA, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", N(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrZ = z(str2);
        if (objArrZ == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrZ);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + N(str2) + ": " + Arrays.toString(objArrZ) + " Default value will be used.", e);
            return null;
        }
    }

    public Set D() {
        Set setUnmodifiableSet;
        synchronized (((HashSet) this.a)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) this.a);
        }
        return setUnmodifiableSet;
    }

    public String E(String str) {
        Bundle bundle = (Bundle) this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public long[] F() {
        JSONArray jSONArrayX = x("gcm.n.vibrate_timings");
        if (jSONArrayX == null) {
            return null;
        }
        try {
            if (jSONArrayX.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayX.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayX.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayX + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public void H(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iE = recyclerView.e.E();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iE; i6++) {
            View viewD = recyclerView.e.D(i6);
            JB jbI = RecyclerView.I(viewD);
            if (jbI != null && !jbI.q() && (i4 = jbI.c) >= i && i4 < i5) {
                jbI.b(2);
                jbI.a(obj);
                ((C3583wB) viewD.getLayoutParams()).c = true;
            }
        }
        BB bb = recyclerView.b;
        ArrayList arrayList = bb.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            JB jb = (JB) arrayList.get(size);
            if (jb != null && (i3 = jb.c) >= i && i3 < i5) {
                jb.b(2);
                bb.f(size);
            }
        }
        recyclerView.n0 = true;
    }

    public void I(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iE = recyclerView.e.E();
        for (int i3 = 0; i3 < iE; i3++) {
            JB jbI = RecyclerView.I(recyclerView.e.D(i3));
            if (jbI != null && !jbI.q() && jbI.c >= i) {
                jbI.n(i2, false);
                recyclerView.j0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.b.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            JB jb = (JB) arrayList.get(i4);
            if (jb != null && jb.c >= i) {
                jb.n(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.m0 = true;
    }

    public void J(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iE = recyclerView.e.E();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iE; i11++) {
            JB jbI = RecyclerView.I(recyclerView.e.D(i11));
            if (jbI != null && (i9 = jbI.c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    jbI.n(i2 - i, false);
                } else {
                    jbI.n(i5, false);
                }
                recyclerView.j0.f = true;
            }
        }
        BB bb = recyclerView.b;
        bb.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList arrayList = bb.c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            JB jb = (JB) arrayList.get(i12);
            if (jb != null && (i8 = jb.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    jb.n(i2 - i, false);
                } else {
                    jb.n(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.m0 = true;
    }

    public void K(C3308r6 c3308r6, Thread thread, Throwable th) {
        C2567dd c2567dd = (C2567dd) this.a;
        synchronized (c2567dd) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            AbstractC0069Df.I();
            try {
                AbstractC2721gL.a(((ExecutorC0305Rd) c2567dd.e.b).b(new CallableC0542bd(c2567dd, System.currentTimeMillis(), th, thread, c3308r6)));
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    public Bundle L() {
        Bundle bundle = (Bundle) this.a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void M(defpackage.UG r7) {
        /*
            r6 = this;
            java.lang.String r0 = "newState"
            defpackage.AbstractC0500aq.m(r7, r0)
        L5:
            java.lang.Object r0 = r6.a
            WG r0 = (defpackage.WG) r0
            r0.getClass()
            ri r1 = defpackage.AbstractC0500aq.e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.WG.e
            java.lang.Object r2 = r2.get(r0)
            if (r2 != r1) goto L17
            r2 = 0
        L17:
            r3 = r2
            UG r3 = (defpackage.UG) r3
            boolean r4 = r3 instanceof defpackage.C2874jB
            if (r4 == 0) goto L20
            r4 = 1
            goto L26
        L20:
            wK r4 = defpackage.C3592wK.b
            boolean r4 = defpackage.AbstractC0500aq.b(r3, r4)
        L26:
            if (r4 == 0) goto L29
            goto L33
        L29:
            boolean r4 = r3 instanceof defpackage.C0068De
            if (r4 == 0) goto L35
            int r4 = r3.a
            int r5 = r7.a
            if (r5 <= r4) goto L39
        L33:
            r3 = r7
            goto L39
        L35:
            boolean r4 = r3 instanceof defpackage.C3286qk
            if (r4 == 0) goto L47
        L39:
            if (r2 != 0) goto L3c
            r2 = r1
        L3c:
            if (r3 != 0) goto L3f
            goto L40
        L3f:
            r1 = r3
        L40:
            boolean r0 = r0.e(r2, r1)
            if (r0 == 0) goto L5
            return
        L47:
            Na r7 = new Na
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0607co.M(UG):void");
    }

    @Override // defpackage.Ou
    public void a(MenuC3511uu menuC3511uu, boolean z) {
        if (menuC3511uu instanceof FH) {
            ((FH) menuC3511uu).z.k().c(false);
        }
        Ou ou = ((A0) this.a).e;
        if (ou != null) {
            ou.a(menuC3511uu, z);
        }
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void addView(View view) {
        super/*android.widget.FrameLayout*/.addView(view);
    }

    @Override // defpackage.InterfaceC2918k0
    public boolean b(View view) {
        DrawerLayout drawerLayout = (DrawerLayout) this.a;
        drawerLayout.getClass();
        if (!DrawerLayout.k(view) || drawerLayout.g(view) == 2) {
            return false;
        }
        drawerLayout.b(view);
        return true;
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void bringChildToFront(View view) {
        super/*android.widget.FrameLayout*/.bringChildToFront(view);
    }

    @Override // defpackage.InterfaceC2948kc
    public C3113nc build() {
        return new C3113nc(new C2524cp(((ContentInfo.Builder) this.a).build()));
    }

    @Override // defpackage.N0
    public void c(Object obj) {
        M0 m0 = (M0) obj;
        t tVar = (t) this.a;
        C3503um c3503um = (C3503um) tVar.C.pollFirst();
        if (c3503um == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        x xVar = tVar.c;
        String str = c3503um.a;
        l lVarC = xVar.c(str);
        if (lVarC != null) {
            lVarC.onActivityResult(c3503um.b, m0.a, m0.b);
        } else {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    @Override // defpackage.InterfaceC0143Hl
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.a;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // defpackage.Bu
    public void d(MenuC3511uu menuC3511uu, MenuItem menuItem) {
        ((M8) this.a).m.removeCallbacksAndMessages(menuC3511uu);
    }

    @Override // defpackage.GL
    public int e(View view) {
        C3583wB c3583wB = (C3583wB) view.getLayoutParams();
        ((AbstractC3529vB) this.a).getClass();
        return (view.getTop() - ((C3583wB) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) c3583wB).topMargin;
    }

    @Override // defpackage.C8
    public void f() {
        ((z) this.a).a();
    }

    @Override // defpackage.GL
    public int g() {
        return ((AbstractC3529vB) this.a).G();
    }

    @Override // defpackage.InterfaceC2948kc
    public void h(Uri uri) {
        ((ContentInfo.Builder) this.a).setLinkUri(uri);
    }

    @Override // defpackage.Uz
    public void i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.Uz
    public void j(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.a).setResultCode(i);
    }

    @Override // defpackage.InterfaceC2948kc
    public void k(int i) {
        ((ContentInfo.Builder) this.a).setFlags(i);
    }

    @Override // defpackage.InterfaceC0143Hl
    public Cursor l(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.a;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override // defpackage.GL
    public int m() {
        AbstractC3529vB abstractC3529vB = (AbstractC3529vB) this.a;
        return abstractC3529vB.o - abstractC3529vB.D();
    }

    @Override // defpackage.Bu
    public void n(MenuC3511uu menuC3511uu, Cu cu) {
        M8 m8 = (M8) this.a;
        m8.m.removeCallbacksAndMessages(null);
        ArrayList arrayList = m8.o;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC3511uu == ((L8) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        m8.m.postAtTime(new K8(this, i2 < arrayList.size() ? (L8) arrayList.get(i2) : null, cu, menuC3511uu, 0), menuC3511uu, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.GL
    public View o(int i) {
        return ((AbstractC3529vB) this.a).u(i);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void onAttachedToWindow() {
        super/*android.widget.FrameLayout*/.onAttachedToWindow();
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onComplete(MediaView mediaView) {
        MediationNativeAdCallback mediationNativeAdCallback = ((C0175Jj) this.a).c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onVideoComplete();
        }
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void onDetachedFromWindow() {
        super/*android.widget.FrameLayout*/.onDetachedFromWindow();
    }

    @Override // defpackage.InterfaceC3155oH
    public void onLine(String str) {
        if (str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-110431551321018L))) {
            C3430tK.v.addStatus(Deobfuscator$MHRTUNNELVPN$app.getString(-110474500993978L));
            C3430tK.v.startSocksOpenVPN();
            Thread thread = SocksDNSService.r;
            Thread thread2 = new Thread(SocksDNSService.s);
            SocksDNSService.r = thread2;
            thread2.start();
            SkStatus.logInfo(R.string.tunnel_start, new Object[0]);
        }
        if (str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-110517450666938L))) {
            C3430tK.v.addStatus(Deobfuscator$MHRTUNNELVPN$app.getString(-110568990274490L));
        }
        boolean zContains = str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-110633414783930L));
        C3430tK c3430tK = (C3430tK) this.a;
        if (zContains) {
            C3430tK.v.addStatus(Deobfuscator$MHRTUNNELVPN$app.getString(-110680659424186L));
            InterfaceC3376sK interfaceC3376sK = C3430tK.v;
            if (interfaceC3376sK != null) {
                interfaceC3376sK.stopSocksOpenVPN();
            } else {
                AbstractC3279qd.j0(c3430tK.a, Deobfuscator$MHRTUNNELVPN$app.getString(-110783738639290L));
            }
            AbstractC3279qd.j0(c3430tK.a, Deobfuscator$MHRTUNNELVPN$app.getString(-110912587658170L));
            TunnelManagerHelper.stopSocksHttp(c3430tK.a);
        }
        if (str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-111062911513530L))) {
            InterfaceC3376sK interfaceC3376sK2 = C3430tK.v;
            if (interfaceC3376sK2 != null) {
                interfaceC3376sK2.stopSocksOpenVPN();
            } else {
                AbstractC3279qd.j0(c3430tK.a, Deobfuscator$MHRTUNNELVPN$app.getString(-111097271251898L));
            }
            TunnelManagerHelper.stopSocksHttp(c3430tK.a);
        }
        if (str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-111226120270778L))) {
            InterfaceC3376sK interfaceC3376sK3 = C3430tK.v;
            if (interfaceC3376sK3 != null) {
                interfaceC3376sK3.stopSocksOpenVPN();
            } else {
                AbstractC3279qd.j0(c3430tK.a, Deobfuscator$MHRTUNNELVPN$app.getString(-111294839747514L));
            }
            TunnelManagerHelper.stopSocksHttp(c3430tK.a);
        }
        if (str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-111423688766394L))) {
            SkStatus.updateStateString(Deobfuscator$MHRTUNNELVPN$app.getString(-111479523341242L), Deobfuscator$MHRTUNNELVPN$app.getString(-111535357916090L));
            C3430tK.v.addStatus(Deobfuscator$MHRTUNNELVPN$app.getString(-111604077392826L));
            new Thread(new H0(this, 17)).start();
        }
        str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-111672796869562L));
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void onMeasure(int i, int i2) {
        super/*android.widget.FrameLayout*/.onMeasure(i, i2);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) obj;
        C3236pp c3236pp = (C3236pp) this.a;
        c3236pp.q.getClass();
        if (appUpdateInfo.installStatus() == 11) {
            C3236pp.i(c3236pp);
            C3236pp.d(c3236pp);
            Log.d("InAppUpdateManager", "checkNewAppVersionState(): resuming flexible update. Code: " + appUpdateInfo.updateAvailability());
        }
        if (appUpdateInfo.updateAvailability() == 3) {
            C3236pp.j(c3236pp, appUpdateInfo);
            Log.d("InAppUpdateManager", "checkNewAppVersionState(): resuming immediate update. Code: " + appUpdateInfo.updateAvailability());
        }
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void onVisibilityChanged(View view, int i) {
        super/*android.widget.FrameLayout*/.onVisibilityChanged(view, i);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void onWindowFocusChanged(boolean z) {
        super/*android.widget.FrameLayout*/.onWindowFocusChanged(z);
    }

    @Override // defpackage.GL
    public int p(View view) {
        C3583wB c3583wB = (C3583wB) view.getLayoutParams();
        ((AbstractC3529vB) this.a).getClass();
        return view.getBottom() + ((C3583wB) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) c3583wB).bottomMargin;
    }

    @Override // defpackage.Ou
    public boolean q(MenuC3511uu menuC3511uu) {
        A0 a0 = (A0) this.a;
        if (menuC3511uu == a0.c) {
            return false;
        }
        ((FH) menuC3511uu).A.getClass();
        a0.getClass();
        Ou ou = a0.e;
        if (ou != null) {
            return ou.q(menuC3511uu);
        }
        return false;
    }

    public void r(C2756h1 c2756h1) {
        int i = c2756h1.a;
        RecyclerView recyclerView = (RecyclerView) this.a;
        if (i == 1) {
            recyclerView.r.X(c2756h1.b, c2756h1.d);
            return;
        }
        if (i == 2) {
            recyclerView.r.a0(c2756h1.b, c2756h1.d);
        } else if (i == 4) {
            recyclerView.r.b0(c2756h1.b, c2756h1.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.r.Z(c2756h1.b, c2756h1.d);
        }
    }

    public String s(Object obj) throws IOException {
        StringWriter stringWriter = new StringWriter();
        try {
            C0386Vq c0386Vq = (C0386Vq) this.a;
            C2526cr c2526cr = new C2526cr(stringWriter, c0386Vq.a, c0386Vq.b, c0386Vq.c, c0386Vq.d);
            c2526cr.h(obj);
            c2526cr.j();
            c2526cr.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // defpackage.InterfaceC2948kc
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.a).setExtras(bundle);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super/*android.widget.FrameLayout*/.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void setMeasuredDimension(int i, int i2) {
        super/*android.widget.FrameLayout*/.setMeasuredDimension(i, i2);
    }

    public JB t(int i) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iE = recyclerView.e.E();
        int i2 = 0;
        JB jb = null;
        while (true) {
            if (i2 >= iE) {
                break;
            }
            JB jbI = RecyclerView.I(recyclerView.e.D(i2));
            if (jbI != null && !jbI.j() && jbI.c == i) {
                if (!recyclerView.e.J(jbI.a)) {
                    jb = jbI;
                    break;
                }
                jb = jbI;
            }
            i2++;
        }
        if (jb == null || recyclerView.e.J(jb.a)) {
            return null;
        }
        return jb;
    }

    public boolean u(String str) {
        String strE = E(str);
        return "1".equals(strE) || Boolean.parseBoolean(strE);
    }

    public UG v() {
        WG wg = (WG) this.a;
        wg.getClass();
        C3337ri c3337ri = AbstractC0500aq.e;
        Object obj = WG.e.get(wg);
        if (obj == c3337ri) {
            obj = null;
        }
        return (UG) obj;
    }

    public Integer w(String str) {
        String strE = E(str);
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strE));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + N(str) + "(" + strE + ") into an int");
            return null;
        }
    }

    public JSONArray x(String str) {
        String strE = E(str);
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        try {
            return new JSONArray(strE);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + N(str) + ": " + strE + ", falling back to default");
            return null;
        }
    }

    public int[] y() {
        String str;
        JSONArray jSONArrayX = x("gcm.n.light_settings");
        if (jSONArrayX == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayX.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayX.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayX.optInt(1);
            iArr[2] = jSONArrayX.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            str = "LightSettings is invalid: " + jSONArrayX + ". " + e.getMessage() + ". Skipping setting LightSettings";
            Log.w("NotificationParams", str);
            return null;
        } catch (JSONException unused) {
            str = "LightSettings is invalid: " + jSONArrayX + ". Skipping setting LightSettings";
            Log.w("NotificationParams", str);
            return null;
        }
    }

    public Object[] z(String str) {
        JSONArray jSONArrayX = x(str.concat("_loc_args"));
        if (jSONArrayX == null) {
            return null;
        }
        int length = jSONArrayX.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayX.optString(i);
        }
        return strArr;
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, int i) {
        super/*android.widget.FrameLayout*/.addView(view, i);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, int i, int i2) {
        super/*android.widget.FrameLayout*/.addView(view, i, i2);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super/*android.widget.FrameLayout*/.addView(view, i, layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super/*android.widget.FrameLayout*/.addView(view, layoutParams);
    }

    public C0607co(ClipData clipData, int i) {
        this.a = AbstractC2817i7.j(clipData, i);
    }

    public C0607co(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.a = new Bundle(bundle);
    }

    public /* synthetic */ C0607co(Object obj) {
        this.a = obj;
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onEnterFullscreen(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onExitFullscreen(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onFullscreenBackground(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onFullscreenForeground(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onPause(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onPlay(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onVolumeChange(MediaView mediaView, float f) {
    }
}
