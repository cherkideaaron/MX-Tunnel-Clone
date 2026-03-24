package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class YD implements SharedPreferences {
    public final SharedPreferences a;

    public YD(Context context) {
        this.a = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static String a(String str) {
        try {
            return AbstractC0309Rh.c(str, AbstractC0309Rh.a);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(String str) {
        try {
            return AbstractC0309Rh.e(str, AbstractC0309Rh.a);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.a.contains(b(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        XD xd = new XD();
        xd.a = this.a.edit();
        return xd;
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        Map<String, ?> all = this.a.getAll();
        HashMap map = new HashMap(all.size());
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            try {
                map.put(entry.getKey(), a(entry.getValue().toString()));
            } catch (Exception unused) {
                map.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        String string = this.a.getString(b(str), null);
        if (string == null) {
            return z;
        }
        try {
            return Boolean.parseBoolean(a(string));
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        String string = this.a.getString(b(str), null);
        if (string == null) {
            return f;
        }
        try {
            return Float.parseFloat(a(string));
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        String string = this.a.getString(b(str), null);
        if (string == null) {
            return i;
        }
        try {
            return Integer.parseInt(a(string));
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        String string = this.a.getString(b(str), null);
        if (string == null) {
            return j;
        }
        try {
            return Long.parseLong(a(string));
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        String string = this.a.getString(b(str), null);
        String strA = a(string);
        return (string == null || strA == null) ? str2 : strA;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Set<String> stringSet = this.a.getStringSet(b(str), null);
        if (stringSet == null) {
            return set;
        }
        HashSet hashSet = new HashSet(stringSet.size());
        Iterator<String> it = stringSet.iterator();
        while (it.hasNext()) {
            hashSet.add(a(it.next()));
        }
        return hashSet;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
