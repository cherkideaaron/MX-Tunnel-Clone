package defpackage;

import java.io.IOException;

/* renamed from: oa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3166oa extends IOException {
    public C3166oa(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
