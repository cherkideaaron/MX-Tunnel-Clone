package org.yaml.snakeyaml.introspector;

/* loaded from: classes2.dex */
public abstract class Property implements Comparable<Property> {
    private final String name;
    private final Class<?> type;

    public Property(String str, Class<?> cls) {
        this.name = str;
        this.type = cls;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Property)) {
            return false;
        }
        Property property = (Property) obj;
        return this.name.equals(property.getName()) && this.type.equals(property.getType());
    }

    public abstract Object get(Object obj);

    public abstract Class<?>[] getActualTypeArguments();

    public String getName() {
        return this.name;
    }

    public Class<?> getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + this.name.hashCode();
    }

    public boolean isReadable() {
        return true;
    }

    public boolean isWritable() {
        return true;
    }

    public abstract void set(Object obj, Object obj2);

    public String toString() {
        return getName() + " of " + getType();
    }

    @Override // java.lang.Comparable
    public int compareTo(Property property) {
        return this.name.compareTo(property.name);
    }
}
