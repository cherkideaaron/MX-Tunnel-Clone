package org.yaml.snakeyaml.constructor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.yaml.snakeyaml.composer.Composer;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.introspector.PropertyUtils;
import org.yaml.snakeyaml.nodes.MappingNode;
import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.nodes.NodeId;
import org.yaml.snakeyaml.nodes.NodeTuple;
import org.yaml.snakeyaml.nodes.ScalarNode;
import org.yaml.snakeyaml.nodes.SequenceNode;
import org.yaml.snakeyaml.nodes.Tag;

/* loaded from: classes2.dex */
public abstract class BaseConstructor {
    private Composer composer;
    private PropertyUtils propertyUtils;
    protected final Map<NodeId, Construct> yamlClassConstructors = new EnumMap(NodeId.class);
    protected final Map<Tag, Construct> yamlConstructors = new HashMap();
    protected final Map<String, Construct> yamlMultiConstructors = new HashMap();
    private final Map<Node, Object> constructedObjects = new HashMap();
    private final Set<Node> recursiveObjects = new HashSet();
    private final ArrayList<RecursiveTuple<Map<Object, Object>, RecursiveTuple<Object, Object>>> maps2fill = new ArrayList<>();
    private final ArrayList<RecursiveTuple<Set<Object>, Object>> sets2fill = new ArrayList<>();
    protected Tag rootTag = null;
    private boolean explicitPropertyUtils = false;

    public static class RecursiveTuple<T, K> {
        private final T _1;
        private final K _2;

        public RecursiveTuple(T t, K k) {
            this._1 = t;
            this._2 = k;
        }

        public T _1() {
            return this._1;
        }

        public K _2() {
            return this._2;
        }
    }

    private Object constructDocument(Node node) {
        Object objConstructObject = constructObject(node);
        fillRecursive();
        this.constructedObjects.clear();
        this.recursiveObjects.clear();
        return objConstructObject;
    }

    private void fillRecursive() {
        if (!this.maps2fill.isEmpty()) {
            Iterator<RecursiveTuple<Map<Object, Object>, RecursiveTuple<Object, Object>>> it = this.maps2fill.iterator();
            while (it.hasNext()) {
                RecursiveTuple<Map<Object, Object>, RecursiveTuple<Object, Object>> next = it.next();
                RecursiveTuple<Object, Object> recursiveTuple_2 = next._2();
                next._1().put(recursiveTuple_2._1(), recursiveTuple_2._2());
            }
            this.maps2fill.clear();
        }
        if (this.sets2fill.isEmpty()) {
            return;
        }
        Iterator<RecursiveTuple<Set<Object>, Object>> it2 = this.sets2fill.iterator();
        while (it2.hasNext()) {
            RecursiveTuple<Set<Object>, Object> next2 = it2.next();
            next2._1().add(next2._2());
        }
        this.sets2fill.clear();
    }

    public boolean checkData() {
        return this.composer.checkNode();
    }

    public Object constructArray(SequenceNode sequenceNode) {
        return constructArrayStep2(sequenceNode, createArray(sequenceNode.getType(), sequenceNode.getValue().size()));
    }

    public Object constructArrayStep2(SequenceNode sequenceNode, Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        Iterator<Node> it = sequenceNode.getValue().iterator();
        int i = 0;
        while (it.hasNext()) {
            Array.set(obj, i, constructObject(it.next()));
            i++;
        }
        return obj;
    }

    public Map<Object, Object> constructMapping(MappingNode mappingNode) {
        Map<Object, Object> mapCreateDefaultMap = createDefaultMap();
        constructMapping2ndStep(mappingNode, mapCreateDefaultMap);
        return mapCreateDefaultMap;
    }

    public void constructMapping2ndStep(MappingNode mappingNode, Map<Object, Object> map) {
        for (NodeTuple nodeTuple : mappingNode.getValue()) {
            Node keyNode = nodeTuple.getKeyNode();
            Node valueNode = nodeTuple.getValueNode();
            Object objConstructObject = constructObject(keyNode);
            if (objConstructObject != null) {
                try {
                    objConstructObject.hashCode();
                } catch (Exception e) {
                    throw new ConstructorException("while constructing a mapping", mappingNode.getStartMark(), "found unacceptable key " + objConstructObject, nodeTuple.getKeyNode().getStartMark(), e);
                }
            }
            Object objConstructObject2 = constructObject(valueNode);
            if (keyNode.isTwoStepsConstruction()) {
                this.maps2fill.add(0, new RecursiveTuple<>(map, new RecursiveTuple(objConstructObject, objConstructObject2)));
            } else {
                map.put(objConstructObject, objConstructObject2);
            }
        }
    }

    public Object constructObject(Node node) {
        if (this.constructedObjects.containsKey(node)) {
            return this.constructedObjects.get(node);
        }
        if (this.recursiveObjects.contains(node)) {
            throw new ConstructorException(null, null, "found unconstructable recursive node", node.getStartMark());
        }
        this.recursiveObjects.add(node);
        Construct constructor = getConstructor(node);
        Object objConstruct = constructor.construct(node);
        this.constructedObjects.put(node, objConstruct);
        this.recursiveObjects.remove(node);
        if (node.isTwoStepsConstruction()) {
            constructor.construct2ndStep(node, objConstruct);
        }
        return objConstruct;
    }

