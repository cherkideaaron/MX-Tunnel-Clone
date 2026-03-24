package defpackage;

/* renamed from: Ri, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0310Ri implements Runnable {
    public static final String c = C3130nt.f("EnqueueRunnable");
    public final RN a;
    public final R2 b = new R2(3);

    public RunnableC0310Ri(RN rn) {
        this.a = rn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x022c A[Catch: all -> 0x02fe, TryCatch #12 {all -> 0x02fe, blocks: (B:144:0x02d4, B:75:0x0172, B:76:0x0178, B:51:0x00f9, B:53:0x0105, B:54:0x0109, B:56:0x010f, B:61:0x0121, B:62:0x0131, B:64:0x0137, B:66:0x0151, B:68:0x0158, B:70:0x0161, B:72:0x0169, B:73:0x016f, B:67:0x0155, B:81:0x0181, B:82:0x0188, B:84:0x018e, B:88:0x019c, B:97:0x01ba, B:99:0x01c0, B:101:0x01d2, B:103:0x01d6, B:105:0x01da, B:108:0x0207, B:111:0x020d, B:113:0x0225, B:115:0x022c, B:117:0x0230, B:119:0x0253, B:121:0x025a, B:122:0x025d, B:123:0x025e, B:124:0x0264, B:126:0x026a, B:128:0x0291, B:130:0x0296, B:131:0x0299, B:133:0x029c, B:135:0x02bd, B:137:0x02c2, B:138:0x02c5, B:141:0x02cd, B:142:0x02d0, B:91:0x01a4, B:92:0x01a7, B:93:0x01ab, B:95:0x01b3, B:96:0x01b6, B:134:0x02b3, B:69:0x015b, B:112:0x021b, B:127:0x0287, B:118:0x0249), top: B:190:0x0039, inners: #0, #2, #4, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026a A[Catch: all -> 0x02fe, TRY_LEAVE, TryCatch #12 {all -> 0x02fe, blocks: (B:144:0x02d4, B:75:0x0172, B:76:0x0178, B:51:0x00f9, B:53:0x0105, B:54:0x0109, B:56:0x010f, B:61:0x0121, B:62:0x0131, B:64:0x0137, B:66:0x0151, B:68:0x0158, B:70:0x0161, B:72:0x0169, B:73:0x016f, B:67:0x0155, B:81:0x0181, B:82:0x0188, B:84:0x018e, B:88:0x019c, B:97:0x01ba, B:99:0x01c0, B:101:0x01d2, B:103:0x01d6, B:105:0x01da, B:108:0x0207, B:111:0x020d, B:113:0x0225, B:115:0x022c, B:117:0x0230, B:119:0x0253, B:121:0x025a, B:122:0x025d, B:123:0x025e, B:124:0x0264, B:126:0x026a, B:128:0x0291, B:130:0x0296, B:131:0x0299, B:133:0x029c, B:135:0x02bd, B:137:0x02c2, B:138:0x02c5, B:141:0x02cd, B:142:0x02d0, B:91:0x01a4, B:92:0x01a7, B:93:0x01ab, B:95:0x01b3, B:96:0x01b6, B:134:0x02b3, B:69:0x015b, B:112:0x021b, B:127:0x0287, B:118:0x0249), top: B:190:0x0039, inners: #0, #2, #4, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x029c A[Catch: all -> 0x02fe, TRY_LEAVE, TryCatch #12 {all -> 0x02fe, blocks: (B:144:0x02d4, B:75:0x0172, B:76:0x0178, B:51:0x00f9, B:53:0x0105, B:54:0x0109, B:56:0x010f, B:61:0x0121, B:62:0x0131, B:64:0x0137, B:66:0x0151, B:68:0x0158, B:70:0x0161, B:72:0x0169, B:73:0x016f, B:67:0x0155, B:81:0x0181, B:82:0x0188, B:84:0x018e, B:88:0x019c, B:97:0x01ba, B:99:0x01c0, B:101:0x01d2, B:103:0x01d6, B:105:0x01da, B:108:0x0207, B:111:0x020d, B:113:0x0225, B:115:0x022c, B:117:0x0230, B:119:0x0253, B:121:0x025a, B:122:0x025d, B:123:0x025e, B:124:0x0264, B:126:0x026a, B:128:0x0291, B:130:0x0296, B:131:0x0299, B:133:0x029c, B:135:0x02bd, B:137:0x02c2, B:138:0x02c5, B:141:0x02cd, B:142:0x02d0, B:91:0x01a4, B:92:0x01a7, B:93:0x01ab, B:95:0x01b3, B:96:0x01b6, B:134:0x02b3, B:69:0x015b, B:112:0x021b, B:127:0x0287, B:118:0x0249), top: B:190:0x0039, inners: #0, #2, #4, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02de A[Catch: all -> 0x02f2, TryCatch #7 {all -> 0x02f2, blocks: (B:145:0x02d9, B:147:0x02de, B:151:0x02f4), top: B:181:0x02d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018e A[Catch: all -> 0x02fe, TryCatch #12 {all -> 0x02fe, blocks: (B:144:0x02d4, B:75:0x0172, B:76:0x0178, B:51:0x00f9, B:53:0x0105, B:54:0x0109, B:56:0x010f, B:61:0x0121, B:62:0x0131, B:64:0x0137, B:66:0x0151, B:68:0x0158, B:70:0x0161, B:72:0x0169, B:73:0x016f, B:67:0x0155, B:81:0x0181, B:82:0x0188, B:84:0x018e, B:88:0x019c, B:97:0x01ba, B:99:0x01c0, B:101:0x01d2, B:103:0x01d6, B:105:0x01da, B:108:0x0207, B:111:0x020d, B:113:0x0225, B:115:0x022c, B:117:0x0230, B:119:0x0253, B:121:0x025a, B:122:0x025d, B:123:0x025e, B:124:0x0264, B:126:0x026a, B:128:0x0291, B:130:0x0296, B:131:0x0299, B:133:0x029c, B:135:0x02bd, B:137:0x02c2, B:138:0x02c5, B:141:0x02cd, B:142:0x02d0, B:91:0x01a4, B:92:0x01a7, B:93:0x01ab, B:95:0x01b3, B:96:0x01b6, B:134:0x02b3, B:69:0x015b, B:112:0x021b, B:127:0x0287, B:118:0x0249), top: B:190:0x0039, inners: #0, #2, #4, #8, #9 }] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [R2] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v30 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC0310Ri.run():void");
    }
}
