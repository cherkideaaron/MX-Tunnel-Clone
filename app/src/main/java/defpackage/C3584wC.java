package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.TypedValue;
import com.mxtunnel.pro.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: wC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3584wC {
    public static C3584wC i;
    public WeakHashMap a;
    public WF b;
    public C3534vG c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f;
    public H2 g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final C3476uC j = new C3476uC(6);

    public static synchronized C3584wC d() {
        try {
            if (i == null) {
                C3584wC c3584wC = new C3584wC();
                i = c3584wC;
                j(c3584wC);
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C3476uC c3476uC = j;
        c3476uC.getClass();
        int i3 = (31 + i2) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c3476uC.get(Integer.valueOf(mode.hashCode() + i3));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
        }
        return porterDuffColorFilter;
    }

    public static void j(C3584wC c3584wC) {
        if (Build.VERSION.SDK_INT < 24) {
            c3584wC.a("vector", new C3530vC(3));
            c3584wC.a("animated-vector", new C3530vC(2));
            c3584wC.a("animated-selector", new C3530vC(1));
            c3584wC.a("drawable", new C3530vC(0));
        }
    }

    public final void a(String str, C3530vC c3530vC) {
        if (this.b == null) {
            this.b = new WF(0);
        }
        this.b.put(str, c3530vC);
    }

    public final synchronized void b(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C3240pt c3240pt = (C3240pt) this.d.get(context);
                if (c3240pt == null) {
                    c3240pt = new C3240pt();
                    this.d.put(context, c3240pt);
                }
                c3240pt.g(j2, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i2) throws Resources.NotFoundException {
        int i3;
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableE = e(context, j2);
        if (drawableE != null) {
            return drawableE;
        }
        LayerDrawable layerDrawableJ = null;
        if (this.g != null) {
            if (i2 == R.drawable.abc_cab_background_top_material) {
                layerDrawableJ = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, 2131230777)});
            } else {
                if (i2 == R.drawable.abc_ratingbar_material) {
                    i3 = R.dimen.abc_star_big;
                } else if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                    i3 = R.dimen.abc_star_medium;
                } else if (i2 == R.drawable.abc_ratingbar_small_material) {
                    i3 = R.dimen.abc_star_small;
                }
                layerDrawableJ = H2.j(this, context, i3);
            }
        }
        if (layerDrawableJ != null) {
            layerDrawableJ.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawableJ);
        }
        return layerDrawableJ;
    }

    public final synchronized Drawable e(Context context, long j2) {
        C3240pt c3240pt = (C3240pt) this.d.get(context);
        if (c3240pt == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c3240pt.d(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iE = AbstractC0115Ga.e(c3240pt.b, c3240pt.d, j2);
            if (iE >= 0) {
                Object[] objArr = c3240pt.c;
                Object obj = objArr[iE];
                Object obj2 = AbstractC0115Ga.f;
                if (obj != obj2) {
                    objArr[iE] = obj2;
                    c3240pt.a = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i2) {
        return g(context, i2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable g(android.content.Context r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3584wC.g(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        C3534vG c3534vG;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListL = null;
        colorStateList = (weakHashMap == null || (c3534vG = (C3534vG) weakHashMap.get(context)) == null) ? null : (ColorStateList) c3534vG.c(i2);
        if (colorStateList == null) {
            H2 h2 = this.g;
            if (h2 != null) {
                colorStateListL = h2.l(context, i2);
            }
            if (colorStateListL != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                C3534vG c3534vG2 = (C3534vG) this.a.get(context);
                if (c3534vG2 == null) {
                    c3534vG2 = new C3534vG();
                    this.a.put(context, c3534vG2);
                }
                c3534vG2.a(i2, colorStateListL);
            }
            colorStateList = colorStateListL;
        }
        return colorStateList;
    }

    public final synchronized void k(Context context) {
        C3240pt c3240pt = (C3240pt) this.d.get(context);
        if (c3240pt != null) {
            c3240pt.b();
        }
    }

    public final synchronized void l(H2 h2) {
        this.g = h2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            H2 r0 = r7.g
            r1 = 0
            if (r0 == 0) goto L74
            android.graphics.PorterDuff$Mode r2 = defpackage.I2.b
            java.lang.Object r3 = r0.a
            int[] r3 = (int[]) r3
            boolean r3 = defpackage.H2.c(r3, r9)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L19
            r9 = 2130968845(0x7f04010d, float:1.7546355E38)
        L16:
            r3 = r4
        L17:
            r0 = r5
            goto L55
        L19:
            java.lang.Object r3 = r0.c
            int[] r3 = (int[]) r3
            boolean r3 = defpackage.H2.c(r3, r9)
            if (r3 == 0) goto L27
            r9 = 2130968843(0x7f04010b, float:1.7546351E38)
            goto L16
        L27:
            java.lang.Object r0 = r0.d
            int[] r0 = (int[]) r0
            boolean r0 = defpackage.H2.c(r0, r9)
            r3 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto L38
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
        L36:
            r9 = r3
            goto L16
        L38:
            r0 = 2131230797(0x7f08004d, float:1.8077657E38)
            if (r9 != r0) goto L4c
            r9 = 1109603123(0x42233333, float:40.8)
            int r9 = java.lang.Math.round(r9)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r4
            r6 = r0
            r0 = r9
            r9 = r6
            goto L55
        L4c:
            r0 = 2131230779(0x7f08003b, float:1.807762E38)
            if (r9 != r0) goto L52
            goto L36
        L52:
            r9 = r1
            r3 = r9
            goto L17
        L55:
            if (r3 == 0) goto L74
            android.graphics.drawable.Drawable r10 = r10.mutate()
            int r8 = defpackage.PI.c(r8, r9)
            java.lang.Class<I2> r9 = defpackage.I2.class
            monitor-enter(r9)
            android.graphics.PorterDuffColorFilter r8 = h(r8, r2)     // Catch: java.lang.Throwable -> L71
            monitor-exit(r9)
            r10.setColorFilter(r8)
            if (r0 == r5) goto L6f
            r10.setAlpha(r0)
        L6f:
            r1 = r4
            goto L74
        L71:
            r8 = move-exception
            monitor-exit(r9)
            throw r8
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3584wC.m(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
