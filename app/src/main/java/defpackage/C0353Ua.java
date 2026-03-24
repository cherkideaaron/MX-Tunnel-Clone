package defpackage;

import android.os.Bundle;
import androidx.fragment.app.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: Ua, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0353Ua implements CD {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0353Ua(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.CD
    public final Bundle a() {
        Jy[] jyArr;
        switch (this.a) {
            case 0:
                return AbstractActivityC2619eb.h((AbstractActivityC2619eb) this.b);
            case 1:
                return ((t) this.b).R();
            default:
                C2811i1 c2811i1 = (C2811i1) this.b;
                for (Map.Entry entry : Ht.Z((LinkedHashMap) c2811i1.d).entrySet()) {
                    String str = (String) entry.getKey();
                    WG wg = (WG) ((Sv) entry.getValue());
                    wg.getClass();
                    C3337ri c3337ri = AbstractC0500aq.e;
                    Object obj = WG.e.get(wg);
                    if (obj == c3337ri) {
                        obj = null;
                    }
                    c2811i1.z(obj, str);
                }
                for (Map.Entry entry2 : Ht.Z((LinkedHashMap) c2811i1.b).entrySet()) {
                    c2811i1.z(((CD) entry2.getValue()).a(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) c2811i1.a;
                if (linkedHashMap.isEmpty()) {
                    jyArr = new Jy[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        arrayList.add(new Jy((String) entry3.getKey(), entry3.getValue()));
                    }
                    jyArr = (Jy[]) arrayList.toArray(new Jy[0]);
                }
                return AbstractC0500aq.d((Jy[]) Arrays.copyOf(jyArr, jyArr.length));
        }
    }
}
