package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: ke, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2950ke {
    public final InterfaceC0248No a;
    public final ComponentName b;

    public AbstractC2950ke(InterfaceC0248No interfaceC0248No, ComponentName componentName) {
        this.a = interfaceC0248No;
        this.b = componentName;
    }

    public static String a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList<String> arrayList = new ArrayList();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveInfoResolveActivity != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        }
        return null;
    }

    public final C3333re b(AbstractC2568de abstractC2568de) {
        BinderC2895je binderC2895je = new BinderC2895je(abstractC2568de);
        InterfaceC0248No interfaceC0248No = this.a;
        try {
            if (((C0214Lo) interfaceC0248No).b(binderC2895je)) {
                return new C3333re(interfaceC0248No, binderC2895je, this.b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }
}
