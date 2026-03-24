package org.junit.experimental.theories.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.experimental.theories.PotentialAssignment;
import org.junit.runners.model.TestClass;

/* loaded from: classes2.dex */
public class Assignments {
    private final List<PotentialAssignment> assigned;
    private final TestClass clazz;
    private final List<ParameterSignature> unassigned;

    private Assignments(List<PotentialAssignment> list, List<ParameterSignature> list2, TestClass testClass) {
        this.unassigned = list2;
        this.assigned = list;
        this.clazz = testClass;
    }

    public static Assignments allUnassigned(Method method, TestClass testClass) {
        List<ParameterSignature> listSignatures = ParameterSignature.signatures(testClass.getOnlyConstructor());
        listSignatures.addAll(ParameterSignature.signatures(method));
        return new Assignments(new ArrayList(), listSignatures, testClass);
    }

    private ParameterSupplier buildParameterSupplierFromClass(Class<? extends ParameterSupplier> cls) throws IllegalAccessException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Constructor<?>[] constructors = cls.getConstructors();
        int length = constructors.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                objNewInstance = cls.newInstance();
                break;
            }
            Constructor<?> constructor = constructors[i];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0].equals(TestClass.class)) {
                objNewInstance = constructor.newInstance(this.clazz);
                break;
            }
            i++;
        }
        return (ParameterSupplier) objNewInstance;
    }

    private List<PotentialAssignment> generateAssignmentsFromTypeAlone(ParameterSignature parameterSignature) {
        Class<?> type = parameterSignature.getType();
        return type.isEnum() ? new EnumSupplier(type).getValueSources(parameterSignature) : (type.equals(Boolean.class) || type.equals(Boolean.TYPE)) ? new BooleanSupplier().getValueSources(parameterSignature) : Collections.emptyList();
    }

    private int getConstructorParameterCount() {
        return ParameterSignature.signatures(this.clazz.getOnlyConstructor()).size();
    }

    private ParameterSupplier getSupplier(ParameterSignature parameterSignature) {
        ParametersSuppliedBy parametersSuppliedBy = (ParametersSuppliedBy) parameterSignature.findDeepAnnotation(ParametersSuppliedBy.class);
        return parametersSuppliedBy != null ? buildParameterSupplierFromClass(parametersSuppliedBy.value()) : new AllMembersSupplier(this.clazz);
    }

    public Assignments assignNext(PotentialAssignment potentialAssignment) {
        ArrayList arrayList = new ArrayList(this.assigned);
        arrayList.add(potentialAssignment);
        List<ParameterSignature> list = this.unassigned;
        return new Assignments(arrayList, list.subList(1, list.size()), this.clazz);
    }

    public Object[] getActualValues(int i, int i2) {
        Object[] objArr = new Object[i2 - i];
        for (int i3 = i; i3 < i2; i3++) {
            objArr[i3 - i] = this.assigned.get(i3).getValue();
        }
        return objArr;
    }

    public Object[] getAllArguments() {
        return getActualValues(0, this.assigned.size());
    }

    public Object[] getArgumentStrings(boolean z) {
        int size = this.assigned.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            objArr[i] = this.assigned.get(i).getDescription();
        }
        return objArr;
    }

    public Object[] getConstructorArguments() {
        return getActualValues(0, getConstructorParameterCount());
    }

    public Object[] getMethodArguments() {
        return getActualValues(getConstructorParameterCount(), this.assigned.size());
    }

    public boolean isComplete() {
        return this.unassigned.isEmpty();
    }

    public ParameterSignature nextUnassigned() {
        return this.unassigned.get(0);
    }

    public List<PotentialAssignment> potentialsForNextUnassigned() {
        ParameterSignature parameterSignatureNextUnassigned = nextUnassigned();
        List<PotentialAssignment> valueSources = getSupplier(parameterSignatureNextUnassigned).getValueSources(parameterSignatureNextUnassigned);
        return valueSources.isEmpty() ? generateAssignmentsFromTypeAlone(parameterSignatureNextUnassigned) : valueSources;
    }
}
