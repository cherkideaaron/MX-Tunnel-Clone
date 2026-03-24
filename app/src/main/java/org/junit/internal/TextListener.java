package org.junit.internal;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/* loaded from: classes2.dex */
public class TextListener extends RunListener {
    private final PrintStream writer;

    public TextListener(PrintStream printStream) {
        this.writer = printStream;
    }

    private PrintStream getWriter() {
        return this.writer;
    }

    public String elapsedTimeAsString(long j) {
        return NumberFormat.getInstance().format(j / 1000.0d);
    }

    public void printFailure(Failure failure, String str) {
        getWriter().println(str + ") " + failure.getTestHeader());
        getWriter().print(failure.getTrimmedTrace());
    }

    public void printFailures(Result result) {
        PrintStream writer;
        StringBuilder sb;
        String str;
        List<Failure> failures = result.getFailures();
        if (failures.isEmpty()) {
            return;
        }
        int i = 1;
        if (failures.size() == 1) {
            writer = getWriter();
            sb = new StringBuilder("There was ");
            sb.append(failures.size());
            str = " failure:";
        } else {
            writer = getWriter();
            sb = new StringBuilder("There were ");
            sb.append(failures.size());
            str = " failures:";
        }
        sb.append(str);
        writer.println(sb.toString());
        Iterator<Failure> it = failures.iterator();
        while (it.hasNext()) {
            printFailure(it.next(), "" + i);
            i++;
        }
    }

    public void printFooter(Result result) {
        PrintStream writer;
        StringBuilder sb;
        if (result.wasSuccessful()) {
            getWriter().println();
            getWriter().print("OK");
            writer = getWriter();
            sb = new StringBuilder(" (");
            sb.append(result.getRunCount());
            sb.append(" test");
            sb.append(result.getRunCount() == 1 ? "" : "s");
            sb.append(")");
        } else {
            getWriter().println();
            getWriter().println("FAILURES!!!");
            writer = getWriter();
            sb = new StringBuilder("Tests run: ");
            sb.append(result.getRunCount());
            sb.append(",  Failures: ");
            sb.append(result.getFailureCount());
        }
        writer.println(sb.toString());
        getWriter().println();
    }

    public void printHeader(long j) {
        getWriter().println();
        getWriter().println("Time: " + elapsedTimeAsString(j));
    }

    @Override // org.junit.runner.notification.RunListener
    public void testFailure(Failure failure) {
        this.writer.append('E');
    }

    @Override // org.junit.runner.notification.RunListener
    public void testIgnored(Description description) {
        this.writer.append('I');
    }

    @Override // org.junit.runner.notification.RunListener
    public void testRunFinished(Result result) {
        printHeader(result.getRunTime());
        printFailures(result);
        printFooter(result);
    }

    @Override // org.junit.runner.notification.RunListener
    public void testStarted(Description description) {
        this.writer.append('.');
    }

    public TextListener(JUnitSystem jUnitSystem) {
        this(jUnitSystem.out());
    }
}
