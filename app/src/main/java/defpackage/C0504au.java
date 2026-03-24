package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.g;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.internal.CheckableImageButton;
import com.mxtunnel.pro.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import org.achartengine.renderer.DefaultRenderer;

/* renamed from: au, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0504au<S> extends g {
    public CheckableImageButton A;
    public C2638eu B;
    public boolean C;
    public CharSequence D;
    public CharSequence E;
    public final LinkedHashSet a;
    public final LinkedHashSet b;
    public int c;
    public Uy d;
    public C2871j8 e;
    public Ut f;
    public int m;
    public CharSequence n;
    public boolean o;
    public int p;
    public int q;
    public CharSequence r;
    public int s;
    public CharSequence t;
    public int u;
    public CharSequence v;
    public int w;
    public CharSequence x;
    public TextView y;
    public TextView z;

    public C0504au() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.a = new LinkedHashSet();
        this.b = new LinkedHashSet();
    }

    public static int h(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarC = AbstractC0477aL.c();
        calendarC.set(5, 1);
        Calendar calendarB = AbstractC0477aL.b(calendarC);
        calendarB.get(2);
        calendarB.get(1);
        int maximum = calendarB.getMaximum(7);
        calendarB.getActualMaximum(5);
        calendarB.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean i(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0069Df.W(context, R.attr.materialCalendarStyle, Ut.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public final void g() {
        Vs.t(getArguments().getParcelable("DATE_SELECTOR_KEY"));
    }

    @Override // androidx.fragment.app.g, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.l
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.c = bundle.getInt("OVERRIDE_THEME_RES_ID");
        Vs.t(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.e = (C2871j8) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        Vs.t(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.m = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.n = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.p = bundle.getInt("INPUT_MODE_KEY");
        this.q = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.r = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.s = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.t = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.u = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.v = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.w = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.x = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.n;
        if (text == null) {
            text = requireContext().getResources().getText(this.m);
        }
        this.D = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.E = text;
    }

    @Override // androidx.fragment.app.g
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        requireContext();
        int i = this.c;
        if (i == 0) {
            g();
            throw null;
        }
        Dialog dialog = new Dialog(contextRequireContext, i);
        Context context = dialog.getContext();
        this.o = i(context, android.R.attr.windowFullscreen);
        this.B = new C2638eu(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, RA.o, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.B.l(context);
        this.B.o(ColorStateList.valueOf(color));
        this.B.n(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.l
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewFindViewById;
        LinearLayout.LayoutParams layoutParams;
        View viewInflate = layoutInflater.inflate(this.o ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.o) {
            viewFindViewById = viewInflate.findViewById(R.id.mtrl_calendar_frame);
            layoutParams = new LinearLayout.LayoutParams(h(context), -2);
        } else {
            viewFindViewById = viewInflate.findViewById(R.id.mtrl_calendar_main_pane);
            layoutParams = new LinearLayout.LayoutParams(h(context), -1);
        }
        viewFindViewById.setLayoutParams(layoutParams);
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.z = textView;
        textView.setAccessibilityLiveRegion(1);
        this.A = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.y = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.A.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC0500aq.F(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC0500aq.F(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.A.setChecked(this.p != 0);
        UL.l(this.A, null);
        this.A.setContentDescription(this.A.getContext().getString(this.p == 1 ? R.string.mtrl_picker_toggle_to_calendar_input_mode : R.string.mtrl_picker_toggle_to_text_input_mode));
        this.A.setOnClickListener(new V9(this, 2));
        g();
        throw null;
    }

    @Override // androidx.fragment.app.g, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.l
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.c);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C2871j8 c2871j8 = this.e;
        C2818i8 c2818i8 = new C2818i8();
        int i = C2818i8.b;
        int i2 = C2818i8.b;
        long j = c2871j8.a.f;
        long j2 = c2871j8.b.f;
        c2818i8.a = Long.valueOf(c2871j8.d.f);
        Ut ut = this.f;
        C3512uv c3512uv = ut == null ? null : ut.d;
        if (c3512uv != null) {
            c2818i8.a = Long.valueOf(c3512uv.f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c2871j8.c);
        C3512uv c3512uvB = C3512uv.b(j);
        C3512uv c3512uvB2 = C3512uv.b(j2);
        C0018Af c0018Af = (C0018Af) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = c2818i8.a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C2871j8(c3512uvB, c3512uvB2, c0018Af, l == null ? null : C3512uv.b(l.longValue()), c2871j8.e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.m);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.n);
        bundle.putInt("INPUT_MODE_KEY", this.p);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.q);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.r);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.s);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.t);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.u);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.v);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.w);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v21, types: [DN] */
    /* JADX WARN: Type inference failed for: r4v24, types: [DN] */
    /* JADX WARN: Type inference failed for: r8v10, types: [DN] */
    /* JADX WARN: Type inference failed for: r8v13, types: [DN] */
    @Override // androidx.fragment.app.g, androidx.fragment.app.l
    public final void onStart() throws Resources.NotFoundException {
        BN cn2;
        BN cn3;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.o) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.B);
            if (!this.C) {
                View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListY = AbstractC3296qu.y(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListY != null ? Integer.valueOf(colorStateListY.getDefaultColor()) : null;
                boolean z = false;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int iB = AbstractC0500aq.B(window.getContext(), android.R.attr.colorBackground, DefaultRenderer.BACKGROUND_COLOR);
                if (z2) {
                    numValueOf = Integer.valueOf(iB);
                }
                JP.a(window, false);
                window.getContext();
                int iD = Build.VERSION.SDK_INT < 27 ? AbstractC0013Aa.d(AbstractC0500aq.B(window.getContext(), android.R.attr.navigationBarColor, DefaultRenderer.BACKGROUND_COLOR), UserVerificationMethods.USER_VERIFY_PATTERN) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iD);
                boolean z3 = AbstractC0500aq.N(0) || AbstractC0500aq.N(numValueOf.intValue());
                C2827iH c2827iH = new C2827iH(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                if (i >= 35) {
                    ?? en = new EN(window.getInsetsController(), c2827iH);
                    en.c = window;
                    cn2 = en;
                } else if (i >= 30) {
                    ?? dn = new DN(window.getInsetsController(), c2827iH);
                    dn.c = window;
                    cn2 = dn;
                } else {
                    cn2 = i >= 26 ? new CN(window, c2827iH) : new BN(window, c2827iH);
                }
                cn2.b(z3);
                boolean zN = AbstractC0500aq.N(iB);
                if (AbstractC0500aq.N(iD) || (iD == 0 && zN)) {
                    z = true;
                }
                C2827iH c2827iH2 = new C2827iH(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 35) {
                    ?? en2 = new EN(window.getInsetsController(), c2827iH2);
                    en2.c = window;
                    cn3 = en2;
                } else if (i2 >= 30) {
                    ?? dn2 = new DN(window.getInsetsController(), c2827iH2);
                    dn2.c = window;
                    cn3 = dn2;
                } else {
                    cn3 = i2 >= 26 ? new CN(window, c2827iH2) : new BN(window, c2827iH2);
                }
                cn3.a(z);
                Zt zt = new Zt(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight());
                WeakHashMap weakHashMap = UL.a;
                ML.k(viewFindViewById, zt);
                this.C = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.B, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC0113Fp(requireDialog(), rect));
        }
        requireContext();
        int i3 = this.c;
        if (i3 == 0) {
            g();
            throw null;
        }
        g();
        C2871j8 c2871j8 = this.e;
        Ut ut = new Ut();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i3);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c2871j8);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", c2871j8.d);
        ut.setArguments(bundle);
        this.f = ut;
        Uy uy = ut;
        if (this.p == 1) {
            g();
            C2871j8 c2871j82 = this.e;
            Uy c2693fu = new C2693fu();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i3);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c2871j82);
            c2693fu.setArguments(bundle2);
            uy = c2693fu;
        }
        this.d = uy;
        this.y.setText((this.p == 1 && getResources().getConfiguration().orientation == 2) ? this.E : this.D);
        g();
        getContext();
        throw null;
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.l
    public final void onStop() {
        this.d.a.clear();
        super.onStop();
    }
}
