package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: Dg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0070Dg extends C0234Na {
    public final List a;

    public C0070Dg(ArrayList arrayList) {
        super("Dependency cycle detected: " + Arrays.toString(arrayList.toArray()));
    }
}
