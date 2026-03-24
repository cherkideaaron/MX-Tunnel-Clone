package org.yaml.snakeyaml.nodes;

import org.yaml.snakeyaml.error.Mark;

/* loaded from: classes2.dex */
public abstract class Node {
    protected Mark endMark;
    protected boolean resolved;
    private Mark startMark;
    private Tag tag;
    private boolean twoStepsConstruction;
    private Class<? extends Object> type;
    protected Boolean useClassConstructor;

    public Node(Tag tag, Mark mark, Mark mark2) {
        setTag(tag);
        this.startMark = mark;
        this.endMark = mark2;
        this.type = Object.class;
        this.twoStepsConstruction = false;
        this.resolved = true;
        this.useClassConstructor = null;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Mark getEndMark() {
        return this.endMark;
    }

    public abstract NodeId getNodeId();

    public Mark getStartMark() {
        return this.startMark;
    }

    public Tag getTag() {
        return this.tag;
    }

    public Class<? extends Object> getType() {
        return this.type;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public boolean isResolved() {
        return this.resolved;
    }

    public boolean isTwoStepsConstruction() {
        return this.twoStepsConstruction;
    }

    public void setTag(Tag tag) {
        if (tag == null) {
            throw new NullPointerException("tag in a Node is required.");
        }
        this.tag = tag;
    }

    public void setTwoStepsConstruction(boolean z) {
        this.twoStepsConstruction = z;
    }

    public void setType(Class<? extends Object> cls) {
        if (cls.isAssignableFrom(this.type)) {
            return;
        }
        this.type = cls;
    }

    public void setUseClassConstructor(Boolean bool) {
        this.useClassConstructor = bool;
    }

    public boolean useClassConstructor() {
        Boolean bool = this.useClassConstructor;
        return bool == null ? !(!isResolved() || Object.class.equals(this.type) || this.tag.equals(Tag.NULL)) || this.tag.isCompatible(getType()) : bool.booleanValue();
    }
}
