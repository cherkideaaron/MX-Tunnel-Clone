package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: Nl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0245Nl implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ CallableC0245Nl(String str, Context context, Object obj, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = context;
        this.e = obj;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.d;
        Object obj = this.e;
        Context context = this.c;
        String str = this.b;
        switch (this.a) {
            case 0:
                Object[] objArr = {(C0194Kl) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return AbstractC0296Ql.b(str, context, Collections.unmodifiableList(arrayList), i);
            default:
                try {
                    return AbstractC0296Ql.b(str, context, (List) obj, i);
                } catch (Throwable unused) {
                    return new C0279Pl(-3);
                }
        }
    }
}
