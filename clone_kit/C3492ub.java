package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;

/* renamed from: ub, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3492ub {
    public static C3492ub c;
    public final YD a;
    public final XD b;

    public C3492ub(Context context) {
        YD yd = new YD(context);
        this.a = yd;
        this.b = (XD) yd.edit();
    }

    public static C3492ub c(Context context) {
        if (c == null) {
            c = new C3492ub(context);
        }
        return c;
    }

    public static String m(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(Deobfuscator$MHRTUNNELVPN$app.getString(-168237516157882L));
        }
        return sb.toString();
    }

    public final void A(String str) {
        XD xd = this.b;
        xd.putString(Deobfuscator$MHRTUNNELVPN$app.getString(-166004133163962L), str);
        xd.apply();
    }

    public final void B(String str) {
        XD xd = this.b;
        xd.putString(Deobfuscator$MHRTUNNELVPN$app.getString(-167507371717562L), str);
        xd.apply();
    }

    public final void C(int i) {
        XD xd = this.b;
        xd.putInt(Deobfuscator$MHRTUNNELVPN$app.getString(-167576091194298L), i);
        xd.apply();
    }

    public final void D(String str) {
        XD xd = this.b;
        xd.putString(Deobfuscator$MHRTUNNELVPN$app.getString(-166042787869626L), str);
        xd.apply();
    }

    public final void E(boolean z) {
        XD xd = this.b;
        xd.putBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-168576818574266L), z);
        xd.apply();
    }

    public final void F(boolean z) {
        XD xd = this.b;
        xd.putBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-168740027331514L), z);
        xd.apply();
    }

    public final Set a() {
        return this.a.getStringSet(Deobfuscator$MHRTUNNELVPN$app.getString(-169100804584378L), new HashSet());
    }

    public final boolean b() {
        return this.a.getBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-169268308308922L), false);
    }

    public final String d() {
        return this.a.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-168881761252282L), Deobfuscator$MHRTUNNELVPN$app.getString(-168937595827130L));
    }

    public final String e() {
        return this.a.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-165411427677114L), Deobfuscator$MHRTUNNELVPN$app.getString(-165505916957626L));
    }

    public final int f() {
        return this.a.getInt(Deobfuscator$MHRTUNNELVPN$app.getString(-166407860089786L), 0);
    }

    public final String g() {
        return this.a.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-167043515249594L), Deobfuscator$MHRTUNNELVPN$app.getString(-167090759889850L));
    }

    public final String h() {
        return this.a.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-166519529239482L), Deobfuscator$MHRTUNNELVPN$app.getString(-166558183945146L));
    }

    public final int i() {
        return Integer.parseInt(this.a.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-166562478912442L), Deobfuscator$MHRTUNNELVPN$app.getString(-166601133618106L)));
    }

    public final String j() {
        return this.a.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-166729982636986L), Deobfuscator$MHRTUNNELVPN$app.getString(-166768637342650L));
    }

    public final String k() {
        return this.a.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-167485896881082L), Deobfuscator$MHRTUNNELVPN$app.getString(-167503076750266L));
    }

    public final int l() {
        return this.a.getInt(Deobfuscator$MHRTUNNELVPN$app.getString(-167524551586746L), 0);
    }

    public final Boolean n() {
        return Boolean.valueOf(this.a.getBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-168697077658554L), false));
    }

    public final Boolean o() {
        return Boolean.valueOf(this.a.getBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-168520983999418L), false));
    }

    public final Boolean p() {
        return Boolean.valueOf(this.a.getBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-168615473279930L), false));
    }

    public final Boolean q() {
        return Boolean.valueOf(this.a.getBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-168782977004474L), false));
    }

    public final void r(String str) {
        XD xd = this.b;
        xd.putString(Deobfuscator$MHRTUNNELVPN$app.getString(-165273988723642L), str);
        xd.apply();
    }

    public final void s(String str) {
        XD xd = this.b;
        xd.putString(Deobfuscator$MHRTUNNELVPN$app.getString(-168155911779258L), str);
        xd.apply();
    }

    public final void t(String str) {
        XD xd = this.b;
        xd.putString(Deobfuscator$MHRTUNNELVPN$app.getString(-165316938396602L), str);
        xd.apply();
    }

    public final String toString() {
        return super.toString();
    }

    public final void u(boolean z) {
        XD xd = this.b;
        xd.putBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-168654127985594L), z);
        xd.apply();
    }

    public final void v(String str) {
        XD xd = this.b;
        xd.putString(Deobfuscator$MHRTUNNELVPN$app.getString(-167859559035834L), str);
        xd.apply();
    }

    public final void w(String str) {
        XD xd = this.b;
        xd.putString(Deobfuscator$MHRTUNNELVPN$app.getString(-167906803676090L), str);
        xd.apply();
    }

    public final void x(boolean z) {
        XD xd = this.b;
        xd.putBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-168465149424570L), z);
        xd.apply();
    }

    public final void y(String str) {
        XD xd = this.b;
        xd.putString(Deobfuscator$MHRTUNNELVPN$app.getString(-168001292956602L), str);
        xd.apply();
    }

    public final void z(String str) {
        XD xd = this.b;
        xd.putString(Deobfuscator$MHRTUNNELVPN$app.getString(-168039947662266L), str);
        xd.apply();
    }
}
