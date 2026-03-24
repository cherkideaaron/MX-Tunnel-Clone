package rased.vpn.app.activities;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import defpackage.AbstractActivityC2592e2;

/* loaded from: classes2.dex */
public class ExceptionActivity extends AbstractActivityC2592e2 {
    @Override // androidx.fragment.app.q, defpackage.AbstractActivityC2619eb, defpackage.AbstractActivityC2565db, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        setContentView(linearLayout);
        ScrollView scrollView = new ScrollView(this);
        TextView textView = new TextView(this);
        scrollView.addView(textView);
        linearLayout.addView(scrollView);
        textView.setText(getIntent().getStringExtra("error"));
    }
}
