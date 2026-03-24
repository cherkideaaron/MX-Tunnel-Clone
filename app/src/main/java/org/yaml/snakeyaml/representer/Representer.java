package org.yaml.snakeyaml.representer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.introspector.Property;
import org.yaml.snakeyaml.nodes.MappingNode;
import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.nodes.NodeId;
import org.yaml.snakeyaml.nodes.NodeTuple;
import org.yaml.snakeyaml.nodes.ScalarNode;
import org.yaml.snakeyaml.nodes.SequenceNode;
import org.yaml.snakeyaml.nodes.Tag;

/* loaded from: classes2.dex */
public class Representer extends SafeRepresenter {

    public class RepresentJavaBean implements Represent {
        public RepresentJavaBean() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.yaml.snakeyaml.representer.Represent
        public Node representData(Object obj) {
            Representer representer = Representer.this;
            return representer.representJavaBean(representer.getProperties(obj.getClass()), obj);
        }
    }

    public Representer() {
        this.representers.put(null, new RepresentJavaBean());
    }

    private void resetTag(Class<? extends Object> cls, Node node) {
        if (node.getTag().matches(cls)) {
            node.setTag(Enum.class.isAssignableFrom(cls) ? Tag.STR : Tag.MAP);
        }
    }

    @Override // org.yaml.snakeyaml.representer.SafeRepresenter
    public /* bridge */ /* synthetic */ Tag addClassTag(Class cls, String str) {
        return super.addClassTag((Class<? extends Object>) cls, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void checkGlobalTag(Property property, Node node, Object obj) {
        Class<?>[] actualTypeArguments = property.getActualTypeArguments();
        if (actualTypeArguments != null) {
            if (node.getNodeId() == NodeId.sequence) {
                Class<?> cls = actualTypeArguments[0];
                SequenceNode sequenceNode = (SequenceNode) node;
                Iterator it = (obj.getClass().isArray() ? Arrays.asList((Object[]) obj) : (Iterable) obj).iterator();
                for (Node node2 : sequenceNode.getValue()) {
                    Object next = it.next();
                    if (next != null && cls.equals(next.getClass()) && node2.getNodeId() == NodeId.mapping) {
                        node2.setTag(Tag.MAP);
                    }
                }
                return;
            }
            if (obj instanceof Set) {
                Class<?> cls2 = actualTypeArguments[0];
                Iterator<NodeTuple> it2 = ((MappingNode) node).getValue().iterator();
                for (Object obj2 : (Set) obj) {
                    Node keyNode = it2.next().getKeyNode();
                    if (cls2.equals(obj2.getClass()) && keyNode.getNodeId() == NodeId.mapping) {
                        keyNode.setTag(Tag.MAP);
                    }
                }
                return;
            }
            if (obj instanceof Map) {
                Class<?> cls3 = actualTypeArguments[0];
                Class<?> cls4 = actualTypeArguments[1];
                for (NodeTuple nodeTuple : ((MappingNode) node).getValue()) {
                    resetTag(cls3, nodeTuple.getKeyNode());
                    resetTag(cls4, nodeTuple.getValueNode());
                }
            }
        }
    }

    public Set<Property> getProperties(Class<? extends Object> cls) {
        return getPropertyUtils().getProperties(cls);
    }

    @Override // org.yaml.snakeyaml.representer.SafeRepresenter
    public /* bridge */ /* synthetic */ TimeZone getTimeZone() {
        return super.getTimeZone();
    }

    public MappingNode representJavaBean(Set<Property> set, Object obj) {
        ArrayList arrayList = new ArrayList(set.size());
        Tag tag = this.classTags.get(obj.getClass());
        if (tag == null) {
            tag = new Tag((Class<? extends Object>) obj.getClass());
        }
        MappingNode mappingNode = new MappingNode(tag, arrayList, null);
        this.representedObjects.put(obj, mappingNode);
        boolean z = true;
        for (Property property : set) {
            Object obj2 = property.get(obj);
            NodeTuple nodeTupleRepresentJavaBeanProperty = representJavaBeanProperty(obj, property, obj2, obj2 == null ? null : this.classTags.get(obj2.getClass()));
            if (nodeTupleRepresentJavaBeanProperty != null) {
                if (((ScalarNode) nodeTupleRepresentJavaBeanProperty.getKeyNode()).getStyle() != null) {
                    z = false;
                }
                Node valueNode = nodeTupleRepresentJavaBeanProperty.getValueNode();
                if (!(valueNode instanceof ScalarNode) || ((ScalarNode) valueNode).getStyle() != null) {
                    z = false;
                }
                arrayList.add(nodeTupleRepresentJavaBeanProperty);
            }
        }
        DumperOptions.FlowStyle flowStyle = this.defaultFlowStyle;
        mappingNode.setFlowStyle(flowStyle != DumperOptions.FlowStyle.AUTO ? flowStyle.getStyleBoolean() : Boolean.valueOf(z));
        return mappingNode;
    }

    public NodeTuple representJavaBeanProperty(Object obj, Property property, Object obj2, Tag tag) {
        ScalarNode scalarNode = (ScalarNode) representData(property.getName());
        boolean zContainsKey = this.representedObjects.containsKey(obj2);
        Node nodeRepresentData = representData(obj2);
        if (obj2 != null && !zContainsKey) {
            NodeId nodeId = nodeRepresentData.getNodeId();
            if (tag == null) {
                if (nodeId != NodeId.scalar) {
                    if (nodeId == NodeId.mapping && property.getType() == obj2.getClass() && !(obj2 instanceof Map) && !nodeRepresentData.getTag().equals(Tag.SET)) {
                        nodeRepresentData.setTag(Tag.MAP);
                    }
                    checkGlobalTag(property, nodeRepresentData, obj2);
                } else if (obj2 instanceof Enum) {
                    nodeRepresentData.setTag(Tag.STR);
                }
            }
        }
        return new NodeTuple(scalarNode, nodeRepresentData);
    }

    @Override // org.yaml.snakeyaml.representer.SafeRepresenter
    public /* bridge */ /* synthetic */ void setTimeZone(TimeZone timeZone) {
        super.setTimeZone(timeZone);
    }

    @Override // org.yaml.snakeyaml.representer.SafeRepresenter
    public /* bridge */ /* synthetic */ Tag addClassTag(Class cls, Tag tag) {
        return super.addClassTag((Class<? extends Object>) cls, tag);
    }
}
