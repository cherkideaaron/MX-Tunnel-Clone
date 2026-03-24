package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: Me, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221Me extends WH implements InterfaceC2631en {
    public int a;
    public final /* synthetic */ AF b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0221Me(AF af, InterfaceC3493uc interfaceC3493uc) {
        super(1, interfaceC3493uc);
        this.b = af;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(InterfaceC3493uc interfaceC3493uc) {
        return new C0221Me(this.b, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC2631en
    public final Object invoke(Object obj) {
        return ((C0221Me) create((InterfaceC3493uc) obj)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) throws IOException {
        Context context;
        String str;
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        DK dk = DK.a;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            this.a = 1;
            AF af = this.b;
            SharedPreferences.Editor editorEdit = ((SharedPreferences) af.e.getValue()).edit();
            LinkedHashSet linkedHashSet = af.f;
            if (linkedHashSet == null) {
                editorEdit.clear();
            } else {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    editorEdit.remove((String) it.next());
                }
            }
            if (!editorEdit.commit()) {
                throw new IOException("Unable to delete migrated keys from SharedPreferences.");
            }
            if (((SharedPreferences) af.e.getValue()).getAll().isEmpty() && (context = af.c) != null && (str = af.d) != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    AbstractC3695yF.a(context, str);
                } else {
                    File file = new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), str.concat(".xml"));
                    File file2 = new File(file.getPath() + ".bak");
                    file.delete();
                    file2.delete();
                }
            }
            if (linkedHashSet != null) {
                linkedHashSet.clear();
            }
            if (dk == enumC0321Sc) {
                return enumC0321Sc;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0115Ga.U(obj);
        }
        return dk;
    }
}
