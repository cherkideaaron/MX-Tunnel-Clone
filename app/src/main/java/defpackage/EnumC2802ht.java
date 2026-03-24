package defpackage;

/* renamed from: ht, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC2802ht implements InterfaceC2765hA {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    public final int a;

    EnumC2802ht(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC2765hA
    public final int a() {
        return this.a;
    }
}
