package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.d;
import androidx.fragment.app.z;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: vE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3532vE implements C8, Continuation {
    public static C3532vE e;
    public static final Object f = new Object();
    public static C3532vE m;
    public static C3532vE n;
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public C3532vE(int i) {
        switch (i) {
            case 2:
                this.b = null;
                this.c = new ArrayList();
                this.d = null;
                this.a = "";
                break;
            case 3:
            case 4:
            default:
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = new ArrayDeque();
                break;
            case 5:
                this.a = new Object();
                this.b = new Handler(Looper.getMainLooper(), new C2826iG(this));
                break;
            case 6:
                this.a = new Z3();
                this.b = new SparseArray();
                this.c = new C3240pt();
                this.d = new Z3();
                break;
        }
    }

    public static synchronized C3532vE b() {
        try {
            if (e == null) {
                e = new C3532vE(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public static C3532vE c(Context context) {
        C3532vE c3532vE;
        synchronized (f) {
            try {
                if (m == null) {
                    Context applicationContext = context.getApplicationContext();
                    C3532vE c3532vE2 = new C3532vE();
                    c3532vE2.b = new HashMap();
                    c3532vE2.c = new HashMap();
                    c3532vE2.d = new ArrayList();
                    c3532vE2.a = applicationContext;
                    new HandlerC3139o1(c3532vE2, applicationContext.getMainLooper());
                    m = c3532vE2;
                }
                c3532vE = m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3532vE;
    }

    public static C3532vE d() {
        if (n == null) {
            n = new C3532vE(5);
        }
        return n;
    }

    public boolean a(C2879jG c2879jG, int i) {
        C3145o7 c3145o7 = (C3145o7) c2879jG.a.get();
        if (c3145o7 == null) {
            return false;
        }
        ((Handler) this.b).removeCallbacksAndMessages(c2879jG);
        Handler handler = AbstractC3309r7.x;
        handler.sendMessage(handler.obtainMessage(1, i, 0, c3145o7.a));
        return true;
    }

    public AbstractC0478aM e(R9 r9, String str) {
        AbstractC0478aM abstractC0478aM;
        boolean zIsInstance;
        AbstractC0478aM abstractC0478aMB;
        AbstractC0500aq.m(str, "key");
        synchronized (((C0108Fk) this.d)) {
            try {
                C2667fM c2667fM = (C2667fM) this.a;
                c2667fM.getClass();
                abstractC0478aM = (AbstractC0478aM) c2667fM.a.get(str);
                Class clsZ = r9.a;
                AbstractC0500aq.m(clsZ, "jClass");
                Map map = R9.b;
                AbstractC0500aq.k(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
                Integer num = (Integer) map.get(clsZ);
                if (num != null) {
                    zIsInstance = AbstractC2883jK.C(num.intValue(), abstractC0478aM);
                } else {
                    if (clsZ.isPrimitive()) {
                        clsZ = AbstractC0115Ga.z(PB.a(clsZ));
                    }
                    zIsInstance = clsZ.isInstance(abstractC0478aM);
                }
                if (zIsInstance) {
                    InterfaceC2612eM interfaceC2612eM = (InterfaceC2612eM) this.b;
                    if (interfaceC2612eM instanceof ID) {
                        ID id = (ID) interfaceC2612eM;
                        AbstractC0500aq.j(abstractC0478aM);
                        id.getClass();
                        Jr jr = id.d;
                        if (jr != null) {
                            DD dd = id.e;
                            AbstractC0500aq.j(dd);
                            AbstractC0500aq.c(abstractC0478aM, dd, jr);
                        }
                    }
                    AbstractC0500aq.k(abstractC0478aM, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
                } else {
                    Pv pv = new Pv((AbstractC0424Yd) this.c);
                    pv.a.put(C2524cp.c, str);
                    InterfaceC2612eM interfaceC2612eM2 = (InterfaceC2612eM) this.b;
                    AbstractC0500aq.m(interfaceC2612eM2, "factory");
                    try {
                        try {
                            abstractC0478aMB = interfaceC2612eM2.k(r9, pv);
                        } catch (AbstractMethodError unused) {
                            abstractC0478aMB = interfaceC2612eM2.g(AbstractC0115Ga.y(r9), pv);
                        }
                    } catch (AbstractMethodError unused2) {
                        abstractC0478aMB = interfaceC2612eM2.b(AbstractC0115Ga.y(r9));
                    }
                    abstractC0478aM = abstractC0478aMB;
                    C2667fM c2667fM2 = (C2667fM) this.a;
                    c2667fM2.getClass();
                    AbstractC0500aq.m(abstractC0478aM, "viewModel");
                    AbstractC0478aM abstractC0478aM2 = (AbstractC0478aM) c2667fM2.a.put(str, abstractC0478aM);
                    if (abstractC0478aM2 != null) {
                        abstractC0478aM2.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC0478aM;
    }

    @Override // defpackage.C8
    public void f() {
        View view = (View) this.a;
        view.clearAnimation();
        ((ViewGroup) this.b).endViewTransition(view);
        ((d) this.c).a();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((z) this.d) + " has been cancelled.");
        }
    }

    public boolean g(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    public boolean h(Context context) {
        if (((Boolean) this.b) == null) {
            this.b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.b).booleanValue();
    }

    public boolean i(C3145o7 c3145o7) {
        C2879jG c2879jG = (C2879jG) this.c;
        return (c2879jG == null || c3145o7 == null || c2879jG.a.get() != c3145o7) ? false : true;
    }

    public void j(C3145o7 c3145o7) {
        synchronized (this.a) {
            try {
                if (i(c3145o7)) {
                    C2879jG c2879jG = (C2879jG) this.c;
                    if (!c2879jG.c) {
                        c2879jG.c = true;
                        ((Handler) this.b).removeCallbacksAndMessages(c2879jG);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(C3145o7 c3145o7) {
        synchronized (this.a) {
            try {
                if (i(c3145o7)) {
                    C2879jG c2879jG = (C2879jG) this.c;
                    if (c2879jG.c) {
                        c2879jG.c = false;
                        l(c2879jG);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(C2879jG c2879jG) {
        int i = c2879jG.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
        }
        Handler handler = (Handler) this.b;
        handler.removeCallbacksAndMessages(c2879jG);
        handler.sendMessageDelayed(Message.obtain(handler, 0, c2879jG), i);
    }

    public void m(Intent intent) {
        synchronized (((HashMap) this.b)) {
            try {
                intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(((Context) this.a).getContentResolver());
                intent.getData();
                String scheme = intent.getScheme();
                intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) ((HashMap) this.c).get(intent.getAction());
                if (arrayList != null) {
                    if (z) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    if (arrayList.size() > 0) {
                        Vs.u(arrayList.get(0));
                        if (!z) {
                            throw null;
                        }
                        throw null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n() {
        C2879jG c2879jG = (C2879jG) this.d;
        if (c2879jG != null) {
            this.c = c2879jG;
            this.d = null;
            C3145o7 c3145o7 = (C3145o7) c2879jG.a.get();
            if (c3145o7 == null) {
                this.c = null;
            } else {
                Handler handler = AbstractC3309r7.x;
                handler.sendMessage(handler.obtainMessage(0, c3145o7.a));
            }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (task.isSuccessful() || !zzaen.zzc((Exception) Preconditions.checkNotNull(task.getException()))) {
            return task;
        }
        boolean zIsLoggable = Log.isLoggable("RecaptchaCallWrapper", 4);
        String str = (String) this.a;
        if (zIsLoggable) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + str);
        }
        return ((H2) this.b).u(str, Boolean.TRUE, (RecaptchaAction) this.c).continueWithTask((Continuation) this.d);
    }

    public C3532vE(C2667fM c2667fM, InterfaceC2612eM interfaceC2612eM, AbstractC0424Yd abstractC0424Yd) {
        AbstractC0500aq.m(c2667fM, "store");
        AbstractC0500aq.m(abstractC0424Yd, "defaultExtras");
        this.a = c2667fM;
        this.b = interfaceC2612eM;
        this.c = abstractC0424Yd;
        this.d = new C0108Fk(27);
    }

    public C3532vE(Typeface typeface, C3022lv c3022lv) {
        int i;
        int i2;
        this.d = typeface;
        this.a = c3022lv;
        this.c = new C3077mv(UserVerificationMethods.USER_VERIFY_ALL);
        int iA = c3022lv.a(6);
        if (iA != 0) {
            int i3 = iA + c3022lv.a;
            i = ((ByteBuffer) c3022lv.d).getInt(((ByteBuffer) c3022lv.d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int iA2 = c3022lv.a(6);
        if (iA2 != 0) {
            int i4 = iA2 + c3022lv.a;
            i2 = ((ByteBuffer) c3022lv.d).getInt(((ByteBuffer) c3022lv.d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            C3268qK c3268qK = new C3268qK(this, i5);
            C2967kv c2967kvC = c3268qK.c();
            int iA3 = c2967kvC.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) c2967kvC.d).getInt(iA3 + c2967kvC.a) : 0, (char[]) this.b, i5 * 2);
            AbstractC0136He.e("invalid metadata codepoint length", c3268qK.b() > 0);
            ((C3077mv) this.c).a(c3268qK, 0, c3268qK.b() - 1);
        }
    }

    public /* synthetic */ C3532vE(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }
}
