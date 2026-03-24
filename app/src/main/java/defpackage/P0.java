package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class P0 extends O0 {
    public final /* synthetic */ int a;

    public /* synthetic */ P0(int i) {
        this.a = i;
    }

    @Override // defpackage.O0
    public final Intent a(AbstractActivityC2619eb abstractActivityC2619eb, Object obj) {
        Bundle bundleExtra;
        switch (this.a) {
            case 0:
                String[] strArr = (String[]) obj;
                AbstractC0500aq.m(abstractActivityC2619eb, "context");
                AbstractC0500aq.m(strArr, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                AbstractC0500aq.l(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            case 1:
                String str = (String) obj;
                AbstractC0500aq.m(abstractActivityC2619eb, "context");
                AbstractC0500aq.m(str, "input");
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                AbstractC0500aq.l(intentPutExtra2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra2;
            case 2:
                Intent intent = (Intent) obj;
                AbstractC0500aq.m(abstractActivityC2619eb, "context");
                AbstractC0500aq.m(intent, "input");
                return intent;
            default:
                C0317Rp c0317Rp = (C0317Rp) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = c0317Rp.b;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = c0317Rp.a;
                        AbstractC0500aq.m(intentSender, "intentSender");
                        c0317Rp = new C0317Rp(intentSender, null, c0317Rp.c, c0317Rp.d);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0317Rp);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent2);
                }
                return intent2;
        }
    }

    @Override // defpackage.O0
    public C0565c0 b(AbstractActivityC2619eb abstractActivityC2619eb, Object obj) {
        switch (this.a) {
            case 0:
                String[] strArr = (String[]) obj;
                AbstractC0500aq.m(abstractActivityC2619eb, "context");
                AbstractC0500aq.m(strArr, "input");
                if (strArr.length == 0) {
                    return new C0565c0(C0072Di.a);
                }
                for (String str : strArr) {
                    if (AbstractC0115Ga.l(abstractActivityC2619eb, str) != 0) {
                        return null;
                    }
                }
                int iU = Ht.U(strArr.length);
                if (iU < 16) {
                    iU = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new C0565c0(linkedHashMap);
            case 1:
                String str3 = (String) obj;
                AbstractC0500aq.m(abstractActivityC2619eb, "context");
                AbstractC0500aq.m(str3, "input");
                if (AbstractC0115Ga.l(abstractActivityC2619eb, str3) == 0) {
                    return new C0565c0(Boolean.TRUE);
                }
                return null;
            default:
                return super.b(abstractActivityC2619eb, obj);
        }
    }

    @Override // defpackage.O0
    public final Object c(int i, Intent intent) {
        switch (this.a) {
            case 0:
                C0072Di c0072Di = C0072Di.a;
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArrayExtra) {
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(AbstractC3491ua.Z(arrayList2, 10), AbstractC3491ua.Z(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new Jy(it.next(), it2.next()));
                        }
                        break;
                    }
                }
                break;
            case 1:
                if (intent == null || i != -1) {
                    break;
                } else {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    boolean z = false;
                    if (intArrayExtra2 != null) {
                        int length = intArrayExtra2.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                if (intArrayExtra2[i3] == 0) {
                                    z = true;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
        }
        return new M0(i, intent);
    }
}
