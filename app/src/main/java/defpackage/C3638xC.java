package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: xC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3638xC {
    public final ColorStateList a;
    public final Configuration b;
    public final int c;

    public C3638xC(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.a = colorStateList;
        this.b = configuration;
        this.c = theme == null ? 0 : theme.hashCode();
    }
}
