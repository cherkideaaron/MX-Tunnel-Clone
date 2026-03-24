package org.yaml.snakeyaml.extensions.compactnotation;

import defpackage.AbstractC3264qG;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.yaml.snakeyaml.constructor.AbstractConstruct;
import org.yaml.snakeyaml.constructor.Construct;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.introspector.Property;
import org.yaml.snakeyaml.nodes.MappingNode;
import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.nodes.NodeTuple;
import org.yaml.snakeyaml.nodes.ScalarNode;

/* loaded from: classes2.dex */
public class CompactConstructor extends Constructor {
    private static final Pattern FIRST_PATTERN = Pattern.compile("(\\p{Alpha}.*)(\\s*)\\((.*?)\\)");
    private static final Pattern PROPERTY_NAME_PATTERN = Pattern.compile("\\s*(\\p{Alpha}\\w*)\\s*=(.+)");

    public class ConstructCompactObject extends AbstractConstruct {
        public ConstructCompactObject() {
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public Object construct(Node node) {
            Map.Entry entry = (Map.Entry) CompactConstructor.this.constructMapping((MappingNode) node).entrySet().iterator().next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                try {
                    CompactConstructor.this.setProperties(key, (Map) value);
                } catch (Exception e) {
                    throw new YAMLException(e);
                }
            } else {
                CompactConstructor.this.applySequence(key, (List) value);
            }
            return key;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void applySequence(Object obj, List<?> list) {
        try {
            getPropertyUtils().getProperty(obj.getClass(), getSequencePropertyName(obj.getClass())).set(obj, list);
        } catch (Exception e) {
            throw new YAMLException(e);
        }
    }

    public Object constructCompactFormat(ScalarNode scalarNode, CompactData compactData) {
        try {
            Object objCreateInstance = createInstance(scalarNode, compactData);
            setProperties(objCreateInstance, new HashMap(compactData.getProperties()));
            return objCreateInstance;
        } catch (Exception e) {
            throw new YAMLException(e);
        }
    }

    @Override // org.yaml.snakeyaml.constructor.BaseConstructor
    public Object constructScalar(ScalarNode scalarNode) {
        CompactData compactData = getCompactData(scalarNode.getValue());
        return compactData != null ? constructCompactFormat(scalarNode, compactData) : super.constructScalar(scalarNode);
    }

    public Object createInstance(ScalarNode scalarNode, CompactData compactData) throws NoSuchMethodException, SecurityException {
        Class<?> classForName = getClassForName(compactData.getPrefix());
        int size = compactData.getArguments().size();
        Class<?>[] clsArr = new Class[size];
        for (int i = 0; i < size; i++) {
            clsArr[i] = String.class;
        }
        java.lang.reflect.Constructor<?> declaredConstructor = classForName.getDeclaredConstructor(clsArr);
        declaredConstructor.setAccessible(true);
        return declaredConstructor.newInstance(compactData.getArguments().toArray());
    }

    public CompactData getCompactData(String str) {
        if (!str.endsWith(")") || str.indexOf(40) < 0) {
            return null;
        }
        Matcher matcher = FIRST_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strTrim = matcher.group(1).trim();
        String strGroup = matcher.group(3);
        CompactData compactData = new CompactData(strTrim);
        if (strGroup.length() == 0) {
            return compactData;
        }
        for (String str2 : strGroup.split("\\s*,\\s*")) {
            if (str2.indexOf(61) < 0) {
                compactData.getArguments().add(str2);
            } else {
                Matcher matcher2 = PROPERTY_NAME_PATTERN.matcher(str2);
                if (!matcher2.matches()) {
                    return null;
                }
                compactData.getProperties().put(matcher2.group(1), matcher2.group(2).trim());
            }
        }
        return compactData;
    }

    @Override // org.yaml.snakeyaml.constructor.BaseConstructor
    public Construct getConstructor(Node node) {
        if (node instanceof MappingNode) {
            List<NodeTuple> value = ((MappingNode) node).getValue();
            if (value.size() == 1) {
                Node keyNode = value.get(0).getKeyNode();
                if ((keyNode instanceof ScalarNode) && getCompactData(((ScalarNode) keyNode).getValue()) != null) {
                    return new ConstructCompactObject();
                }
            }
        }
        return super.getConstructor(node);
    }

    public String getSequencePropertyName(Class<?> cls) {
        Set<Property> properties = getPropertyUtils().getProperties(cls);
        Iterator<Property> it = properties.iterator();
        while (it.hasNext()) {
            if (!List.class.isAssignableFrom(it.next().getType())) {
                it.remove();
            }
        }
        if (properties.size() == 0) {
            throw new YAMLException("No list property found in " + cls);
        }
        if (properties.size() <= 1) {
            return properties.iterator().next().getName();
        }
        throw new YAMLException("Many list properties found in " + cls + "; Please override getSequencePropertyName() to specify which property to use.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setProperties(Object obj, Map<String, Object> map) {
        if (map == null) {
            throw new NullPointerException("Data for Compact Object Notation cannot be null.");
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            try {
                getPropertyUtils().getProperty(obj.getClass(), key).set(obj, entry.getValue());
            } catch (IllegalArgumentException unused) {
                StringBuilder sbO = AbstractC3264qG.o("Cannot set property='", key, "' with value='");
                sbO.append(map.get(key));
                sbO.append("' (");
                sbO.append(map.get(key).getClass());
                sbO.append(") in ");
                sbO.append(obj);
                throw new YAMLException(sbO.toString());
            }
        }
    }
}
