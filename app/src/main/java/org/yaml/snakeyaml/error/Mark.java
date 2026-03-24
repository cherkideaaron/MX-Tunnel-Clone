package org.yaml.snakeyaml.error;

import org.yaml.snakeyaml.scanner.Constant;

/* loaded from: classes2.dex */
public final class Mark {
    private String buffer;
    private int column;
    private int index;
    private int line;
    private String name;
    private int pointer;

    public Mark(String str, int i, int i2, int i3, String str2, int i4) {
        this.name = str;
        this.index = i;
        this.line = i2;
        this.column = i3;
        this.buffer = str2;
        this.pointer = i4;
    }

    private boolean isLineBreak(char c) {
        return Constant.NULL_OR_LINEBR.has(c);
    }

    public int getColumn() {
        return this.column;
    }

    public int getIndex() {
        return this.index;
    }

    public int getLine() {
        return this.line;
    }

    public String getName() {
        return this.name;
    }

    public String get_snippet() {
        return get_snippet(4, 75);
    }

    public String toString() {
        String str = get_snippet();
        StringBuilder sb = new StringBuilder(" in \"");
        sb.append(this.name);
        sb.append("\", line ");
        sb.append(this.line + 1);
        sb.append(", column ");
        sb.append(this.column + 1);
        if (str != null) {
            sb.append(":\n");
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r3 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String get_snippet(int r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = r7.buffer
            if (r0 != 0) goto L6
            r8 = 0
            return r8
        L6:
            int r9 = r9 / 2
            int r9 = r9 + (-1)
            float r9 = (float) r9
            int r0 = r7.pointer
        Ld:
            java.lang.String r1 = " ... "
            java.lang.String r2 = ""
            if (r0 <= 0) goto L31
            java.lang.String r3 = r7.buffer
            int r4 = r0 + (-1)
            char r3 = r3.charAt(r4)
            boolean r3 = r7.isLineBreak(r3)
            if (r3 != 0) goto L31
            int r3 = r0 + (-1)
            int r4 = r7.pointer
            int r4 = r4 - r3
            float r4 = (float) r4
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 <= 0) goto L2f
            int r0 = r0 + 4
            r3 = r1
            goto L32
        L2f:
            r0 = r3
            goto Ld
        L31:
            r3 = r2
        L32:
            int r4 = r7.pointer
        L34:
            java.lang.String r5 = r7.buffer
            int r5 = r5.length()
            if (r4 >= r5) goto L58
            java.lang.String r5 = r7.buffer
            char r5 = r5.charAt(r4)
            boolean r5 = r7.isLineBreak(r5)
            if (r5 != 0) goto L58
            int r5 = r4 + 1
            int r6 = r7.pointer
            int r6 = r5 - r6
            float r6 = (float) r6
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 <= 0) goto L56
            int r4 = r4 + (-4)
            goto L59
        L56:
            r4 = r5
            goto L34
        L58:
            r1 = r2
        L59:
            java.lang.String r9 = r7.buffer
            java.lang.String r9 = r9.substring(r0, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r4 = 0
            r5 = r4
        L66:
            java.lang.String r6 = " "
            if (r5 >= r8) goto L70
            r2.append(r6)
            int r5 = r5 + 1
            goto L66
        L70:
            java.lang.String r5 = "\n"
            defpackage.AbstractC3264qG.v(r2, r3, r9, r1, r5)
        L75:
            int r9 = r7.pointer
            int r9 = r9 + r8
            int r9 = r9 - r0
            int r1 = r3.length()
            int r1 = r1 + r9
            if (r4 >= r1) goto L86
            r2.append(r6)
            int r4 = r4 + 1
            goto L75
        L86:
            java.lang.String r8 = "^"
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.yaml.snakeyaml.error.Mark.get_snippet(int, int):java.lang.String");
    }
}
