package org.yaml.snakeyaml.introspector;

import java.lang.reflect.Field;
import org.yaml.snakeyaml.error.YAMLException;

/* loaded from: classes2.dex */
public class FieldProperty extends GenericProperty {
    private final Field field;

    public FieldProperty(Field field) throws SecurityException {
        super(field.getName(), field.getType(), field.getGenericType());
        this.field = field;
        field.setAccessible(true);
    }

    @Override // org.yaml.snakeyaml.introspector.Property
    public Object get(Object obj) {
        try {
            return this.field.get(obj);
        } catch (Exception e) {
            throw new YAMLException("Unable to access field " + this.field.getName() + " on object " + obj + " : " + e);
        }
    }

    @Override // org.yaml.snakeyaml.introspector.Property
    public void set(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException {
        this.field.set(obj, obj2);
    }
}
