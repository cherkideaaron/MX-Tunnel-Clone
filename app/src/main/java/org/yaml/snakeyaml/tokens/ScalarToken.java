package org.yaml.snakeyaml.tokens;

import org.yaml.snakeyaml.error.Mark;
import org.yaml.snakeyaml.tokens.Token;

/* loaded from: classes2.dex */
public final class ScalarToken extends Token {
    private final boolean plain;
    private final char style;
    private final String value;

    public ScalarToken(String str, Mark mark, Mark mark2, boolean z) {
        this(str, z, mark, mark2, (char) 0);
    }

    @Override // org.yaml.snakeyaml.tokens.Token
    public String getArguments() {
        return "value=" + this.value + ", plain=" + this.plain + ", style=" + this.style;
    }

    public boolean getPlain() {
        return this.plain;
    }

    public char getStyle() {
        return this.style;
    }

    @Override // org.yaml.snakeyaml.tokens.Token
    public Token.ID getTokenId() {
        return Token.ID.Scalar;
    }

    public String getValue() {
        return this.value;
    }

    public ScalarToken(String str, boolean z, Mark mark, Mark mark2, char c) {
        super(mark, mark2);
        this.value = str;
        this.plain = z;
        this.style = c;
    }
}
