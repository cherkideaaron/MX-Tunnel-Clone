package org.yaml.snakeyaml.constructor;

import defpackage.AbstractC3264qG;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;
import org.yaml.snakeyaml.nodes.MappingNode;
import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.nodes.NodeId;
import org.yaml.snakeyaml.nodes.NodeTuple;
import org.yaml.snakeyaml.nodes.ScalarNode;
import org.yaml.snakeyaml.nodes.SequenceNode;
import org.yaml.snakeyaml.nodes.Tag;

/* loaded from: classes2.dex */
public class SafeConstructor extends BaseConstructor {
    private static final Map<String, Boolean> BOOL_VALUES;
    private static final Pattern TIMESTAMP_REGEXP;
    private static final Pattern YMD_REGEXP;
    public static final ConstructUndefined undefinedConstructor = new ConstructUndefined();

    /* renamed from: org.yaml.snakeyaml.constructor.SafeConstructor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$yaml$snakeyaml$nodes$NodeId;

        static {
            int[] iArr = new int[NodeId.values().length];
            $SwitchMap$org$yaml$snakeyaml$nodes$NodeId = iArr;
            try {
                iArr[NodeId.mapping.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$yaml$snakeyaml$nodes$NodeId[NodeId.sequence.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class ConstructUndefined extends AbstractConstruct {
        @Override // org.yaml.snakeyaml.constructor.Construct
        public Object construct(Node node) {
            throw new ConstructorException(null, null, "could not determine a constructor for the tag " + node.getTag(), node.getStartMark());
        }
    }

    public class ConstructYamlBinary extends AbstractConstruct {
        public ConstructYamlBinary() {
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public Object construct(Node node) {
            return Base64Coder.decode(SafeConstructor.this.constructScalar((ScalarNode) node).toString().toCharArray());
        }
    }

    public class ConstructYamlBool extends AbstractConstruct {
        public ConstructYamlBool() {
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public Object construct(Node node) {
            return SafeConstructor.BOOL_VALUES.get(((String) SafeConstructor.this.constructScalar((ScalarNode) node)).toLowerCase());
        }
    }

    public class ConstructYamlFloat extends AbstractConstruct {
        public ConstructYamlFloat() {
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public Object construct(Node node) {
            int i;
            String strReplaceAll = SafeConstructor.this.constructScalar((ScalarNode) node).toString().replaceAll("_", "");
            char cCharAt = strReplaceAll.charAt(0);
            if (cCharAt == '-') {
                strReplaceAll = strReplaceAll.substring(1);
                i = -1;
            } else {
                if (cCharAt == '+') {
                    strReplaceAll = strReplaceAll.substring(1);
                }
                i = 1;
            }
            String lowerCase = strReplaceAll.toLowerCase();
            if (".inf".equals(lowerCase)) {
                return new Double(i == -1 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            if (".nan".equals(lowerCase)) {
                return new Double(Double.NaN);
            }
            if (strReplaceAll.indexOf(58) == -1) {
                return new Double(Double.valueOf(strReplaceAll).doubleValue() * i);
            }
            String[] strArrSplit = strReplaceAll.split(":");
            int length = strArrSplit.length;
            double d = 0.0d;
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                d += Double.parseDouble(strArrSplit[(length - i3) - 1]) * i2;
                i2 *= 60;
            }
            return new Double(i * d);
        }
    }

    public class ConstructYamlInt extends AbstractConstruct {
        public ConstructYamlInt() {
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public Object construct(Node node) {
            int i;
            String strSubstring;
            String strReplaceAll = SafeConstructor.this.constructScalar((ScalarNode) node).toString().replaceAll("_", "");
            char cCharAt = strReplaceAll.charAt(0);
            if (cCharAt == '-') {
                strReplaceAll = strReplaceAll.substring(1);
                i = -1;
            } else {
                if (cCharAt == '+') {
                    strReplaceAll = strReplaceAll.substring(1);
                }
                i = 1;
            }
            if ("0".equals(strReplaceAll)) {
                return 0;
            }
            int i2 = 2;
            if (strReplaceAll.startsWith("0b")) {
                strSubstring = strReplaceAll.substring(2);
            } else if (strReplaceAll.startsWith("0x")) {
                strSubstring = strReplaceAll.substring(2);
                i2 = 16;
            } else {
                if (!strReplaceAll.startsWith("0")) {
                    if (strReplaceAll.indexOf(58) == -1) {
                        return SafeConstructor.this.createNumber(i, strReplaceAll, 10);
                    }
                    String[] strArrSplit = strReplaceAll.split(":");
                    int length = strArrSplit.length;
                    int i3 = 0;
                    int i4 = 1;
                    for (int i5 = 0; i5 < length; i5++) {
                        i3 = (int) ((Long.parseLong(strArrSplit[(length - i5) - 1]) * i4) + i3);
                        i4 *= 60;
                    }
                    return SafeConstructor.this.createNumber(i, String.valueOf(i3), 10);
                }
                strSubstring = strReplaceAll.substring(1);
                i2 = 8;
            }
            return SafeConstructor.this.createNumber(i, strSubstring, i2);
        }
    }

    public class ConstructYamlMap implements Construct {
        public ConstructYamlMap() {
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public Object construct(Node node) {
            return node.isTwoStepsConstruction() ? SafeConstructor.this.createDefaultMap() : SafeConstructor.this.constructMapping((MappingNode) node);
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public void construct2ndStep(Node node, Object obj) {
            if (node.isTwoStepsConstruction()) {
                SafeConstructor.this.constructMapping2ndStep((MappingNode) node, (Map) obj);
            } else {
                throw new YAMLException("Unexpected recursive mapping structure. Node: " + node);
            }
        }
    }

    public class ConstructYamlNull extends AbstractConstruct {
        public ConstructYamlNull() {
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public Object construct(Node node) {
            SafeConstructor.this.constructScalar((ScalarNode) node);
            return null;
        }
    }

    public class ConstructYamlOmap extends AbstractConstruct {
        public ConstructYamlOmap() {
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public Object construct(Node node) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (!(node instanceof SequenceNode)) {
                throw new ConstructorException("while constructing an ordered map", node.getStartMark(), "expected a sequence, but found " + node.getNodeId(), node.getStartMark());
            }
            for (Node node2 : ((SequenceNode) node).getValue()) {
                if (!(node2 instanceof MappingNode)) {
                    throw new ConstructorException("while constructing an ordered map", node.getStartMark(), "expected a mapping of length 1, but found " + node2.getNodeId(), node2.getStartMark());
                }
                MappingNode mappingNode = (MappingNode) node2;
                if (mappingNode.getValue().size() != 1) {
                    throw new ConstructorException("while constructing an ordered map", node.getStartMark(), "expected a single mapping item, but found " + mappingNode.getValue().size() + " items", mappingNode.getStartMark());
                }
                linkedHashMap.put(SafeConstructor.this.constructObject(mappingNode.getValue().get(0).getKeyNode()), SafeConstructor.this.constructObject(mappingNode.getValue().get(0).getValueNode()));
            }
            return linkedHashMap;
        }
    }

    public class ConstructYamlPairs extends AbstractConstruct {
        public ConstructYamlPairs() {
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public Object construct(Node node) {
            if (!(node instanceof SequenceNode)) {
                throw new ConstructorException("while constructing pairs", node.getStartMark(), "expected a sequence, but found " + node.getNodeId(), node.getStartMark());
            }
            SequenceNode sequenceNode = (SequenceNode) node;
            ArrayList arrayList = new ArrayList(sequenceNode.getValue().size());
            for (Node node2 : sequenceNode.getValue()) {
                if (!(node2 instanceof MappingNode)) {
                    throw new ConstructorException("while constructingpairs", node.getStartMark(), "expected a mapping of length 1, but found " + node2.getNodeId(), node2.getStartMark());
                }
                MappingNode mappingNode = (MappingNode) node2;
                if (mappingNode.getValue().size() != 1) {
                    throw new ConstructorException("while constructing pairs", node.getStartMark(), "expected a single mapping item, but found " + mappingNode.getValue().size() + " items", mappingNode.getStartMark());
                }
                arrayList.add(new Object[]{SafeConstructor.this.constructObject(mappingNode.getValue().get(0).getKeyNode()), SafeConstructor.this.constructObject(mappingNode.getValue().get(0).getValueNode())});
            }
            return arrayList;
        }
    }

    public class ConstructYamlSeq implements Construct {
        public ConstructYamlSeq() {
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public Object construct(Node node) {
            SequenceNode sequenceNode = (SequenceNode) node;
            return node.isTwoStepsConstruction() ? SafeConstructor.this.createDefaultList(sequenceNode.getValue().size()) : SafeConstructor.this.constructSequence(sequenceNode);
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public void construct2ndStep(Node node, Object obj) {
            if (node.isTwoStepsConstruction()) {
                SafeConstructor.this.constructSequenceStep2((SequenceNode) node, (List) obj);
            } else {
                throw new YAMLException("Unexpected recursive sequence structure. Node: " + node);
            }
        }
    }

    public class ConstructYamlSet implements Construct {
        public ConstructYamlSet() {
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public Object construct(Node node) {
            return node.isTwoStepsConstruction() ? SafeConstructor.this.createDefaultSet() : SafeConstructor.this.constructSet((MappingNode) node);
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public void construct2ndStep(Node node, Object obj) {
            if (node.isTwoStepsConstruction()) {
                SafeConstructor.this.constructSet2ndStep((MappingNode) node, (Set) obj);
            } else {
                throw new YAMLException("Unexpected recursive set structure. Node: " + node);
            }
        }
    }

    public class ConstructYamlStr extends AbstractConstruct {
        public ConstructYamlStr() {
        }

        @Override // org.yaml.snakeyaml.constructor.Construct
        public Object construct(Node node) {
            return SafeConstructor.this.constructScalar((ScalarNode) node);
        }
    }

    public static class ConstructYamlTimestamp extends AbstractConstruct {
        private Calendar calendar;

        @Override // org.yaml.snakeyaml.constructor.Construct
        public Object construct(Node node) throws NumberFormatException {
            TimeZone timeZone;
            String value = ((ScalarNode) node).getValue();
            Matcher matcher = SafeConstructor.YMD_REGEXP.matcher(value);
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(2);
                String strGroup3 = matcher.group(3);
                Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                this.calendar = calendar;
                calendar.clear();
                this.calendar.set(1, Integer.parseInt(strGroup));
                this.calendar.set(2, Integer.parseInt(strGroup2) - 1);
                this.calendar.set(5, Integer.parseInt(strGroup3));
                return this.calendar.getTime();
            }
            Matcher matcher2 = SafeConstructor.TIMESTAMP_REGEXP.matcher(value);
            if (!matcher2.matches()) {
                throw new YAMLException(AbstractC3264qG.w("Unexpected timestamp: ", value));
            }
            String strGroup4 = matcher2.group(1);
            String strGroup5 = matcher2.group(2);
            String strGroup6 = matcher2.group(3);
            String strGroup7 = matcher2.group(4);
            String strGroup8 = matcher2.group(5);
            String strGroup9 = matcher2.group(6);
            String strGroup10 = matcher2.group(7);
            if (strGroup10 != null) {
                strGroup9 = AbstractC3264qG.h(strGroup9, ".", strGroup10);
            }
            double d = Double.parseDouble(strGroup9);
            int iRound = (int) Math.round(Math.floor(d));
            int iRound2 = (int) Math.round((d - iRound) * 1000.0d);
            String strGroup11 = matcher2.group(8);
            String strGroup12 = matcher2.group(9);
            if (strGroup11 != null) {
                timeZone = TimeZone.getTimeZone("GMT" + strGroup11 + (strGroup12 != null ? ":".concat(strGroup12) : "00"));
            } else {
                timeZone = TimeZone.getTimeZone("UTC");
            }
            Calendar calendar2 = Calendar.getInstance(timeZone);
            this.calendar = calendar2;
            calendar2.set(1, Integer.parseInt(strGroup4));
            this.calendar.set(2, Integer.parseInt(strGroup5) - 1);
            this.calendar.set(5, Integer.parseInt(strGroup6));
            this.calendar.set(11, Integer.parseInt(strGroup7));
            this.calendar.set(12, Integer.parseInt(strGroup8));
            this.calendar.set(13, iRound);
            this.calendar.set(14, iRound2);
            return this.calendar.getTime();
        }

        public Calendar getCalendar() {
            return this.calendar;
        }
    }

    static {
        HashMap map = new HashMap();
        BOOL_VALUES = map;
        Boolean bool = Boolean.TRUE;
        map.put("yes", bool);
        Boolean bool2 = Boolean.FALSE;
        map.put("no", bool2);
        map.put("true", bool);
        map.put("false", bool2);
        map.put("on", bool);
        map.put("off", bool2);
        TIMESTAMP_REGEXP = Pattern.compile("^([0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)(?:(?:[Tt]|[ \t]+)([0-9][0-9]?):([0-9][0-9]):([0-9][0-9])(?:\\.([0-9]*))?(?:[ \t]*(?:Z|([-+][0-9][0-9]?)(?::([0-9][0-9])?)?))?)?$");
        YMD_REGEXP = Pattern.compile("^([0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)$");
    }

    public SafeConstructor() {
        this.yamlConstructors.put(Tag.NULL, new ConstructYamlNull());
        this.yamlConstructors.put(Tag.BOOL, new ConstructYamlBool());
        this.yamlConstructors.put(Tag.INT, new ConstructYamlInt());
        this.yamlConstructors.put(Tag.FLOAT, new ConstructYamlFloat());
        this.yamlConstructors.put(Tag.BINARY, new ConstructYamlBinary());
        this.yamlConstructors.put(Tag.TIMESTAMP, new ConstructYamlTimestamp());
        this.yamlConstructors.put(Tag.OMAP, new ConstructYamlOmap());
        this.yamlConstructors.put(Tag.PAIRS, new ConstructYamlPairs());
        this.yamlConstructors.put(Tag.SET, new ConstructYamlSet());
        this.yamlConstructors.put(Tag.STR, new ConstructYamlStr());
        this.yamlConstructors.put(Tag.SEQ, new ConstructYamlSeq());
        this.yamlConstructors.put(Tag.MAP, new ConstructYamlMap());
        Map<Tag, Construct> map = this.yamlConstructors;
        ConstructUndefined constructUndefined = undefinedConstructor;
        map.put(null, constructUndefined);
        this.yamlClassConstructors.put(NodeId.scalar, constructUndefined);
        this.yamlClassConstructors.put(NodeId.sequence, constructUndefined);
        this.yamlClassConstructors.put(NodeId.mapping, constructUndefined);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Number createNumber(int i, String str, int i2) {
        if (i < 0) {
            str = AbstractC3264qG.w("-", str);
        }
        try {
            try {
                return Integer.valueOf(str, i2);
            } catch (NumberFormatException unused) {
                return Long.valueOf(str, i2);
            }
        } catch (NumberFormatException unused2) {
            return new BigInteger(str, i2);
        }
    }

    private List<NodeTuple> mergeNode(MappingNode mappingNode, boolean z, Map<Object, Integer> map, List<NodeTuple> list) {
        List<NodeTuple> value = mappingNode.getValue();
        Collections.reverse(value);
        Iterator<NodeTuple> it = value.iterator();
        while (it.hasNext()) {
            NodeTuple next = it.next();
            Node keyNode = next.getKeyNode();
            Node valueNode = next.getValueNode();
            if (keyNode.getTag().equals(Tag.MERGE)) {
                it.remove();
                int i = AnonymousClass1.$SwitchMap$org$yaml$snakeyaml$nodes$NodeId[valueNode.getNodeId().ordinal()];
                if (i == 1) {
                    mergeNode((MappingNode) valueNode, false, map, list);
                } else {
                    if (i != 2) {
                        throw new ConstructorException("while constructing a mapping", mappingNode.getStartMark(), "expected a mapping or list of mappings for merging, but found " + valueNode.getNodeId(), valueNode.getStartMark());
                    }
                    for (Node node : ((SequenceNode) valueNode).getValue()) {
                        if (!(node instanceof MappingNode)) {
                            throw new ConstructorException("while constructing a mapping", mappingNode.getStartMark(), "expected a mapping for merging, but found " + node.getNodeId(), node.getStartMark());
                        }
                        mergeNode((MappingNode) node, false, map, list);
                    }
                }
            } else {
                Object objConstructObject = constructObject(keyNode);
                if (!map.containsKey(objConstructObject)) {
                    list.add(next);
                    map.put(objConstructObject, Integer.valueOf(list.size() - 1));
                } else if (z) {
                    list.set(map.get(objConstructObject).intValue(), next);
                }
            }
        }
        return list;
    }

    @Override // org.yaml.snakeyaml.constructor.BaseConstructor
    public void constructMapping2ndStep(MappingNode mappingNode, Map<Object, Object> map) {
        flattenMapping(mappingNode);
        super.constructMapping2ndStep(mappingNode, map);
    }

    @Override // org.yaml.snakeyaml.constructor.BaseConstructor
    public void constructSet2ndStep(MappingNode mappingNode, Set<Object> set) {
        flattenMapping(mappingNode);
        super.constructSet2ndStep(mappingNode, set);
    }

    public void flattenMapping(MappingNode mappingNode) {
        if (mappingNode.isMerged()) {
            mappingNode.setValue(mergeNode(mappingNode, true, new HashMap(), new ArrayList()));
        }
    }
}
