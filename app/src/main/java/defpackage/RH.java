package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class RH extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public RH(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v63 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r4;
        int i;
        boolean z;
        Du du;
        ColorStateList colorStateList;
        int resourceId;
        QH qh = new QH(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType != 3) {
                    z = r4;
                } else {
                    String name2 = xmlResourceParser.getName();
                    if (z3 && name2.equals(str)) {
                        z = r4;
                        z3 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            qh.b = 0;
                            qh.c = 0;
                            qh.d = 0;
                            qh.e = 0;
                            qh.f = r4;
                            qh.g = r4;
                        } else if (name2.equals("item")) {
                            if (!qh.h) {
                                Du du2 = qh.z;
                                if (du2 == null || !du2.b.hasSubMenu()) {
                                    qh.h = r4;
                                    qh.b(qh.a.add(qh.b, qh.i, qh.j, qh.k));
                                } else {
                                    qh.h = r4;
                                    qh.b(qh.a.addSubMenu(qh.b, qh.i, qh.j, qh.k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = r4;
                            z2 = z;
                        }
                        z = r4;
                    }
                }
                eventType = xmlResourceParser.next();
                r4 = z;
                i = 2;
            } else {
                if (!z3) {
                    String name3 = xmlResourceParser.getName();
                    boolean zEquals = name3.equals("group");
                    RH rh = qh.E;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = rh.c.obtainStyledAttributes(attributeSet, AbstractC2547dB.p);
                        qh.b = typedArrayObtainStyledAttributes.getResourceId(r4, 0);
                        qh.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        qh.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        qh.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        qh.f = typedArrayObtainStyledAttributes.getBoolean(2, r4);
                        qh.g = typedArrayObtainStyledAttributes.getBoolean(0, r4);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = rh.c;
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC2547dB.q);
                            qh.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            qh.j = (typedArrayObtainStyledAttributes2.getInt(5, qh.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, qh.d) & 65535);
                            qh.k = typedArrayObtainStyledAttributes2.getText(7);
                            qh.l = typedArrayObtainStyledAttributes2.getText(8);
                            qh.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            qh.n = string == null ? (char) 0 : string.charAt(0);
                            qh.o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            qh.p = string2 == null ? (char) 0 : string2.charAt(0);
                            qh.q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            qh.r = typedArrayObtainStyledAttributes2.hasValue(11) ? typedArrayObtainStyledAttributes2.getBoolean(11, false) : qh.e;
                            qh.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            qh.t = typedArrayObtainStyledAttributes2.getBoolean(4, qh.f);
                            qh.u = typedArrayObtainStyledAttributes2.getBoolean(1, qh.g);
                            qh.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            qh.y = typedArrayObtainStyledAttributes2.getString(12);
                            qh.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            qh.x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z4 = string3 != null;
                            if (z4 && qh.w == 0 && qh.x == null) {
                                du = (Du) qh.a(string3, f, rh.b);
                            } else {
                                if (z4) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                du = null;
                            }
                            qh.z = du;
                            qh.A = typedArrayObtainStyledAttributes2.getText(17);
                            qh.B = typedArrayObtainStyledAttributes2.getText(22);
                            qh.D = typedArrayObtainStyledAttributes2.hasValue(19) ? AbstractC3228ph.c(typedArrayObtainStyledAttributes2.getInt(19, -1), qh.D) : null;
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC0115Ga.u(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                qh.C = colorStateList;
                            } else {
                                qh.C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            qh.h = false;
                            z = true;
                        } else if (name3.equals("menu")) {
                            z = true;
                            qh.h = true;
                            SubMenu subMenuAddSubMenu = qh.a.addSubMenu(qh.b, qh.i, qh.j, qh.k);
                            qh.b(subMenuAddSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                        } else {
                            z = true;
                            str = name3;
                            z3 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = z;
                        i = 2;
                    }
                }
                z = r4;
            }
            eventType = xmlResourceParser.next();
            r4 = z;
            i = 2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC3511uu)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC3511uu) {
                    MenuC3511uu menuC3511uu = (MenuC3511uu) menu;
                    if (!menuC3511uu.p) {
                        menuC3511uu.w();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((MenuC3511uu) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuC3511uu) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
