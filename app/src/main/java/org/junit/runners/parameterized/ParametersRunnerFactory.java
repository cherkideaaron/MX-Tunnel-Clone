package org.junit.runners.parameterized;

import org.junit.runner.Runner;

/* loaded from: classes2.dex */
public interface ParametersRunnerFactory {
    Runner createRunnerForTestWithParameters(TestWithParameters testWithParameters);
}
