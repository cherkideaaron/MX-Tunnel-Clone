package org.yaml.snakeyaml.parser;

import defpackage.AbstractC3264qG;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.yaml.snakeyaml.error.Mark;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.events.AliasEvent;
import org.yaml.snakeyaml.events.DocumentEndEvent;
import org.yaml.snakeyaml.events.DocumentStartEvent;
import org.yaml.snakeyaml.events.Event;
import org.yaml.snakeyaml.events.ImplicitTuple;
import org.yaml.snakeyaml.events.MappingEndEvent;
import org.yaml.snakeyaml.events.MappingStartEvent;
import org.yaml.snakeyaml.events.ScalarEvent;
import org.yaml.snakeyaml.events.SequenceEndEvent;
import org.yaml.snakeyaml.events.SequenceStartEvent;
import org.yaml.snakeyaml.events.StreamEndEvent;
import org.yaml.snakeyaml.events.StreamStartEvent;
import org.yaml.snakeyaml.nodes.Tag;
import org.yaml.snakeyaml.reader.StreamReader;
import org.yaml.snakeyaml.scanner.Scanner;
import org.yaml.snakeyaml.scanner.ScannerImpl;
import org.yaml.snakeyaml.tokens.AliasToken;
import org.yaml.snakeyaml.tokens.AnchorToken;
import org.yaml.snakeyaml.tokens.BlockEntryToken;
import org.yaml.snakeyaml.tokens.DirectiveToken;
import org.yaml.snakeyaml.tokens.ScalarToken;
import org.yaml.snakeyaml.tokens.StreamEndToken;
import org.yaml.snakeyaml.tokens.StreamStartToken;
import org.yaml.snakeyaml.tokens.TagToken;
import org.yaml.snakeyaml.tokens.TagTuple;
import org.yaml.snakeyaml.tokens.Token;
import org.yaml.snakeyaml.util.ArrayStack;

/* loaded from: classes2.dex */
public final class ParserImpl implements Parser {
    private static final Map<String, String> DEFAULT_TAGS;
    private final Scanner scanner;
    private Event currentEvent = null;
    private List<Integer> yamlVersion = null;
    private Map<String, String> tagHandles = new HashMap();
    private final ArrayStack<Production> states = new ArrayStack<>(100);
    private final ArrayStack<Mark> marks = new ArrayStack<>(10);
    private Production state = new ParseStreamStart();

    public class ParseBlockMappingFirstKey implements Production {
        private ParseBlockMappingFirstKey() {
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            ParserImpl.this.marks.push(ParserImpl.this.scanner.getToken().getStartMark());
            return new ParseBlockMappingKey().produce();
        }
    }

    public class ParseBlockMappingKey implements Production {
        private ParseBlockMappingKey() {
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            Scanner scanner = ParserImpl.this.scanner;
            Token.ID id = Token.ID.Key;
            if (scanner.checkToken(id)) {
                Token token = ParserImpl.this.scanner.getToken();
                if (!ParserImpl.this.scanner.checkToken(id, Token.ID.Value, Token.ID.BlockEnd)) {
                    ParserImpl.this.states.push(new ParseBlockMappingValue());
                    return ParserImpl.this.parseBlockNodeOrIndentlessSequence();
                }
                ParserImpl parserImpl = ParserImpl.this;
                parserImpl.state = new ParseBlockMappingValue();
                return ParserImpl.this.processEmptyScalar(token.getEndMark());
            }
            if (!ParserImpl.this.scanner.checkToken(Token.ID.BlockEnd)) {
                Token tokenPeekToken = ParserImpl.this.scanner.peekToken();
                throw new ParserException("while parsing a block mapping", (Mark) ParserImpl.this.marks.pop(), "expected <block end>, but found " + tokenPeekToken.getTokenId(), tokenPeekToken.getStartMark());
            }
            Token token2 = ParserImpl.this.scanner.getToken();
            MappingEndEvent mappingEndEvent = new MappingEndEvent(token2.getStartMark(), token2.getEndMark());
            ParserImpl parserImpl2 = ParserImpl.this;
            parserImpl2.state = (Production) parserImpl2.states.pop();
            ParserImpl.this.marks.pop();
            return mappingEndEvent;
        }
    }

