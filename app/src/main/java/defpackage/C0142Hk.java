package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: Hk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0142Hk extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0142Hk(String str) {
        super(str);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}
