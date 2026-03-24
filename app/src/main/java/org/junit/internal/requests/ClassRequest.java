package org.junit.internal.requests;

import org.junit.internal.builders.AllDefaultPossibilitiesBuilder;
import org.junit.internal.builders.SuiteMethodBuilder;
import org.junit.runner.Runner;
import org.junit.runners.model.RunnerBuilder;

/* loaded from: classes2.dex */
public class ClassRequest extends MemoizingRequest {
    private final boolean canUseSuiteMethod;
    private final Class<?> fTestClass;

    public class CustomAllDefaultPossibilitiesBuilder extends AllDefaultPossibilitiesBuilder {
        private CustomAllDefaultPossibilitiesBuilder() {
        }

        @Override // org.junit.internal.builders.AllDefaultPossibilitiesBuilder
        public RunnerBuilder suiteMethodBuilder() {
            return new CustomSuiteMethodBuilder();
        }
    }

    public class CustomSuiteMethodBuilder extends SuiteMethodBuilder {
        private CustomSuiteMethodBuilder() {
        }

        @Override // org.junit.internal.builders.SuiteMethodBuilder, org.junit.runners.model.RunnerBuilder
        public Runner runnerForClass(Class<?> cls) {
            if (cls != ClassRequest.this.fTestClass || ClassRequest.this.canUseSuiteMethod) {
                return super.runnerForClass(cls);
            }
            return null;
        }
    }

    public ClassRequest(Class<?> cls) {
        this(cls, true);
    }

    @Override // org.junit.internal.requests.MemoizingRequest
    public Runner createRunner() {
        return new CustomAllDefaultPossibilitiesBuilder().safeRunnerForClass(this.fTestClass);
    }

    public ClassRequest(Class<?> cls, boolean z) {
        this.fTestClass = cls;
        this.canUseSuiteMethod = z;
    }
}
