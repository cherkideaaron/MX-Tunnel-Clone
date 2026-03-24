package org.junit.experimental.theories;

import defpackage.Vs;

/* loaded from: classes2.dex */
public abstract class PotentialAssignment {

    public static class CouldNotGenerateValueException extends Exception {
        private static final long serialVersionUID = 1;

        public CouldNotGenerateValueException() {
        }

        public CouldNotGenerateValueException(Throwable th) {
            super(th);
        }
    }

    public static PotentialAssignment forValue(final String str, final Object obj) {
        return new PotentialAssignment() { // from class: org.junit.experimental.theories.PotentialAssignment.1
            @Override // org.junit.experimental.theories.PotentialAssignment
            public String getDescription() {
                String strM;
                Object obj2 = obj;
                if (obj2 == null) {
                    strM = "null";
                } else {
                    try {
                        strM = String.format("\"%s\"", obj2);
                    } catch (Throwable th) {
                        strM = Vs.m("[toString() threw ", th.getClass().getSimpleName(), ": ", th.getMessage(), "]");
                    }
                }
                return strM + " <from " + str + ">";
            }

            @Override // org.junit.experimental.theories.PotentialAssignment
            public Object getValue() {
                return obj;
            }

            public String toString() {
                return String.format("[%s]", obj);
            }
        };
    }

    public abstract String getDescription();

    public abstract Object getValue();
}
