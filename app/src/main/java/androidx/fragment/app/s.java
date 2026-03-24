package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.AbstractC0076Dm;
import defpackage.AbstractC0467aB;
import defpackage.AbstractC3123nm;
import defpackage.AbstractC3264qG;
import defpackage.C0059Cm;
import defpackage.C0093Em;
import defpackage.C3395sm;
import defpackage.EnumC0042Bm;

/* loaded from: classes.dex */
public final class s implements LayoutInflater.Factory2 {
    public final t a;

    public s(t tVar) {
        this.a = tVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        w wVarF;
        StringBuilder sb;
        String str2;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        t tVar = this.a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, tVar);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0467aB.a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                zIsAssignableFrom = l.class.isAssignableFrom(C3395sm.a(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                l lVarA = resourceId != -1 ? tVar.A(resourceId) : null;
                if (lVarA == null && string != null) {
                    lVarA = tVar.B(string);
                }
                if (lVarA == null && id != -1) {
                    lVarA = tVar.A(id);
                }
                if (lVarA == null) {
                    C3395sm c3395smD = tVar.D();
                    context.getClassLoader();
                    lVarA = l.instantiate(c3395smD.a.t.b, attributeValue, null);
                    lVarA.mFromLayout = true;
                    lVarA.mFragmentId = resourceId != 0 ? resourceId : id;
                    lVarA.mContainerId = id;
                    lVarA.mTag = string;
                    lVarA.mInLayout = true;
                    lVarA.mFragmentManager = tVar;
                    AbstractC3123nm abstractC3123nm = tVar.t;
                    lVarA.mHost = abstractC3123nm;
                    lVarA.onInflate(abstractC3123nm.b, attributeSet, lVarA.mSavedFragmentState);
                    wVarF = tVar.a(lVarA);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        sb = new StringBuilder("Fragment ");
                        sb.append(lVarA);
                        str2 = " has been inflated via the <fragment> tag: id=0x";
                        sb.append(str2);
                        sb.append(Integer.toHexString(resourceId));
                        Log.v("FragmentManager", sb.toString());
                    }
                } else {
                    if (lVarA.mInLayout) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    lVarA.mInLayout = true;
                    lVarA.mFragmentManager = tVar;
                    AbstractC3123nm abstractC3123nm2 = tVar.t;
                    lVarA.mHost = abstractC3123nm2;
                    lVarA.onInflate(abstractC3123nm2.b, attributeSet, lVarA.mSavedFragmentState);
                    wVarF = tVar.f(lVarA);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        sb = new StringBuilder("Retained Fragment ");
                        sb.append(lVarA);
                        str2 = " has been re-attached via the <fragment> tag: id=0x";
                        sb.append(str2);
                        sb.append(Integer.toHexString(resourceId));
                        Log.v("FragmentManager", sb.toString());
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                C0059Cm c0059Cm = AbstractC0076Dm.a;
                AbstractC0076Dm.b(new C0093Em(lVarA, viewGroup, 0));
                AbstractC0076Dm.a(lVarA).getClass();
                Object obj = EnumC0042Bm.b;
                if (obj instanceof Void) {
                }
                lVarA.mContainer = viewGroup;
                wVarF.j();
                wVarF.i();
                View view2 = lVarA.mView;
                if (view2 == null) {
                    throw new IllegalStateException(AbstractC3264qG.x("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (lVarA.mView.getTag() == null) {
                    lVarA.mView.setTag(string);
                }
                lVarA.mView.addOnAttachStateChangeListener(new r(this, wVarF));
                return lVarA.mView;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
