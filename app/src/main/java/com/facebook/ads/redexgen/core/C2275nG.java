package com.facebook.ads.redexgen.core;

import com.google.android.gms.common.api.Api;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2275nG extends AbstractC0935Eh<C2275nG> implements Comparable<C2275nG> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static int A01(List<C2275nG> list, List<C2275nG> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C2275nG(int i, C2424pg c2424pg, int i2, C08199i c08199i, int i3, String str) {
        List<String> listA03;
        super(i, c2424pg, i2);
        int i4 = 0;
        this.A08 = C08189h.A0S(i3, false);
        int i5 = super.A02.A0H & (~((C2420pc) c08199i).A00);
        this.A06 = (i5 & 1) != 0;
        this.A07 = (i5 & 2) != 0;
        int i6 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int bestLanguageScore = 0;
        if (c08199i.A0K.isEmpty()) {
            listA03 = MetaExoPlayerCustomizedCollections.A03("");
        } else {
            listA03 = c08199i.A0K;
        }
        int bestLanguageIndex = 0;
        while (true) {
            if (bestLanguageIndex >= listA03.size()) {
                break;
            }
            int iA02 = C08189h.A02(super.A02, listA03.get(bestLanguageIndex), c08199i.A0P);
            if (iA02 > 0) {
                i6 = bestLanguageIndex;
                bestLanguageScore = iA02;
                break;
            }
            bestLanguageIndex++;
        }
        this.A00 = i6;
        this.A01 = bestLanguageScore;
        this.A02 = C08189h.A00(super.A02.A0E, ((C2420pc) c08199i).A0C);
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = C08189h.A02(super.A02, str, C08189h.A0K(str) == null);
        boolean z = this.A01 > 0 || (c08199i.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (C08189h.A0S(i3, c08199i.A0B) && z) {
            i4 = 1;
        }
        this.A04 = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2275nG c2275nG) {
        AbstractC2313ns abstractC2313nsA06 = AbstractC2313ns.A01().A09(this.A08, c2275nG.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c2275nG.A00), AbstractC2463qK.A03().A06()).A06(this.A01, c2275nG.A01).A06(this.A02, c2275nG.A02).A09(this.A06, c2275nG.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c2275nG.A07), this.A01 == 0 ? AbstractC2463qK.A03() : AbstractC2463qK.A03().A06()).A06(this.A03, c2275nG.A03);
        if (this.A02 == 0) {
            abstractC2313nsA06 = abstractC2313nsA06.A0A(this.A05, c2275nG.A05);
        }
        return abstractC2313nsA06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static BP<C2275nG> A02(int i, C2424pg c2424pg, C08199i c08199i, int[] iArr, String str) {
        C2K c2kA01 = BP.A01();
        for (int i2 = 0; i2 < c2424pg.A01; i2++) {
            c2kA01.A04(new C2275nG(i, c2424pg, i2, c08199i, iArr[i2], str));
        }
        return c2kA01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC0935Eh
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C2275nG c2275nG) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0935Eh
    public final int A08() {
        return this.A04;
    }
}
