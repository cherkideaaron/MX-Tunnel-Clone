package defpackage;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class G3 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ G3(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r3 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return 1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = -1
            r2 = 1
            int r3 = r6.a
            switch(r3) {
                case 0: goto L82;
                case 1: goto L7a;
                case 2: goto L60;
                case 3: goto L2d;
                case 4: goto L20;
                case 5: goto L16;
                default: goto L8;
            }
        L8:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            int r7 = r7.getTop()
            int r8 = r8.getTop()
            int r7 = r7 - r8
            return r7
        L16:
            rG r7 = (defpackage.C3318rG) r7
            rG r8 = (defpackage.C3318rG) r8
            int r7 = r7.b
            int r8 = r8.b
            int r7 = r7 - r8
            return r7
        L20:
            uy r7 = (defpackage.C3515uy) r7
            uy r8 = (defpackage.C3515uy) r8
            java.lang.String r7 = r7.g
            java.lang.String r8 = r8.g
            int r7 = r7.compareTo(r8)
            return r7
        L2d:
            Hn r7 = (defpackage.C0145Hn) r7
            Hn r8 = (defpackage.C0145Hn) r8
            androidx.recyclerview.widget.RecyclerView r3 = r7.d
            if (r3 != 0) goto L37
            r4 = r2
            goto L38
        L37:
            r4 = r0
        L38:
            androidx.recyclerview.widget.RecyclerView r5 = r8.d
            if (r5 != 0) goto L3e
            r5 = r2
            goto L3f
        L3e:
            r5 = r0
        L3f:
            if (r4 == r5) goto L45
            if (r3 != 0) goto L55
        L43:
            r0 = r2
            goto L5f
        L45:
            boolean r3 = r7.a
            boolean r4 = r8.a
            if (r3 == r4) goto L4e
            if (r3 == 0) goto L43
            goto L55
        L4e:
            int r1 = r8.b
            int r2 = r7.b
            int r1 = r1 - r2
            if (r1 == 0) goto L57
        L55:
            r0 = r1
            goto L5f
        L57:
            int r7 = r7.c
            int r8 = r8.c
            int r7 = r7 - r8
            if (r7 == 0) goto L5f
            r0 = r7
        L5f:
            return r0
        L60:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            java.util.WeakHashMap r3 = defpackage.UL.a
            float r7 = defpackage.ML.g(r7)
            float r8 = defpackage.ML.g(r8)
            int r3 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r3 <= 0) goto L74
            r0 = r1
            goto L79
        L74:
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L79
            r0 = r2
        L79:
            return r0
        L7a:
            byte[] r7 = (byte[]) r7
            byte[] r8 = (byte[]) r8
            int r7 = r7.length
            int r8 = r8.length
            int r7 = r7 - r8
            return r7
        L82:
            J3 r7 = (defpackage.J3) r7
            J3 r8 = (defpackage.J3) r8
            boolean r0 = r7.b
            boolean r3 = r8.b
            if (r0 == r3) goto L91
            if (r0 == 0) goto L8f
            goto L99
        L8f:
            r1 = r2
            goto L99
        L91:
            java.lang.String r7 = r7.c
            java.lang.String r8 = r8.c
            int r1 = r7.compareTo(r8)
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.G3.compare(java.lang.Object, java.lang.Object):int");
    }
}
