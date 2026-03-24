package org.yaml.snakeyaml.emitter;

import defpackage.AbstractC3264qG;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.regex.Pattern;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.events.AliasEvent;
import org.yaml.snakeyaml.events.CollectionEndEvent;
import org.yaml.snakeyaml.events.CollectionStartEvent;
import org.yaml.snakeyaml.events.DocumentEndEvent;
import org.yaml.snakeyaml.events.DocumentStartEvent;
import org.yaml.snakeyaml.events.Event;
import org.yaml.snakeyaml.events.MappingEndEvent;
import org.yaml.snakeyaml.events.MappingStartEvent;
import org.yaml.snakeyaml.events.NodeEvent;
import org.yaml.snakeyaml.events.ScalarEvent;
import org.yaml.snakeyaml.events.SequenceEndEvent;
import org.yaml.snakeyaml.events.SequenceStartEvent;
import org.yaml.snakeyaml.events.StreamEndEvent;
import org.yaml.snakeyaml.events.StreamStartEvent;
import org.yaml.snakeyaml.nodes.Tag;
import org.yaml.snakeyaml.scanner.Constant;
import org.yaml.snakeyaml.util.ArrayStack;

/* loaded from: classes2.dex */
public final class Emitter implements Emitable {
    private static final Pattern ANCHOR_FORMAT;
    private static final Map<String, String> DEFAULT_TAG_PREFIXES;
    private static final Map<Character, String> ESCAPE_REPLACEMENTS;
    private static final Pattern HANDLE_FORMAT;
    public static final int MAX_INDENT = 10;
    public static final int MIN_INDENT = 1;
    private static final char[] SPACE;
    private boolean allowUnicode;
    private ScalarAnalysis analysis;
    private int bestIndent;
    private char[] bestLineBreak;
    private int bestWidth;
    private Boolean canonical;
    private DumperOptions options;
    private String preparedAnchor;
    private String preparedTag;
    private Boolean prettyFlow;
    private boolean rootContext;
    private final Writer stream;
    private Character style;
    private Map<String, String> tagPrefixes;
    private final ArrayStack<EmitterState> states = new ArrayStack<>(100);
    private EmitterState state = new ExpectStreamStart();
    private final Queue<Event> events = new ArrayBlockingQueue(100);
    private Event event = null;
    private final ArrayStack<Integer> indents = new ArrayStack<>(10);
    private Integer indent = null;
    private int flowLevel = 0;
    private boolean mappingContext = false;
    private boolean simpleKeyContext = false;
    private int column = 0;
    private boolean whitespace = true;
    private boolean indention = true;
    private boolean openEnded = false;

    public class ExpectBlockMappingKey implements EmitterState {
        private boolean first;

        public ExpectBlockMappingKey(boolean z) {
            this.first = z;
        }

        @Override // org.yaml.snakeyaml.emitter.EmitterState
        public void expect() throws IOException {
            if (!this.first && (Emitter.this.event instanceof MappingEndEvent)) {
                Emitter emitter = Emitter.this;
                emitter.indent = (Integer) emitter.indents.pop();
                Emitter emitter2 = Emitter.this;
                emitter2.state = (EmitterState) emitter2.states.pop();
                return;
            }
            Emitter.this.writeIndent();
            if (Emitter.this.checkSimpleKey()) {
                Emitter.this.states.push(new ExpectBlockMappingSimpleValue());
                Emitter.this.expectNode(false, true, true);
            } else {
                Emitter.this.writeIndicator("?", true, false, true);
                Emitter.this.states.push(new ExpectBlockMappingValue());
                Emitter.this.expectNode(false, true, false);
            }
        }
    }

    public class ExpectBlockMappingSimpleValue implements EmitterState {
        private ExpectBlockMappingSimpleValue() {
        }

        @Override // org.yaml.snakeyaml.emitter.EmitterState
        public void expect() throws IOException {
            Emitter.this.writeIndicator(":", false, false, false);
            Emitter.this.states.push(Emitter.this.new ExpectBlockMappingKey(false));
            Emitter.this.expectNode(false, true, false);
        }
    }

    public class ExpectBlockMappingValue implements EmitterState {
        private ExpectBlockMappingValue() {
        }

        @Override // org.yaml.snakeyaml.emitter.EmitterState
        public void expect() throws IOException {
            Emitter.this.writeIndent();
            Emitter.this.writeIndicator(":", true, false, true);
            Emitter.this.states.push(Emitter.this.new ExpectBlockMappingKey(false));
            Emitter.this.expectNode(false, true, false);
        }
    }

    public class ExpectBlockSequenceItem implements EmitterState {
        private boolean first;

        public ExpectBlockSequenceItem(boolean z) {
            this.first = z;
        }

        @Override // org.yaml.snakeyaml.emitter.EmitterState
        public void expect() throws IOException {
            if (this.first || !(Emitter.this.event instanceof SequenceEndEvent)) {
                Emitter.this.writeIndent();
                Emitter.this.writeIndicator("-", true, false, true);
                Emitter.this.states.push(Emitter.this.new ExpectBlockSequenceItem(false));
                Emitter.this.expectNode(false, false, false);
                return;
            }
            Emitter emitter = Emitter.this;
            emitter.indent = (Integer) emitter.indents.pop();
            Emitter emitter2 = Emitter.this;
            emitter2.state = (EmitterState) emitter2.states.pop();
        }
    }

    public class ExpectDocumentEnd implements EmitterState {
        private ExpectDocumentEnd() {
        }

        @Override // org.yaml.snakeyaml.emitter.EmitterState
        public void expect() throws IOException {
            if (!(Emitter.this.event instanceof DocumentEndEvent)) {
                throw new EmitterException("expected DocumentEndEvent, but got " + Emitter.this.event);
            }
            Emitter.this.writeIndent();
            if (((DocumentEndEvent) Emitter.this.event).getExplicit()) {
                Emitter.this.writeIndicator("...", true, false, false);
                Emitter.this.writeIndent();
            }
            Emitter.this.flushStream();
            Emitter emitter = Emitter.this;
            emitter.state = emitter.new ExpectDocumentStart(false);
        }
    }

    public class ExpectDocumentRoot implements EmitterState {
        private ExpectDocumentRoot() {
        }

        @Override // org.yaml.snakeyaml.emitter.EmitterState
        public void expect() throws IOException {
            Emitter.this.states.push(new ExpectDocumentEnd());
            Emitter.this.expectNode(true, false, false);
        }
    }

    public class ExpectDocumentStart implements EmitterState {
        private boolean first;

        public ExpectDocumentStart(boolean z) {
            this.first = z;
        }

