package defpackage;

import android.content.Context;
import android.view.VelocityTracker;
import com.google.android.gms.common.api.Api;

/* renamed from: Rg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308Rg {
    public final Context a;
    public final C2827iH b;
    public final C0220Md c;
    public final C0220Md d;
    public VelocityTracker e;
    public float f;
    public int g;
    public int h;
    public int i;
    public final int[] j;

    public C0308Rg(Context context, C2827iH c2827iH) {
        C0220Md c0220Md = new C0220Md(8);
        C0220Md c0220Md2 = new C0220Md(8);
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = new int[]{Api.BaseClientBuilder.API_PRIORITY_OTHER, 0};
        this.a = context;
        this.b = c2827iH;
        this.c = c0220Md;
        this.d = c0220Md2;
    }
}
