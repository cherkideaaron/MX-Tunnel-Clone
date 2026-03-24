package org.yaml.snakeyaml.tokens;

import java.util.List;
import org.yaml.snakeyaml.error.Mark;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.tokens.Token;

/* loaded from: classes2.dex */
public final class DirectiveToken<T> extends Token {
    private final String name;
    private final List<T> value;

    public DirectiveToken(String str, List<T> list, Mark mark, Mark mark2) {
        super(mark, mark2);
        this.name = str;
        if (list == null || list.size() == 2) {
            this.value = list;
        } else {
            throw new YAMLException("Two strings must be provided instead of " + String.valueOf(list.size()));
        }
    }

    @Override // org.yaml.snakeyaml.tokens.Token
    public String getArguments() {
        StringBuilder sb;
        String str;
        if (this.value != null) {
            sb = new StringBuilder("name=");
            sb.append(this.name);
            sb.append(", value=[");
            sb.append(this.value.get(0));
            sb.append(", ");
            sb.append(this.value.get(1));
            str = "]";
        } else {
            sb = new StringBuilder("name=");
            str = this.name;
        }
        sb.append(str);
        return sb.toString();
    }

    public String getName() {
        return this.name;
    }

    @Override // org.yaml.snakeyaml.tokens.Token
    public Token.ID getTokenId() {
        return Token.ID.Directive;
    }

    public List<T> getValue() {
        return this.value;
    }
}
