package org.junit.internal.runners.rules;

import defpackage.AbstractC3264qG;
import java.lang.annotation.Annotation;
import org.junit.runners.model.FrameworkMember;

/* loaded from: classes2.dex */
class ValidationError extends Exception {
    private static final long serialVersionUID = 3176511008672645574L;

    /* JADX WARN: Illegal instructions before constructor call */
    public ValidationError(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, String str) {
        StringBuilder sbP = AbstractC3264qG.p("The @", cls.getSimpleName(), " '", frameworkMember.getName(), "' ");
        sbP.append(str);
        super(sbP.toString());
    }
}
