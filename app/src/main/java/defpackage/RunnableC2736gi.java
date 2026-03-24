package defpackage;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ThreadPoolExecutor;
import rased.vpn.app.activities.IPHunterActivity;

/* renamed from: gi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2736gi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC2736gi(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.a) {
            case 0:
                C2845ii c2845ii = (C2845ii) this.b;
                AbstractC0136He abstractC0136He = (AbstractC0136He) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                c2845ii.getClass();
                try {
                    C0228Ml c0228MlO = AbstractC3279qd.o(c2845ii.a);
                    if (c0228MlO == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C0211Ll c0211Ll = (C0211Ll) ((InterfaceC2572di) c0228MlO.b);
                    synchronized (c0211Ll.d) {
                        c0211Ll.f = threadPoolExecutor;
                    }
                    ((InterfaceC2572di) c0228MlO.b).a(new C2791hi(abstractC0136He, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC0136He.B(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                Intent intent = (Intent) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                AbstractServiceC0293Qi abstractServiceC0293Qi = (AbstractServiceC0293Qi) this.b;
                abstractServiceC0293Qi.getClass();
                try {
                    abstractServiceC0293Qi.b(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            default:
                int i = 1;
                while (true) {
                    IPHunterActivity iPHunterActivity = (IPHunterActivity) this.b;
                    if (!iPHunterActivity.n) {
                        return;
                    }
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString("command", "airplane_mode_simul");
                        iPHunterActivity.showAssist(bundle);
                    } catch (Exception e) {
                        iPHunterActivity.b();
                        AbstractC3279qd.i0(iPHunterActivity.getApplicationContext(), "IP Hunter Error: " + e.getMessage());
                    }
                    while (true) {
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) iPHunterActivity.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                            String strA = iPHunterActivity.a();
                            String[] strArr = (String[]) this.c;
                            strArr[0] = strA;
                            for (String str : (String[]) this.d) {
                                String strTrim = str.trim();
                                if (!strTrim.isEmpty() && strArr[0].startsWith(strTrim)) {
                                    StringBuilder sb = new StringBuilder("Found IP: ");
                                    AbstractC3264qG.v(sb, strArr[0], " (Matches prefix: ", strTrim, ") after ");
                                    iPHunterActivity.runOnUiThread(new RunnableC0384Vo(iPHunterActivity, AbstractC3264qG.j(sb, i, " attempt(s)"), 1));
                                    AbstractC3279qd.i0(iPHunterActivity.getApplicationContext(), "Success! IP Found!");
                                    return;
                                }
                            }
                            iPHunterActivity.runOnUiThread(new RunnableC0384Vo(iPHunterActivity, Vs.l(i, "No match found. Retrying... (Attempt: ", ")"), 2));
                            try {
                                Thread.sleep(1000L);
                                i++;
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return;
                            }
                        } else {
                            try {
                                Thread.sleep(1000L);
                            } catch (InterruptedException unused2) {
                            }
                        }
                    }
                }
                break;
        }
    }
}
