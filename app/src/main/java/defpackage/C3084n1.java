package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* renamed from: n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3084n1 {
    public final Context a;
    public final LayoutInflater b;
    public Drawable d;
    public CharSequence e;
    public View f;
    public CharSequence g;
    public CharSequence h;
    public DialogInterface.OnClickListener i;
    public CharSequence j;
    public DialogInterface.OnClickListener k;
    public CharSequence l;
    public DialogInterface.OnClickListener m;
    public DialogInterface.OnKeyListener o;
    public ListAdapter p;
    public DialogInterface.OnClickListener q;
    public View r;
    public boolean s;
    public int c = 0;
    public int t = -1;
    public boolean n = true;

    public C3084n1(ContextThemeWrapper contextThemeWrapper) {
        this.a = contextThemeWrapper;
        this.b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
