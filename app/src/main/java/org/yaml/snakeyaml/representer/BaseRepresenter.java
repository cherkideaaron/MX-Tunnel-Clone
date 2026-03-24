package org.yaml.snakeyaml.representer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.introspector.PropertyUtils;
import org.yaml.snakeyaml.nodes.AnchorNode;
import org.yaml.snakeyaml.nodes.MappingNode;
import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.nodes.NodeTuple;
import org.yaml.snakeyaml.nodes.ScalarNode;
import org.yaml.snakeyaml.nodes.SequenceNode;
import org.yaml.snakeyaml.nodes.Tag;

/* loaded from: classes2.dex */
public abstract class BaseRepresenter {
    protected Character defaultScalarStyle;
    protected Represent nullRepresenter;
    protected Object objectToRepresent;
    private PropertyUtils propertyUtils;
    protected final Map<Class<?>, Represent> representers = new HashMap();
    protected final Map<Class<?>, Represent> multiRepresenters = new LinkedHashMap();
    protected DumperOptions.FlowStyle defaultFlowStyle = DumperOptions.FlowStyle.AUTO;
    protected final Map<Object, Node> representedObjects = new IdentityHashMap<Object, Node>() { // from class: org.yaml.snakeyaml.representer.BaseRepresenter.1
        private static final long serialVersionUID = -5576159264232131854L;

        @Override // java.util.IdentityHashMap, java.util.AbstractMap, java.util.Map
        public Node put(Object obj, Node node) {
            return (Node) super.put((AnonymousClass1) obj, (Object) new AnchorNode(node));
        }
    };
    private boolean explicitPropertyUtils = false;

    public DumperOptions.FlowStyle getDefaultFlowStyle() {
        return this.defaultFlowStyle;
    }

    public final PropertyUtils getPropertyUtils() {
        if (this.propertyUtils == null) {
            this.propertyUtils = new PropertyUtils();
        }
        return this.propertyUtils;
    }

    public final boolean isExplicitPropertyUtils() {
        return this.explicitPropertyUtils;
    }

    public Node represent(Object obj) {
        Node nodeRepresentData = representData(obj);
        this.representedObjects.clear();
        this.objectToRepresent = null;
        return nodeRepresentData;
    }

    public final Node representData(Object obj) {
        Represent represent;
        this.objectToRepresent = obj;
        if (this.representedObjects.containsKey(obj)) {
            return this.representedObjects.get(this.objectToRepresent);
        }
        if (obj == null) {
            return this.nullRepresenter.representData(null);
        }
        Class<?> cls = obj.getClass();
        if (this.representers.containsKey(cls)) {
            represent = this.representers.get(cls);
        } else {
            for (Class<?> cls2 : this.multiRepresenters.keySet()) {
                if (cls2.isInstance(obj)) {
                    return this.multiRepresenters.get(cls2).representData(obj);
                }
            }
            if (cls.isArray()) {
                throw new YAMLException("Arrays of primitives are not fully supported.");
            }
            represent = (this.multiRepresenters.containsKey(null) ? this.multiRepresenters : this.representers).get(null);
        }
        return represent.representData(obj);
    }

    public Node representMapping(Tag tag, Map<? extends Object, Object> map, Boolean bool) {
        ArrayList arrayList = new ArrayList(map.size());
        MappingNode mappingNode = new MappingNode(tag, arrayList, bool);
        this.representedObjects.put(this.objectToRepresent, mappingNode);
        boolean z = true;
        for (Map.Entry<? extends Object, Object> entry : map.entrySet()) {
            Node nodeRepresentData = representData(entry.getKey());
            Node nodeRepresentData2 = representData(entry.getValue());
            if (!(nodeRepresentData instanceof ScalarNode) || ((ScalarNode) nodeRepresentData).getStyle() != null) {
                z = false;
            }
            if (!(nodeRepresentData2 instanceof ScalarNode) || ((ScalarNode) nodeRepresentData2).getStyle() != null) {
                z = false;
            }
            arrayList.add(new NodeTuple(nodeRepresentData, nodeRepresentData2));
        }
        if (bool == null) {
            DumperOptions.FlowStyle flowStyle = this.defaultFlowStyle;
            mappingNode.setFlowStyle(flowStyle != DumperOptions.FlowStyle.AUTO ? flowStyle.getStyleBoolean() : Boolean.valueOf(z));
        }
        return mappingNode;
    }

    public Node representScalar(Tag tag, String str) {
        return representScalar(tag, str, null);
    }

    public Node representSequence(Tag tag, Iterable<? extends Object> iterable, Boolean bool) {
        ArrayList arrayList = new ArrayList(iterable instanceof List ? ((List) iterable).size() : 10);
        SequenceNode sequenceNode = new SequenceNode(tag, arrayList, bool);
        this.representedObjects.put(this.objectToRepresent, sequenceNode);
        Iterator<? extends Object> it = iterable.iterator();
        boolean z = true;
        while (it.hasNext()) {
            Node nodeRepresentData = representData(it.next());
            if (!(nodeRepresentData instanceof ScalarNode) || ((ScalarNode) nodeRepresentData).getStyle() != null) {
                z = false;
            }
            arrayList.add(nodeRepresentData);
        }
        if (bool == null) {
            DumperOptions.FlowStyle flowStyle = this.defaultFlowStyle;
            sequenceNode.setFlowStyle(flowStyle != DumperOptions.FlowStyle.AUTO ? flowStyle.getStyleBoolean() : Boolean.valueOf(z));
        }
        return sequenceNode;
    }

    public void setDefaultFlowStyle(DumperOptions.FlowStyle flowStyle) {
        this.defaultFlowStyle = flowStyle;
    }

    public void setDefaultScalarStyle(DumperOptions.ScalarStyle scalarStyle) {
        this.defaultScalarStyle = scalarStyle.getChar();
    }

    public void setPropertyUtils(PropertyUtils propertyUtils) {
        this.propertyUtils = propertyUtils;
        this.explicitPropertyUtils = true;
    }

    public Node representScalar(Tag tag, String str, Character ch) {
        if (ch == null) {
            ch = this.defaultScalarStyle;
        }
        return new ScalarNode(tag, str, null, null, ch);
    }
}
