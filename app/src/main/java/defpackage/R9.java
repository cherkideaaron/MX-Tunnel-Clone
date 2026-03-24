package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class R9 implements InterfaceC2690fr, P9 {
    public static final Map b;
    public static final HashMap c;
    public static final LinkedHashMap d;
    public final Class a;

    static {
        int i = 0;
        List listY = AbstractC3437ta.Y(InterfaceC0606cn.class, InterfaceC2631en.class, InterfaceC3396sn.class, InterfaceC3504un.class, InterfaceC3558vn.class, InterfaceC3612wn.class, InterfaceC3666xn.class, InterfaceC3720yn.class, InterfaceC3774zn.class, InterfaceC0026An.class, InterfaceC2577dn.class, InterfaceC2686fn.class, InterfaceC2741gn.class, InterfaceC2796hn.class, InterfaceC2850in.class, InterfaceC2904jn.class, InterfaceC2959kn.class, InterfaceC3014ln.class, InterfaceC3069mn.class, InterfaceC3124nn.class, InterfaceC3234pn.class, InterfaceC3289qn.class, InterfaceC3342rn.class);
        ArrayList arrayList = new ArrayList(AbstractC3491ua.Z(listY, 10));
        for (Object obj : listY) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new Jy((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = Ht.Y(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        AbstractC0500aq.l(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC0500aq.j(str);
            sb.append(AbstractC3481uH.o0(str, str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        c = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Ht.U(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            AbstractC0500aq.j(str2);
            linkedHashMap.put(key, AbstractC3481uH.o0(str2, str2));
        }
        d = linkedHashMap;
    }

    public R9(Class cls) {
        AbstractC0500aq.m(cls, "jClass");
        this.a = cls;
    }

    @Override // defpackage.P9
    public final Class a() {
        return this.a;
    }

    public final String b() {
        String str;
        String str2;
        Class cls = this.a;
        AbstractC0500aq.m(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            LinkedHashMap linkedHashMap = d;
            if (!zIsArray) {
                String str3 = (String) linkedHashMap.get(cls.getName());
                return str3 == null ? cls.getSimpleName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            str2 = enclosingMethod.getName() + '$';
        } else {
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                int iG0 = AbstractC3481uH.g0(simpleName, '$', 0, false, 6);
                if (iG0 == -1) {
                    return simpleName;
                }
                String strSubstring = simpleName.substring(iG0 + 1, simpleName.length());
                AbstractC0500aq.l(strSubstring, "substring(...)");
                return strSubstring;
            }
            str2 = enclosingConstructor.getName() + '$';
        }
        return AbstractC3481uH.n0(simpleName, str2, simpleName);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof R9) && AbstractC0500aq.b(AbstractC0115Ga.z(this), AbstractC0115Ga.z((InterfaceC2690fr) obj));
    }

    public final int hashCode() {
        return AbstractC0115Ga.z(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