    public class ParseBlockMappingValue implements Production {
        private ParseBlockMappingValue() {
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            Scanner scanner = ParserImpl.this.scanner;
            Token.ID id = Token.ID.Value;
            if (!scanner.checkToken(id)) {
                ParserImpl parserImpl = ParserImpl.this;
                parserImpl.state = new ParseBlockMappingKey();
                return ParserImpl.this.processEmptyScalar(ParserImpl.this.scanner.peekToken().getStartMark());
            }
            Token token = ParserImpl.this.scanner.getToken();
            if (!ParserImpl.this.scanner.checkToken(Token.ID.Key, id, Token.ID.BlockEnd)) {
                ParserImpl.this.states.push(new ParseBlockMappingKey());
                return ParserImpl.this.parseBlockNodeOrIndentlessSequence();
            }
            ParserImpl parserImpl2 = ParserImpl.this;
            parserImpl2.state = new ParseBlockMappingKey();
            return ParserImpl.this.processEmptyScalar(token.getEndMark());
        }
    }

    public class ParseBlockNode implements Production {
        private ParseBlockNode() {
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            return ParserImpl.this.parseNode(true, false);
        }
    }

    public class ParseBlockSequenceEntry implements Production {
        private ParseBlockSequenceEntry() {
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            Scanner scanner = ParserImpl.this.scanner;
            Token.ID id = Token.ID.BlockEntry;
            if (scanner.checkToken(id)) {
                BlockEntryToken blockEntryToken = (BlockEntryToken) ParserImpl.this.scanner.getToken();
                if (!ParserImpl.this.scanner.checkToken(id, Token.ID.BlockEnd)) {
                    ParserImpl.this.states.push(ParserImpl.this.new ParseBlockSequenceEntry());
                    return new ParseBlockNode().produce();
                }
                ParserImpl parserImpl = ParserImpl.this;
                parserImpl.state = parserImpl.new ParseBlockSequenceEntry();
                return ParserImpl.this.processEmptyScalar(blockEntryToken.getEndMark());
            }
            if (!ParserImpl.this.scanner.checkToken(Token.ID.BlockEnd)) {
                Token tokenPeekToken = ParserImpl.this.scanner.peekToken();
                throw new ParserException("while parsing a block collection", (Mark) ParserImpl.this.marks.pop(), "expected <block end>, but found " + tokenPeekToken.getTokenId(), tokenPeekToken.getStartMark());
            }
            Token token = ParserImpl.this.scanner.getToken();
            SequenceEndEvent sequenceEndEvent = new SequenceEndEvent(token.getStartMark(), token.getEndMark());
            ParserImpl parserImpl2 = ParserImpl.this;
            parserImpl2.state = (Production) parserImpl2.states.pop();
            ParserImpl.this.marks.pop();
            return sequenceEndEvent;
        }
    }

    public class ParseBlockSequenceFirstEntry implements Production {
        private ParseBlockSequenceFirstEntry() {
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            ParserImpl.this.marks.push(ParserImpl.this.scanner.getToken().getStartMark());
            return new ParseBlockSequenceEntry().produce();
        }
    }

    public class ParseDocumentContent implements Production {
        private ParseDocumentContent() {
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            if (!ParserImpl.this.scanner.checkToken(Token.ID.Directive, Token.ID.DocumentStart, Token.ID.DocumentEnd, Token.ID.StreamEnd)) {
                return new ParseBlockNode().produce();
            }
            ParserImpl parserImpl = ParserImpl.this;
            Event eventProcessEmptyScalar = parserImpl.processEmptyScalar(parserImpl.scanner.peekToken().getStartMark());
            ParserImpl parserImpl2 = ParserImpl.this;
            parserImpl2.state = (Production) parserImpl2.states.pop();
            return eventProcessEmptyScalar;
        }
    }

    public class ParseDocumentEnd implements Production {
        private ParseDocumentEnd() {
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            Mark endMark;
            Mark startMark = ParserImpl.this.scanner.peekToken().getStartMark();
            boolean z = true;
            if (ParserImpl.this.scanner.checkToken(Token.ID.DocumentEnd)) {
                endMark = ParserImpl.this.scanner.getToken().getEndMark();
            } else {
                endMark = startMark;
                z = false;
            }
            DocumentEndEvent documentEndEvent = new DocumentEndEvent(startMark, endMark, z);
            ParserImpl parserImpl = ParserImpl.this;
            parserImpl.state = new ParseDocumentStart();
            return documentEndEvent;
        }
    }

