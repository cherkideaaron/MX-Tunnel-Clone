package org.checkerframework.checker.calledmethods.qual;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.InheritedAnnotation;
import org.checkerframework.framework.qual.PostconditionAnnotation;
import org.checkerframework.framework.qual.QualifierArgument;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Repeatable(List.class)
@PostconditionAnnotation(qualifier = CalledMethods.class)
/* loaded from: classes2.dex */
public @interface EnsuresCalledMethods {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @InheritedAnnotation
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface List {
        EnsuresCalledMethods[] value();
    }

    @QualifierArgument(AppMeasurementSdk.ConditionalUserProperty.VALUE)
    String[] methods();

    String[] value();
}
