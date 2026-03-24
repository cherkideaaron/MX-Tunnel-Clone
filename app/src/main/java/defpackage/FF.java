package defpackage;

import android.content.SharedPreferences;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class FF {
    public final SharedPreferences a;
    public final Set b;

    public FF(SharedPreferences sharedPreferences, LinkedHashSet linkedHashSet) {
        AbstractC0500aq.m(sharedPreferences, "prefs");
        this.a = sharedPreferences;
        this.b = linkedHashSet;
    }
}
