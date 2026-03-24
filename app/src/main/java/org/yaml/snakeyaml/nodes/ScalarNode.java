package org.yaml.snakeyaml.nodes;

import org.yaml.snakeyaml.error.Mark;

/* loaded from: classes2.dex */
public class ScalarNode extends Node {
    private Character style;
    private String value;

    public ScalarNode(Tag tag, String str, Mark mark, Mark mark2, Character ch) {
        this(tag, true, str, mark, mark2, ch);
    }

    @Override // org.yaml.snakeyaml.nodes.Node
    public NodeId getNodeId() {
        return NodeId.scalar;
    }

    public Character getStyle() {
        return this.style;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return "<" + getClass().getName() + " (tag=" + getTag() + ", value=" + getValue() + ")>";
    }

    public ScalarNode(Tag tag, boolean z, String str, Mark mark, Mark mark2, Character ch) {
        super(tag, mark, mark2);
        if (str == null) {
            throw new NullPointerException("value in a Node is required.");
        }
        this.value = str;
        this.style = ch;
        this.resolved = z;
    }
}
