package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: hI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2773hI implements PN, InterfaceC2900jj {
    public static final String p = C3130nt.f("SystemFgDispatcher");
    public final C0589cO a;
    public final InterfaceC3482uI b;
    public final Object c = new Object();
    public String d;
    public final LinkedHashMap e;
    public final HashMap f;
    public final HashSet m;
    public final QN n;
    public InterfaceC2718gI o;

    public C2773hI(Context context) {
        C0589cO c0589cOS = C0589cO.S(context);
        this.a = c0589cOS;
        InterfaceC3482uI interfaceC3482uI = c0589cOS.z;
        this.b = interfaceC3482uI;
        this.d = null;
        this.e = new LinkedHashMap();
        this.m = new HashSet();
        this.f = new HashMap();
        this.n = new QN(context, interfaceC3482uI, this);
        c0589cOS.B.a(this);
    }

    public static Intent a(Context context, String str, C0415Xl c0415Xl) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c0415Xl.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c0415Xl.b);
        intent.putExtra("KEY_NOTIFICATION", c0415Xl.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, C0415Xl c0415Xl) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", c0415Xl.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c0415Xl.b);
        intent.putExtra("KEY_NOTIFICATION", c0415Xl.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // defpackage.InterfaceC2900jj
    public final void b(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            try {
                C2834iO c2834iO = (C2834iO) this.f.remove(str);
                if (c2834iO != null ? this.m.remove(c2834iO) : false) {
                    this.n.c(this.m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0415Xl c0415Xl = (C0415Xl) this.e.remove(str);
        if (str.equals(this.d) && this.e.size() > 0) {
            Iterator it = this.e.entrySet().iterator();
            do {
                entry = (Map.Entry) it.next();
            } while (it.hasNext());
            this.d = (String) entry.getKey();
            if (this.o != null) {
                C0415Xl c0415Xl2 = (C0415Xl) entry.getValue();
                InterfaceC2718gI interfaceC2718gI = this.o;
                SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC2718gI;
                systemForegroundService.b.post(new RunnableC2787he(systemForegroundService, c0415Xl2.a, c0415Xl2.c, c0415Xl2.b));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.o;
                systemForegroundService2.b.post(new RunnableC3256q8(c0415Xl2.a, 3, systemForegroundService2));
            }
        }
        InterfaceC2718gI interfaceC2718gI2 = this.o;
        if (c0415Xl == null || interfaceC2718gI2 == null) {
            return;
        }
        C3130nt c3130ntD = C3130nt.d();
        String str2 = p;
        int i = c0415Xl.a;
        int i2 = c0415Xl.b;
        StringBuilder sb = new StringBuilder("Removing Notification (id: ");
        sb.append(i);
        sb.append(", workSpecId: ");
        sb.append(str);
        sb.append(" ,notificationType: ");
        c3130ntD.a(str2, AbstractC3264qG.j(sb, i2, ")"), new Throwable[0]);
        SystemForegroundService systemForegroundService3 = (SystemForegroundService) interfaceC2718gI2;
        systemForegroundService3.b.post(new RunnableC3256q8(c0415Xl.a, 3, systemForegroundService3));
    }

    @Override // defpackage.PN
    public final void d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C3130nt.d().a(p, AbstractC3264qG.w("Constraints unmet for WorkSpec ", str), new Throwable[0]);
            C0589cO c0589cO = this.a;
            ((D3) c0589cO.z).t(new RunnableC2880jH(c0589cO, str, true));
        }
    }

    public final void e(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C3130nt c3130ntD = C3130nt.d();
        StringBuilder sb = new StringBuilder("Notifying with (id: ");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType: ");
        c3130ntD.a(p, AbstractC3264qG.j(sb, intExtra2, ")"), new Throwable[0]);
        if (notification == null || this.o == null) {
            return;
        }
        C0415Xl c0415Xl = new C0415Xl(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.e;
        linkedHashMap.put(stringExtra, c0415Xl);
        if (TextUtils.isEmpty(this.d)) {
            this.d = stringExtra;
            SystemForegroundService systemForegroundService = (SystemForegroundService) this.o;
            systemForegroundService.b.post(new RunnableC2787he(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.o;
        systemForegroundService2.b.post(new RunnableC2921k3(systemForegroundService2, intExtra, notification, 6));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((C0415Xl) ((Map.Entry) it.next()).getValue()).b;
        }
        C0415Xl c0415Xl2 = (C0415Xl) linkedHashMap.get(this.d);
        if (c0415Xl2 != null) {
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.o;
            systemForegroundService3.b.post(new RunnableC2787he(systemForegroundService3, c0415Xl2.a, c0415Xl2.c, i));
        }
    }

    public final void g() {
        this.o = null;
        synchronized (this.c) {
            this.n.d();
        }
        this.a.B.f(this);
    }

    @Override // defpackage.PN
    public final void f(List list) {
    }
}
