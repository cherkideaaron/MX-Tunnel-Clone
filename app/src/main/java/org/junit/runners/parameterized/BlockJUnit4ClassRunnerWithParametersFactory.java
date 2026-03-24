package org.junit.runners.parameterized;

import org.junit.runner.Runner;

/* loaded from: classes2.dex */
public class BlockJUnit4ClassRunnerWithParametersFactory implements ParametersRunnerFactory {
    @Override // org.junit.runners.parameterized.ParametersRunnerFactory
    public Runner createRunnerForTestWithParameters(TestWithParameters testWithParameters) {
        return new BlockJUnit4ClassRunnerWithParameters(testWithParameters);
    }
}
