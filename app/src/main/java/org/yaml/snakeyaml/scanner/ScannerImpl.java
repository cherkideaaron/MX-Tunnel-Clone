package org.yaml.snakeyaml.scanner;

import defpackage.AbstractC3264qG;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.yaml.snakeyaml.error.Mark;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.reader.StreamReader;
import org.yaml.snakeyaml.tokens.AliasToken;
import org.yaml.snakeyaml.tokens.AnchorToken;
import org.yaml.snakeyaml.tokens.BlockEndToken;
import org.yaml.snakeyaml.tokens.BlockEntryToken;
import org.yaml.snakeyaml.tokens.BlockMappingStartToken;
import org.yaml.snakeyaml.tokens.BlockSequenceStartToken;
import org.yaml.snakeyaml.tokens.DirectiveToken;
import org.yaml.snakeyaml.tokens.DocumentEndToken;
import org.yaml.snakeyaml.tokens.DocumentStartToken;
import org.yaml.snakeyaml.tokens.FlowEntryToken;
import org.yaml.snakeyaml.tokens.FlowMappingEndToken;
import org.yaml.snakeyaml.tokens.FlowMappingStartToken;
import org.yaml.snakeyaml.tokens.FlowSequenceEndToken;
import org.yaml.snakeyaml.tokens.FlowSequenceStartToken;
import org.yaml.snakeyaml.tokens.KeyToken;
import org.yaml.snakeyaml.tokens.ScalarToken;
import org.yaml.snakeyaml.tokens.StreamEndToken;
import org.yaml.snakeyaml.tokens.StreamStartToken;
import org.yaml.snakeyaml.tokens.TagToken;
import org.yaml.snakeyaml.tokens.TagTuple;
import org.yaml.snakeyaml.tokens.Token;
import org.yaml.snakeyaml.tokens.ValueToken;
import org.yaml.snakeyaml.util.ArrayStack;
import org.yaml.snakeyaml.util.UriEncoder;

/* loaded from: classes2.dex */
public final class ScannerImpl implements Scanner {
    public static final Map<Character, Integer> ESCAPE_CODES;
    public static final Map<Character, String> ESCAPE_REPLACEMENTS;
    private static final Pattern NOT_HEXA = Pattern.compile("[^0-9A-Fa-f]");
    private final StreamReader reader;
    private boolean done = false;
    private int flowLevel = 0;
    private int tokensTaken = 0;
    private int indent = -1;
    private boolean allowSimpleKey = true;
    private List<Token> tokens = new ArrayList(100);
    private ArrayStack<Integer> indents = new ArrayStack<>(10);
    private Map<Integer, SimpleKey> possibleSimpleKeys = new LinkedHashMap();

    public static class Chomping {
        private final int increment;
        private final Boolean value;

        public Chomping(Boolean bool, int i) {
            this.value = bool;
            this.increment = i;
        }

        public boolean chompTailIsNotFalse() {
            Boolean bool = this.value;
            return bool == null || bool.booleanValue();
        }

        public boolean chompTailIsTrue() {
            Boolean bool = this.value;
            return bool != null && bool.booleanValue();
        }

        public int getIncrement() {
            return this.increment;
        }
    }

    static {
        HashMap map = new HashMap();
        ESCAPE_REPLACEMENTS = map;
        HashMap map2 = new HashMap();
        ESCAPE_CODES = map2;
        map.put('0', "\u0000");
        map.put('a', "\u0007");
        map.put('b', "\b");
        map.put('t', "\t");
        map.put('n', "\n");
        map.put('v', "\u000b");
        map.put('f', "\f");
        map.put('r', "\r");
        map.put('e', "\u001b");
        map.put(' ', " ");
        map.put('\"', "\"");
        map.put('\\', "\\");
        map.put('N', "\u0085");
        map.put('_', " ");
        map.put('L', "\u2028");
        map.put('P', "\u2029");
        map2.put('x', 2);
        map2.put('u', 4);
        map2.put('U', 8);
    }

    public ScannerImpl(StreamReader streamReader) {
        this.reader = streamReader;
        fetchStreamStart();
    }

    private boolean addIndent(int i) {
        int i2 = this.indent;
        if (i2 >= i) {
            return false;
        }
        this.indents.push(Integer.valueOf(i2));
        this.indent = i;
        return true;
    }

    private boolean checkBlockEntry() {
        return Constant.NULL_BL_T_LINEBR.has(this.reader.peek(1));
    }

    private boolean checkDirective() {
        return this.reader.getColumn() == 0;
    }

    private boolean checkDocumentEnd() {
        return this.reader.getColumn() == 0 && "...".equals(this.reader.prefix(3)) && Constant.NULL_BL_T_LINEBR.has(this.reader.peek(3));
    }

    private boolean checkDocumentStart() {
        return this.reader.getColumn() == 0 && "---".equals(this.reader.prefix(3)) && Constant.NULL_BL_T_LINEBR.has(this.reader.peek(3));
    }

    private boolean checkKey() {
        if (this.flowLevel != 0) {
            return true;
        }
        return Constant.NULL_BL_T_LINEBR.has(this.reader.peek(1));
    }

    private boolean checkPlain() {
        char cPeek = this.reader.peek();
        Constant constant = Constant.NULL_BL_T_LINEBR;
        if (constant.hasNo(cPeek, "-?:,[]{}#&*!|>'\"%@`")) {
            return true;
        }
        if (constant.hasNo(this.reader.peek(1))) {
            if (cPeek == '-') {
                return true;
            }
            if (this.flowLevel == 0 && "?:".indexOf(cPeek) != -1) {
                return true;
            }
        }
        return false;
    }

