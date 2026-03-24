package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import defpackage.Vs;

/* loaded from: classes.dex */
public final class zaac extends RemoteCreator {
    private static final zaac zaa = new zaac();

    private zaac() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View zaa(Context context, int i, int i2) throws RemoteCreator.RemoteCreatorException {
        zaac zaacVar = zaa;
        try {
            zaaa zaaaVar = new zaaa(1, i, i2, null);
            return (View) ObjectWrapper.unwrap(((zap) zaacVar.getRemoteCreatorInstance(context)).zae(ObjectWrapper.wrap(context), zaaaVar));
        } catch (Exception e) {
            throw new RemoteCreator.RemoteCreatorException(Vs.n(new StringBuilder(String.valueOf(i).length() + 42 + String.valueOf(i2).length()), "Could not get button with size ", i, " and color ", i2), e);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof zap ? (zap) iInterfaceQueryLocalInterface : new zap(iBinder);
    }
}
