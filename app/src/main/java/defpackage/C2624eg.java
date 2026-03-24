package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.d;
import androidx.fragment.app.z;

/* renamed from: eg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2624eg extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ z d;
    public final /* synthetic */ d e;

    public C2624eg(ViewGroup viewGroup, View view, boolean z, z zVar, d dVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = zVar;
        this.e = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        z zVar = this.d;
        if (z) {
            Vs.a(view, zVar.a);
        }
        this.e.a();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + zVar + " has ended.");
        }
    }
}