    public Object constructScalar(ScalarNode scalarNode) {
        return scalarNode.getValue();
    }

    public List<? extends Object> constructSequence(SequenceNode sequenceNode) {
        List<? extends Object> listCreateDefaultList;
        if (!List.class.isAssignableFrom(sequenceNode.getType()) || sequenceNode.getType().isInterface()) {
            listCreateDefaultList = createDefaultList(sequenceNode.getValue().size());
        } else {
            try {
                listCreateDefaultList = (List) sequenceNode.getType().newInstance();
            } catch (Exception e) {
                throw new YAMLException(e);
            }
        }
        constructSequenceStep2(sequenceNode, listCreateDefaultList);
        return listCreateDefaultList;
    }

    public void constructSequenceStep2(SequenceNode sequenceNode, Collection<Object> collection) {
        Iterator<Node> it = sequenceNode.getValue().iterator();
        while (it.hasNext()) {
            collection.add(constructObject(it.next()));
        }
    }

    public Set<Object> constructSet(MappingNode mappingNode) {
        Set<Object> setCreateDefaultSet = createDefaultSet();
        constructSet2ndStep(mappingNode, setCreateDefaultSet);
        return setCreateDefaultSet;
    }

    public void constructSet2ndStep(MappingNode mappingNode, Set<Object> set) {
        for (NodeTuple nodeTuple : mappingNode.getValue()) {
            Node keyNode = nodeTuple.getKeyNode();
            Object objConstructObject = constructObject(keyNode);
            if (objConstructObject != null) {
                try {
                    objConstructObject.hashCode();
                } catch (Exception e) {
                    throw new ConstructorException("while constructing a Set", mappingNode.getStartMark(), "found unacceptable key " + objConstructObject, nodeTuple.getKeyNode().getStartMark(), e);
                }
            }
            if (keyNode.isTwoStepsConstruction()) {
                this.sets2fill.add(0, new RecursiveTuple<>(set, objConstructObject));
            } else {
                set.add(objConstructObject);
            }
        }
    }

    public <T> T[] createArray(Class<T> cls, int i) {
        return (T[]) ((Object[]) Array.newInstance(cls.getComponentType(), i));
    }

    public List<Object> createDefaultList(int i) {
        return new ArrayList(i);
    }

    public Map<Object, Object> createDefaultMap() {
        return new LinkedHashMap();
    }

    public Set<Object> createDefaultSet() {
        return new LinkedHashSet();
    }

    public Construct getConstructor(Node node) {
        Construct construct;
        if (node.useClassConstructor()) {
            construct = this.yamlClassConstructors.get(node.getNodeId());
        } else {
            Construct construct2 = this.yamlConstructors.get(node.getTag());
            if (construct2 != null) {
                return construct2;
            }
            Iterator<String> it = this.yamlMultiConstructors.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    construct = this.yamlConstructors.get(null);
                    break;
                }
                String next = it.next();
                if (node.getTag().startsWith(next)) {
                    construct = this.yamlMultiConstructors.get(next);
                    break;
                }
            }
        }
        return construct;
    }

    public Object getData() {
        this.composer.checkNode();
        Node node = this.composer.getNode();
        Tag tag = this.rootTag;
        if (tag != null) {
            node.setTag(tag);
        }
        return constructDocument(node);
    }

    public final PropertyUtils getPropertyUtils() {
        if (this.propertyUtils == null) {
            this.propertyUtils = new PropertyUtils();
        }
        return this.propertyUtils;
    }

    public Object getSingleData(Class<?> cls) {
        Node singleNode = this.composer.getSingleNode();
        if (singleNode == null) {
            return null;
        }
        if (Object.class != cls) {
            singleNode.setTag(new Tag((Class<? extends Object>) cls));
        } else {
            Tag tag = this.rootTag;
            if (tag != null) {
                singleNode.setTag(tag);
            }
        }
        return constructDocument(singleNode);
    }

    public final boolean isExplicitPropertyUtils() {
        return this.explicitPropertyUtils;
    }

    public void setComposer(Composer composer) {
        this.composer = composer;
    }

    public void setPropertyUtils(PropertyUtils propertyUtils) {
        this.propertyUtils = propertyUtils;
        this.explicitPropertyUtils = true;
    }

    public Set<? extends Object> constructSet(SequenceNode sequenceNode) {
        Set<Object> setCreateDefaultSet;
        if (sequenceNode.getType().isInterface()) {
            setCreateDefaultSet = createDefaultSet(sequenceNode.getValue().size());
        } else {
            try {
                setCreateDefaultSet = (Set) sequenceNode.getType().newInstance();
            } catch (Exception e) {
                throw new YAMLException(e);
            }
        }
        constructSequenceStep2(sequenceNode, setCreateDefaultSet);
        return setCreateDefaultSet;
    }

    public Set<Object> createDefaultSet(int i) {
        return new LinkedHashSet(i);
    }
}
