package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3249q1 implements InterfaceC2918k0 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public C3249q1(int i) {
        this.a = i;
        switch (i) {
            case 3:
                break;
            case 4:
            default:
                this.b = 1;
                this.c = Collections.singletonList(null);
                break;
            case 5:
                this.c = new ArrayList();
                this.b = UserVerificationMethods.USER_VERIFY_PATTERN;
                break;
        }
    }

    public DialogInterfaceC3303r1 a() {
        C3084n1 c3084n1 = (C3084n1) this.c;
        DialogInterfaceC3303r1 dialogInterfaceC3303r1 = new DialogInterfaceC3303r1(c3084n1.a, this.b);
        View view = c3084n1.f;
        C3194p1 c3194p1 = dialogInterfaceC3303r1.f;
        if (view != null) {
            c3194p1.C = view;
        } else {
            CharSequence charSequence = c3084n1.e;
            if (charSequence != null) {
                c3194p1.e = charSequence;
                TextView textView = c3194p1.A;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c3084n1.d;
            if (drawable != null) {
                c3194p1.y = drawable;
                c3194p1.x = 0;
                ImageView imageView = c3194p1.z;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c3194p1.z.setImageDrawable(drawable);
                }
            }
            int i = c3084n1.c;
            if (i != 0) {
                c3194p1.y = null;
                c3194p1.x = i;
                ImageView imageView2 = c3194p1.z;
                if (imageView2 != null) {
                    if (i != 0) {
                        imageView2.setVisibility(0);
                        c3194p1.z.setImageResource(c3194p1.x);
                    } else {
                        imageView2.setVisibility(8);
                    }
                }
            }
        }
        CharSequence charSequence2 = c3084n1.g;
        if (charSequence2 != null) {
            c3194p1.f = charSequence2;
            TextView textView2 = c3194p1.B;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c3084n1.h;
        if (charSequence3 != null) {
            c3194p1.c(-1, charSequence3, c3084n1.i);
        }
        CharSequence charSequence4 = c3084n1.j;
        if (charSequence4 != null) {
            c3194p1.c(-2, charSequence4, c3084n1.k);
        }
        CharSequence charSequence5 = c3084n1.l;
        if (charSequence5 != null) {
            c3194p1.c(-3, charSequence5, c3084n1.m);
        }
        if (c3084n1.p != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c3084n1.b.inflate(c3194p1.G, (ViewGroup) null);
            int i2 = c3084n1.s ? c3194p1.H : c3194p1.I;
            ListAdapter c0512b1 = c3084n1.p;
            if (c0512b1 == null) {
                c0512b1 = new C0512b1(c3084n1.a, i2, R.id.text1, null);
            }
            c3194p1.D = c0512b1;
            c3194p1.E = c3084n1.t;
            if (c3084n1.q != null) {
                alertController$RecycleListView.setOnItemClickListener(new C3029m1(c3084n1, c3194p1));
            }
            if (c3084n1.s) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c3194p1.g = alertController$RecycleListView;
        }
        View view2 = c3084n1.r;
        if (view2 != null) {
            c3194p1.h = view2;
            c3194p1.i = 0;
            c3194p1.j = false;
        }
        dialogInterfaceC3303r1.setCancelable(c3084n1.n);
        if (c3084n1.n) {
            dialogInterfaceC3303r1.setCanceledOnTouchOutside(true);
        }
        dialogInterfaceC3303r1.setOnCancelListener(null);
        dialogInterfaceC3303r1.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = c3084n1.o;
        if (onKeyListener != null) {
            dialogInterfaceC3303r1.setOnKeyListener(onKeyListener);
        }
        return dialogInterfaceC3303r1;
    }

    @Override // defpackage.InterfaceC2918k0
    public boolean b(View view) {
        ((BottomSheetBehavior) this.c).C(this.b);
        return true;
    }

    public void c(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i3);
            AbstractC0500aq.l(cArrCopyOf, "copyOf(...)");
            this.c = cArrCopyOf;
        }
    }

    public synchronized List d() {
        return Collections.unmodifiableList(new ArrayList((ArrayList) this.c));
    }

    public void e() {
        C2872j9 c2872j9 = C2872j9.c;
        char[] cArr = (char[]) this.c;
        c2872j9.getClass();
        AbstractC0500aq.m(cArr, "array");
        synchronized (c2872j9) {
            int i = c2872j9.b;
            if (cArr.length + i < AbstractC0460a4.a) {
                c2872j9.b = i + cArr.length;
                c2872j9.a.addLast(cArr);
            }
        }
    }

    public void f(String str, DialogInterface.OnClickListener onClickListener) {
        C3084n1 c3084n1 = (C3084n1) this.c;
        c3084n1.j = str;
        c3084n1.k = onClickListener;
    }

    public void g(int i, DialogInterface.OnClickListener onClickListener) {
        C3084n1 c3084n1 = (C3084n1) this.c;
        c3084n1.h = c3084n1.a.getText(i);
        c3084n1.i = onClickListener;
    }

    public void h(String str, DialogInterface.OnClickListener onClickListener) {
        C3084n1 c3084n1 = (C3084n1) this.c;
        c3084n1.h = str;
        c3084n1.i = onClickListener;
    }

    public void i() {
        a().show();
    }

    public void j(String str) {
        AbstractC0500aq.m(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        c(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C3249q1(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3249q1(Context context) {
        this(context, DialogInterfaceC3303r1.g(context, 0));
        this.a = 0;
    }

    public C3249q1(Context context, int i) {
        this.a = 0;
        this.c = new C3084n1(new ContextThemeWrapper(context, DialogInterfaceC3303r1.g(context, i)));
        this.b = i;
    }

    public C3249q1(ArrayList arrayList) {
        this.a = 2;
        this.b = 0;
        this.c = arrayList;
    }
}
