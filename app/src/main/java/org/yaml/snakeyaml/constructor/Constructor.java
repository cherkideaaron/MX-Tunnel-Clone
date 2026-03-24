package org.yaml.snakeyaml.constructor;

import defpackage.AbstractC3264qG;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.introspector.Property;
import org.yaml.snakeyaml.nodes.MappingNode;
import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.nodes.NodeId;
import org.yaml.snakeyaml.nodes.ScalarNode;
import org.yaml.snakeyaml.nodes.SequenceNode;
import org.yaml.snakeyaml.nodes.Tag;

/* loaded from: classes2.dex */
public class Constructor extends SafeConstructor {
    private final Map<Class<? extends Object>, TypeDescription> typeDefinitions;
    private final Map<Tag, Class<? extends Object>> typeTags;

    /* renamed from: org.yaml.snakeyaml.constructor.Constructor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$yaml$snakeyaml$nodes$NodeId;

        static {
            int[] iArr = new int[NodeId.values().length];
            $SwitchMap$org$yaml$snakeyaml$nodes$NodeId = iArr;
            try {
                iArr[NodeId.sequence.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$yaml$snakeyaml$nodes$NodeId[NodeId.mapping.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class ConstructMapping implements Construct {
        public ConstructMapping() {
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public Object construct(Node node) {
            MappingNode mappingNode = (MappingNode) node;
            if (Properties.class.isAssignableFrom(node.getType())) {
                Properties properties = new Properties();
                if (node.isTwoStepsConstruction()) {
                    throw new YAMLException("Properties must not be recursive.");
                }
                Constructor.this.constructMapping2ndStep(mappingNode, properties);
                return properties;
            }
            if (SortedMap.class.isAssignableFrom(node.getType())) {
                TreeMap treeMap = new TreeMap();
                if (!node.isTwoStepsConstruction()) {
                    Constructor.this.constructMapping2ndStep(mappingNode, treeMap);
                }
                return treeMap;
            }
            if (Map.class.isAssignableFrom(node.getType())) {
                return node.isTwoStepsConstruction() ? Constructor.this.createDefaultMap() : Constructor.this.constructMapping(mappingNode);
            }
            if (SortedSet.class.isAssignableFrom(node.getType())) {
                TreeSet treeSet = new TreeSet();
                Constructor.this.constructSet2ndStep(mappingNode, treeSet);
                return treeSet;
            }
            boolean zIsAssignableFrom = Collection.class.isAssignableFrom(node.getType());
            boolean zIsTwoStepsConstruction = node.isTwoStepsConstruction();
            return zIsAssignableFrom ? zIsTwoStepsConstruction ? Constructor.this.createDefaultSet() : Constructor.this.constructSet(mappingNode) : zIsTwoStepsConstruction ? createEmptyJavaBean(mappingNode) : constructJavaBean2ndStep(mappingNode, createEmptyJavaBean(mappingNode));
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public void construct2ndStep(Node node, Object obj) {
            if (Map.class.isAssignableFrom(node.getType())) {
                Constructor.this.constructMapping2ndStep((MappingNode) node, (Map) obj);
            } else if (Set.class.isAssignableFrom(node.getType())) {
                Constructor.this.constructSet2ndStep((MappingNode) node, (Set) obj);
            } else {
                constructJavaBean2ndStep((MappingNode) node, obj);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a5 A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:8:0x003c, B:10:0x0056, B:15:0x0068, B:17:0x0071, B:40:0x00f0, B:20:0x007d, B:22:0x0086, B:23:0x008a, B:25:0x0094, B:26:0x009d, B:28:0x00a5, B:30:0x00ab, B:32:0x00b4, B:33:0x00bd, B:35:0x00c9, B:36:0x00d3, B:37:0x00d7, B:39:0x00e3), top: B:47:0x003c }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00f0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object constructJavaBean2ndStep(org.yaml.snakeyaml.nodes.MappingNode r10, java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 316
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.yaml.snakeyaml.constructor.Constructor.ConstructMapping.constructJavaBean2ndStep(org.yaml.snakeyaml.nodes.MappingNode, java.lang.Object):java.lang.Object");
        }

        public Object createEmptyJavaBean(MappingNode mappingNode) throws NoSuchMethodException, SecurityException {
            try {
                java.lang.reflect.Constructor<? extends Object> declaredConstructor = mappingNode.getType().getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(null);
            } catch (Exception e) {
                throw new YAMLException(e);
            }
        }

        public Property getProperty(Class<? extends Object> cls, String str) {
            return Constructor.this.getPropertyUtils().getProperty(cls, str);
        }
    }

    public class ConstructScalar extends AbstractConstruct {
        public ConstructScalar() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:89:0x0197, code lost:
        
            if (r7 == java.lang.Float.TYPE) goto L90;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.lang.Object constructStandardJavaInstance(java.lang.Class r7, org.yaml.snakeyaml.nodes.ScalarNode r8) throws java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 504
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.yaml.snakeyaml.constructor.Constructor.ConstructScalar.constructStandardJavaInstance(java.lang.Class, org.yaml.snakeyaml.nodes.ScalarNode):java.lang.Object");
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public Object construct(Node node) throws NoSuchMethodException, SecurityException, NumberFormatException {
            Object objConstructStandardJavaInstance;
            ScalarNode scalarNode = (ScalarNode) node;
            Class<? extends Object> type = scalarNode.getType();
            if (type.isPrimitive() || type == String.class || Number.class.isAssignableFrom(type) || type == Boolean.class || Date.class.isAssignableFrom(type) || type == Character.class || type == BigInteger.class || type == BigDecimal.class || Enum.class.isAssignableFrom(type) || Tag.BINARY.equals(scalarNode.getTag()) || Calendar.class.isAssignableFrom(type)) {
                return constructStandardJavaInstance(type, scalarNode);
            }
            java.lang.reflect.Constructor<?> constructor = null;
            int i = 0;
            for (java.lang.reflect.Constructor<?> constructor2 : type.getConstructors()) {
                if (constructor2.getParameterTypes().length == 1) {
                    i++;
                    constructor = constructor2;
                }
            }
            if (constructor == null) {
                throw new YAMLException("No single argument constructor found for " + type);
            }
            if (i == 1) {
                objConstructStandardJavaInstance = constructStandardJavaInstance(constructor.getParameterTypes()[0], scalarNode);
            } else {
                Object objConstructScalar = Constructor.this.constructScalar(scalarNode);
                try {
                    constructor = type.getConstructor(String.class);
                    objConstructStandardJavaInstance = objConstructScalar;
                } catch (Exception e) {
                    throw new ConstructorException(null, null, "Can't construct a java object for scalar " + scalarNode.getTag() + "; No String constructor found. Exception=" + e.getMessage(), scalarNode.getStartMark(), e);
                }
            }
            try {
                return constructor.newInstance(objConstructStandardJavaInstance);
            } catch (Exception e2) {
                throw new ConstructorException(null, null, "Can't construct a java object for scalar " + scalarNode.getTag() + "; exception=" + e2.getMessage(), scalarNode.getStartMark(), e2);
            }
        }
    }

    public class ConstructSequence implements Construct {
        public ConstructSequence() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final Class<? extends Object> wrapIfPrimitive(Class<?> cls) {
            if (!cls.isPrimitive()) {
                return cls;
            }
            if (cls == Integer.TYPE) {
                return Integer.class;
            }
            if (cls == Float.TYPE) {
                return Float.class;
            }
            if (cls == Double.TYPE) {
                return Double.class;
            }
            if (cls == Boolean.TYPE) {
                return Boolean.class;
            }
            if (cls == Long.TYPE) {
                return Long.class;
            }
            if (cls == Character.TYPE) {
                return Character.class;
            }
            if (cls == Short.TYPE) {
                return Short.class;
            }
            if (cls == Byte.TYPE) {
                return Byte.class;
            }
            throw new YAMLException("Unexpected primitive " + cls);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.yaml.snakeyaml.constructor.Construct
        public Object construct(Node node) throws SecurityException {
            SequenceNode sequenceNode = (SequenceNode) node;
            if (Set.class.isAssignableFrom(node.getType())) {
                if (node.isTwoStepsConstruction()) {
                    throw new YAMLException("Set cannot be recursive.");
                }
                return Constructor.this.constructSet(sequenceNode);
            }
            if (Collection.class.isAssignableFrom(node.getType())) {
                return node.isTwoStepsConstruction() ? Constructor.this.createDefaultList(sequenceNode.getValue().size()) : Constructor.this.constructSequence(sequenceNode);
            }
            if (node.getType().isArray()) {
                return node.isTwoStepsConstruction() ? Constructor.this.createArray(node.getType(), sequenceNode.getValue().size()) : Constructor.this.constructArray(sequenceNode);
            }
            ArrayList arrayList = new ArrayList(sequenceNode.getValue().size());
            int i = 0;
            for (java.lang.reflect.Constructor<?> constructor : node.getType().getConstructors()) {
                if (sequenceNode.getValue().size() == constructor.getParameterTypes().length) {
                    arrayList.add(constructor);
                }
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    Object[] objArr = new Object[sequenceNode.getValue().size()];
                    java.lang.reflect.Constructor constructor2 = (java.lang.reflect.Constructor) arrayList.get(0);
                    for (Node node2 : sequenceNode.getValue()) {
                        node2.setType(constructor2.getParameterTypes()[i]);
                        objArr[i] = Constructor.this.constructObject(node2);
                        i++;
                    }
                    try {
                        return constructor2.newInstance(objArr);
                    } catch (Exception e) {
                        throw new YAMLException(e);
                    }
                }
                List<? extends Object> listConstructSequence = Constructor.this.constructSequence(sequenceNode);
                Class<?>[] clsArr = new Class[listConstructSequence.size()];
                Iterator<? extends Object> it = listConstructSequence.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    clsArr[i2] = it.next().getClass();
                    i2++;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    java.lang.reflect.Constructor constructor3 = (java.lang.reflect.Constructor) it2.next();
                    Class<?>[] parameterTypes = constructor3.getParameterTypes();
                    for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                        if (!wrapIfPrimitive(parameterTypes[i3]).isAssignableFrom(clsArr[i3])) {
                            break;
                        }
                    }
                    try {
                        return constructor3.newInstance(listConstructSequence.toArray());
                    } catch (Exception e2) {
                        throw new YAMLException(e2);
                    }
                }
            }
            throw new YAMLException("No suitable constructor with " + String.valueOf(sequenceNode.getValue().size()) + " arguments found for " + node.getType());
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public void construct2ndStep(Node node, Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
            SequenceNode sequenceNode = (SequenceNode) node;
            if (List.class.isAssignableFrom(node.getType())) {
                Constructor.this.constructSequenceStep2(sequenceNode, (List) obj);
            } else {
                if (!node.getType().isArray()) {
                    throw new YAMLException("Immutable objects cannot be recursive.");
                }
                Constructor.this.constructArrayStep2(sequenceNode, obj);
            }
        }
    }

    public class ConstructYamlObject implements Construct {
        public ConstructYamlObject() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Construct getConstructor(Node node) {
            node.setType(Constructor.this.getClassForNode(node));
            return Constructor.this.yamlClassConstructors.get(node.getNodeId());
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public Object construct(Node node) {
            try {
                return getConstructor(node).construct(node);
            } catch (Exception e) {
                throw new ConstructorException(null, null, "Can't construct a java object for " + node.getTag() + "; exception=" + e.getMessage(), node.getStartMark(), e);
            }
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public void construct2ndStep(Node node, Object obj) {
            try {
                getConstructor(node).construct2ndStep(node, obj);
            } catch (Exception e) {
                throw new ConstructorException(null, null, "Can't construct a second step for a java object for " + node.getTag() + "; exception=" + e.getMessage(), node.getStartMark(), e);
            }
        }
    }

    public Constructor() {
        this((Class<? extends Object>) Object.class);
    }

    private static final String check(String str) {
        if (str == null) {
            throw new NullPointerException("Root type must be provided.");
        }
        if (str.trim().length() != 0) {
            return str;
        }
        throw new YAMLException("Root type must be provided.");
    }

    private static Class<? extends Object> checkRoot(Class<? extends Object> cls) {
        if (cls != null) {
            return cls;
        }
        throw new NullPointerException("Root class must be provided.");
    }

    public TypeDescription addTypeDescription(TypeDescription typeDescription) {
        if (typeDescription == null) {
            throw new NullPointerException("TypeDescription is required.");
        }
        this.typeTags.put(typeDescription.getTag(), typeDescription.getType());
        return this.typeDefinitions.put(typeDescription.getType(), typeDescription);
    }

    public Class<?> getClassForName(String str) {
        return Class.forName(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Class<?> getClassForNode(Node node) {
        Class<? extends Object> cls = this.typeTags.get(node.getTag());
        if (cls != null) {
            return cls;
        }
        String className = node.getTag().getClassName();
        try {
            Class<?> classForName = getClassForName(className);
            this.typeTags.put(node.getTag(), classForName);
            return classForName;
        } catch (ClassNotFoundException unused) {
            throw new YAMLException(AbstractC3264qG.w("Class not found: ", className));
        }
    }

    public Constructor(Class<? extends Object> cls) {
        this(new TypeDescription(checkRoot(cls)));
    }

    public Constructor(String str) {
        this((Class<? extends Object>) Class.forName(check(str)));
    }

    public Constructor(TypeDescription typeDescription) {
        if (typeDescription == null) {
            throw new NullPointerException("Root type must be provided.");
        }
        this.yamlConstructors.put(null, new ConstructYamlObject());
        if (!Object.class.equals(typeDescription.getType())) {
            this.rootTag = new Tag(typeDescription.getType());
        }
        this.typeTags = new HashMap();
        this.typeDefinitions = new HashMap();
        this.yamlClassConstructors.put(NodeId.scalar, new ConstructScalar());
        this.yamlClassConstructors.put(NodeId.mapping, new ConstructMapping());
        this.yamlClassConstructors.put(NodeId.sequence, new ConstructSequence());
        addTypeDescription(typeDescription);
    }
}
