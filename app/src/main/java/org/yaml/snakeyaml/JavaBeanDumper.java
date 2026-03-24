package org.yaml.snakeyaml;

import java.io.StringWriter;
import java.io.Writer;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.introspector.BeanAccess;
import org.yaml.snakeyaml.nodes.Tag;
import org.yaml.snakeyaml.representer.Representer;

/* loaded from: classes2.dex */
public class JavaBeanDumper {
    private final BeanAccess beanAccess;
    private DumperOptions.FlowStyle flowStyle;
    private DumperOptions options;
    private Representer representer;
    private boolean useGlobalTag;

    public JavaBeanDumper() {
        this(BeanAccess.DEFAULT);
    }

    public String dump(Object obj) {
        StringWriter stringWriter = new StringWriter();
        dump(obj, stringWriter);
        return stringWriter.toString();
    }

    public DumperOptions.FlowStyle getFlowStyle() {
        return this.flowStyle;
    }

    public boolean isUseGlobalTag() {
        return this.useGlobalTag;
    }

    public void setFlowStyle(DumperOptions.FlowStyle flowStyle) {
        this.flowStyle = flowStyle;
    }

    public void setUseGlobalTag(boolean z) {
        this.useGlobalTag = z;
    }

    public JavaBeanDumper(BeanAccess beanAccess) {
        this(false, beanAccess);
    }

    public void dump(Object obj, Writer writer) {
        DumperOptions dumperOptions = this.options;
        if (dumperOptions == null) {
            dumperOptions = new DumperOptions();
            if (!this.useGlobalTag) {
                dumperOptions.setExplicitRoot(Tag.MAP);
            }
            dumperOptions.setDefaultFlowStyle(this.flowStyle);
        }
        Representer representer = this.representer;
        if (representer == null) {
            representer = new Representer();
            representer.getPropertyUtils().setBeanAccess(this.beanAccess);
        }
        new Yaml(representer, dumperOptions).dump(obj, writer);
    }

    public JavaBeanDumper(Representer representer, DumperOptions dumperOptions) {
        if (representer == null) {
            throw new NullPointerException("Representer must be provided.");
        }
        if (dumperOptions == null) {
            throw new NullPointerException("DumperOptions must be provided.");
        }
        this.options = dumperOptions;
        this.representer = representer;
        this.beanAccess = null;
    }

    public JavaBeanDumper(boolean z) {
        this(z, BeanAccess.DEFAULT);
    }

    public JavaBeanDumper(boolean z, BeanAccess beanAccess) {
        this.useGlobalTag = z;
        this.beanAccess = beanAccess;
        this.flowStyle = DumperOptions.FlowStyle.BLOCK;
    }
}
