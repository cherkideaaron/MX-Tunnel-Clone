package defpackage;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: vv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3566vv extends BaseAdapter {
    public static final int d = AbstractC0477aL.d(null).getMaximum(4);
    public static final int e = (AbstractC0477aL.d(null).getMaximum(7) + AbstractC0477aL.d(null).getMaximum(5)) - 1;
    public final C3512uv a;
    public R2 b;
    public final C2871j8 c;

    public C3566vv(C3512uv c3512uv, C2871j8 c2871j8) {
        this.a = c3512uv;
        this.c = c2871j8;
        throw null;
    }

    public final int a() {
        int firstDayOfWeek = this.c.e;
        C3512uv c3512uv = this.a;
        Calendar calendar = c3512uv.a;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + c3512uv.d : i2;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        int iA = (i - a()) + 1;
        Calendar calendarB = AbstractC0477aL.b(this.a.a);
        calendarB.set(5, iA);
        return Long.valueOf(calendarB.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.a.e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.a.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            android.content.Context r2 = r8.getContext()
            R2 r3 = r5.b
            if (r3 != 0) goto L13
            R2 r3 = new R2
            r4 = 10
            r3.<init>(r2, r4)
            r5.b = r3
        L13:
            r2 = r7
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r7 != 0) goto L2a
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r2 = 2131558519(0x7f0d0077, float:1.8742356E38)
            android.view.View r7 = r7.inflate(r2, r8, r1)
            r2 = r7
            android.widget.TextView r2 = (android.widget.TextView) r2
        L2a:
            int r7 = r5.a()
            int r7 = r6 - r7
            if (r7 < 0) goto L5f
            uv r8 = r5.a
            int r3 = r8.e
            if (r7 < r3) goto L39
            goto L5f
        L39:
            int r7 = r7 + r0
            r2.setTag(r8)
            android.content.res.Resources r8 = r2.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r1] = r7
            java.lang.String r7 = "%d"
            java.lang.String r7 = java.lang.String.format(r8, r7, r3)
            r2.setText(r7)
            r2.setVisibility(r1)
            r2.setEnabled(r0)
            goto L67
        L5f:
            r7 = 8
            r2.setVisibility(r7)
            r2.setEnabled(r1)
        L67:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L6e
            goto L70
        L6e:
            if (r2 != 0) goto L71
        L70:
            return r2
        L71:
            r2.getContext()
            java.util.Calendar r6 = defpackage.AbstractC0477aL.c()
            r6.getTimeInMillis()
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3566vv.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
