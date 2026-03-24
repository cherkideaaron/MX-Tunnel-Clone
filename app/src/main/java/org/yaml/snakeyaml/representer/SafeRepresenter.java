package org.yaml.snakeyaml.representer;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.Vs;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;
import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.nodes.Tag;

/* loaded from: classes2.dex */
class SafeRepresenter extends BaseRepresenter {
    public static Pattern BINARY_PATTERN = Pattern.compile("[\\x00-\\x08\\x0B\\x0C\\x0E-\\x1F]");
    public static Pattern MULTILINE_PATTERN = Pattern.compile("\n|\u0085|\u2028|\u2029");
    protected Map<Class<? extends Object>, Tag> classTags;
    protected TimeZone timeZone = null;

    public static class IteratorWrapper implements Iterable<Object> {
        private Iterator<Object> iter;

        public IteratorWrapper(Iterator<Object> it) {
            this.iter = it;
        }

        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            return this.iter;
        }
    }

    public class RepresentArray implements Represent {
        public RepresentArray() {
        }

        @Override // org.yaml.snakeyaml.representer.Represent
        public Node representData(Object obj) {
            return SafeRepresenter.this.representSequence(Tag.SEQ, Arrays.asList((Object[]) obj), null);
        }
    }

    public class RepresentBoolean implements Represent {
        public RepresentBoolean() {
        }

        @Override // org.yaml.snakeyaml.representer.Represent
        public Node representData(Object obj) {
            return SafeRepresenter.this.representScalar(Tag.BOOL, Boolean.TRUE.equals(obj) ? "true" : "false");
        }
    }

    public class RepresentByteArray implements Represent {
        public RepresentByteArray() {
        }

        @Override // org.yaml.snakeyaml.representer.Represent
        public Node representData(Object obj) {
            return SafeRepresenter.this.representScalar(Tag.BINARY, String.valueOf(Base64Coder.encode((byte[]) obj)), '|');
        }
    }

    public class RepresentDate implements Represent {
        public RepresentDate() {
        }

        @Override // org.yaml.snakeyaml.representer.Represent
        public Node representData(Object obj) {
            Calendar calendar;
            if (obj instanceof Calendar) {
                calendar = (Calendar) obj;
            } else {
                calendar = Calendar.getInstance(SafeRepresenter.this.getTimeZone() == null ? TimeZone.getTimeZone("UTC") : SafeRepresenter.this.timeZone);
                calendar.setTime((Date) obj);
            }
            int i = calendar.get(1);
            int i2 = calendar.get(2) + 1;
            int i3 = calendar.get(5);
            int i4 = calendar.get(11);
            int i5 = calendar.get(12);
            int i6 = calendar.get(13);
            int i7 = calendar.get(14);
            StringBuilder sb = new StringBuilder(String.valueOf(i));
            while (sb.length() < 4) {
                sb.insert(0, "0");
            }
            sb.append("-");
            if (i2 < 10) {
                sb.append("0");
            }
            sb.append(String.valueOf(i2));
            sb.append("-");
            if (i3 < 10) {
                sb.append("0");
            }
            sb.append(String.valueOf(i3));
            sb.append(RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            if (i4 < 10) {
                sb.append("0");
            }
            sb.append(String.valueOf(i4));
            sb.append(":");
            if (i5 < 10) {
                sb.append("0");
            }
            sb.append(String.valueOf(i5));
            sb.append(":");
            if (i6 < 10) {
                sb.append("0");
            }
            sb.append(String.valueOf(i6));
            if (i7 > 0) {
                sb.append(i7 < 10 ? ".00" : i7 < 100 ? ".0" : ".");
                sb.append(String.valueOf(i7));
            }
            if (TimeZone.getTimeZone("UTC").equals(calendar.getTimeZone())) {
                sb.append("Z");
            } else {
                int offset = calendar.getTimeZone().getOffset(calendar.get(0), calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(7), calendar.get(14)) / 60000;
                int i8 = offset / 60;
                int i9 = offset % 60;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i8 > 0 ? "+" : "");
                sb2.append(i8);
                sb2.append(":");
                sb2.append(i9 < 10 ? Vs.k(i9, "0") : Integer.valueOf(i9));
                sb.append(sb2.toString());
            }
            SafeRepresenter safeRepresenter = SafeRepresenter.this;
            return safeRepresenter.representScalar(safeRepresenter.getTag(obj.getClass(), Tag.TIMESTAMP), sb.toString(), null);
        }
    }

    public class RepresentEnum implements Represent {
        public RepresentEnum() {
        }

        @Override // org.yaml.snakeyaml.representer.Represent
        public Node representData(Object obj) {
            Tag tag = new Tag((Class<? extends Object>) obj.getClass());
            SafeRepresenter safeRepresenter = SafeRepresenter.this;
            return safeRepresenter.representScalar(safeRepresenter.getTag(obj.getClass(), tag), ((Enum) obj).name());
        }
    }

    public class RepresentIterator implements Represent {
        public RepresentIterator() {
        }

        @Override // org.yaml.snakeyaml.representer.Represent
        public Node representData(Object obj) {
            Iterator it = (Iterator) obj;
            SafeRepresenter safeRepresenter = SafeRepresenter.this;
            return safeRepresenter.representSequence(safeRepresenter.getTag(obj.getClass(), Tag.SEQ), new IteratorWrapper(it), null);
        }
    }

    public class RepresentList implements Represent {
        public RepresentList() {
        }

        @Override // org.yaml.snakeyaml.representer.Represent
        public Node representData(Object obj) {
            SafeRepresenter safeRepresenter = SafeRepresenter.this;
            return safeRepresenter.representSequence(safeRepresenter.getTag(obj.getClass(), Tag.SEQ), (List) obj, null);
        }
    }

    public class RepresentMap implements Represent {
        public RepresentMap() {
        }

        @Override // org.yaml.snakeyaml.representer.Represent
        public Node representData(Object obj) {
            SafeRepresenter safeRepresenter = SafeRepresenter.this;
            return safeRepresenter.representMapping(safeRepresenter.getTag(obj.getClass(), Tag.MAP), (Map) obj, null);
        }
    }

    public class RepresentNull implements Represent {
        public RepresentNull() {
        }

        @Override // org.yaml.snakeyaml.representer.Represent
        public Node representData(Object obj) {
            return SafeRepresenter.this.representScalar(Tag.NULL, "null");
        }
    }

    public class RepresentNumber implements Represent {
        public RepresentNumber() {
        }

        @Override // org.yaml.snakeyaml.representer.Represent
        public Node representData(Object obj) {
            Tag tag;
            String string;
            if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof BigInteger)) {
                tag = Tag.INT;
                string = obj.toString();
            } else {
                Number number = (Number) obj;
                tag = Tag.FLOAT;
                string = number.equals(Double.valueOf(Double.NaN)) ? ".NaN" : number.equals(Double.valueOf(Double.POSITIVE_INFINITY)) ? ".inf" : number.equals(Double.valueOf(Double.NEGATIVE_INFINITY)) ? "-.inf" : number.toString();
            }
            SafeRepresenter safeRepresenter = SafeRepresenter.this;
            return safeRepresenter.representScalar(safeRepresenter.getTag(obj.getClass(), tag), string);
        }
    }

    public class RepresentSet implements Represent {
        public RepresentSet() {
        }

        @Override // org.yaml.snakeyaml.representer.Represent
        public Node representData(Object obj) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((Set) obj).iterator();
            while (it.hasNext()) {
                linkedHashMap.put(it.next(), null);
            }
            SafeRepresenter safeRepresenter = SafeRepresenter.this;
            return safeRepresenter.representMapping(safeRepresenter.getTag(obj.getClass(), Tag.SET), linkedHashMap, null);
        }
    }

    public class RepresentString implements Represent {
        public RepresentString() {
        }

        @Override // org.yaml.snakeyaml.representer.Represent
        public Node representData(Object obj) {
            Character ch;
            Tag tag = Tag.STR;
            String string = obj.toString();
            if (SafeRepresenter.BINARY_PATTERN.matcher(string).find()) {
                tag = Tag.BINARY;
                try {
                    string = String.valueOf(Base64Coder.encode(string.getBytes("UTF-8")));
                    ch = ch;
                } catch (UnsupportedEncodingException e) {
                    throw new YAMLException(e);
                }
            } else {
                ch = null;
            }
            return SafeRepresenter.this.representScalar(tag, string, (SafeRepresenter.this.defaultScalarStyle == null && SafeRepresenter.MULTILINE_PATTERN.matcher(string).find()) ? '|' : ch);
        }
    }

    public SafeRepresenter() {
        this.nullRepresenter = new RepresentNull();
        this.representers.put(String.class, new RepresentString());
        this.representers.put(Boolean.class, new RepresentBoolean());
        this.representers.put(Character.class, new RepresentString());
        this.representers.put(byte[].class, new RepresentByteArray());
        this.multiRepresenters.put(Number.class, new RepresentNumber());
        this.multiRepresenters.put(List.class, new RepresentList());
        this.multiRepresenters.put(Map.class, new RepresentMap());
        this.multiRepresenters.put(Set.class, new RepresentSet());
        this.multiRepresenters.put(Iterator.class, new RepresentIterator());
        this.multiRepresenters.put(new Object[0].getClass(), new RepresentArray());
        this.multiRepresenters.put(Date.class, new RepresentDate());
        this.multiRepresenters.put(Enum.class, new RepresentEnum());
        this.multiRepresenters.put(Calendar.class, new RepresentDate());
        this.classTags = new HashMap();
    }

    public Tag addClassTag(Class<? extends Object> cls, String str) {
        return addClassTag(cls, new Tag(str));
    }

    public Tag getTag(Class<?> cls, Tag tag) {
        return this.classTags.containsKey(cls) ? this.classTags.get(cls) : tag;
    }

    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public Tag addClassTag(Class<? extends Object> cls, Tag tag) {
        if (tag != null) {
            return this.classTags.put(cls, tag);
        }
        throw new NullPointerException("Tag must be provided.");
    }
}
