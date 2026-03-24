package org.junit.internal.runners;

import defpackage.AbstractC3698yI;
import defpackage.BI;
import defpackage.C2594e4;
import defpackage.D3;
import defpackage.InterfaceC3644xI;
import defpackage.InterfaceC3752zI;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Vector;
import org.junit.runner.Describable;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.manipulation.Orderable;
import org.junit.runner.manipulation.Orderer;
import org.junit.runner.manipulation.Sortable;
import org.junit.runner.manipulation.Sorter;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;

/* loaded from: classes2.dex */
public class JUnit38ClassRunner extends Runner implements Filterable, Orderable {
    private volatile InterfaceC3644xI test;

    public static final class OldTestClassAdaptingListener implements InterfaceC3752zI {
        private final RunNotifier notifier;

        private OldTestClassAdaptingListener(RunNotifier runNotifier) {
            this.notifier = runNotifier;
        }

        private Description asDescription(InterfaceC3644xI interfaceC3644xI) {
            return interfaceC3644xI instanceof Describable ? ((Describable) interfaceC3644xI).getDescription() : Description.createTestDescription(getEffectiveClass(interfaceC3644xI), getName(interfaceC3644xI));
        }

        private Class<? extends InterfaceC3644xI> getEffectiveClass(InterfaceC3644xI interfaceC3644xI) {
            return interfaceC3644xI.getClass();
        }

        private String getName(InterfaceC3644xI interfaceC3644xI) {
            return interfaceC3644xI instanceof AbstractC3698yI ? ((AbstractC3698yI) interfaceC3644xI).a : interfaceC3644xI.toString();
        }

        @Override // defpackage.InterfaceC3752zI
        public void addError(InterfaceC3644xI interfaceC3644xI, Throwable th) {
            this.notifier.fireTestFailure(new Failure(asDescription(interfaceC3644xI), th));
        }

        @Override // defpackage.InterfaceC3752zI
        public void addFailure(InterfaceC3644xI interfaceC3644xI, C2594e4 c2594e4) {
            addError(interfaceC3644xI, c2594e4);
        }

        @Override // defpackage.InterfaceC3752zI
        public void endTest(InterfaceC3644xI interfaceC3644xI) {
            this.notifier.fireTestFinished(asDescription(interfaceC3644xI));
        }

        @Override // defpackage.InterfaceC3752zI
        public void startTest(InterfaceC3644xI interfaceC3644xI) {
            this.notifier.fireTestStarted(asDescription(interfaceC3644xI));
        }
    }

    public JUnit38ClassRunner(InterfaceC3644xI interfaceC3644xI) {
        setTest(interfaceC3644xI);
    }

    private static String createSuiteDescription(BI bi) {
        int iA = bi.a();
        return "TestSuite with " + iA + " tests" + (iA == 0 ? "" : String.format(" [example: %s]", (InterfaceC3644xI) bi.b.get(0)));
    }

    private static Annotation[] getAnnotations(AbstractC3698yI abstractC3698yI) {
        try {
            return abstractC3698yI.getClass().getMethod(abstractC3698yI.a, null).getDeclaredAnnotations();
        } catch (NoSuchMethodException | SecurityException unused) {
            return new Annotation[0];
        }
    }

    private InterfaceC3644xI getTest() {
        return this.test;
    }

    private static Description makeDescription(InterfaceC3644xI interfaceC3644xI) {
        if (interfaceC3644xI instanceof AbstractC3698yI) {
            AbstractC3698yI abstractC3698yI = (AbstractC3698yI) interfaceC3644xI;
            return Description.createTestDescription(abstractC3698yI.getClass(), abstractC3698yI.a, getAnnotations(abstractC3698yI));
        }
        if (!(interfaceC3644xI instanceof BI)) {
            return interfaceC3644xI instanceof Describable ? ((Describable) interfaceC3644xI).getDescription() : Description.createSuiteDescription(interfaceC3644xI.getClass());
        }
        BI bi = (BI) interfaceC3644xI;
        String strCreateSuiteDescription = bi.a;
        if (strCreateSuiteDescription == null) {
            strCreateSuiteDescription = createSuiteDescription(bi);
        }
        Description descriptionCreateSuiteDescription = Description.createSuiteDescription(strCreateSuiteDescription, new Annotation[0]);
        int size = bi.b.size();
        for (int i = 0; i < size; i++) {
            descriptionCreateSuiteDescription.addChild(makeDescription((InterfaceC3644xI) bi.b.get(i)));
        }
        return descriptionCreateSuiteDescription;
    }

    private void setTest(InterfaceC3644xI interfaceC3644xI) {
        this.test = interfaceC3644xI;
    }

    public InterfaceC3752zI createAdaptingListener(RunNotifier runNotifier) {
        return new OldTestClassAdaptingListener(runNotifier);
    }

    @Override // org.junit.runner.manipulation.Filterable
    public void filter(Filter filter) throws NoTestsRemainException {
        if (getTest() instanceof Filterable) {
            ((Filterable) getTest()).filter(filter);
            return;
        }
        if (getTest() instanceof BI) {
            BI bi = (BI) getTest();
            String str = bi.a;
            BI bi2 = new BI();
            bi2.b = new Vector(10);
            bi2.a = str;
            int size = bi.b.size();
            for (int i = 0; i < size; i++) {
                InterfaceC3644xI interfaceC3644xI = (InterfaceC3644xI) bi.b.get(i);
                if (filter.shouldRun(makeDescription(interfaceC3644xI))) {
                    bi2.c(interfaceC3644xI);
                }
            }
            setTest(bi2);
            if (bi2.b.size() == 0) {
                throw new NoTestsRemainException();
            }
        }
    }

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        return makeDescription(getTest());
    }

    @Override // org.junit.runner.manipulation.Orderable
    public void order(Orderer orderer) {
        if (getTest() instanceof Orderable) {
            ((Orderable) getTest()).order(orderer);
        }
    }

    @Override // org.junit.runner.Runner
    public void run(RunNotifier runNotifier) {
        D3 d3 = new D3(19);
        d3.b = new ArrayList();
        d3.c = new ArrayList();
        ArrayList arrayList = new ArrayList();
        d3.d = arrayList;
        InterfaceC3752zI interfaceC3752zICreateAdaptingListener = createAdaptingListener(runNotifier);
        synchronized (d3) {
            arrayList.add(interfaceC3752zICreateAdaptingListener);
        }
        getTest().b(d3);
    }

    @Override // org.junit.runner.manipulation.Sortable
    public void sort(Sorter sorter) {
        if (getTest() instanceof Sortable) {
            ((Sortable) getTest()).sort(sorter);
        }
    }

    public JUnit38ClassRunner(Class<?> cls) {
        this(new BI(cls.asSubclass(AbstractC3698yI.class)));
    }
}
