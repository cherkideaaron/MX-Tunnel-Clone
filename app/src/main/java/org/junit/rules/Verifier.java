package org.junit.rules;

import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* loaded from: classes2.dex */
public abstract class Verifier implements TestRule {
    @Override // org.junit.rules.TestRule
    public Statement apply(final Statement statement, Description description) {
        return new Statement() { // from class: org.junit.rules.Verifier.1
            @Override // org.junit.runners.model.Statement
            public void evaluate() {
                statement.evaluate();
                Verifier.this.verify();
            }
        };
    }

    public void verify() {
    }
}
