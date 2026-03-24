package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class SC {
    public final String b;
    public final Context c;
    public ArrayList d;
    public Executor e;
    public Executor f;
    public TH g;
    public boolean h;
    public boolean j;
    public final C0607co k;
    public HashSet l;
    public final Class a = WorkDatabase.class;
    public boolean i = true;

    public SC(Context context, String str) {
        this.c = context;
        this.b = str;
        C0607co c0607co = new C0607co();
        c0607co.a = new HashMap();
        this.k = c0607co;
    }

    public final void a(AbstractC3132nv... abstractC3132nvArr) {
        if (this.l == null) {
            this.l = new HashSet();
        }
        for (AbstractC3132nv abstractC3132nv : abstractC3132nvArr) {
            this.l.add(Integer.valueOf(abstractC3132nv.a));
            this.l.add(Integer.valueOf(abstractC3132nv.b));
        }
        C0607co c0607co = this.k;
        c0607co.getClass();
        for (AbstractC3132nv abstractC3132nv2 : abstractC3132nvArr) {
            int i = abstractC3132nv2.a;
            HashMap map = (HashMap) c0607co.a;
            TreeMap treeMap = (TreeMap) map.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap();
                map.put(Integer.valueOf(i), treeMap);
            }
            int i2 = abstractC3132nv2.b;
            AbstractC3132nv abstractC3132nv3 = (AbstractC3132nv) treeMap.get(Integer.valueOf(i2));
            if (abstractC3132nv3 != null) {
                Log.w("ROOM", "Overriding migration " + abstractC3132nv3 + " with " + abstractC3132nv2);
            }
            treeMap.put(Integer.valueOf(i2), abstractC3132nv2);
        }
    }
}
