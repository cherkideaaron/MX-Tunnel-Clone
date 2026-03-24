package org.junit.internal;

import defpackage.AbstractC3264qG;
import java.lang.reflect.Array;
import java.util.Arrays;
import org.junit.Assert;

/* loaded from: classes2.dex */
public abstract class ComparisonCriteria {
    private static final Object END_OF_ARRAY_SENTINEL = objectWithToString("end of array");

    private String componentTypeName(Class<?> cls) {
        Class<?> componentType = cls.getComponentType();
        return componentType.isArray() ? AbstractC3264qG.l(new StringBuilder(), componentTypeName(componentType), "[]") : componentType.getName();
    }

    private Object getToStringableArrayElement(Object obj, int i, int i2) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (i2 >= i) {
            return END_OF_ARRAY_SENTINEL;
        }
        Object obj2 = Array.get(obj, i2);
        if (!isArray(obj2)) {
            return obj2;
        }
        return objectWithToString(componentTypeName(obj2.getClass()) + "[" + Array.getLength(obj2) + "]");
    }

    private boolean isArray(Object obj) {
        return obj != null && obj.getClass().isArray();
    }

    private static Object objectWithToString(final String str) {
        return new Object() { // from class: org.junit.internal.ComparisonCriteria.1
            public String toString() {
                return str;
            }
        };
    }

    public void arrayEquals(String str, Object obj, Object obj2) {
        arrayEquals(str, obj, obj2, true);
    }

    public abstract void assertElementsEqual(Object obj, Object obj2);

    private void arrayEquals(String str, Object obj, Object obj2, boolean z) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == obj2 || Arrays.deepEquals(new Object[]{obj}, new Object[]{obj2})) {
            return;
        }
        String strConcat = str == null ? "" : str.concat(": ");
        String str2 = z ? strConcat : "";
        if (obj == null) {
            Assert.fail(str2 + "expected array was null");
        }
        if (obj2 == null) {
            Assert.fail(str2 + "actual array was null");
        }
        int length = Array.getLength(obj2);
        int length2 = Array.getLength(obj);
        if (length != length2) {
            strConcat = strConcat + "array lengths differed, expected.length=" + length2 + " actual.length=" + length + "; ";
        }
        int iMin = Math.min(length, length2);
        for (int i = 0; i < iMin; i++) {
            Object obj3 = Array.get(obj, i);
            Object obj4 = Array.get(obj2, i);
            if (isArray(obj3) && isArray(obj4)) {
                try {
                    arrayEquals(str, obj3, obj4, false);
                } catch (ArrayComparisonFailure e) {
                    e.addDimension(i);
                    throw e;
                } catch (AssertionError e2) {
                    throw new ArrayComparisonFailure(strConcat, e2, i);
                }
            } else {
                try {
                    assertElementsEqual(obj3, obj4);
                } catch (AssertionError e3) {
                    throw new ArrayComparisonFailure(strConcat, e3, i);
                }
            }
        }
        if (length != length2) {
            try {
                Assert.assertEquals(getToStringableArrayElement(obj, length2, iMin), getToStringableArrayElement(obj2, length, iMin));
            } catch (AssertionError e4) {
                throw new ArrayComparisonFailure(strConcat, e4, iMin);
            }
        }
    }
}
