package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.d;
import androidx.fragment.app.z;

/* renamed from: fg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC2679fg implements Animation.AnimationListener {
    public final /* synthetic */ z a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ d d;

    public AnimationAnimationListenerC2679fg(z zVar, ViewGroup viewGroup, View view, d dVar) {
        this.a = zVar;
        this.b = viewGroup;
        this.c = view;
        this.d = dVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.b.post(new RunnableC2705g5(this, 4));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
