package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* renamed from: lc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3003lc implements InterfaceC2948kc, InterfaceC3058mc {
    public final /* synthetic */ int a = 0;
    public ClipData b;
    public int c;
    public int d;
    public Uri e;
    public Bundle f;

    public /* synthetic */ C3003lc() {
    }

    @Override // defpackage.InterfaceC3058mc
    public ClipData a() {
        return this.b;
    }

    @Override // defpackage.InterfaceC2948kc
    public C3113nc build() {
        return new C3113nc(new C3003lc(this));
    }

    @Override // defpackage.InterfaceC3058mc
    public int g() {
        return this.d;
    }

    @Override // defpackage.InterfaceC2948kc
    public void h(Uri uri) {
        this.e = uri;
    }

    @Override // defpackage.InterfaceC3058mc
    public ContentInfo i() {
        return null;
    }

    @Override // defpackage.InterfaceC2948kc
    public void k(int i) {
        this.d = i;
    }

    @Override // defpackage.InterfaceC3058mc
    public int n() {
        return this.c;
    }

    @Override // defpackage.InterfaceC2948kc
    public void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                int i = this.c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = this.e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC3264qG.l(sb, this.f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public C3003lc(C3003lc c3003lc) {
        ClipData clipData = c3003lc.b;
        clipData.getClass();
        this.b = clipData;
        int i = c3003lc.c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.c = i;
        int i2 = c3003lc.d;
        if ((i2 & 1) == i2) {
            this.d = i2;
            this.e = c3003lc.e;
            this.f = c3003lc.f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