    public class ParseDocumentStart implements Production {
        private ParseDocumentStart() {
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            while (ParserImpl.this.scanner.checkToken(Token.ID.DocumentEnd)) {
                ParserImpl.this.scanner.getToken();
            }
            if (ParserImpl.this.scanner.checkToken(Token.ID.StreamEnd)) {
                StreamEndToken streamEndToken = (StreamEndToken) ParserImpl.this.scanner.getToken();
                StreamEndEvent streamEndEvent = new StreamEndEvent(streamEndToken.getStartMark(), streamEndToken.getEndMark());
                if (!ParserImpl.this.states.isEmpty()) {
                    throw new YAMLException("Unexpected end of stream. States left: " + ParserImpl.this.states);
                }
                if (ParserImpl.this.marks.isEmpty()) {
                    ParserImpl.this.state = null;
                    return streamEndEvent;
                }
                throw new YAMLException("Unexpected end of stream. Marks left: " + ParserImpl.this.marks);
            }
            Mark startMark = ParserImpl.this.scanner.peekToken().getStartMark();
            List listProcessDirectives = ParserImpl.this.processDirectives();
            List list = (List) listProcessDirectives.get(0);
            Map map = (Map) listProcessDirectives.get(1);
            if (!ParserImpl.this.scanner.checkToken(Token.ID.DocumentStart)) {
                throw new ParserException(null, null, "expected '<document start>', but found " + ParserImpl.this.scanner.peekToken().getTokenId(), ParserImpl.this.scanner.peekToken().getStartMark());
            }
            DocumentStartEvent documentStartEvent = new DocumentStartEvent(startMark, ParserImpl.this.scanner.getToken().getEndMark(), true, list != null ? (Integer[]) list.toArray(new Integer[2]) : null, map);
            ParserImpl.this.states.push(new ParseDocumentEnd());
            ParserImpl parserImpl = ParserImpl.this;
            parserImpl.state = new ParseDocumentContent();
            return documentStartEvent;
        }
    }

    public class ParseFlowMappingEmptyValue implements Production {
        private ParseFlowMappingEmptyValue() {
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            ParserImpl parserImpl = ParserImpl.this;
            parserImpl.state = parserImpl.new ParseFlowMappingKey(false);
            ParserImpl parserImpl2 = ParserImpl.this;
            return parserImpl2.processEmptyScalar(parserImpl2.scanner.peekToken().getStartMark());
        }
    }

    public class ParseFlowMappingFirstKey implements Production {
        private ParseFlowMappingFirstKey() {
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            ParserImpl.this.marks.push(ParserImpl.this.scanner.getToken().getStartMark());
            return ParserImpl.this.new ParseFlowMappingKey(true).produce();
        }
    }

    public class ParseFlowMappingKey implements Production {
        private boolean first;

        public ParseFlowMappingKey(boolean z) {
            this.first = z;
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            Scanner scanner = ParserImpl.this.scanner;
            Token.ID id = Token.ID.FlowMappingEnd;
            if (!scanner.checkToken(id)) {
                if (!this.first) {
                    if (!ParserImpl.this.scanner.checkToken(Token.ID.FlowEntry)) {
                        Token tokenPeekToken = ParserImpl.this.scanner.peekToken();
                        throw new ParserException("while parsing a flow mapping", (Mark) ParserImpl.this.marks.pop(), "expected ',' or '}', but got " + tokenPeekToken.getTokenId(), tokenPeekToken.getStartMark());
                    }
                    ParserImpl.this.scanner.getToken();
                }
                if (ParserImpl.this.scanner.checkToken(Token.ID.Key)) {
                    Token token = ParserImpl.this.scanner.getToken();
                    if (!ParserImpl.this.scanner.checkToken(Token.ID.Value, Token.ID.FlowEntry, id)) {
                        ParserImpl.this.states.push(new ParseFlowMappingValue());
                        return ParserImpl.this.parseFlowNode();
                    }
                    ParserImpl parserImpl = ParserImpl.this;
                    parserImpl.state = new ParseFlowMappingValue();
                    return ParserImpl.this.processEmptyScalar(token.getEndMark());
                }
                if (!ParserImpl.this.scanner.checkToken(id)) {
                    ParserImpl.this.states.push(new ParseFlowMappingEmptyValue());
                    return ParserImpl.this.parseFlowNode();
                }
            }
            Token token2 = ParserImpl.this.scanner.getToken();
            MappingEndEvent mappingEndEvent = new MappingEndEvent(token2.getStartMark(), token2.getEndMark());
            ParserImpl parserImpl2 = ParserImpl.this;
            parserImpl2.state = (Production) parserImpl2.states.pop();
            ParserImpl.this.marks.pop();
            return mappingEndEvent;
        }
    }

