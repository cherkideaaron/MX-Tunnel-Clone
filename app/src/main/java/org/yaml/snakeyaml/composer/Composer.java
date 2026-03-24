package org.yaml.snakeyaml.composer;

import defpackage.AbstractC3264qG;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.yaml.snakeyaml.events.AliasEvent;
import org.yaml.snakeyaml.events.Event;
import org.yaml.snakeyaml.events.MappingStartEvent;
import org.yaml.snakeyaml.events.NodeEvent;
import org.yaml.snakeyaml.events.ScalarEvent;
import org.yaml.snakeyaml.events.SequenceStartEvent;
import org.yaml.snakeyaml.nodes.MappingNode;
import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.nodes.NodeId;
import org.yaml.snakeyaml.nodes.NodeTuple;
import org.yaml.snakeyaml.nodes.ScalarNode;
import org.yaml.snakeyaml.nodes.SequenceNode;
import org.yaml.snakeyaml.nodes.Tag;
import org.yaml.snakeyaml.parser.Parser;
import org.yaml.snakeyaml.resolver.Resolver;

/* loaded from: classes2.dex */
public class Composer {
    private final Parser parser;
    private final Resolver resolver;
    private final Map<String, Node> anchors = new HashMap();
    private final Set<Node> recursiveNodes = new HashSet();

    public Composer(Parser parser, Resolver resolver) {
        this.parser = parser;
        this.resolver = resolver;
    }

    private Node composeDocument() {
        this.parser.getEvent();
        Node nodeComposeNode = composeNode(null);
        this.parser.getEvent();
        this.anchors.clear();
        this.recursiveNodes.clear();
        return nodeComposeNode;
    }

    private Node composeMappingNode(String str) {
        Tag tagResolve;
        boolean z;
        MappingStartEvent mappingStartEvent = (MappingStartEvent) this.parser.getEvent();
        String tag = mappingStartEvent.getTag();
        if (tag == null || tag.equals("!")) {
            tagResolve = this.resolver.resolve(NodeId.mapping, null, mappingStartEvent.getImplicit());
            z = true;
        } else {
            tagResolve = new Tag(tag);
            z = false;
        }
        Tag tag2 = tagResolve;
        ArrayList arrayList = new ArrayList();
        MappingNode mappingNode = new MappingNode(tag2, z, arrayList, mappingStartEvent.getStartMark(), null, mappingStartEvent.getFlowStyle());
        if (str != null) {
            this.anchors.put(str, mappingNode);
        }
        while (!this.parser.checkEvent(Event.ID.MappingEnd)) {
            Node nodeComposeNode = composeNode(mappingNode);
            if (nodeComposeNode.getTag().equals(Tag.MERGE)) {
                mappingNode.setMerged(true);
            } else if (nodeComposeNode.getTag().equals(Tag.VALUE)) {
                nodeComposeNode.setTag(Tag.STR);
            }
            arrayList.add(new NodeTuple(nodeComposeNode, composeNode(mappingNode)));
        }
        mappingNode.setEndMark(this.parser.getEvent().getEndMark());
        return mappingNode;
    }

    private Node composeNode(Node node) {
        this.recursiveNodes.add(node);
        if (this.parser.checkEvent(Event.ID.Alias)) {
            AliasEvent aliasEvent = (AliasEvent) this.parser.getEvent();
            String anchor = aliasEvent.getAnchor();
            if (!this.anchors.containsKey(anchor)) {
                throw new ComposerException(null, null, AbstractC3264qG.w("found undefined alias ", anchor), aliasEvent.getStartMark());
            }
            Node node2 = this.anchors.get(anchor);
            if (this.recursiveNodes.remove(node2)) {
                node2.setTwoStepsConstruction(true);
            }
            return node2;
        }
        NodeEvent nodeEvent = (NodeEvent) this.parser.peekEvent();
        String anchor2 = nodeEvent.getAnchor();
        if (anchor2 != null && this.anchors.containsKey(anchor2)) {
            throw new ComposerException(AbstractC3264qG.x("found duplicate anchor ", anchor2, "; first occurence"), this.anchors.get(anchor2).getStartMark(), "second occurence", nodeEvent.getStartMark());
        }
        Node nodeComposeScalarNode = this.parser.checkEvent(Event.ID.Scalar) ? composeScalarNode(anchor2) : this.parser.checkEvent(Event.ID.SequenceStart) ? composeSequenceNode(anchor2) : composeMappingNode(anchor2);
        this.recursiveNodes.remove(node);
        return nodeComposeScalarNode;
    }

    private Node composeScalarNode(String str) {
        Tag tagResolve;
        boolean z;
        ScalarEvent scalarEvent = (ScalarEvent) this.parser.getEvent();
        String tag = scalarEvent.getTag();
        if (tag == null || tag.equals("!")) {
            tagResolve = this.resolver.resolve(NodeId.scalar, scalarEvent.getValue(), scalarEvent.getImplicit().canOmitTagInPlainScalar());
            z = true;
        } else {
            tagResolve = new Tag(tag);
            z = false;
        }
        ScalarNode scalarNode = new ScalarNode(tagResolve, z, scalarEvent.getValue(), scalarEvent.getStartMark(), scalarEvent.getEndMark(), scalarEvent.getStyle());
        if (str != null) {
            this.anchors.put(str, scalarNode);
        }
        return scalarNode;
    }

    private Node composeSequenceNode(String str) {
        Tag tagResolve;
        boolean z;
        SequenceStartEvent sequenceStartEvent = (SequenceStartEvent) this.parser.getEvent();
        String tag = sequenceStartEvent.getTag();
        if (tag == null || tag.equals("!")) {
            tagResolve = this.resolver.resolve(NodeId.sequence, null, sequenceStartEvent.getImplicit());
            z = true;
        } else {
            tagResolve = new Tag(tag);
            z = false;
        }
        boolean z2 = z;
        Tag tag2 = tagResolve;
        ArrayList arrayList = new ArrayList();
        SequenceNode sequenceNode = new SequenceNode(tag2, z2, arrayList, sequenceStartEvent.getStartMark(), null, sequenceStartEvent.getFlowStyle());
        if (str != null) {
            this.anchors.put(str, sequenceNode);
        }
        while (!this.parser.checkEvent(Event.ID.SequenceEnd)) {
            arrayList.add(composeNode(sequenceNode));
        }
        sequenceNode.setEndMark(this.parser.getEvent().getEndMark());
        return sequenceNode;
    }

    public boolean checkNode() {
        if (this.parser.checkEvent(Event.ID.StreamStart)) {
            this.parser.getEvent();
        }
        return !this.parser.checkEvent(Event.ID.StreamEnd);
    }

    public Node getNode() {
        if (this.parser.checkEvent(Event.ID.StreamEnd)) {
            return null;
        }
        return composeDocument();
    }

    public Node getSingleNode() {
        this.parser.getEvent();
        Parser parser = this.parser;
        Event.ID id = Event.ID.StreamEnd;
        Node nodeComposeDocument = !parser.checkEvent(id) ? composeDocument() : null;
        if (!this.parser.checkEvent(id)) {
            throw new ComposerException("expected a single document in the stream", nodeComposeDocument.getStartMark(), "but found another document", this.parser.getEvent().getStartMark());
        }
        this.parser.getEvent();
        return nodeComposeDocument;
    }
}
