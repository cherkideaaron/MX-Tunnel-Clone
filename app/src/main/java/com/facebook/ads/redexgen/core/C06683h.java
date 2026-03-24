package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.3h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C06683h {
    public static byte[] A0R;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public HashMap<C2424pg, C2422pe> A0G;
    public HashSet<Integer> A0H;
    public List<String> A0I;
    public List<String> A0J;
    public List<String> A0K;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public List<String> A0L;
    public List<String> A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;

    static {
        A0P();
    }

    public static String A0H(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0R, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 34);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0P() {
        A0R = new byte[]{63, 61, 44, 40, 53, 51, 50, 53, 50, 59};
    }

    @Deprecated
    public C06683h() {
        this.A06 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.A05 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.A04 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.A03 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.A0F = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.A0E = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.A0Q = true;
        this.A0M = MetaExoPlayerCustomizedCollections.A01();
        this.A0D = 0;
        this.A0L = MetaExoPlayerCustomizedCollections.A01();
        this.A0I = MetaExoPlayerCustomizedCollections.A01();
        this.A0B = 0;
        this.A02 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.A01 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.A0J = MetaExoPlayerCustomizedCollections.A01();
        this.A0K = MetaExoPlayerCustomizedCollections.A01();
        this.A0C = 0;
        this.A00 = 0;
        this.A0P = false;
        this.A0O = false;
        this.A0N = false;
        this.A0G = new HashMap<>();
        this.A0H = new HashSet<>();
    }

    public C06683h(Context context) {
        this();
        A0n(context);
        A0o(context, true);
    }

    public C06683h(Bundle bundle) {
        List listA01;
        this.A06 = bundle.getInt(C2420pc.A0e, C2420pc.A0U.A06);
        this.A05 = bundle.getInt(C2420pc.A0d, C2420pc.A0U.A05);
        this.A04 = bundle.getInt(C2420pc.A0c, C2420pc.A0U.A04);
        this.A03 = bundle.getInt(C2420pc.A0b, C2420pc.A0U.A03);
        this.A0A = bundle.getInt(C2420pc.A0i, C2420pc.A0U.A0A);
        this.A09 = bundle.getInt(C2420pc.A0h, C2420pc.A0U.A09);
        this.A08 = bundle.getInt(C2420pc.A0n(), C2420pc.A0U.A08);
        this.A07 = bundle.getInt(C2420pc.A0f, C2420pc.A0U.A07);
        this.A0F = bundle.getInt(C2420pc.A0v, C2420pc.A0U.A0F);
        this.A0E = bundle.getInt(C2420pc.A0t, C2420pc.A0U.A0E);
        this.A0Q = bundle.getBoolean(C2420pc.A0u, C2420pc.A0U.A0Q);
        this.A0M = BP.A07((String[]) AbstractC2124ka.A00(bundle.getStringArray(C2420pc.A0p), new String[0]));
        this.A0D = bundle.getInt(C2420pc.A0q, C2420pc.A0U.A0D);
        String[] preferredVideoLanguages1 = (String[]) AbstractC2124ka.A00(bundle.getStringArray(C2420pc.A0o), new String[0]);
        this.A0L = A0G(preferredVideoLanguages1);
        String[] preferredVideoLanguages12 = new String[0];
        this.A0I = A0G((String[]) AbstractC2124ka.A00(bundle.getStringArray(C2420pc.A0j), preferredVideoLanguages12));
        this.A0B = bundle.getInt(C2420pc.A0l, C2420pc.A0U.A0B);
        this.A02 = bundle.getInt(C2420pc.A0a, C2420pc.A0U.A02);
        this.A01 = bundle.getInt(C2420pc.A0Z, C2420pc.A0U.A01);
        String[] preferredVideoLanguages13 = new String[0];
        this.A0J = BP.A07((String[]) AbstractC2124ka.A00(bundle.getStringArray(C2420pc.A0k), preferredVideoLanguages13));
        String[] preferredVideoLanguages14 = new String[0];
        this.A0K = A0G((String[]) AbstractC2124ka.A00(bundle.getStringArray(C2420pc.A0m), preferredVideoLanguages14));
        this.A0C = bundle.getInt(C2420pc.A0n, C2420pc.A0U.A0C);
        this.A00 = bundle.getInt(C2420pc.A0e(), C2420pc.A0U.A00);
        this.A0P = bundle.getBoolean(C2420pc.A0s, C2420pc.A0U.A0P);
        this.A0O = bundle.getBoolean(C2420pc.A0X, C2420pc.A0U.A0O);
        this.A0N = bundle.getBoolean(C2420pc.A0W, C2420pc.A0U.A0N);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C2420pc.A0r);
        if (parcelableArrayList == null) {
            listA01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            listA01 = AnonymousClass44.A01(C2422pe.A02, parcelableArrayList);
        }
        this.A0G = new HashMap<>();
        for (int i = 0; i < listA01.size(); i++) {
            C2422pe c2422pe = (C2422pe) listA01.get(i);
            this.A0G.put(c2422pe.A00, c2422pe);
        }
        int[] iArr = (int[]) AbstractC2124ka.A00(bundle.getIntArray(C2420pc.A0V), new int[0]);
        this.A0H = new HashSet<>();
        for (int i2 : iArr) {
            this.A0H.add(Integer.valueOf(i2));
        }
    }

    public C06683h(C2420pc c2420pc) {
        A0R(c2420pc);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<java.lang.String> */
    public static BP<String> A0G(String[] strArr) {
        C2K c2kA01 = BP.A01();
        for (String str : (String[]) AbstractC06853y.A01(strArr)) {
            c2kA01.A04(C5C.A0k((String) AbstractC06853y.A01(str)));
        }
        return c2kA01.A05();
    }

    private void A0Q(Context context) {
        CaptioningManager captioningManager;
        if ((C5C.A02 < 23 && Looper.myLooper() == null) || (captioningManager = (CaptioningManager) context.getSystemService(A0H(0, 10, 126))) == null || !captioningManager.isEnabled()) {
            return;
        }
        this.A0C = 1088;
        Locale locale = captioningManager.getLocale();
        if (locale != null) {
            this.A0K = BP.A04(C5C.A0o(locale));
        }
    }

    @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
    private void A0R(C2420pc c2420pc) {
        this.A06 = c2420pc.A06;
        this.A05 = c2420pc.A05;
        this.A04 = c2420pc.A04;
        this.A03 = c2420pc.A03;
        this.A0A = c2420pc.A0A;
        this.A09 = c2420pc.A09;
        this.A08 = c2420pc.A08;
        this.A07 = c2420pc.A07;
        this.A0F = c2420pc.A0F;
        this.A0E = c2420pc.A0E;
        this.A0Q = c2420pc.A0Q;
        this.A0M = c2420pc.A0M;
        this.A0D = c2420pc.A0D;
        this.A0L = c2420pc.A0L;
        this.A0I = c2420pc.A0I;
        this.A0B = c2420pc.A0B;
        this.A02 = c2420pc.A02;
        this.A01 = c2420pc.A01;
        this.A0J = c2420pc.A0J;
        this.A0K = c2420pc.A0K;
        this.A0C = c2420pc.A0C;
        this.A00 = c2420pc.A00;
        this.A0P = c2420pc.A0P;
        this.A0O = c2420pc.A0O;
        this.A0N = c2420pc.A0N;
        this.A0H = new HashSet<>(c2420pc.A0H);
        this.A0G = new HashMap<>(c2420pc.A0G);
    }

    public C06683h A0W(C2420pc c2420pc) {
        A0R(c2420pc);
        return this;
    }

    public C06683h A0m(int i, int i2, boolean z) {
        this.A0F = i;
        this.A0E = i2;
        this.A0Q = z;
        return this;
    }

    public C06683h A0n(Context context) {
        if (C5C.A02 >= 19) {
            A0Q(context);
        }
        return this;
    }

    public C06683h A0o(Context context, boolean z) {
        Point viewportSize = C5C.A0W(context);
        return A0m(viewportSize.x, viewportSize.y, z);
    }

    public C2420pc A0p() {
        return new C2420pc(this);
    }
}