    public class ParseFlowMappingValue implements Production {
        private ParseFlowMappingValue() {
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            if (!ParserImpl.this.scanner.checkToken(Token.ID.Value)) {
                ParserImpl parserImpl = ParserImpl.this;
                parserImpl.state = parserImpl.new ParseFlowMappingKey(false);
                return ParserImpl.this.processEmptyScalar(ParserImpl.this.scanner.peekToken().getStartMark());
            }
            Token token = ParserImpl.this.scanner.getToken();
            if (!ParserImpl.this.scanner.checkToken(Token.ID.FlowEntry, Token.ID.FlowMappingEnd)) {
                ParserImpl.this.states.push(ParserImpl.this.new ParseFlowMappingKey(false));
                return ParserImpl.this.parseFlowNode();
            }
            ParserImpl parserImpl2 = ParserImpl.this;
            parserImpl2.state = parserImpl2.new ParseFlowMappingKey(false);
            return ParserImpl.this.processEmptyScalar(token.getEndMark());
        }
    }

    public class ParseFlowSequenceEntry implements Production {
        private boolean first;

        public ParseFlowSequenceEntry(boolean z) {
            this.first = z;
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            Scanner scanner = ParserImpl.this.scanner;
            Token.ID id = Token.ID.FlowSequenceEnd;
            if (!scanner.checkToken(id)) {
                if (!this.first) {
                    if (!ParserImpl.this.scanner.checkToken(Token.ID.FlowEntry)) {
                        Token tokenPeekToken = ParserImpl.this.scanner.peekToken();
                        throw new ParserException("while parsing a flow sequence", (Mark) ParserImpl.this.marks.pop(), "expected ',' or ']', but got " + tokenPeekToken.getTokenId(), tokenPeekToken.getStartMark());
                    }
                    ParserImpl.this.scanner.getToken();
                }
                if (ParserImpl.this.scanner.checkToken(Token.ID.Key)) {
                    Token tokenPeekToken2 = ParserImpl.this.scanner.peekToken();
                    MappingStartEvent mappingStartEvent = new MappingStartEvent(null, null, true, tokenPeekToken2.getStartMark(), tokenPeekToken2.getEndMark(), Boolean.TRUE);
                    ParserImpl parserImpl = ParserImpl.this;
                    parserImpl.state = new ParseFlowSequenceEntryMappingKey();
                    return mappingStartEvent;
                }
                if (!ParserImpl.this.scanner.checkToken(id)) {
                    ParserImpl.this.states.push(ParserImpl.this.new ParseFlowSequenceEntry(false));
                    return ParserImpl.this.parseFlowNode();
                }
            }
            Token token = ParserImpl.this.scanner.getToken();
            SequenceEndEvent sequenceEndEvent = new SequenceEndEvent(token.getStartMark(), token.getEndMark());
            ParserImpl parserImpl2 = ParserImpl.this;
            parserImpl2.state = (Production) parserImpl2.states.pop();
            ParserImpl.this.marks.pop();
            return sequenceEndEvent;
        }
    }

    public class ParseFlowSequenceEntryMappingEnd implements Production {
        private ParseFlowSequenceEntryMappingEnd() {
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            ParserImpl parserImpl = ParserImpl.this;
            parserImpl.state = parserImpl.new ParseFlowSequenceEntry(false);
            Token tokenPeekToken = ParserImpl.this.scanner.peekToken();
            return new MappingEndEvent(tokenPeekToken.getStartMark(), tokenPeekToken.getEndMark());
        }
    }

