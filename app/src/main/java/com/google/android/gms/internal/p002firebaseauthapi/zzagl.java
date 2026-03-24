package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.AbstractC3264qG;
import defpackage.C3663xk;
import defpackage.Z3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzagl {
    private static final Map<String, zzagk> zza = new Z3();
    private static final Map<String, List<WeakReference<zzagn>>> zzb = new Z3();

    public static String zza(String str) {
        zzagk zzagkVar;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        if (zzagkVar != null) {
            return AbstractC3264qG.g(zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":")), "emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static String zzb(String str) {
        zzagk zzagkVar;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        return AbstractC3264qG.g(zzagkVar != null ? AbstractC3264qG.w("", zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":"))) : "https://", "www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzc(String str) {
        zzagk zzagkVar;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        return AbstractC3264qG.g(zzagkVar != null ? AbstractC3264qG.w("", zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":"))) : "https://", "identitytoolkit.googleapis.com/v2");
    }

    public static String zzd(String str) {
        zzagk zzagkVar;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        return AbstractC3264qG.g(zzagkVar != null ? AbstractC3264qG.w("", zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":"))) : "https://", "securetoken.googleapis.com/v1");
    }

    private static String zza(String str, int i, boolean z) {
        StringBuilder sb;
        String str2;
        if (z) {
            sb = new StringBuilder("http://[");
            sb.append(str);
            str2 = "]:";
        } else {
            sb = new StringBuilder("http://");
            sb.append(str);
            str2 = ":";
        }
        sb.append(str2);
        sb.append(i);
        sb.append("/");
        return sb.toString();
    }

    public static void zza(C3663xk c3663xk, String str, int i) {
        c3663xk.a();
        String str2 = c3663xk.c.a;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            map.put(str2, new zzagk(str, i));
        }
        Map<String, List<WeakReference<zzagn>>> map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(str2)) {
                    Iterator<WeakReference<zzagn>> it = map2.get(str2).iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        zzagn zzagnVar = it.next().get();
                        if (zzagnVar != null) {
                            zzagnVar.zza();
                            z = true;
                        }
                    }
                    if (!z) {
                        zza.remove(str2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void zza(String str, zzagn zzagnVar) {
        Map<String, List<WeakReference<zzagn>>> map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    map.get(str).add(new WeakReference<>(zzagnVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(zzagnVar));
                    map.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean zza(C3663xk c3663xk) {
        Map<String, zzagk> map = zza;
        c3663xk.a();
        return map.containsKey(c3663xk.c.a);
    }
}
