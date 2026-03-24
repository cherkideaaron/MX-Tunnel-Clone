package defpackage;

import android.database.Cursor;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: sI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3374sI {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public C3374sI(String str, HashMap map, HashSet hashSet, HashSet hashSet2) {
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(hashSet);
        this.d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    public static C3374sI a(C0399Wm c0399Wm, String str) {
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        Cursor cursorK = c0399Wm.k("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorK.getColumnCount() > 0) {
                int columnIndex = cursorK.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
                int columnIndex2 = cursorK.getColumnIndex("type");
                int columnIndex3 = cursorK.getColumnIndex("notnull");
                int columnIndex4 = cursorK.getColumnIndex("pk");
                int columnIndex5 = cursorK.getColumnIndex("dflt_value");
                while (cursorK.moveToNext()) {
                    String string = cursorK.getString(columnIndex);
                    map.put(string, new C3156oI(cursorK.getInt(columnIndex4), string, cursorK.getString(columnIndex2), cursorK.getString(columnIndex5), cursorK.getInt(columnIndex3) != 0, 2));
                }
            }
            cursorK.close();
            HashSet hashSet = new HashSet();
            cursorK = c0399Wm.k("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorK.getColumnIndex(FacebookMediationAdapter.KEY_ID);
                int columnIndex7 = cursorK.getColumnIndex("seq");
                int columnIndex8 = cursorK.getColumnIndex("table");
                int columnIndex9 = cursorK.getColumnIndex("on_delete");
                int columnIndex10 = cursorK.getColumnIndex("on_update");
                ArrayList arrayListB = b(cursorK);
                int count = cursorK.getCount();
                int i4 = 0;
                while (i4 < count) {
                    cursorK.moveToPosition(i4);
                    if (cursorK.getInt(columnIndex7) != 0) {
                        i = columnIndex6;
                        i2 = columnIndex7;
                        arrayList = arrayListB;
                        i3 = count;
                    } else {
                        int i5 = cursorK.getInt(columnIndex6);
                        i = columnIndex6;
                        ArrayList arrayList2 = new ArrayList();
                        i2 = columnIndex7;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = arrayListB.iterator();
                        while (it.hasNext()) {
                            ArrayList arrayList4 = arrayListB;
                            C3266qI c3266qI = (C3266qI) it.next();
                            int i6 = count;
                            if (c3266qI.a == i5) {
                                arrayList2.add(c3266qI.c);
                                arrayList3.add(c3266qI.d);
                            }
                            arrayListB = arrayList4;
                            count = i6;
                        }
                        arrayList = arrayListB;
                        i3 = count;
                        hashSet.add(new C3211pI(cursorK.getString(columnIndex8), cursorK.getString(columnIndex9), cursorK.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i4++;
                    columnIndex6 = i;
                    columnIndex7 = i2;
                    arrayListB = arrayList;
                    count = i3;
                }
                cursorK.close();
                cursorK = c0399Wm.k("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorK.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int columnIndex12 = cursorK.getColumnIndex("origin");
                    int columnIndex13 = cursorK.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        break;
                    }
                    HashSet hashSet3 = new HashSet();
                    while (cursorK.moveToNext()) {
                        if ("c".equals(cursorK.getString(columnIndex12))) {
                            C3320rI c3320rIC = c(c0399Wm, cursorK.getString(columnIndex11), cursorK.getInt(columnIndex13) == 1);
                            if (c3320rIC == null) {
                                break;
                            }
                            hashSet3.add(c3320rIC);
                        }
                    }
                    cursorK.close();
                    hashSet2 = hashSet3;
                    return new C3374sI(str, map, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(FacebookMediationAdapter.KEY_ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C3266qI(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public static C3320rI c(C0399Wm c0399Wm, String str, boolean z) {
        Cursor cursorK = c0399Wm.k("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorK.getColumnIndex("seqno");
            int columnIndex2 = cursorK.getColumnIndex("cid");
            int columnIndex3 = cursorK.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorK.moveToNext()) {
                    if (cursorK.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorK.getInt(columnIndex)), cursorK.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                C3320rI c3320rI = new C3320rI(arrayList, str, z);
                cursorK.close();
                return c3320rI;
            }
            cursorK.close();
            return null;
        } catch (Throwable th) {
            cursorK.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || C3374sI.class != obj.getClass()) {
            return false;
        }
        C3374sI c3374sI = (C3374sI) obj;
        String str = c3374sI.a;
        String str2 = this.a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map map = c3374sI.b;
        Map map2 = this.b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set set2 = c3374sI.c;
        Set set3 = this.c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set set4 = this.d;
        if (set4 == null || (set = c3374sI.d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
