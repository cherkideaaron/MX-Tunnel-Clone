package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzahy;
import com.google.android.gms.internal.p002firebaseauthapi.zzaiz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class TP {
    public static int a(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        throw new IllegalArgumentException(Vs.k(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static Bv b(zzahy zzahyVar) {
        if (zzahyVar == null) {
            return null;
        }
        if (TextUtils.isEmpty(zzahyVar.zze())) {
            if (zzahyVar.zzb() != null) {
                return new HJ(zzahyVar.zzd(), zzahyVar.zzc(), zzahyVar.zza(), (zzaiz) Preconditions.checkNotNull(zzahyVar.zzb(), "totpInfo cannot be null."));
            }
            return null;
        }
        return new Ty(zzahyVar.zza(), zzahyVar.zzd(), zzahyVar.zzc(), Preconditions.checkNotEmpty(zzahyVar.zze()));
    }

    public static ArrayList c(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bv bvB = b((zzahy) it.next());
            if (bvB != null) {
                arrayList.add(bvB);
            }
        }
        return arrayList;
    }
}
