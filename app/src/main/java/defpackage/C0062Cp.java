package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* renamed from: Cp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062Cp implements InterfaceC0079Dp {
    public final InputContentInfo a;

    public C0062Cp(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // defpackage.InterfaceC0079Dp
    public final Uri a() {
        return this.a.getContentUri();
    }

    @Override // defpackage.InterfaceC0079Dp
    public final void b() {
        this.a.requestPermission();
    }

    @Override // defpackage.InterfaceC0079Dp
    public final Uri c() {
        return this.a.getLinkUri();
    }

    @Override // defpackage.InterfaceC0079Dp
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.InterfaceC0079Dp
    public final ClipDescription getDescription() {
        return this.a.getDescription();
    }

    public C0062Cp(Object obj) {
        this.a = (InputContentInfo) obj;
    }
}
