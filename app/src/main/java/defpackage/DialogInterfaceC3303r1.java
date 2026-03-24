package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.mxtunnel.pro.R;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;

/* renamed from: r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC3303r1 extends DialogC2784hb implements DialogInterface, InterfaceC2812i2 {
    public F2 d;
    public final G2 e;
    public final C3194p1 f;

    /* JADX WARN: Type inference failed for: r2v2, types: [G2] */
    public DialogInterfaceC3303r1(Context context, int i) {
        int i2;
        int iG = g(context, i);
        if (iG == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iG;
        }
        super(context, i2);
        this.e = new InterfaceC3128nr() { // from class: G2
            @Override // defpackage.InterfaceC3128nr
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.a.i(keyEvent);
            }
        };
        AbstractC3304r2 abstractC3304r2E = e();
        if (iG == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iG = typedValue2.resourceId;
        }
        ((F2) abstractC3304r2E).Z = iG;
        abstractC3304r2E.e();
        this.f = new C3194p1(getContext(), this, getWindow());
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.DialogC2784hb, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        c();
        F2 f2 = (F2) e();
        f2.w();
        ((ViewGroup) f2.G.findViewById(android.R.id.content)).addView(view, layoutParams);
        f2.s.a(f2.r.getCallback());
    }

    public final Button d(int i) {
        C3194p1 c3194p1 = this.f;
        if (i == -3) {
            return c3194p1.s;
        }
        if (i == -2) {
            return c3194p1.o;
        }
        if (i == -1) {
            return c3194p1.k;
        }
        c3194p1.getClass();
        return null;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        e().f();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0136He.m(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    public final AbstractC3304r2 e() {
        if (this.d == null) {
            ExecutorC3250q2 executorC3250q2 = AbstractC3304r2.a;
            this.d = new F2(getContext(), getWindow(), this, this);
        }
        return this.d;
    }

    public final void f(Bundle bundle) {
        e().a();
        super.onCreate(bundle);
        e().e();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        F2 f2 = (F2) e();
        f2.w();
        return f2.r.findViewById(i);
    }

    public final void h(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().m(charSequence);
    }

    public final boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        e().c();
    }

    @Override // defpackage.DialogC2784hb, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        View view;
        int i2;
        ListAdapter listAdapter;
        View viewFindViewById;
        Button button;
        f(bundle);
        C3194p1 c3194p1 = this.f;
        c3194p1.b.setContentView(c3194p1.F);
        Window window = c3194p1.c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View viewInflate = c3194p1.h;
        Context context = c3194p1.a;
        if (viewInflate == null) {
            viewInflate = c3194p1.i != 0 ? LayoutInflater.from(context).inflate(c3194p1.i, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !C3194p1.a(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (c3194p1.j) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c3194p1.g != null) {
                ((LinearLayout.LayoutParams) ((C0557bs) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = C3194p1.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = C3194p1.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = C3194p1.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c3194p1.w = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c3194p1.w.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        c3194p1.B = textView;
        if (textView != null) {
            CharSequence charSequence = c3194p1.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                c3194p1.w.removeView(c3194p1.B);
                if (c3194p1.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c3194p1.w.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(c3194p1.w);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(c3194p1.g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button2 = (Button) viewGroupB3.findViewById(android.R.id.button1);
        c3194p1.k = button2;
        ViewOnClickListenerC0510b viewOnClickListenerC0510b = c3194p1.L;
        button2.setOnClickListener(viewOnClickListenerC0510b);
        boolean zIsEmpty = TextUtils.isEmpty(c3194p1.l);
        int i3 = c3194p1.d;
        if (zIsEmpty && c3194p1.n == null) {
            c3194p1.k.setVisibility(8);
            i = 0;
        } else {
            c3194p1.k.setText(c3194p1.l);
            Drawable drawable = c3194p1.n;
            if (drawable != null) {
                drawable.setBounds(0, 0, i3, i3);
                c3194p1.k.setCompoundDrawables(c3194p1.n, null, null, null);
            }
            c3194p1.k.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        c3194p1.o = button3;
        button3.setOnClickListener(viewOnClickListenerC0510b);
        if (TextUtils.isEmpty(c3194p1.p) && c3194p1.r == null) {
            c3194p1.o.setVisibility(8);
        } else {
            c3194p1.o.setText(c3194p1.p);
            Drawable drawable2 = c3194p1.r;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i3, i3);
                c3194p1.o.setCompoundDrawables(c3194p1.r, null, null, null);
            }
            c3194p1.o.setVisibility(0);
            i |= 2;
        }
        Button button4 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        c3194p1.s = button4;
        button4.setOnClickListener(viewOnClickListenerC0510b);
        if (TextUtils.isEmpty(c3194p1.t) && c3194p1.v == null) {
            c3194p1.s.setVisibility(8);
            view = null;
        } else {
            c3194p1.s.setText(c3194p1.t);
            Drawable drawable3 = c3194p1.v;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i3, i3);
                view = null;
                c3194p1.s.setCompoundDrawables(c3194p1.v, null, null, null);
            } else {
                view = null;
            }
            c3194p1.s.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data == 0) {
            i2 = 2;
        } else if (i == 1) {
            Button button5 = c3194p1.k;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button5.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.weight = 0.5f;
            button5.setLayoutParams(layoutParams);
            i2 = 2;
        } else {
            i2 = 2;
            if (i == 2) {
                button = c3194p1.o;
            } else if (i == 4) {
                button = c3194p1.s;
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button.getLayoutParams();
            layoutParams2.gravity = 1;
            layoutParams2.weight = 0.5f;
            button.setLayoutParams(layoutParams2);
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (c3194p1.C != null) {
            viewGroupB.addView(c3194p1.C, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c3194p1.z = (ImageView) window.findViewById(android.R.id.icon);
            if ((!TextUtils.isEmpty(c3194p1.e)) && c3194p1.J) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c3194p1.A = textView2;
                textView2.setText(c3194p1.e);
                int i4 = c3194p1.x;
                if (i4 != 0) {
                    c3194p1.z.setImageResource(i4);
                } else {
                    Drawable drawable4 = c3194p1.y;
                    if (drawable4 != null) {
                        c3194p1.z.setImageDrawable(drawable4);
                    } else {
                        c3194p1.A.setPadding(c3194p1.z.getPaddingLeft(), c3194p1.z.getPaddingTop(), c3194p1.z.getPaddingRight(), c3194p1.z.getPaddingBottom());
                        c3194p1.z.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                c3194p1.z.setVisibility(8);
                viewGroupB.setVisibility(8);
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i5 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupB3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i5 != 0) {
            NestedScrollView nestedScrollView2 = c3194p1.w;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (c3194p1.f == null && c3194p1.g == null) ? view : viewGroupB.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c3194p1.g;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z3 || i5 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i5 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
            }
        }
        if (!z2) {
            View view2 = c3194p1.g;
            if (view2 == null) {
                view2 = c3194p1.w;
            }
            if (view2 != null) {
                int i6 = i5 | (z3 ? i2 : 0);
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = UL.a;
                NL.b(view2, i6, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c3194p1.g;
        if (alertController$RecycleListView2 == null || (listAdapter = c3194p1.D) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i7 = c3194p1.E;
        if (i7 > -1) {
            alertController$RecycleListView2.setItemChecked(i7, true);
            alertController$RecycleListView2.setSelection(i7);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.w;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.w;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.DialogC2784hb, android.app.Dialog
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        F2 f2 = (F2) e();
        f2.B();
        C2668fN c2668fN = f2.u;
        if (c2668fN != null) {
            c2668fN.F = false;
            C3623wy c3623wy = c2668fN.E;
            if (c3623wy != null) {
                c3623wy.a();
            }
        }
    }

    @Override // defpackage.DialogC2784hb, android.app.Dialog
    public final void setContentView(int i) {
        c();
        e().i(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        e().m(getContext().getString(i));
    }

    @Override // defpackage.DialogC2784hb, android.app.Dialog
    public final void setContentView(View view) {
        c();
        e().j(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        h(charSequence);
        C3194p1 c3194p1 = this.f;
        c3194p1.e = charSequence;
        TextView textView = c3194p1.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.DialogC2784hb, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        e().l(view, layoutParams);
    }
}
