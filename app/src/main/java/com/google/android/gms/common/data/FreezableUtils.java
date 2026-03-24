package com.google.android.gms.common.data;

import defpackage.C3569vy;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        C3569vy c3569vy = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c3569vy.add(arrayList.get(i).freeze());
        }
        return c3569vy;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        C3569vy c3569vy = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            c3569vy.add(it.next().freeze());
        }
        return c3569vy;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        C3569vy c3569vy = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            c3569vy.add(e.freeze());
        }
        return c3569vy;
    }
}