    public class ParseFlowSequenceEntryMappingKey implements Production {
        private ParseFlowSequenceEntryMappingKey() {
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            Token token = ParserImpl.this.scanner.getToken();
            if (!ParserImpl.this.scanner.checkToken(Token.ID.Value, Token.ID.FlowEntry, Token.ID.FlowSequenceEnd)) {
                ParserImpl.this.states.push(new ParseFlowSequenceEntryMappingValue());
                return ParserImpl.this.parseFlowNode();
            }
            ParserImpl parserImpl = ParserImpl.this;
            parserImpl.state = new ParseFlowSequenceEntryMappingValue();
            return ParserImpl.this.processEmptyScalar(token.getEndMark());
        }
    }

    public class ParseFlowSequenceEntryMappingValue implements Production {
        private ParseFlowSequenceEntryMappingValue() {
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            if (!ParserImpl.this.scanner.checkToken(Token.ID.Value)) {
                ParserImpl parserImpl = ParserImpl.this;
                parserImpl.state = new ParseFlowSequenceEntryMappingEnd();
                return ParserImpl.this.processEmptyScalar(ParserImpl.this.scanner.peekToken().getStartMark());
            }
            Token token = ParserImpl.this.scanner.getToken();
            if (!ParserImpl.this.scanner.checkToken(Token.ID.FlowEntry, Token.ID.FlowSequenceEnd)) {
                ParserImpl.this.states.push(new ParseFlowSequenceEntryMappingEnd());
                return ParserImpl.this.parseFlowNode();
            }
            ParserImpl parserImpl2 = ParserImpl.this;
            parserImpl2.state = new ParseFlowSequenceEntryMappingEnd();
            return ParserImpl.this.processEmptyScalar(token.getEndMark());
        }
    }

    public class ParseFlowSequenceFirstEntry implements Production {
        private ParseFlowSequenceFirstEntry() {
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            ParserImpl.this.marks.push(ParserImpl.this.scanner.getToken().getStartMark());
            return ParserImpl.this.new ParseFlowSequenceEntry(true).produce();
        }
    }

    public class ParseImplicitDocumentStart implements Production {
        private ParseImplicitDocumentStart() {
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            if (ParserImpl.this.scanner.checkToken(Token.ID.Directive, Token.ID.DocumentStart, Token.ID.StreamEnd)) {
                return new ParseDocumentStart().produce();
            }
            ParserImpl.this.tagHandles = ParserImpl.DEFAULT_TAGS;
            Mark startMark = ParserImpl.this.scanner.peekToken().getStartMark();
            DocumentStartEvent documentStartEvent = new DocumentStartEvent(startMark, startMark, false, null, null);
            ParserImpl.this.states.push(new ParseDocumentEnd());
            ParserImpl parserImpl = ParserImpl.this;
            parserImpl.state = new ParseBlockNode();
            return documentStartEvent;
        }
    }

    public class ParseIndentlessSequenceEntry implements Production {
        private ParseIndentlessSequenceEntry() {
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            Scanner scanner = ParserImpl.this.scanner;
            Token.ID id = Token.ID.BlockEntry;
            if (!scanner.checkToken(id)) {
                Token tokenPeekToken = ParserImpl.this.scanner.peekToken();
                SequenceEndEvent sequenceEndEvent = new SequenceEndEvent(tokenPeekToken.getStartMark(), tokenPeekToken.getEndMark());
                ParserImpl parserImpl = ParserImpl.this;
                parserImpl.state = (Production) parserImpl.states.pop();
                return sequenceEndEvent;
            }
            Token token = ParserImpl.this.scanner.getToken();
            if (!ParserImpl.this.scanner.checkToken(id, Token.ID.Key, Token.ID.Value, Token.ID.BlockEnd)) {
                ParserImpl.this.states.push(ParserImpl.this.new ParseIndentlessSequenceEntry());
                return new ParseBlockNode().produce();
            }
            ParserImpl parserImpl2 = ParserImpl.this;
            parserImpl2.state = parserImpl2.new ParseIndentlessSequenceEntry();
            return ParserImpl.this.processEmptyScalar(token.getEndMark());
        }
    }

    public class ParseStreamStart implements Production {
        private ParseStreamStart() {
        }

        @Override // org.yaml.snakeyaml.parser.Production
        public Event produce() {
            StreamStartToken streamStartToken = (StreamStartToken) ParserImpl.this.scanner.getToken();
            StreamStartEvent streamStartEvent = new StreamStartEvent(streamStartToken.getStartMark(), streamStartToken.getEndMark());
            ParserImpl parserImpl = ParserImpl.this;
            parserImpl.state = new ParseImplicitDocumentStart();
            return streamStartEvent;
        }
    }