    private boolean checkValue() {
        if (this.flowLevel != 0) {
            return true;
        }
        return Constant.NULL_BL_T_LINEBR.has(this.reader.peek(1));
    }

    private void fetchAlias() throws IOException {
        savePossibleSimpleKey();
        this.allowSimpleKey = false;
        this.tokens.add(scanAnchor(false));
    }

    private void fetchAnchor() throws IOException {
        savePossibleSimpleKey();
        this.allowSimpleKey = false;
        this.tokens.add(scanAnchor(true));
    }

    private void fetchBlockEntry() throws IOException {
        if (this.flowLevel == 0) {
            if (!this.allowSimpleKey) {
                throw new ScannerException(null, null, "sequence entries are not allowed here", this.reader.getMark());
            }
            if (addIndent(this.reader.getColumn())) {
                Mark mark = this.reader.getMark();
                this.tokens.add(new BlockSequenceStartToken(mark, mark));
            }
        }
        this.allowSimpleKey = true;
        removePossibleSimpleKey();
        Mark mark2 = this.reader.getMark();
        this.reader.forward();
        this.tokens.add(new BlockEntryToken(mark2, this.reader.getMark()));
    }

    private void fetchBlockScalar(char c) throws IOException, NumberFormatException {
        this.allowSimpleKey = true;
        removePossibleSimpleKey();
        this.tokens.add(scanBlockScalar(c));
    }

    private void fetchDirective() throws IOException {
        unwindIndent(-1);
        removePossibleSimpleKey();
        this.allowSimpleKey = false;
        this.tokens.add(scanDirective());
    }

    private void fetchDocumentEnd() throws IOException {
        fetchDocumentIndicator(false);
    }

    private void fetchDocumentIndicator(boolean z) throws IOException {
        unwindIndent(-1);
        removePossibleSimpleKey();
        this.allowSimpleKey = false;
        Mark mark = this.reader.getMark();
        this.reader.forward(3);
        Mark mark2 = this.reader.getMark();
        this.tokens.add(z ? new DocumentStartToken(mark, mark2) : new DocumentEndToken(mark, mark2));
    }

    private void fetchDocumentStart() throws IOException {
        fetchDocumentIndicator(true);
    }

    private void fetchDouble() throws IOException {
        fetchFlowScalar('\"');
    }

    private void fetchFlowCollectionEnd(boolean z) throws IOException {
        removePossibleSimpleKey();
        this.flowLevel--;
        this.allowSimpleKey = false;
        Mark mark = this.reader.getMark();
        this.reader.forward();
        Mark mark2 = this.reader.getMark();
        this.tokens.add(z ? new FlowMappingEndToken(mark, mark2) : new FlowSequenceEndToken(mark, mark2));
    }

    private void fetchFlowCollectionStart(boolean z) throws IOException {
        savePossibleSimpleKey();
        this.flowLevel++;
        this.allowSimpleKey = true;
        Mark mark = this.reader.getMark();
        this.reader.forward(1);
        Mark mark2 = this.reader.getMark();
        this.tokens.add(z ? new FlowMappingStartToken(mark, mark2) : new FlowSequenceStartToken(mark, mark2));
    }

    private void fetchFlowEntry() throws IOException {
        this.allowSimpleKey = true;
        removePossibleSimpleKey();
        Mark mark = this.reader.getMark();
        this.reader.forward();
        this.tokens.add(new FlowEntryToken(mark, this.reader.getMark()));
    }

    private void fetchFlowMappingEnd() throws IOException {
        fetchFlowCollectionEnd(true);
    }

    private void fetchFlowMappingStart() throws IOException {
        fetchFlowCollectionStart(true);
    }

    private void fetchFlowScalar(char c) throws IOException {
        savePossibleSimpleKey();
        this.allowSimpleKey = false;
        this.tokens.add(scanFlowScalar(c));
    }

    private void fetchFlowSequenceEnd() throws IOException {
        fetchFlowCollectionEnd(false);
    }

    private void fetchFlowSequenceStart() throws IOException {
        fetchFlowCollectionStart(false);
    }

    private void fetchFolded() throws IOException, NumberFormatException {
        fetchBlockScalar('>');
    }

    private void fetchKey() throws IOException {
        if (this.flowLevel == 0) {
            if (!this.allowSimpleKey) {
                throw new ScannerException(null, null, "mapping keys are not allowed here", this.reader.getMark());
            }
            if (addIndent(this.reader.getColumn())) {
                Mark mark = this.reader.getMark();
                this.tokens.add(new BlockMappingStartToken(mark, mark));
            }
        }
        this.allowSimpleKey = this.flowLevel == 0;
        removePossibleSimpleKey();
        Mark mark2 = this.reader.getMark();
        this.reader.forward();
        this.tokens.add(new KeyToken(mark2, this.reader.getMark()));
    }

    private void fetchLiteral() throws IOException, NumberFormatException {
        fetchBlockScalar('|');
    }

