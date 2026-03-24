package com.google.android.recaptcha.internal;

import android.content.Context;
import defpackage.AbstractC0069Df;
import defpackage.AbstractC0136He;
import defpackage.AbstractC0500aq;
import defpackage.C0038Bi;
import defpackage.C0234Na;
import defpackage.C0581cG;
import defpackage.C2932kE;
import defpackage.InterfaceC0304Rc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class zzes implements zzeo {

    @Nullable
    private static Timer zza;

    @NotNull
    private final Context zzb;

    @NotNull
    private final zzet zzc;

    @NotNull
    private final InterfaceC0304Rc zzd;

    @Nullable
    private final zzei zze;

    public zzes(@NotNull Context context, @NotNull zzet zzetVar, @NotNull InterfaceC0304Rc interfaceC0304Rc) {
        this.zzb = context;
        this.zzc = zzetVar;
        this.zzd = interfaceC0304Rc;
        zzei zzeiVar = null;
        byte b = 0;
        try {
            zzei zzeiVar2 = zzei.zzd;
            zzeiVar2 = zzeiVar2 == null ? new zzei(context, b == true ? 1 : 0) : zzeiVar2;
            zzei.zzd = zzeiVar2;
            zzeiVar = zzeiVar2;
        } catch (Exception unused) {
        }
        this.zze = zzeiVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        Iterator it;
        ArrayList<List> arrayList;
        zzei zzeiVar;
        zztx zztxVarZzk;
        int iZzN;
        int i;
        zzei zzeiVar2 = this.zze;
        if (zzeiVar2 != null) {
            List listZzd = zzeiVar2.zzd();
            AbstractC0500aq.m(listZzd, "<this>");
            if (listZzd instanceof RandomAccess) {
                int size = listZzd.size();
                arrayList = new ArrayList((size / 20) + (size % 20 == 0 ? 0 : 1));
                for (int i2 = 0; i2 >= 0 && i2 < size; i2 += 20) {
                    int i3 = size - i2;
                    if (20 <= i3) {
                        i3 = 20;
                    }
                    ArrayList arrayList2 = new ArrayList(i3);
                    for (int i4 = 0; i4 < i3; i4++) {
                        arrayList2.add(listZzd.get(i4 + i2));
                    }
                    arrayList.add(arrayList2);
                }
            } else {
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = listZzd.iterator();
                AbstractC0500aq.m(it2, "iterator");
                if (it2.hasNext()) {
                    C0581cG c0581cG = new C0581cG(20, 20, it2, false, true, null);
                    C2932kE c2932kE = new C2932kE();
                    c2932kE.c = AbstractC0069Df.i(c2932kE, c0581cG, c2932kE);
                    it = c2932kE;
                } else {
                    it = C0038Bi.a;
                }
                while (it.hasNext()) {
                    arrayList3.add((List) it.next());
                }
                arrayList = arrayList3;
            }
            for (List<zzej> list : arrayList) {
                zzrd zzrdVarZzi = zzrf.zzi();
                ArrayList arrayList4 = new ArrayList();
                for (zzej zzejVar : list) {
                    try {
                        zztxVarZzk = zztx.zzk(zzkh.zzg().zzj(zzejVar.zzc()));
                        iZzN = zztxVarZzk.zzN();
                        i = iZzN - 1;
                    } catch (Exception unused) {
                        zzei zzeiVar3 = this.zze;
                        if (zzeiVar3 != null) {
                            zzeiVar3.zzf(zzejVar);
                        }
                    }
                    if (iZzN == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        zzrdVarZzi.zzq(zztxVarZzk.zzf());
                    } else if (i == 1) {
                        zzrdVarZzi.zzr(zztxVarZzk.zzg());
                    } else if (i != 2) {
                        throw new C0234Na();
                    }
                    arrayList4.add(zzejVar);
                }
                if (zzrdVarZzi.zzf() + zzrdVarZzi.zze() != 0) {
                    if (this.zzc.zza(((zzrf) zzrdVarZzi.zzk()).zzd()) && (zzeiVar = this.zze) != null) {
                        zzeiVar.zza(arrayList4);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzep(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzeo
    public final void zza(@NotNull zztx zztxVar) {
        AbstractC0136He.y(this.zzd, new zzer(this, zztxVar, null));
        zzh();
    }
}
