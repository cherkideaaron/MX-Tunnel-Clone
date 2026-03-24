package org.yaml.snakeyaml.nodes;

import org.yaml.snakeyaml.error.Mark;

/* loaded from: classes2.dex */
public abstract class CollectionNode extends Node {
    private Boolean flowStyle;

    public CollectionNode(Tag tag, Mark mark, Mark mark2, Boolean bool) {
        super(tag, mark, mark2);
        this.flowStyle = bool;
    }

    public Boolean getFlowStyle() {
        return this.flowStyle;
    }

    public void setEndMark(Mark mark) {
        this.endMark = mark;
    }

    public void setFlowStyle(Boolean bool) {
        this.flowStyle = bool;
    }
}