    private void fetchMoreTokens() throws IOException, NumberFormatException {
        scanToNextToken();
        stalePossibleSimpleKeys();
        unwindIndent(this.reader.getColumn());
        char cPeek = this.reader.peek();
        if (cPeek == 0) {
            fetchStreamEnd();
            return;
        }
        if (cPeek == '*') {
            fetchAlias();
            return;
        }
        if (cPeek != ':') {
            if (cPeek == '[') {
                fetchFlowSequenceStart();
                return;
            }
            if (cPeek == ']') {
                fetchFlowSequenceEnd();
                return;
            }
            if (cPeek == '!') {
                fetchTag();
                return;
            }
            if (cPeek == '\"') {
                fetchDouble();
                return;
            }
            if (cPeek != '>') {
                if (cPeek != '?') {
                    switch (cPeek) {
                        case '%':
                            if (checkDirective()) {
                                fetchDirective();
                                return;
                            }
                            break;
                        case '&':
                            fetchAnchor();
                            return;
                        case '\'':
                            fetchSingle();
                            return;
                        default:
                            switch (cPeek) {
                                case ',':
                                    fetchFlowEntry();
                                    return;
                                case '-':
                                    if (checkDocumentStart()) {
                                        fetchDocumentStart();
                                        return;
                                    } else if (checkBlockEntry()) {
                                        fetchBlockEntry();
                                        return;
                                    }
                                    break;
                                case '.':
                                    if (checkDocumentEnd()) {
                                        fetchDocumentEnd();
                                        return;
                                    }
                                    break;
                                default:
                                    switch (cPeek) {
                                        case '{':
                                            fetchFlowMappingStart();
                                            return;
                                        case '|':
                                            if (this.flowLevel == 0) {
                                                fetchLiteral();
                                                return;
                                            }
                                            break;
                                        case '}':
                                            fetchFlowMappingEnd();
                                            return;
                                    }
                            }
                    }
                } else if (checkKey()) {
                    fetchKey();
                    return;
                }
            } else if (this.flowLevel == 0) {
                fetchFolded();
                return;
            }
        } else if (checkValue()) {
            fetchValue();
            return;
        }
        if (checkPlain()) {
            fetchPlain();
            return;
        }
        String strValueOf = String.valueOf(cPeek);
        Iterator<Character> it = ESCAPE_REPLACEMENTS.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Character next = it.next();
                if (ESCAPE_REPLACEMENTS.get(next).equals(strValueOf)) {
                    strValueOf = "\\" + next;
                }
            }
        }
        throw new ScannerException("while scanning for the next token", null, "found character " + cPeek + "'" + strValueOf + "' that cannot start any token", this.reader.getMark());
    }

    private void fetchPlain() throws IOException {
        savePossibleSimpleKey();
        this.allowSimpleKey = false;
        this.tokens.add(scanPlain());
    }

    private void fetchSingle() throws IOException {
        fetchFlowScalar('\'');
    }

    private void fetchStreamEnd() {
        unwindIndent(-1);
        removePossibleSimpleKey();
        this.allowSimpleKey = false;
        this.possibleSimpleKeys.clear();
        Mark mark = this.reader.getMark();
        this.tokens.add(new StreamEndToken(mark, mark));
        this.done = true;
    }

    private void fetchStreamStart() {
        Mark mark = this.reader.getMark();
        this.tokens.add(new StreamStartToken(mark, mark));
    }

    private void fetchTag() throws IOException {
        savePossibleSimpleKey();
        this.allowSimpleKey = false;
        this.tokens.add(scanTag());
    }

    private void fetchValue() throws IOException {
        SimpleKey simpleKeyRemove = this.possibleSimpleKeys.remove(Integer.valueOf(this.flowLevel));
        if (simpleKeyRemove != null) {
            this.tokens.add(simpleKeyRemove.getTokenNumber() - this.tokensTaken, new KeyToken(simpleKeyRemove.getMark(), simpleKeyRemove.getMark()));
            if (this.flowLevel == 0 && addIndent(simpleKeyRemove.getColumn())) {
                this.tokens.add(simpleKeyRemove.getTokenNumber() - this.tokensTaken, new BlockMappingStartToken(simpleKeyRemove.getMark(), simpleKeyRemove.getMark()));
            }
            this.allowSimpleKey = false;
        } else {
            int i = this.flowLevel;
            if (i == 0 && !this.allowSimpleKey) {
                throw new ScannerException(null, null, "mapping values are not allowed here", this.reader.getMark());
            }
            if (i == 0 && addIndent(this.reader.getColumn())) {
                Mark mark = this.reader.getMark();
                this.tokens.add(new BlockMappingStartToken(mark, mark));
            }
            this.allowSimpleKey = this.flowLevel == 0;
            removePossibleSimpleKey();
        }
        Mark mark2 = this.reader.getMark();
        this.reader.forward();
        this.tokens.add(new ValueToken(mark2, this.reader.getMark()));
    }

    private boolean needMoreTokens() {
        if (this.done) {
            return false;
        }
        if (this.tokens.isEmpty()) {
            return true;
        }
        stalePossibleSimpleKeys();
        return nextPossibleSimpleKey() == this.tokensTaken;
    }

    private int nextPossibleSimpleKey() {
        if (this.possibleSimpleKeys.isEmpty()) {
            return -1;
        }
        return this.possibleSimpleKeys.values().iterator().next().getTokenNumber();
    }

    private void removePossibleSimpleKey() {
        SimpleKey simpleKeyRemove = this.possibleSimpleKeys.remove(Integer.valueOf(this.flowLevel));
        if (simpleKeyRemove != null && simpleKeyRemove.isRequired()) {
            throw new ScannerException("while scanning a simple key", simpleKeyRemove.getMark(), "could not found expected ':'", this.reader.getMark());
        }
    }

    private void savePossibleSimpleKey() {
        boolean z = this.flowLevel == 0 && this.indent == this.reader.getColumn();
        boolean z2 = this.allowSimpleKey;
        if (!z2 && z) {
            throw new YAMLException("A simple key is required only if it is the first token in the current line");
        }
        if (z2) {
            removePossibleSimpleKey();
            this.possibleSimpleKeys.put(Integer.valueOf(this.flowLevel), new SimpleKey(this.tokens.size() + this.tokensTaken, z, this.reader.getIndex(), this.reader.getLine(), this.reader.getColumn(), this.reader.getMark()));
        }
    }

    private Token scanAnchor(boolean z) throws IOException {
        char cPeek;
        Mark mark = this.reader.getMark();
        String str = this.reader.peek() == '*' ? "alias" : "anchor";
        this.reader.forward();
        StreamReader streamReader = this.reader;
        int i = 0;
        while (true) {
            cPeek = streamReader.peek(i);
            if (!Constant.ALPHA.has(cPeek)) {
                break;
            }
            i++;
            streamReader = this.reader;
        }
        if (i == 0) {
            throw new ScannerException("while scanning an ".concat(str), mark, "expected alphabetic or numeric character, but found but found " + cPeek, this.reader.getMark());
        }
        String strPrefixForward = this.reader.prefixForward(i);
        char cPeek2 = this.reader.peek();
        if (!Constant.NULL_BL_T_LINEBR.hasNo(cPeek2, "?:,]}%@`")) {
            Mark mark2 = this.reader.getMark();
            return z ? new AnchorToken(strPrefixForward, mark, mark2) : new AliasToken(strPrefixForward, mark, mark2);
        }
        throw new ScannerException("while scanning an ".concat(str), mark, "expected alphabetic or numeric character, but found " + cPeek2 + "(" + ((int) this.reader.peek()) + ")", this.reader.getMark());
    }

    private Token scanBlockScalar(char c) throws IOException, NumberFormatException {
        int iMax;
        String str;
        Mark mark;
        Mark mark2;
        boolean z = c == '>';
        StringBuilder sb = new StringBuilder();
        Mark mark3 = this.reader.getMark();
        this.reader.forward();
        Chomping chompingScanBlockScalarIndicators = scanBlockScalarIndicators(mark3);
        int increment = chompingScanBlockScalarIndicators.getIncrement();
        scanBlockScalarIgnoredLine(mark3);
        int i = this.indent + 1;
        if (i < 1) {
            i = 1;
        }
        if (increment == -1) {
            Object[] objArrScanBlockScalarIndentation = scanBlockScalarIndentation();
            str = (String) objArrScanBlockScalarIndentation[0];
            int iIntValue = ((Integer) objArrScanBlockScalarIndentation[1]).intValue();
            mark = (Mark) objArrScanBlockScalarIndentation[2];
            iMax = Math.max(i, iIntValue);
        } else {
            iMax = (i + increment) - 1;
            Object[] objArrScanBlockScalarBreaks = scanBlockScalarBreaks(iMax);
            str = (String) objArrScanBlockScalarBreaks[0];
            mark = (Mark) objArrScanBlockScalarBreaks[1];
        }
        String strScanLineBreak = "";
        while (this.reader.getColumn() == iMax && this.reader.peek() != 0) {
            sb.append(str);
            boolean z2 = " \t".indexOf(this.reader.peek()) == -1;
            int i2 = 0;
            while (Constant.NULL_OR_LINEBR.hasNo(this.reader.peek(i2))) {
                i2++;
            }
            sb.append(this.reader.prefixForward(i2));
            strScanLineBreak = scanLineBreak();
            Object[] objArrScanBlockScalarBreaks2 = scanBlockScalarBreaks(iMax);
            String str2 = (String) objArrScanBlockScalarBreaks2[0];
            mark2 = (Mark) objArrScanBlockScalarBreaks2[1];
            if (this.reader.getColumn() != iMax || this.reader.peek() == 0) {
                str = str2;
                break;
            }
            if (!z || !"\n".equals(strScanLineBreak) || !z2 || " \t".indexOf(this.reader.peek()) != -1) {
                sb.append(strScanLineBreak);
            } else if (str2.length() == 0) {
                sb.append(" ");
            }
            mark = mark2;
            str = str2;
        }
        mark2 = mark;
        if (chompingScanBlockScalarIndicators.chompTailIsNotFalse()) {
            sb.append(strScanLineBreak);
        }
        if (chompingScanBlockScalarIndicators.chompTailIsTrue()) {
            sb.append(str);
        }
        return new ScalarToken(sb.toString(), false, mark3, mark2, c);
    }

    private Object[] scanBlockScalarBreaks(int i) throws IOException {
        StringBuilder sb = new StringBuilder();
        Mark mark = this.reader.getMark();
        int i2 = 0;
        for (int column = this.reader.getColumn(); column < i && this.reader.peek(i2) == ' '; column++) {
            i2++;
        }
        if (i2 > 0) {
            this.reader.forward(i2);
        }
        while (true) {
            String strScanLineBreak = scanLineBreak();
            if (strScanLineBreak.length() == 0) {
                return new Object[]{sb.toString(), mark};
            }
            sb.append(strScanLineBreak);
            mark = this.reader.getMark();
            int i3 = 0;
            for (int column2 = this.reader.getColumn(); column2 < i && this.reader.peek(i3) == ' '; column2++) {
                i3++;
            }
            if (i3 > 0) {
                this.reader.forward(i3);
            }
        }
    }

    private String scanBlockScalarIgnoredLine(Mark mark) throws IOException {
        int i = 0;
        int i2 = 0;
        while (this.reader.peek(i2) == ' ') {
            i2++;
        }
        if (i2 > 0) {
            this.reader.forward(i2);
        }
        if (this.reader.peek() == '#') {
            while (Constant.NULL_OR_LINEBR.hasNo(this.reader.peek(i))) {
                i++;
            }
            if (i > 0) {
                this.reader.forward(i);
            }
        }
        char cPeek = this.reader.peek();
        String strScanLineBreak = scanLineBreak();
        if (strScanLineBreak.length() != 0 || cPeek == 0) {
            return strScanLineBreak;
        }
        throw new ScannerException("while scanning a block scalar", mark, "expected a comment or a line break, but found " + cPeek, this.reader.getMark());
    }

    private Object[] scanBlockScalarIndentation() throws IOException {
        StringBuilder sb = new StringBuilder();
        Mark mark = this.reader.getMark();
        int column = 0;
        while (Constant.LINEBR.has(this.reader.peek(), " \r")) {
            if (this.reader.peek() != ' ') {
                sb.append(scanLineBreak());
                mark = this.reader.getMark();
            } else {
                this.reader.forward();
                if (this.reader.getColumn() > column) {
                    column = this.reader.getColumn();
                }
            }
        }
        return new Object[]{sb.toString(), Integer.valueOf(column), mark};
    }

    private Chomping scanBlockScalarIndicators(Mark mark) throws NumberFormatException, IOException {
        Boolean bool;
        char cPeek = this.reader.peek();
        int i = -1;
        if (cPeek == '-' || cPeek == '+') {
            bool = cPeek == '+' ? Boolean.TRUE : Boolean.FALSE;
            this.reader.forward();
            char cPeek2 = this.reader.peek();
            if (Character.isDigit(cPeek2)) {
                i = Integer.parseInt(String.valueOf(cPeek2));
                if (i == 0) {
                    throw new ScannerException("while scanning a block scalar", mark, "expected indentation indicator in the range 1-9, but found 0", this.reader.getMark());
                }
                this.reader.forward();
            }
        } else {
            bool = null;
            if (Character.isDigit(cPeek)) {
                i = Integer.parseInt(String.valueOf(cPeek));
                if (i == 0) {
                    throw new ScannerException("while scanning a block scalar", mark, "expected indentation indicator in the range 1-9, but found 0", this.reader.getMark());
                }
                this.reader.forward();
                char cPeek3 = this.reader.peek();
                if (cPeek3 == '-' || cPeek3 == '+') {
                    bool = cPeek3 == '+' ? Boolean.TRUE : Boolean.FALSE;
                    this.reader.forward();
                }
            }
        }
        char cPeek4 = this.reader.peek();
        if (!Constant.NULL_BL_LINEBR.hasNo(cPeek4)) {
            return new Chomping(bool, i);
        }
        throw new ScannerException("while scanning a block scalar", mark, "expected chomping or indentation indicators, but found " + cPeek4, this.reader.getMark());
    }

    private Token scanDirective() throws IOException {
        Mark mark;
        List listScanTagDirectiveValue;
        Mark mark2 = this.reader.getMark();
        this.reader.forward();
        String strScanDirectiveName = scanDirectiveName(mark2);
        if ("YAML".equals(strScanDirectiveName)) {
            listScanTagDirectiveValue = scanYamlDirectiveValue(mark2);
        } else {
            if (!"TAG".equals(strScanDirectiveName)) {
                mark = this.reader.getMark();
                int i = 0;
                while (Constant.NULL_OR_LINEBR.hasNo(this.reader.peek(i))) {
                    i++;
                }
                if (i > 0) {
                    this.reader.forward(i);
                }
                listScanTagDirectiveValue = null;
                scanDirectiveIgnoredLine(mark2);
                return new DirectiveToken(strScanDirectiveName, listScanTagDirectiveValue, mark2, mark);
            }
            listScanTagDirectiveValue = scanTagDirectiveValue(mark2);
        }
        mark = this.reader.getMark();
        scanDirectiveIgnoredLine(mark2);
        return new DirectiveToken(strScanDirectiveName, listScanTagDirectiveValue, mark2, mark);
    }

    private String scanDirectiveIgnoredLine(Mark mark) throws IOException {
        int i = 0;
        int i2 = 0;
        while (this.reader.peek(i2) == ' ') {
            i2++;
        }
        if (i2 > 0) {
            this.reader.forward(i2);
        }
        if (this.reader.peek() == '#') {
            while (Constant.NULL_OR_LINEBR.hasNo(this.reader.peek(i))) {
                i++;
            }
            this.reader.forward(i);
        }
        char cPeek = this.reader.peek();
        String strScanLineBreak = scanLineBreak();
        if (strScanLineBreak.length() != 0 || cPeek == 0) {
            return strScanLineBreak;
        }
        throw new ScannerException("while scanning a directive", mark, "expected a comment or a line break, but found " + cPeek + "(" + ((int) cPeek) + ")", this.reader.getMark());
    }

    private String scanDirectiveName(Mark mark) throws IOException {
        char cPeek;
        StreamReader streamReader = this.reader;
        int i = 0;
        while (true) {
            cPeek = streamReader.peek(i);
            if (!Constant.ALPHA.has(cPeek)) {
                break;
            }
            i++;
            streamReader = this.reader;
        }
        if (i == 0) {
            throw new ScannerException("while scanning a directive", mark, "expected alphabetic or numeric character, but found " + cPeek + "(" + ((int) cPeek) + ")", this.reader.getMark());
        }
        String strPrefixForward = this.reader.prefixForward(i);
        char cPeek2 = this.reader.peek();
        if (!Constant.NULL_BL_LINEBR.hasNo(cPeek2)) {
            return strPrefixForward;
        }
        throw new ScannerException("while scanning a directive", mark, "expected alphabetic or numeric character, but found " + cPeek2 + "(" + ((int) cPeek2) + ")", this.reader.getMark());
    }

    private Token scanFlowScalar(char c) throws IOException {
        boolean z = c == '\"';
        StringBuilder sb = new StringBuilder();
        Mark mark = this.reader.getMark();
        char cPeek = this.reader.peek();
        this.reader.forward();
        while (true) {
            sb.append(scanFlowScalarNonSpaces(z, mark));
            if (this.reader.peek() == cPeek) {
                this.reader.forward();
                return new ScalarToken(sb.toString(), false, mark, this.reader.getMark(), c);
            }
            sb.append(scanFlowScalarSpaces(mark));
        }
    }

    private String scanFlowScalarBreaks(Mark mark) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String strPrefix = this.reader.prefix(3);
            if (("---".equals(strPrefix) || "...".equals(strPrefix)) && Constant.NULL_BL_T_LINEBR.has(this.reader.peek(3))) {
                throw new ScannerException("while scanning a quoted scalar", mark, "found unexpected document separator", this.reader.getMark());
            }
            while (" \t".indexOf(this.reader.peek()) != -1) {
                this.reader.forward();
            }
            String strScanLineBreak = scanLineBreak();
            if (strScanLineBreak.length() == 0) {
                return sb.toString();
            }
            sb.append(strScanLineBreak);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0134, code lost:
    
        return r0.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String scanFlowScalarNonSpaces(boolean r6, org.yaml.snakeyaml.error.Mark r7) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.yaml.snakeyaml.scanner.ScannerImpl.scanFlowScalarNonSpaces(boolean, org.yaml.snakeyaml.error.Mark):java.lang.String");
    }

    private String scanFlowScalarSpaces(Mark mark) throws IOException {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (" \t".indexOf(this.reader.peek(i)) != -1) {
            i++;
        }
        String strPrefixForward = this.reader.prefixForward(i);
        if (this.reader.peek() == 0) {
            throw new ScannerException("while scanning a quoted scalar", mark, "found unexpected end of stream", this.reader.getMark());
        }
        String strScanLineBreak = scanLineBreak();
        if (strScanLineBreak.length() != 0) {
            String strScanFlowScalarBreaks = scanFlowScalarBreaks(mark);
            if (!"\n".equals(strScanLineBreak)) {
                sb.append(strScanLineBreak);
            } else if (strScanFlowScalarBreaks.length() == 0) {
                sb.append(" ");
            }
            sb.append(strScanFlowScalarBreaks);
        } else {
            sb.append(strPrefixForward);
        }
        return sb.toString();
    }

    private String scanLineBreak() throws IOException {
        char cPeek = this.reader.peek();
        if (cPeek != '\r' && cPeek != '\n' && cPeek != 133) {
            if (cPeek != 8232 && cPeek != 8233) {
                return "";
            }
            this.reader.forward();
            return String.valueOf(cPeek);
        }
        if (cPeek == '\r' && '\n' == this.reader.peek(1)) {
            this.reader.forward(2);
            return "\n";
        }
        this.reader.forward();
        return "\n";
    }

    private Token scanPlain() throws IOException {
        char cPeek;
        Constant constant;
        StringBuilder sb = new StringBuilder();
        Mark mark = this.reader.getMark();
        int i = this.indent + 1;
        String strScanPlainSpaces = "";
        Mark mark2 = mark;
        while (this.reader.peek() != '#') {
            int i2 = 0;
            while (true) {
                cPeek = this.reader.peek(i2);
                constant = Constant.NULL_BL_T_LINEBR;
                if (constant.has(cPeek) || ((this.flowLevel == 0 && cPeek == ':' && constant.has(this.reader.peek(i2 + 1))) || !(this.flowLevel == 0 || ",:?[]{}".indexOf(cPeek) == -1))) {
                    break;
                }
                i2++;
            }
            if (this.flowLevel != 0 && cPeek == ':' && constant.hasNo(this.reader.peek(i2 + 1), ",[]{}")) {
                this.reader.forward(i2);
                throw new ScannerException("while scanning a plain scalar", mark, "found unexpected ':'", this.reader.getMark(), "Please check http://pyyaml.org/wiki/YAMLColonInFlowContext for details.");
            }
            if (i2 == 0) {
                break;
            }
            this.allowSimpleKey = false;
            sb.append(strScanPlainSpaces);
            sb.append(this.reader.prefixForward(i2));
            mark2 = this.reader.getMark();
            strScanPlainSpaces = scanPlainSpaces();
            if (strScanPlainSpaces.length() == 0 || this.reader.peek() == '#' || (this.flowLevel == 0 && this.reader.getColumn() < i)) {
                break;
            }
        }
        return new ScalarToken(sb.toString(), mark, mark2, true);
    }

    private String scanPlainSpaces() throws IOException {
        int i = 0;
        while (true) {
            if (this.reader.peek(i) != ' ' && this.reader.peek(i) != '\t') {
                break;
            }
            i++;
        }
        String strPrefixForward = this.reader.prefixForward(i);
        String strScanLineBreak = scanLineBreak();
        if (strScanLineBreak.length() == 0) {
            return strPrefixForward;
        }
        this.allowSimpleKey = true;
        String strPrefix = this.reader.prefix(3);
        if ("---".equals(strPrefix) || ("...".equals(strPrefix) && Constant.NULL_BL_T_LINEBR.has(this.reader.peek(3)))) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (this.reader.peek() == ' ') {
                this.reader.forward();
            } else {
                String strScanLineBreak2 = scanLineBreak();
                if (strScanLineBreak2.length() == 0) {
                    if ("\n".equals(strScanLineBreak)) {
                        return sb.length() == 0 ? " " : sb.toString();
                    }
                    return strScanLineBreak + ((Object) sb);
                }
                sb.append(strScanLineBreak2);
                String strPrefix2 = this.reader.prefix(3);
                if ("---".equals(strPrefix2) || ("...".equals(strPrefix2) && Constant.NULL_BL_T_LINEBR.has(this.reader.peek(3)))) {
                    break;
                }
            }
        }
        return "";
    }

    private Token scanTag() throws IOException {
        String strScanTagUri;
        Mark mark = this.reader.getMark();
        boolean z = true;
        char cPeek = this.reader.peek(1);
        String strScanTagHandle = null;
        if (cPeek == '<') {
            this.reader.forward(2);
            strScanTagUri = scanTagUri("tag", mark);
            if (this.reader.peek() != '>') {
                throw new ScannerException("while scanning a tag", mark, "expected '>', but found '" + this.reader.peek() + "' (" + ((int) this.reader.peek()) + ")", this.reader.getMark());
            }
            this.reader.forward();
        } else if (Constant.NULL_BL_T_LINEBR.has(cPeek)) {
            this.reader.forward();
            strScanTagUri = "!";
        } else {
            int i = 1;
            while (true) {
                if (!Constant.NULL_BL_LINEBR.hasNo(cPeek)) {
                    z = false;
                    break;
                }
                if (cPeek == '!') {
                    break;
                }
                i++;
                cPeek = this.reader.peek(i);
            }
            if (z) {
                strScanTagHandle = scanTagHandle("tag", mark);
            } else {
                this.reader.forward();
                strScanTagHandle = "!";
            }
            strScanTagUri = scanTagUri("tag", mark);
        }
        char cPeek2 = this.reader.peek();
        if (!Constant.NULL_BL_LINEBR.hasNo(cPeek2)) {
            return new TagToken(new TagTuple(strScanTagHandle, strScanTagUri), mark, this.reader.getMark());
        }
        throw new ScannerException("while scanning a tag", mark, "expected ' ', but found '" + cPeek2 + "' (" + ((int) cPeek2) + ")", this.reader.getMark());
    }

    private String scanTagDirectiveHandle(Mark mark) throws IOException {
        String strScanTagHandle = scanTagHandle("directive", mark);
        char cPeek = this.reader.peek();
        if (cPeek == ' ') {
            return strScanTagHandle;
        }
        throw new ScannerException("while scanning a directive", mark, "expected ' ', but found " + this.reader.peek() + "(" + cPeek + ")", this.reader.getMark());
    }

    private String scanTagDirectivePrefix(Mark mark) throws IOException {
        String strScanTagUri = scanTagUri("directive", mark);
        if (!Constant.NULL_BL_LINEBR.hasNo(this.reader.peek())) {
            return strScanTagUri;
        }
        throw new ScannerException("while scanning a directive", mark, "expected ' ', but found " + this.reader.peek() + "(" + ((int) this.reader.peek()) + ")", this.reader.getMark());
    }

    private List<String> scanTagDirectiveValue(Mark mark) throws IOException {
        while (this.reader.peek() == ' ') {
            this.reader.forward();
        }
        String strScanTagDirectiveHandle = scanTagDirectiveHandle(mark);
        while (this.reader.peek() == ' ') {
            this.reader.forward();
        }
        String strScanTagDirectivePrefix = scanTagDirectivePrefix(mark);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(strScanTagDirectiveHandle);
        arrayList.add(strScanTagDirectivePrefix);
        return arrayList;
    }

    private String scanTagHandle(String str, Mark mark) throws IOException {
        char cPeek = this.reader.peek();
        if (cPeek != '!') {
            throw new ScannerException(AbstractC3264qG.w("while scanning a ", str), mark, "expected '!', but found " + cPeek + "(" + ((int) cPeek) + ")", this.reader.getMark());
        }
        int i = 1;
        char cPeek2 = this.reader.peek(1);
        if (cPeek2 != ' ') {
            int i2 = 1;
            while (Constant.ALPHA.has(cPeek2)) {
                i2++;
                cPeek2 = this.reader.peek(i2);
            }
            if (cPeek2 != '!') {
                this.reader.forward(i2);
                throw new ScannerException(AbstractC3264qG.w("while scanning a ", str), mark, "expected '!', but found " + cPeek2 + "(" + ((int) cPeek2) + ")", this.reader.getMark());
            }
            i = 1 + i2;
        }
        return this.reader.prefixForward(i);
    }

    private String scanTagUri(String str, Mark mark) throws IOException {
        StringBuilder sb = new StringBuilder();
        char cPeek = this.reader.peek(0);
        int i = 0;
        while (Constant.URI_CHARS.has(cPeek)) {
            if (cPeek == '%') {
                sb.append(this.reader.prefixForward(i));
                sb.append(scanUriEscapes(str, mark));
                i = 0;
            } else {
                i++;
            }
            cPeek = this.reader.peek(i);
        }
        if (i != 0) {
            sb.append(this.reader.prefixForward(i));
        }
        if (sb.length() != 0) {
            return sb.toString();
        }
        throw new ScannerException(AbstractC3264qG.w("while scanning a ", str), mark, "expected URI, but found " + cPeek + "(" + ((int) cPeek) + ")", this.reader.getMark());
    }

    private void scanToNextToken() throws IOException {
        if (this.reader.getIndex() == 0 && this.reader.peek() == 65279) {
            this.reader.forward();
        }
        boolean z = false;
        while (!z) {
            int i = 0;
            while (this.reader.peek(i) == ' ') {
                i++;
            }
            if (i > 0) {
                this.reader.forward(i);
            }
            if (this.reader.peek() == '#') {
                int i2 = 0;
                while (Constant.NULL_OR_LINEBR.hasNo(this.reader.peek(i2))) {
                    i2++;
                }
                if (i2 > 0) {
                    this.reader.forward(i2);
                }
            }
            if (scanLineBreak().length() == 0) {
                z = true;
            } else if (this.flowLevel == 0) {
                this.allowSimpleKey = true;
            }
        }
    }

    private String scanUriEscapes(String str, Mark mark) throws IOException {
        int i = 1;
        while (this.reader.peek(i * 3) == '%') {
            i++;
        }
        Mark mark2 = this.reader.getMark();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        while (this.reader.peek() == '%') {
            this.reader.forward();
            try {
                byteBufferAllocate.put((byte) Integer.parseInt(this.reader.prefix(2), 16));
                this.reader.forward(2);
            } catch (NumberFormatException unused) {
                throw new ScannerException(AbstractC3264qG.w("while scanning a ", str), mark, "expected URI escape sequence of 2 hexadecimal numbers, but found " + this.reader.peek() + "(" + ((int) this.reader.peek()) + ") and " + this.reader.peek(1) + "(" + ((int) this.reader.peek(1)) + ")", this.reader.getMark());
            }
        }
        byteBufferAllocate.flip();
        try {
            return UriEncoder.decode(byteBufferAllocate);
        } catch (CharacterCodingException e) {
            throw new ScannerException(AbstractC3264qG.w("while scanning a ", str), mark, "expected URI in UTF-8: " + e.getMessage(), mark2);
        }
    }

    private Integer scanYamlDirectiveNumber(Mark mark) {
        char cPeek = this.reader.peek();
        if (Character.isDigit(cPeek)) {
            int i = 0;
            while (Character.isDigit(this.reader.peek(i))) {
                i++;
            }
            return Integer.valueOf(Integer.parseInt(this.reader.prefixForward(i)));
        }
        throw new ScannerException("while scanning a directive", mark, "expected a digit, but found " + cPeek + "(" + ((int) cPeek) + ")", this.reader.getMark());
    }

    private List<Integer> scanYamlDirectiveValue(Mark mark) throws IOException {
        while (this.reader.peek() == ' ') {
            this.reader.forward();
        }
        Integer numScanYamlDirectiveNumber = scanYamlDirectiveNumber(mark);
        if (this.reader.peek() != '.') {
            throw new ScannerException("while scanning a directive", mark, "expected a digit or '.', but found " + this.reader.peek() + "(" + ((int) this.reader.peek()) + ")", this.reader.getMark());
        }
        this.reader.forward();
        Integer numScanYamlDirectiveNumber2 = scanYamlDirectiveNumber(mark);
        if (!Constant.NULL_BL_LINEBR.hasNo(this.reader.peek())) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(numScanYamlDirectiveNumber);
            arrayList.add(numScanYamlDirectiveNumber2);
            return arrayList;
        }
        throw new ScannerException("while scanning a directive", mark, "expected a digit or ' ', but found " + this.reader.peek() + "(" + ((int) this.reader.peek()) + ")", this.reader.getMark());
    }

    private void stalePossibleSimpleKeys() {
        if (this.possibleSimpleKeys.isEmpty()) {
            return;
        }
        Iterator<SimpleKey> it = this.possibleSimpleKeys.values().iterator();
        while (it.hasNext()) {
            SimpleKey next = it.next();
            if (next.getLine() != this.reader.getLine() || this.reader.getIndex() - next.getIndex() > 1024) {
                if (next.isRequired()) {
                    throw new ScannerException("while scanning a simple key", next.getMark(), "could not found expected ':'", this.reader.getMark());
                }
                it.remove();
            }
        }
    }

    private void unwindIndent(int i) {
        if (this.flowLevel != 0) {
            return;
        }
        while (this.indent > i) {
            Mark mark = this.reader.getMark();
            this.indent = this.indents.pop().intValue();
            this.tokens.add(new BlockEndToken(mark, mark));
        }
    }

    @Override // org.yaml.snakeyaml.scanner.Scanner
    public boolean checkToken(Token.ID... idArr) throws IOException, NumberFormatException {
        while (needMoreTokens()) {
            fetchMoreTokens();
        }
        if (!this.tokens.isEmpty()) {
            if (idArr.length == 0) {
                return true;
            }
            Token.ID tokenId = this.tokens.get(0).getTokenId();
            for (Token.ID id : idArr) {
                if (tokenId == id) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.yaml.snakeyaml.scanner.Scanner
    public Token getToken() {
        if (this.tokens.isEmpty()) {
            return null;
        }
        this.tokensTaken++;
        return this.tokens.remove(0);
    }

    @Override // org.yaml.snakeyaml.scanner.Scanner
    public Token peekToken() throws IOException, NumberFormatException {
        while (needMoreTokens()) {
            fetchMoreTokens();
        }
        return this.tokens.get(0);
    }
}
