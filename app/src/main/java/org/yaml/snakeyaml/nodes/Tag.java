package org.yaml.snakeyaml.nodes;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.util.UriEncoder;

/* loaded from: classes2.dex */
public final class Tag implements Comparable<Tag> {
    public static final Tag BOOL;
    public static final Map<Tag, Set<Class<?>>> COMPATIBILITY_MAP;
    public static final Tag FLOAT;
    public static final Tag INT;
    public static final Tag MAP;
    public static final Tag NULL;
    public static final String PREFIX = "tag:yaml.org,2002:";
    public static final Tag SEQ;
    public static final Tag STR;
    public static final Tag TIMESTAMP;
    private final String value;
    public static final Tag YAML = new Tag("tag:yaml.org,2002:yaml");
    public static final Tag VALUE = new Tag("tag:yaml.org,2002:value");
    public static final Tag MERGE = new Tag("tag:yaml.org,2002:merge");
    public static final Tag SET = new Tag("tag:yaml.org,2002:set");
    public static final Tag PAIRS = new Tag("tag:yaml.org,2002:pairs");
    public static final Tag OMAP = new Tag("tag:yaml.org,2002:omap");
    public static final Tag BINARY = new Tag("tag:yaml.org,2002:binary");

    static {
        Tag tag = new Tag("tag:yaml.org,2002:int");
        INT = tag;
        Tag tag2 = new Tag("tag:yaml.org,2002:float");
        FLOAT = tag2;
        Tag tag3 = new Tag("tag:yaml.org,2002:timestamp");
        TIMESTAMP = tag3;
        BOOL = new Tag("tag:yaml.org,2002:bool");
        NULL = new Tag("tag:yaml.org,2002:null");
        STR = new Tag("tag:yaml.org,2002:str");
        SEQ = new Tag("tag:yaml.org,2002:seq");
        MAP = new Tag("tag:yaml.org,2002:map");
        HashMap map = new HashMap();
        COMPATIBILITY_MAP = map;
        HashSet hashSet = new HashSet();
        hashSet.add(Double.class);
        hashSet.add(Float.class);
        hashSet.add(BigDecimal.class);
        map.put(tag2, hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(Integer.class);
        hashSet2.add(Long.class);
        hashSet2.add(BigInteger.class);
        map.put(tag, hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(Date.class);
        hashSet3.add(java.sql.Date.class);
        hashSet3.add(Timestamp.class);
        map.put(tag3, hashSet3);
    }

    public Tag(Class<? extends Object> cls) {
        if (cls == null) {
            throw new NullPointerException("Class for tag must be provided.");
        }
        this.value = PREFIX + UriEncoder.encode(cls.getName());
    }

    public boolean equals(Object obj) {
        if (obj instanceof Tag) {
            return this.value.equals(((Tag) obj).getValue());
        }
        if (!(obj instanceof String) || !this.value.equals(obj.toString())) {
            return false;
        }
        System.err.println("Comparing Tag and String is deprecated.");
        return true;
    }

    public String getClassName() {
        if (this.value.startsWith(PREFIX)) {
            return UriEncoder.decode(this.value.substring(18));
        }
        throw new YAMLException("Invalid tag: " + this.value);
    }

    public int getLength() {
        return this.value.length();
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public boolean isCompatible(Class<?> cls) {
        Set<Class<?>> set = COMPATIBILITY_MAP.get(this);
        if (set != null) {
            return set.contains(cls);
        }
        return false;
    }

    public boolean matches(Class<? extends Object> cls) {
        return this.value.equals(PREFIX.concat(cls.getName()));
    }

    public boolean startsWith(String str) {
        return this.value.startsWith(str);
    }

    public String toString() {
        return this.value;
    }

    public Tag(String str) {
        if (str == null) {
            throw new NullPointerException("Tag must be provided.");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("Tag must not be empty.");
        }
        if (str.trim().length() != str.length()) {
            throw new IllegalArgumentException("Tag must not contain leading or trailing spaces.");
        }
        this.value = UriEncoder.encode(str);
    }

    @Override // java.lang.Comparable
    public int compareTo(Tag tag) {
        return this.value.compareTo(tag.getValue());
    }

    public Tag(URI uri) {
        if (uri == null) {
            throw new NullPointerException("URI for tag must be provided.");
        }
        this.value = uri.toASCIIString();
    }
}
