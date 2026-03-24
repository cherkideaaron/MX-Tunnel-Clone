package defpackage;

import android.util.Property;

/* renamed from: kl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2957kl extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2957kl(String str, int i) {
        super(Float.class, str);
        this.a = i;
        switch (i) {
            case 1:
                super(Integer.class, str);
                break;
            default:
                break;
        }
    }

    public abstract void a(int i, Object obj);

    public abstract void b(Object obj, float f);

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                b(obj, ((Float) obj2).floatValue());
                break;
            default:
                a(((Integer) obj2).intValue(), obj);
                break;
        }
    }
}