        @Override // org.yaml.snakeyaml.emitter.EmitterState
        public void expect() throws IOException {
            Emitter emitter;
            EmitterState expectNothing;
            if (Emitter.this.event instanceof DocumentStartEvent) {
                DocumentStartEvent documentStartEvent = (DocumentStartEvent) Emitter.this.event;
                if ((documentStartEvent.getVersion() != null || documentStartEvent.getTags() != null) && Emitter.this.openEnded) {
                    Emitter.this.writeIndicator("...", true, false, false);
                    Emitter.this.writeIndent();
                }
                if (documentStartEvent.getVersion() != null) {
                    Emitter.this.writeVersionDirective(Emitter.this.prepareVersion(documentStartEvent.getVersion()));
                }
                Emitter.this.tagPrefixes = new LinkedHashMap(Emitter.DEFAULT_TAG_PREFIXES);
                if (documentStartEvent.getTags() != null) {
                    Iterator it = new TreeSet(documentStartEvent.getTags().keySet()).iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        String str2 = documentStartEvent.getTags().get(str);
                        Emitter.this.tagPrefixes.put(str2, str);
                        Emitter.this.writeTagDirective(Emitter.this.prepareTagHandle(str), Emitter.this.prepareTagPrefix(str2));
                    }
                }
                if (!this.first || documentStartEvent.getExplicit() || Emitter.this.canonical.booleanValue() || documentStartEvent.getVersion() != null || documentStartEvent.getTags() != null || Emitter.this.checkEmptyDocument()) {
                    Emitter.this.writeIndent();
                    Emitter.this.writeIndicator("---", true, false, false);
                    if (Emitter.this.canonical.booleanValue()) {
                        Emitter.this.writeIndent();
                    }
                }
                emitter = Emitter.this;
                expectNothing = new ExpectDocumentRoot();
            } else {
                if (!(Emitter.this.event instanceof StreamEndEvent)) {
                    throw new EmitterException("expected DocumentStartEvent, but got " + Emitter.this.event);
                }
                Emitter.this.writeStreamEnd();
                emitter = Emitter.this;
                expectNothing = new ExpectNothing();
            }
            emitter.state = expectNothing;
        }
    }

    public class ExpectFirstBlockMappingKey implements EmitterState {
        private ExpectFirstBlockMappingKey() {
        }

        @Override // org.yaml.snakeyaml.emitter.EmitterState
        public void expect() throws IOException {
            Emitter.this.new ExpectBlockMappingKey(true).expect();
        }
    }

    public class ExpectFirstBlockSequenceItem implements EmitterState {
        private ExpectFirstBlockSequenceItem() {
        }

        @Override // org.yaml.snakeyaml.emitter.EmitterState
        public void expect() throws IOException {
            Emitter.this.new ExpectBlockSequenceItem(true).expect();
        }
    }

    public class ExpectFirstDocumentStart implements EmitterState {
        private ExpectFirstDocumentStart() {
        }

        @Override // org.yaml.snakeyaml.emitter.EmitterState
        public void expect() throws IOException {
            Emitter.this.new ExpectDocumentStart(true).expect();
        }
    }

    public class ExpectFirstFlowMappingKey implements EmitterState {
        private ExpectFirstFlowMappingKey() {
        }

        @Override // org.yaml.snakeyaml.emitter.EmitterState
        public void expect() throws IOException {
            if (Emitter.this.event instanceof MappingEndEvent) {
                Emitter emitter = Emitter.this;
                emitter.indent = (Integer) emitter.indents.pop();
                Emitter.access$2010(Emitter.this);
                Emitter.this.writeIndicator("}", false, false, false);
                Emitter emitter2 = Emitter.this;
                emitter2.state = (EmitterState) emitter2.states.pop();
                return;
            }
            if (Emitter.this.canonical.booleanValue() || Emitter.this.column > Emitter.this.bestWidth || Emitter.this.prettyFlow.booleanValue()) {
                Emitter.this.writeIndent();
            }
            if (!Emitter.this.canonical.booleanValue() && Emitter.this.checkSimpleKey()) {
                Emitter.this.states.push(new ExpectFlowMappingSimpleValue());
                Emitter.this.expectNode(false, true, true);
            } else {
                Emitter.this.writeIndicator("?", true, false, false);
                Emitter.this.states.push(new ExpectFlowMappingValue());
                Emitter.this.expectNode(false, true, false);
            }
        }
    }

    public class ExpectFirstFlowSequenceItem implements EmitterState {
        private ExpectFirstFlowSequenceItem() {
        }

        @Override // org.yaml.snakeyaml.emitter.EmitterState
        public void expect() throws IOException {
            if (Emitter.this.event instanceof SequenceEndEvent) {
                Emitter emitter = Emitter.this;
                emitter.indent = (Integer) emitter.indents.pop();
                Emitter.access$2010(Emitter.this);
                Emitter.this.writeIndicator("]", false, false, false);
                Emitter emitter2 = Emitter.this;
                emitter2.state = (EmitterState) emitter2.states.pop();
                return;
            }
            if (Emitter.this.canonical.booleanValue() || Emitter.this.column > Emitter.this.bestWidth || Emitter.this.prettyFlow.booleanValue()) {
                Emitter.this.writeIndent();
            }
            Emitter.this.states.push(new ExpectFlowSequenceItem());
            Emitter.this.expectNode(false, false, false);
        }
    }

    public class ExpectFlowMappingKey implements EmitterState {
        private ExpectFlowMappingKey() {
        }

        @Override // org.yaml.snakeyaml.emitter.EmitterState
        public void expect() throws IOException {
            if (Emitter.this.event instanceof MappingEndEvent) {
                Emitter emitter = Emitter.this;
                emitter.indent = (Integer) emitter.indents.pop();
                Emitter.access$2010(Emitter.this);
                if (Emitter.this.canonical.booleanValue()) {
                    Emitter.this.writeIndicator(",", false, false, false);
                    Emitter.this.writeIndent();
                }
                if (Emitter.this.prettyFlow.booleanValue()) {
                    Emitter.this.writeIndent();
                }
                Emitter.this.writeIndicator("}", false, false, false);
                Emitter emitter2 = Emitter.this;
                emitter2.state = (EmitterState) emitter2.states.pop();
                return;
            }
            Emitter.this.writeIndicator(",", false, false, false);
            if (Emitter.this.canonical.booleanValue() || Emitter.this.column > Emitter.this.bestWidth || Emitter.this.prettyFlow.booleanValue()) {
                Emitter.this.writeIndent();
            }
            if (!Emitter.this.canonical.booleanValue() && Emitter.this.checkSimpleKey()) {
                Emitter.this.states.push(new ExpectFlowMappingSimpleValue());
                Emitter.this.expectNode(false, true, true);
            } else {
                Emitter.this.writeIndicator("?", true, false, false);
                Emitter.this.states.push(new ExpectFlowMappingValue());
                Emitter.this.expectNode(false, true, false);
            }
        }
    }

    public class ExpectFlowMappingSimpleValue implements EmitterState {
        private ExpectFlowMappingSimpleValue() {
        }

        @Override // org.yaml.snakeyaml.emitter.EmitterState
        public void expect() throws IOException {
            Emitter.this.writeIndicator(":", false, false, false);
            Emitter.this.states.push(new ExpectFlowMappingKey());
            Emitter.this.expectNode(false, true, false);
        }
    }

    public class ExpectFlowMappingValue implements EmitterState {
        private ExpectFlowMappingValue() {
        }

        @Override // org.yaml.snakeyaml.emitter.EmitterState
        public void expect() throws IOException {
            if (Emitter.this.canonical.booleanValue() || Emitter.this.column > Emitter.this.bestWidth || Emitter.this.prettyFlow.booleanValue()) {
                Emitter.this.writeIndent();
            }
            Emitter.this.writeIndicator(":", true, false, false);
            Emitter.this.states.push(new ExpectFlowMappingKey());
            Emitter.this.expectNode(false, true, false);
        }
    }

    public class ExpectFlowSequenceItem implements EmitterState {
        private ExpectFlowSequenceItem() {
        }

        @Override // org.yaml.snakeyaml.emitter.EmitterState
        public void expect() throws IOException {
            if (!(Emitter.this.event instanceof SequenceEndEvent)) {
                Emitter.this.writeIndicator(",", false, false, false);
                if (Emitter.this.canonical.booleanValue() || Emitter.this.column > Emitter.this.bestWidth || Emitter.this.prettyFlow.booleanValue()) {
                    Emitter.this.writeIndent();
                }
                Emitter.this.states.push(Emitter.this.new ExpectFlowSequenceItem());
                Emitter.this.expectNode(false, false, false);
                return;
            }
            Emitter emitter = Emitter.this;
            emitter.indent = (Integer) emitter.indents.pop();
            Emitter.access$2010(Emitter.this);
            if (Emitter.this.canonical.booleanValue()) {
                Emitter.this.writeIndicator(",", false, false, false);
                Emitter.this.writeIndent();
            }
            Emitter.this.writeIndicator("]", false, false, false);
            if (Emitter.this.prettyFlow.booleanValue()) {
                Emitter.this.writeIndent();
            }
            Emitter emitter2 = Emitter.this;
            emitter2.state = (EmitterState) emitter2.states.pop();
        }
    }

    public class ExpectNothing implements EmitterState {
        private ExpectNothing() {
        }

        @Override // org.yaml.snakeyaml.emitter.EmitterState
        public void expect() {
            throw new EmitterException("expecting nothing, but got " + Emitter.this.event);
        }
    }

    public class ExpectStreamStart implements EmitterState {
        private ExpectStreamStart() {
        }

        @Override // org.yaml.snakeyaml.emitter.EmitterState
        public void expect() {
            if (!(Emitter.this.event instanceof StreamStartEvent)) {
                throw new EmitterException("expected StreamStartEvent, but got " + Emitter.this.event);
            }
            Emitter.this.writeStreamStart();
            Emitter emitter = Emitter.this;
            emitter.state = new ExpectFirstDocumentStart();
        }
    }

    static {
        HashMap map = new HashMap();
        ESCAPE_REPLACEMENTS = map;
        SPACE = new char[]{' '};
        map.put((char) 0, "0");
        map.put((char) 7, "a");
        map.put('\b', "b");
        map.put('\t', "t");
        map.put('\n', "n");
        map.put((char) 11, "v");
        map.put('\f', "f");
        map.put('\r', "r");
        map.put((char) 27, "e");
        map.put('\"', "\"");
        map.put('\\', "\\");
        map.put((char) 133, "N");
        map.put((char) 160, "_");
        map.put((char) 8232, "L");
        map.put((char) 8233, "P");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DEFAULT_TAG_PREFIXES = linkedHashMap;
        linkedHashMap.put("!", "!");
        linkedHashMap.put(Tag.PREFIX, "!!");
        HANDLE_FORMAT = Pattern.compile("^![-_\\w]*!$");
        ANCHOR_FORMAT = Pattern.compile("^[-_\\w]*$");
    }

    public Emitter(Writer writer, DumperOptions dumperOptions) {
        this.stream = writer;
        this.canonical = Boolean.valueOf(dumperOptions.isCanonical());
        this.prettyFlow = Boolean.valueOf(dumperOptions.isPrettyFlow());
        this.allowUnicode = dumperOptions.isAllowUnicode();
        this.bestIndent = 2;
        if (dumperOptions.getIndent() > 1 && dumperOptions.getIndent() < 10) {
            this.bestIndent = dumperOptions.getIndent();
        }
        this.bestWidth = 80;
        if (dumperOptions.getWidth() > this.bestIndent * 2) {
            this.bestWidth = dumperOptions.getWidth();
        }
        this.bestLineBreak = dumperOptions.getLineBreak().getString().toCharArray();
        this.tagPrefixes = new LinkedHashMap();
        this.preparedAnchor = null;
        this.preparedTag = null;
        this.analysis = null;
        this.style = null;
        this.options = dumperOptions;
    }

    public static /* synthetic */ int access$2010(Emitter emitter) {
        int i = emitter.flowLevel;
        emitter.flowLevel = i - 1;
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0127 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.yaml.snakeyaml.emitter.ScalarAnalysis analyzeScalar(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.yaml.snakeyaml.emitter.Emitter.analyzeScalar(java.lang.String):org.yaml.snakeyaml.emitter.ScalarAnalysis");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkEmptyDocument() {
        if (!(this.event instanceof DocumentStartEvent) || this.events.isEmpty()) {
            return false;
        }
        Event eventPeek = this.events.peek();
        if (!(eventPeek instanceof ScalarEvent)) {
            return false;
        }
        ScalarEvent scalarEvent = (ScalarEvent) eventPeek;
        return scalarEvent.getAnchor() == null && scalarEvent.getTag() == null && scalarEvent.getImplicit() != null && scalarEvent.getValue().length() == 0;
    }

    private boolean checkEmptyMapping() {
        return (this.event instanceof MappingStartEvent) && !this.events.isEmpty() && (this.events.peek() instanceof MappingEndEvent);
    }

    private boolean checkEmptySequence() {
        return (this.event instanceof SequenceStartEvent) && !this.events.isEmpty() && (this.events.peek() instanceof SequenceEndEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean checkSimpleKey() {
        /*
            r4 = this;
            org.yaml.snakeyaml.events.Event r0 = r4.event
            boolean r1 = r0 instanceof org.yaml.snakeyaml.events.NodeEvent
            r2 = 0
            if (r1 == 0) goto L28
            org.yaml.snakeyaml.events.NodeEvent r0 = (org.yaml.snakeyaml.events.NodeEvent) r0
            java.lang.String r0 = r0.getAnchor()
            if (r0 == 0) goto L28
            java.lang.String r0 = r4.preparedAnchor
            if (r0 != 0) goto L21
            org.yaml.snakeyaml.events.Event r0 = r4.event
            org.yaml.snakeyaml.events.NodeEvent r0 = (org.yaml.snakeyaml.events.NodeEvent) r0
            java.lang.String r0 = r0.getAnchor()
            java.lang.String r0 = prepareAnchor(r0)
            r4.preparedAnchor = r0
        L21:
            java.lang.String r0 = r4.preparedAnchor
            int r0 = r0.length()
            goto L29
        L28:
            r0 = r2
        L29:
            org.yaml.snakeyaml.events.Event r1 = r4.event
            boolean r3 = r1 instanceof org.yaml.snakeyaml.events.ScalarEvent
            if (r3 == 0) goto L36
            org.yaml.snakeyaml.events.ScalarEvent r1 = (org.yaml.snakeyaml.events.ScalarEvent) r1
            java.lang.String r1 = r1.getTag()
            goto L42
        L36:
            boolean r3 = r1 instanceof org.yaml.snakeyaml.events.CollectionStartEvent
            if (r3 == 0) goto L41
            org.yaml.snakeyaml.events.CollectionStartEvent r1 = (org.yaml.snakeyaml.events.CollectionStartEvent) r1
            java.lang.String r1 = r1.getTag()
            goto L42
        L41:
            r1 = 0
        L42:
            if (r1 == 0) goto L55
            java.lang.String r3 = r4.preparedTag
            if (r3 != 0) goto L4e
            java.lang.String r1 = r4.prepareTag(r1)
            r4.preparedTag = r1
        L4e:
            java.lang.String r1 = r4.preparedTag
            int r1 = r1.length()
            int r0 = r0 + r1
        L55:
            org.yaml.snakeyaml.events.Event r1 = r4.event
            boolean r3 = r1 instanceof org.yaml.snakeyaml.events.ScalarEvent
            if (r3 == 0) goto L74
            org.yaml.snakeyaml.emitter.ScalarAnalysis r3 = r4.analysis
            if (r3 != 0) goto L6b
            org.yaml.snakeyaml.events.ScalarEvent r1 = (org.yaml.snakeyaml.events.ScalarEvent) r1
            java.lang.String r1 = r1.getValue()
            org.yaml.snakeyaml.emitter.ScalarAnalysis r1 = r4.analyzeScalar(r1)
            r4.analysis = r1
        L6b:
            org.yaml.snakeyaml.emitter.ScalarAnalysis r1 = r4.analysis
            java.lang.String r1 = r1.scalar
            int r1 = r1.length()
            int r0 = r0 + r1
        L74:
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L99
            org.yaml.snakeyaml.events.Event r0 = r4.event
            boolean r1 = r0 instanceof org.yaml.snakeyaml.events.AliasEvent
            if (r1 != 0) goto L98
            boolean r0 = r0 instanceof org.yaml.snakeyaml.events.ScalarEvent
            if (r0 == 0) goto L8c
            org.yaml.snakeyaml.emitter.ScalarAnalysis r0 = r4.analysis
            boolean r1 = r0.empty
            if (r1 != 0) goto L8c
            boolean r0 = r0.multiline
            if (r0 == 0) goto L98
        L8c:
            boolean r0 = r4.checkEmptySequence()
            if (r0 != 0) goto L98
            boolean r0 = r4.checkEmptyMapping()
            if (r0 == 0) goto L99
        L98:
            r2 = 1
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.yaml.snakeyaml.emitter.Emitter.checkSimpleKey():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Character chooseScalarStyle() {
        /*
            r4 = this;
            org.yaml.snakeyaml.events.Event r0 = r4.event
            org.yaml.snakeyaml.events.ScalarEvent r0 = (org.yaml.snakeyaml.events.ScalarEvent) r0
            org.yaml.snakeyaml.emitter.ScalarAnalysis r1 = r4.analysis
            if (r1 != 0) goto L12
            java.lang.String r1 = r0.getValue()
            org.yaml.snakeyaml.emitter.ScalarAnalysis r1 = r4.analyzeScalar(r1)
            r4.analysis = r1
        L12:
            java.lang.Character r1 = r0.getStyle()
            r2 = 34
            if (r1 == 0) goto L24
            java.lang.Character r1 = r0.getStyle()
            char r1 = r1.charValue()
            if (r1 == r2) goto L2c
        L24:
            java.lang.Boolean r1 = r4.canonical
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L31
        L2c:
            java.lang.Character r0 = java.lang.Character.valueOf(r2)
            return r0
        L31:
            java.lang.Character r1 = r0.getStyle()
            if (r1 != 0) goto L63
            org.yaml.snakeyaml.events.ImplicitTuple r1 = r0.getImplicit()
            boolean r1 = r1.canOmitTagInPlainScalar()
            if (r1 == 0) goto L63
            boolean r1 = r4.simpleKeyContext
            if (r1 == 0) goto L4f
            org.yaml.snakeyaml.emitter.ScalarAnalysis r1 = r4.analysis
            boolean r3 = r1.empty
            if (r3 != 0) goto L63
            boolean r1 = r1.multiline
            if (r1 != 0) goto L63
        L4f:
            int r1 = r4.flowLevel
            if (r1 == 0) goto L59
            org.yaml.snakeyaml.emitter.ScalarAnalysis r3 = r4.analysis
            boolean r3 = r3.allowFlowPlain
            if (r3 != 0) goto L61
        L59:
            if (r1 != 0) goto L63
            org.yaml.snakeyaml.emitter.ScalarAnalysis r1 = r4.analysis
            boolean r1 = r1.allowBlockPlain
            if (r1 == 0) goto L63
        L61:
            r0 = 0
            return r0
        L63:
            java.lang.Character r1 = r0.getStyle()
            if (r1 == 0) goto L94
            java.lang.Character r1 = r0.getStyle()
            char r1 = r1.charValue()
            r3 = 124(0x7c, float:1.74E-43)
            if (r1 == r3) goto L81
            java.lang.Character r1 = r0.getStyle()
            char r1 = r1.charValue()
            r3 = 62
            if (r1 != r3) goto L94
        L81:
            int r1 = r4.flowLevel
            if (r1 != 0) goto L94
            boolean r1 = r4.simpleKeyContext
            if (r1 != 0) goto L94
            org.yaml.snakeyaml.emitter.ScalarAnalysis r1 = r4.analysis
            boolean r1 = r1.allowBlock
            if (r1 == 0) goto L94
            java.lang.Character r0 = r0.getStyle()
            return r0
        L94:
            java.lang.Character r1 = r0.getStyle()
            r3 = 39
            if (r1 == 0) goto La6
            java.lang.Character r0 = r0.getStyle()
            char r0 = r0.charValue()
            if (r0 != r3) goto Lb9
        La6:
            org.yaml.snakeyaml.emitter.ScalarAnalysis r0 = r4.analysis
            boolean r1 = r0.allowSingleQuoted
            if (r1 == 0) goto Lb9
            boolean r1 = r4.simpleKeyContext
            if (r1 == 0) goto Lb4
            boolean r0 = r0.multiline
            if (r0 != 0) goto Lb9
        Lb4:
            java.lang.Character r0 = java.lang.Character.valueOf(r3)
            return r0
        Lb9:
            java.lang.Character r0 = java.lang.Character.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.yaml.snakeyaml.emitter.Emitter.chooseScalarStyle():java.lang.Character");
    }

    private String determineBlockHints(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        Constant constant = Constant.LINEBR;
        if (constant.has(str.charAt(0), " ")) {
            sb.append(this.bestIndent);
        }
        if (!constant.hasNo(str.charAt(str.length() - 1))) {
            str2 = (str.length() == 1 || constant.has(str.charAt(str.length() + (-2)))) ? "+" : "-";
            return sb.toString();
        }
        sb.append(str2);
        return sb.toString();
    }

    private void expectAlias() throws IOException {
        if (((NodeEvent) this.event).getAnchor() == null) {
            throw new EmitterException("anchor is not specified for alias");
        }
        processAnchor("*");
        this.state = this.states.pop();
    }

    private void expectBlockMapping() {
        increaseIndent(false, false);
        this.state = new ExpectFirstBlockMappingKey();
    }

    private void expectBlockSequence() {
        increaseIndent(false, this.mappingContext && !this.indention);
        this.state = new ExpectFirstBlockSequenceItem();
    }

    private void expectFlowMapping() throws IOException {
        writeIndicator("{", true, true, false);
        this.flowLevel++;
        increaseIndent(true, false);
        if (this.prettyFlow.booleanValue()) {
            writeIndent();
        }
        this.state = new ExpectFirstFlowMappingKey();
    }

    private void expectFlowSequence() throws IOException {
        writeIndicator("[", true, true, false);
        this.flowLevel++;
        increaseIndent(true, false);
        if (this.prettyFlow.booleanValue()) {
            writeIndent();
        }
        this.state = new ExpectFirstFlowSequenceItem();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void expectNode(boolean z, boolean z2, boolean z3) throws IOException {
        this.rootContext = z;
        this.mappingContext = z2;
        this.simpleKeyContext = z3;
        Event event = this.event;
        if (event instanceof AliasEvent) {
            expectAlias();
            return;
        }
        if (!(event instanceof ScalarEvent) && !(event instanceof CollectionStartEvent)) {
            throw new EmitterException("expected NodeEvent, but got " + this.event);
        }
        processAnchor("&");
        processTag();
        Event event2 = this.event;
        if (event2 instanceof ScalarEvent) {
            expectScalar();
            return;
        }
        if (event2 instanceof SequenceStartEvent) {
            if (this.flowLevel != 0 || this.canonical.booleanValue() || ((SequenceStartEvent) this.event).getFlowStyle().booleanValue() || checkEmptySequence()) {
                expectFlowSequence();
                return;
            } else {
                expectBlockSequence();
                return;
            }
        }
        if (this.flowLevel != 0 || this.canonical.booleanValue() || ((MappingStartEvent) this.event).getFlowStyle().booleanValue() || checkEmptyMapping()) {
            expectFlowMapping();
        } else {
            expectBlockMapping();
        }
    }

    private void expectScalar() throws IOException {
        increaseIndent(true, false);
        processScalar();
        this.indent = this.indents.pop();
        this.state = this.states.pop();
    }

    private void increaseIndent(boolean z, boolean z2) {
        int iIntValue;
        this.indents.push(this.indent);
        Integer num = this.indent;
        if (num == null) {
            iIntValue = z ? this.bestIndent : 0;
        } else if (z2) {
            return;
        } else {
            iIntValue = num.intValue() + this.bestIndent;
        }
        this.indent = Integer.valueOf(iIntValue);
    }

    private boolean needEvents(int i) {
        Iterator<Event> it = this.events.iterator();
        it.next();
        int i2 = 0;
        while (it.hasNext()) {
            Event next = it.next();
            if ((next instanceof DocumentStartEvent) || (next instanceof CollectionStartEvent)) {
                i2++;
            } else if ((next instanceof DocumentEndEvent) || (next instanceof CollectionEndEvent)) {
                i2--;
            } else if (next instanceof StreamEndEvent) {
                i2 = -1;
            }
            if (i2 < 0) {
                return false;
            }
        }
        return this.events.size() < i + 1;
    }

    private boolean needMoreEvents() {
        int i;
        if (this.events.isEmpty()) {
            return true;
        }
        Event eventPeek = this.events.peek();
        if (eventPeek instanceof DocumentStartEvent) {
            return needEvents(1);
        }
        if (eventPeek instanceof SequenceStartEvent) {
            i = 2;
        } else {
            if (!(eventPeek instanceof MappingStartEvent)) {
                return false;
            }
            i = 3;
        }
        return needEvents(i);
    }

    public static String prepareAnchor(String str) {
        if (str.length() == 0) {
            throw new EmitterException("anchor must not be empty");
        }
        if (ANCHOR_FORMAT.matcher(str).matches()) {
            return str;
        }
        throw new EmitterException("invalid character in the anchor: ".concat(str));
    }

    private String prepareTag(String str) {
        if (str.length() == 0) {
            throw new EmitterException("tag must not be empty");
        }
        if ("!".equals(str)) {
            return str;
        }
        String str2 = null;
        for (String str3 : this.tagPrefixes.keySet()) {
            if (str.startsWith(str3) && ("!".equals(str3) || str3.length() < str.length())) {
                str2 = str3;
            }
        }
        if (str2 != null) {
            str = str.substring(str2.length());
            str2 = this.tagPrefixes.get(str2);
        }
        int length = str.length();
        String strSubstring = length > 0 ? str.substring(0, length) : "";
        return str2 != null ? AbstractC3264qG.g(str2, strSubstring) : AbstractC3264qG.x("!<", strSubstring, ">");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String prepareTagHandle(String str) {
        if (str.length() == 0) {
            throw new EmitterException("tag handle must not be empty");
        }
        if (str.charAt(0) != '!' || str.charAt(str.length() - 1) != '!') {
            throw new EmitterException("tag handle must start and end with '!': ".concat(str));
        }
        if ("!".equals(str) || HANDLE_FORMAT.matcher(str).matches()) {
            return str;
        }
        throw new EmitterException("invalid character in the tag handle: ".concat(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String prepareTagPrefix(String str) {
        if (str.length() == 0) {
            throw new EmitterException("tag prefix must not be empty");
        }
        StringBuilder sb = new StringBuilder();
        int i = str.charAt(0) == '!' ? 1 : 0;
        while (i < str.length()) {
            i++;
        }
        if (i > 0) {
            sb.append(str.substring(0, i));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String prepareVersion(Integer[] numArr) {
        Integer num = numArr[0];
        Integer num2 = numArr[1];
        if (num.intValue() == 1) {
            return num.toString() + "." + num2.toString();
        }
        throw new EmitterException("unsupported YAML version: " + numArr[0] + "." + numArr[1]);
    }

    private void processAnchor(String str) throws IOException {
        NodeEvent nodeEvent = (NodeEvent) this.event;
        if (nodeEvent.getAnchor() == null) {
            this.preparedAnchor = null;
            return;
        }
        if (this.preparedAnchor == null) {
            this.preparedAnchor = prepareAnchor(nodeEvent.getAnchor());
        }
        StringBuilder sbN = AbstractC3264qG.n(str);
        sbN.append(this.preparedAnchor);
        writeIndicator(sbN.toString(), true, false, false);
        this.preparedAnchor = null;
    }

    private void processScalar() throws IOException {
        ScalarEvent scalarEvent = (ScalarEvent) this.event;
        if (this.analysis == null) {
            this.analysis = analyzeScalar(scalarEvent.getValue());
        }
        if (this.style == null) {
            this.style = chooseScalarStyle();
        }
        Character ch = this.options.calculateScalarStyle(this.analysis, DumperOptions.ScalarStyle.createStyle(this.style)).getChar();
        this.style = ch;
        boolean z = !this.simpleKeyContext;
        if (ch == null) {
            writePlain(this.analysis.scalar, z);
        } else {
            char cCharValue = ch.charValue();
            if (cCharValue == '\"') {
                writeDoubleQuoted(this.analysis.scalar, z);
            } else if (cCharValue == '\'') {
                writeSingleQuoted(this.analysis.scalar, z);
            } else if (cCharValue == '>') {
                writeFolded(this.analysis.scalar);
            } else {
                if (cCharValue != '|') {
                    throw new YAMLException("Unexpected style: " + this.style);
                }
                writeLiteral(this.analysis.scalar);
            }
        }
        this.analysis = null;
        this.style = null;
    }

    private void processTag() throws IOException {
        String tag;
        Event event = this.event;
        if (event instanceof ScalarEvent) {
            ScalarEvent scalarEvent = (ScalarEvent) event;
            tag = scalarEvent.getTag();
            if (this.style == null) {
                this.style = chooseScalarStyle();
            }
            if ((!this.canonical.booleanValue() || tag == null) && ((this.style == null && scalarEvent.getImplicit().canOmitTagInPlainScalar()) || (this.style != null && scalarEvent.getImplicit().canOmitTagInNonPlainScalar()))) {
                this.preparedTag = null;
                return;
            } else if (scalarEvent.getImplicit().canOmitTagInPlainScalar() && tag == null) {
                this.preparedTag = null;
                tag = "!";
            }
        } else {
            CollectionStartEvent collectionStartEvent = (CollectionStartEvent) event;
            tag = collectionStartEvent.getTag();
            if ((!this.canonical.booleanValue() || tag == null) && collectionStartEvent.getImplicit()) {
                this.preparedTag = null;
                return;
            }
        }
        if (tag == null) {
            throw new EmitterException("tag is not specified");
        }
        if (this.preparedTag == null) {
            this.preparedTag = prepareTag(tag);
        }
        writeIndicator(this.preparedTag, true, false, false);
        this.preparedTag = null;
    }

    private void writeDoubleQuoted(String str, boolean z) throws IOException {
        String strValueOf;
        String str2;
        StringBuilder sb;
        int length;
        String strSubstring;
        String str3;
        writeIndicator("\"", true, false, false);
        int i = 0;
        int i2 = 0;
        while (i <= str.length()) {
            Character chValueOf = i < str.length() ? Character.valueOf(str.charAt(i)) : null;
            if (chValueOf == null || "\"\\\u0085\u2028\u2029\ufeff".indexOf(chValueOf.charValue()) != -1 || ' ' > chValueOf.charValue() || chValueOf.charValue() > '~') {
                if (i2 < i) {
                    int i3 = i - i2;
                    this.column += i3;
                    this.stream.write(str, i2, i3);
                    i2 = i;
                }
                if (chValueOf != null) {
                    Map<Character, String> map = ESCAPE_REPLACEMENTS;
                    if (map.containsKey(chValueOf)) {
                        sb = new StringBuilder("\\");
                        strSubstring = map.get(chValueOf);
                    } else if (this.allowUnicode) {
                        strValueOf = String.valueOf(chValueOf);
                        this.column = strValueOf.length() + this.column;
                        this.stream.write(strValueOf);
                        i2 = i + 1;
                    } else {
                        if (chValueOf.charValue() <= 255) {
                            str2 = "0" + Integer.toString(chValueOf.charValue(), 16);
                            sb = new StringBuilder("\\x");
                            length = str2.length() - 2;
                        } else {
                            str2 = "000" + Integer.toString(chValueOf.charValue(), 16);
                            sb = new StringBuilder("\\u");
                            length = str2.length() - 4;
                        }
                        strSubstring = str2.substring(length);
                    }
                    sb.append(strSubstring);
                    strValueOf = sb.toString();
                    this.column = strValueOf.length() + this.column;
                    this.stream.write(strValueOf);
                    i2 = i + 1;
                }
            }
            if (i > 0 && i < str.length() - 1 && (chValueOf.charValue() == ' ' || i2 >= i)) {
                if ((i - i2) + this.column > this.bestWidth && z) {
                    if (i2 >= i) {
                        str3 = "\\";
                    } else {
                        str3 = str.substring(i2, i) + "\\";
                    }
                    if (i2 < i) {
                        i2 = i;
                    }
                    this.column = str3.length() + this.column;
                    this.stream.write(str3);
                    writeIndent();
                    this.whitespace = false;
                    this.indention = false;
                    if (str.charAt(i2) == ' ') {
                        this.column++;
                        this.stream.write("\\");
                    }
                }
            }
            i++;
        }
        writeIndicator("\"", false, false, false);
    }

    private void writeLineBreak(String str) throws IOException {
        this.whitespace = true;
        this.indention = true;
        this.column = 0;
        if (str == null) {
            this.stream.write(this.bestLineBreak);
        } else {
            this.stream.write(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        if (r8 < r5) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeSingleQuoted(java.lang.String r17, boolean r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "'"
            r3 = 1
            r4 = 0
            r0.writeIndicator(r2, r3, r4, r4)
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        Lf:
            int r9 = r17.length()
            if (r5 > r9) goto Lb5
            int r9 = r17.length()
            if (r5 >= r9) goto L20
            char r9 = r1.charAt(r5)
            goto L21
        L20:
            r9 = r4
        L21:
            r10 = 32
            if (r6 == 0) goto L3e
            if (r9 == 0) goto L29
            if (r9 == r10) goto L91
        L29:
            int r11 = r8 + 1
            if (r11 != r5) goto L84
            int r11 = r0.column
            int r12 = r0.bestWidth
            if (r11 <= r12) goto L84
            if (r18 == 0) goto L84
            if (r8 == 0) goto L84
            int r11 = r17.length()
            if (r5 == r11) goto L84
            goto L74
        L3e:
            if (r7 == 0) goto L78
            if (r9 == 0) goto L4a
            org.yaml.snakeyaml.scanner.Constant r11 = org.yaml.snakeyaml.scanner.Constant.LINEBR
            boolean r11 = r11.hasNo(r9)
            if (r11 == 0) goto L91
        L4a:
            char r11 = r1.charAt(r8)
            r12 = 0
            r13 = 10
            if (r11 != r13) goto L56
            r0.writeLineBreak(r12)
        L56:
            java.lang.String r8 = r1.substring(r8, r5)
            char[] r8 = r8.toCharArray()
            int r11 = r8.length
            r14 = r4
        L60:
            if (r14 >= r11) goto L74
            char r15 = r8[r14]
            if (r15 != r13) goto L6a
            r0.writeLineBreak(r12)
            goto L71
        L6a:
            java.lang.String r15 = java.lang.String.valueOf(r15)
            r0.writeLineBreak(r15)
        L71:
            int r14 = r14 + 1
            goto L60
        L74:
            r16.writeIndent()
            goto L90
        L78:
            org.yaml.snakeyaml.scanner.Constant r11 = org.yaml.snakeyaml.scanner.Constant.LINEBR
            java.lang.String r12 = "\u0000 '"
            boolean r11 = r11.has(r9, r12)
            if (r11 == 0) goto L91
            if (r8 >= r5) goto L91
        L84:
            int r11 = r5 - r8
            int r12 = r0.column
            int r12 = r12 + r11
            r0.column = r12
            java.io.Writer r12 = r0.stream
            r12.write(r1, r8, r11)
        L90:
            r8 = r5
        L91:
            r11 = 39
            if (r9 != r11) goto La4
            int r8 = r0.column
            int r8 = r8 + 2
            r0.column = r8
            java.io.Writer r8 = r0.stream
            java.lang.String r11 = "''"
            r8.write(r11)
            int r8 = r5 + 1
        La4:
            if (r9 == 0) goto Lb1
            if (r9 != r10) goto Laa
            r6 = r3
            goto Lab
        Laa:
            r6 = r4
        Lab:
            org.yaml.snakeyaml.scanner.Constant r7 = org.yaml.snakeyaml.scanner.Constant.LINEBR
            boolean r7 = r7.has(r9)
        Lb1:
            int r5 = r5 + 1
            goto Lf
        Lb5:
            r0.writeIndicator(r2, r4, r4, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.yaml.snakeyaml.emitter.Emitter.writeSingleQuoted(java.lang.String, boolean):void");
    }

    @Override // org.yaml.snakeyaml.emitter.Emitable
    public void emit(Event event) {
        this.events.add(event);
        while (!needMoreEvents()) {
            this.event = this.events.poll();
            this.state.expect();
            this.event = null;
        }
    }

    public void flushStream() throws IOException {
        this.stream.flush();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0083 A[PHI: r7
      0x0083: PHI (r7v3 boolean) = (r7v1 boolean), (r7v6 boolean) binds: [B:44:0x0094, B:36:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void writeFolded(java.lang.String r15) throws java.io.IOException {
        /*
            r14 = this;
            java.lang.String r0 = r14.determineBlockHints(r15)
            java.lang.String r1 = ">"
            java.lang.String r1 = defpackage.AbstractC3264qG.w(r1, r0)
            r2 = 1
            r3 = 0
            r14.writeIndicator(r1, r2, r3, r3)
            int r1 = r0.length()
            if (r1 <= 0) goto L24
            int r1 = r0.length()
            int r1 = r1 - r2
            char r0 = r0.charAt(r1)
            r1 = 43
            if (r0 != r1) goto L24
            r14.openEnded = r2
        L24:
            r0 = 0
            r14.writeLineBreak(r0)
            r4 = r2
            r7 = r4
            r1 = r3
            r5 = r1
            r6 = r5
        L2d:
            int r8 = r15.length()
            if (r1 > r8) goto Ld1
            int r8 = r15.length()
            if (r1 >= r8) goto L3e
            char r8 = r15.charAt(r1)
            goto L3f
        L3e:
            r8 = r3
        L3f:
            r9 = 32
            if (r4 == 0) goto L88
            if (r8 == 0) goto L4d
            org.yaml.snakeyaml.scanner.Constant r10 = org.yaml.snakeyaml.scanner.Constant.LINEBR
            boolean r10 = r10.hasNo(r8)
            if (r10 == 0) goto Lc0
        L4d:
            r10 = 10
            if (r7 != 0) goto L5e
            if (r8 == 0) goto L5e
            if (r8 == r9) goto L5e
            char r7 = r15.charAt(r6)
            if (r7 != r10) goto L5e
            r14.writeLineBreak(r0)
        L5e:
            if (r8 != r9) goto L62
            r7 = r2
            goto L63
        L62:
            r7 = r3
        L63:
            java.lang.String r6 = r15.substring(r6, r1)
            char[] r6 = r6.toCharArray()
            int r11 = r6.length
            r12 = r3
        L6d:
            if (r12 >= r11) goto L81
            char r13 = r6[r12]
            if (r13 != r10) goto L77
            r14.writeLineBreak(r0)
            goto L7e
        L77:
            java.lang.String r13 = java.lang.String.valueOf(r13)
            r14.writeLineBreak(r13)
        L7e:
            int r12 = r12 + 1
            goto L6d
        L81:
            if (r8 == 0) goto L86
        L83:
            r14.writeIndent()
        L86:
            r6 = r1
            goto Lc0
        L88:
            if (r5 == 0) goto La4
            if (r8 == r9) goto Lc0
            int r10 = r6 + 1
            if (r10 != r1) goto L97
            int r10 = r14.column
            int r11 = r14.bestWidth
            if (r10 <= r11) goto L97
            goto L83
        L97:
            int r10 = r1 - r6
            int r11 = r14.column
            int r11 = r11 + r10
            r14.column = r11
            java.io.Writer r11 = r14.stream
            r11.write(r15, r6, r10)
            goto L86
        La4:
            org.yaml.snakeyaml.scanner.Constant r10 = org.yaml.snakeyaml.scanner.Constant.LINEBR
            java.lang.String r11 = "\u0000 "
            boolean r10 = r10.has(r8, r11)
            if (r10 == 0) goto Lc0
            int r10 = r1 - r6
            int r11 = r14.column
            int r11 = r11 + r10
            r14.column = r11
            java.io.Writer r11 = r14.stream
            r11.write(r15, r6, r10)
            if (r8 != 0) goto L86
            r14.writeLineBreak(r0)
            goto L86
        Lc0:
            if (r8 == 0) goto Lcd
            org.yaml.snakeyaml.scanner.Constant r4 = org.yaml.snakeyaml.scanner.Constant.LINEBR
            boolean r4 = r4.has(r8)
            if (r8 != r9) goto Lcc
            r5 = r2
            goto Lcd
        Lcc:
            r5 = r3
        Lcd:
            int r1 = r1 + 1
            goto L2d
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.yaml.snakeyaml.emitter.Emitter.writeFolded(java.lang.String):void");
    }

    public void writeIndent() throws IOException {
        int i;
        Integer num = this.indent;
        int iIntValue = num != null ? num.intValue() : 0;
        if (!this.indention || (i = this.column) > iIntValue || (i == iIntValue && !this.whitespace)) {
            writeLineBreak(null);
        }
        int i2 = this.column;
        if (i2 < iIntValue) {
            this.whitespace = true;
            int i3 = iIntValue - i2;
            char[] cArr = new char[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                cArr[i4] = ' ';
            }
            this.column = iIntValue;
            this.stream.write(cArr);
        }
    }

    public void writeIndicator(String str, boolean z, boolean z2, boolean z3) throws IOException {
        if (!this.whitespace && z) {
            this.column++;
            this.stream.write(SPACE);
        }
        this.whitespace = z2;
        this.indention = this.indention && z3;
        this.column = str.length() + this.column;
        this.openEnded = false;
        this.stream.write(str);
    }

    public void writeLiteral(String str) throws IOException {
        String strDetermineBlockHints = determineBlockHints(str);
        boolean zHas = true;
        writeIndicator(AbstractC3264qG.w("|", strDetermineBlockHints), true, false, false);
        if (strDetermineBlockHints.length() > 0 && strDetermineBlockHints.charAt(strDetermineBlockHints.length() - 1) == '+') {
            this.openEnded = true;
        }
        writeLineBreak(null);
        int i = 0;
        int i2 = 0;
        while (i <= str.length()) {
            char cCharAt = i < str.length() ? str.charAt(i) : (char) 0;
            if (zHas) {
                if (cCharAt == 0 || Constant.LINEBR.hasNo(cCharAt)) {
                    for (char c : str.substring(i2, i).toCharArray()) {
                        if (c == '\n') {
                            writeLineBreak(null);
                        } else {
                            writeLineBreak(String.valueOf(c));
                        }
                    }
                    if (cCharAt != 0) {
                        writeIndent();
                    }
                    i2 = i;
                }
            } else if (cCharAt == 0 || Constant.LINEBR.has(cCharAt)) {
                this.stream.write(str, i2, i - i2);
                if (cCharAt == 0) {
                    writeLineBreak(null);
                }
                i2 = i;
            }
            if (cCharAt != 0) {
                zHas = Constant.LINEBR.has(cCharAt);
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
    
        if (org.yaml.snakeyaml.scanner.Constant.LINEBR.has(r6) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ac A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void writePlain(java.lang.String r14, boolean r15) throws java.io.IOException {
        /*
            r13 = this;
            boolean r0 = r13.rootContext
            r1 = 1
            if (r0 == 0) goto L7
            r13.openEnded = r1
        L7:
            int r0 = r14.length()
            if (r0 != 0) goto Le
            return
        Le:
            boolean r0 = r13.whitespace
            if (r0 != 0) goto L1e
            int r0 = r13.column
            int r0 = r0 + r1
            r13.column = r0
            java.io.Writer r0 = r13.stream
            char[] r2 = org.yaml.snakeyaml.emitter.Emitter.SPACE
            r0.write(r2)
        L1e:
            r0 = 0
            r13.whitespace = r0
            r13.indention = r0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
        L27:
            int r6 = r14.length()
            if (r2 > r6) goto Lb0
            int r6 = r14.length()
            if (r2 >= r6) goto L38
            char r6 = r14.charAt(r2)
            goto L39
        L38:
            r6 = r0
        L39:
            r7 = 32
            if (r3 == 0) goto L4c
            if (r6 == r7) goto L9f
            int r8 = r5 + 1
            if (r8 != r2) goto L92
            int r8 = r13.column
            int r9 = r13.bestWidth
            if (r8 <= r9) goto L92
            if (r15 == 0) goto L92
            goto L80
        L4c:
            if (r4 == 0) goto L88
            org.yaml.snakeyaml.scanner.Constant r8 = org.yaml.snakeyaml.scanner.Constant.LINEBR
            boolean r8 = r8.hasNo(r6)
            if (r8 == 0) goto L9f
            char r8 = r14.charAt(r5)
            r9 = 0
            r10 = 10
            if (r8 != r10) goto L62
            r13.writeLineBreak(r9)
        L62:
            java.lang.String r5 = r14.substring(r5, r2)
            char[] r5 = r5.toCharArray()
            int r8 = r5.length
            r11 = r0
        L6c:
            if (r11 >= r8) goto L80
            char r12 = r5[r11]
            if (r12 != r10) goto L76
            r13.writeLineBreak(r9)
            goto L7d
        L76:
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r13.writeLineBreak(r12)
        L7d:
            int r11 = r11 + 1
            goto L6c
        L80:
            r13.writeIndent()
            r13.whitespace = r0
            r13.indention = r0
            goto L9e
        L88:
            if (r6 == 0) goto L92
            org.yaml.snakeyaml.scanner.Constant r8 = org.yaml.snakeyaml.scanner.Constant.LINEBR
            boolean r8 = r8.has(r6)
            if (r8 == 0) goto L9f
        L92:
            int r8 = r2 - r5
            int r9 = r13.column
            int r9 = r9 + r8
            r13.column = r9
            java.io.Writer r9 = r13.stream
            r9.write(r14, r5, r8)
        L9e:
            r5 = r2
        L9f:
            if (r6 == 0) goto Lac
            if (r6 != r7) goto La5
            r3 = r1
            goto La6
        La5:
            r3 = r0
        La6:
            org.yaml.snakeyaml.scanner.Constant r4 = org.yaml.snakeyaml.scanner.Constant.LINEBR
            boolean r4 = r4.has(r6)
        Lac:
            int r2 = r2 + 1
            goto L27
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.yaml.snakeyaml.emitter.Emitter.writePlain(java.lang.String, boolean):void");
    }

    public void writeStreamEnd() throws IOException {
        flushStream();
    }

    public void writeStreamStart() {
    }

    public void writeTagDirective(String str, String str2) throws IOException {
        this.stream.write("%TAG ");
        this.stream.write(str);
        this.stream.write(SPACE);
        this.stream.write(str2);
        writeLineBreak(null);
    }

    public void writeVersionDirective(String str) throws IOException {
        this.stream.write("%YAML ");
        this.stream.write(str);
        writeLineBreak(null);
    }
}