    static {
        HashMap map = new HashMap();
        DEFAULT_TAGS = map;
        map.put("!", "!");
        map.put("!!", Tag.PREFIX);
    }

    public ParserImpl(StreamReader streamReader) {
        this.scanner = new ScannerImpl(streamReader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Event parseBlockNodeOrIndentlessSequence() {
        return parseNode(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Event parseFlowNode() {
        return parseNode(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Event parseNode(boolean z, boolean z2) {
        Mark startMark;
        TagTuple value;
        Mark startMark2;
        Mark endMark;
        String value2;
        String strL;
        Mark startMark3;
        Mark mark;
        Event scalarEvent;
        Production parseBlockMappingFirstKey;
        ImplicitTuple implicitTuple;
        if (this.scanner.checkToken(Token.ID.Alias)) {
            AliasToken aliasToken = (AliasToken) this.scanner.getToken();
            AliasEvent aliasEvent = new AliasEvent(aliasToken.getValue(), aliasToken.getStartMark(), aliasToken.getEndMark());
            this.state = this.states.pop();
            return aliasEvent;
        }
        Scanner scanner = this.scanner;
        Token.ID id = Token.ID.Anchor;
        if (scanner.checkToken(id)) {
            AnchorToken anchorToken = (AnchorToken) this.scanner.getToken();
            startMark = anchorToken.getStartMark();
            Mark endMark2 = anchorToken.getEndMark();
            String value3 = anchorToken.getValue();
            if (this.scanner.checkToken(Token.ID.Tag)) {
                TagToken tagToken = (TagToken) this.scanner.getToken();
                startMark2 = tagToken.getStartMark();
                endMark = tagToken.getEndMark();
                value = tagToken.getValue();
            } else {
                startMark2 = null;
                endMark = endMark2;
                value = null;
            }
            value2 = value3;
        } else if (this.scanner.checkToken(Token.ID.Tag)) {
            TagToken tagToken2 = (TagToken) this.scanner.getToken();
            Mark startMark4 = tagToken2.getStartMark();
            endMark = tagToken2.getEndMark();
            TagTuple value4 = tagToken2.getValue();
            if (this.scanner.checkToken(id)) {
                AnchorToken anchorToken2 = (AnchorToken) this.scanner.getToken();
                endMark = anchorToken2.getEndMark();
                value2 = anchorToken2.getValue();
            } else {
                value2 = null;
            }
            startMark = startMark4;
            startMark2 = startMark;
            value = value4;
        } else {
            startMark = null;
            value = null;
            startMark2 = null;
            endMark = null;
            value2 = null;
        }
        if (value != null) {
            String handle = value.getHandle();
            String suffix = value.getSuffix();
            if (handle == null) {
                strL = suffix;
            } else {
                if (!this.tagHandles.containsKey(handle)) {
                    throw new ParserException("while parsing a node", startMark, "found undefined tag handle ".concat(handle), startMark2);
                }
                strL = AbstractC3264qG.l(new StringBuilder(), this.tagHandles.get(handle), suffix);
            }
        } else {
            strL = null;
        }
        if (startMark == null) {
            startMark3 = this.scanner.peekToken().getStartMark();
            mark = startMark3;
        } else {
            startMark3 = startMark;
            mark = endMark;
        }
        boolean z3 = strL == null || strL.equals("!");
        if (z2 && this.scanner.checkToken(Token.ID.BlockEntry)) {
            scalarEvent = new SequenceStartEvent(value2, strL, z3, startMark3, this.scanner.peekToken().getEndMark(), Boolean.FALSE);
            parseBlockMappingFirstKey = new ParseIndentlessSequenceEntry();
        } else {
            if (this.scanner.checkToken(Token.ID.Scalar)) {
                ScalarToken scalarToken = (ScalarToken) this.scanner.getToken();
                Mark endMark3 = scalarToken.getEndMark();
                if ((scalarToken.getPlain() && strL == null) || "!".equals(strL)) {
                    implicitTuple = new ImplicitTuple(true, false);
                } else {
                    implicitTuple = strL == null ? new ImplicitTuple(false, true) : new ImplicitTuple(false, false);
                }
                scalarEvent = new ScalarEvent(value2, strL, implicitTuple, scalarToken.getValue(), startMark3, endMark3, Character.valueOf(scalarToken.getStyle()));
            } else if (this.scanner.checkToken(Token.ID.FlowSequenceStart)) {
                scalarEvent = new SequenceStartEvent(value2, strL, z3, startMark3, this.scanner.peekToken().getEndMark(), Boolean.TRUE);
                parseBlockMappingFirstKey = new ParseFlowSequenceFirstEntry();
            } else if (this.scanner.checkToken(Token.ID.FlowMappingStart)) {
                scalarEvent = new MappingStartEvent(value2, strL, z3, startMark3, this.scanner.peekToken().getEndMark(), Boolean.TRUE);
                parseBlockMappingFirstKey = new ParseFlowMappingFirstKey();
            } else if (z && this.scanner.checkToken(Token.ID.BlockSequenceStart)) {
                scalarEvent = new SequenceStartEvent(value2, strL, z3, startMark3, this.scanner.peekToken().getStartMark(), Boolean.FALSE);
                parseBlockMappingFirstKey = new ParseBlockSequenceFirstEntry();
            } else if (z && this.scanner.checkToken(Token.ID.BlockMappingStart)) {
                scalarEvent = new MappingStartEvent(value2, strL, z3, startMark3, this.scanner.peekToken().getStartMark(), Boolean.FALSE);
                parseBlockMappingFirstKey = new ParseBlockMappingFirstKey();
            } else {
                if (value2 == null && strL == null) {
                    String str = z ? "block" : "flow";
                    Token tokenPeekToken = this.scanner.peekToken();
                    throw new ParserException(AbstractC3264qG.x("while parsing a ", str, " node"), startMark3, "expected the node content, but found " + tokenPeekToken.getTokenId(), tokenPeekToken.getStartMark());
                }
                scalarEvent = new ScalarEvent(value2, strL, new ImplicitTuple(z3, false), "", startMark3, mark, (char) 0);
            }
            parseBlockMappingFirstKey = this.states.pop();
        }
        this.state = parseBlockMappingFirstKey;
        return scalarEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Object> processDirectives() {
        this.yamlVersion = null;
        this.tagHandles = new HashMap();
        while (this.scanner.checkToken(Token.ID.Directive)) {
            DirectiveToken directiveToken = (DirectiveToken) this.scanner.getToken();
            if (directiveToken.getName().equals("YAML")) {
                if (this.yamlVersion != null) {
                    throw new ParserException(null, null, "found duplicate YAML directive", directiveToken.getStartMark());
                }
                if (((Integer) directiveToken.getValue().get(0)).intValue() != 1) {
                    throw new ParserException(null, null, "found incompatible YAML document (version 1.* is required)", directiveToken.getStartMark());
                }
                this.yamlVersion = directiveToken.getValue();
            } else if (directiveToken.getName().equals("TAG")) {
                List value = directiveToken.getValue();
                String str = (String) value.get(0);
                String str2 = (String) value.get(1);
                if (this.tagHandles.containsKey(str)) {
                    throw new ParserException(null, null, AbstractC3264qG.w("duplicate tag handle ", str), directiveToken.getStartMark());
                }
                this.tagHandles.put(str, str2);
            } else {
                continue;
            }
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.yamlVersion);
        arrayList.add(!this.tagHandles.isEmpty() ? new HashMap(this.tagHandles) : new HashMap());
        for (String str3 : DEFAULT_TAGS.keySet()) {
            if (!this.tagHandles.containsKey(str3)) {
                this.tagHandles.put(str3, DEFAULT_TAGS.get(str3));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Event processEmptyScalar(Mark mark) {
        return new ScalarEvent(null, null, new ImplicitTuple(true, false), "", mark, mark, (char) 0);
    }

    @Override // org.yaml.snakeyaml.parser.Parser
    public boolean checkEvent(Event.ID id) {
        peekEvent();
        Event event = this.currentEvent;
        return event != null && event.is(id);
    }

    @Override // org.yaml.snakeyaml.parser.Parser
    public Event getEvent() {
        peekEvent();
        Event event = this.currentEvent;
        this.currentEvent = null;
        return event;
    }

    @Override // org.yaml.snakeyaml.parser.Parser
    public Event peekEvent() {
        Production production;
        if (this.currentEvent == null && (production = this.state) != null) {
            this.currentEvent = production.produce();
        }
        return this.currentEvent;
    }
}
