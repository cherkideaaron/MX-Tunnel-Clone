package defpackage;

import java.io.IOException;

/* renamed from: gq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2744gq extends IOException {
    public boolean a;

    public static C2744gq a() {
        return new C2744gq("Protocol message had invalid UTF-8.");
    }

    public static C2689fq b() {
        return new C2689fq("Protocol message tag had invalid wire type.");
    }

    public static C2744gq c() {
        return new C2744gq("CodedInputStream encountered a malformed varint.");
    }

    public static C2744gq d() {
        return new C2744gq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C2744gq e() {
        return new C2744gq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
