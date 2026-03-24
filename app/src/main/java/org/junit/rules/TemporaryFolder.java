package org.junit.rules;

import defpackage.AbstractC3264qG;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import org.junit.Assert;

/* loaded from: classes2.dex */
public class TemporaryFolder extends ExternalResource {
    private static final int TEMP_DIR_ATTEMPTS = 10000;
    private static final String TMP_PREFIX = "junit";
    private final boolean assureDeletion;
    private File folder;
    private final File parentFolder;

    public static class Builder {
        private boolean assureDeletion;
        private File parentFolder;

        public Builder assureDeletion() {
            this.assureDeletion = true;
            return this;
        }

        public TemporaryFolder build() {
            return new TemporaryFolder(this);
        }

        public Builder parentFolder(File file) {
            this.parentFolder = file;
            return this;
        }
    }

    public TemporaryFolder() {
        this((File) null);
    }

    public static Builder builder() {
        return new Builder();
    }

    private static File createTemporaryFolderIn(File file) throws IOException {
        try {
            return createTemporaryFolderWithNioApi(file);
        } catch (ClassNotFoundException unused) {
            return createTemporaryFolderWithFileApi(file);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            IOException iOException = new IOException("Failed to create temporary folder in " + file);
            iOException.initCause(cause);
            throw iOException;
        } catch (Exception e2) {
            throw new RuntimeException("Failed to create temporary folder in " + file, e2);
        }
    }

    private static File createTemporaryFolderWithFileApi(File file) throws IOException {
        File file2 = null;
        int i = 0;
        while (i < TEMP_DIR_ATTEMPTS) {
            File fileCreateTempFile = File.createTempFile(TMP_PREFIX, ".tmp", file);
            File file3 = new File(fileCreateTempFile.toString().substring(0, r3.length() - 4));
            boolean zMkdir = file3.mkdir();
            fileCreateTempFile.delete();
            if (zMkdir) {
                return file3;
            }
            i++;
            file2 = file3;
        }
        throw new IOException("Unable to create temporary directory in: " + file.toString() + ". Tried 10000 times. Last attempted to create: " + file2.toString());
    }

    private static File createTemporaryFolderWithNioApi(File file) throws ClassNotFoundException, NegativeArraySizeException {
        Class<?> cls = Class.forName("java.nio.file.Files");
        Object objNewInstance = Array.newInstance(Class.forName("java.nio.file.attribute.FileAttribute"), 0);
        Class<?> cls2 = Class.forName("java.nio.file.Path");
        return (File) cls2.getDeclaredMethod("toFile", null).invoke(file != null ? cls.getDeclaredMethod("createTempDirectory", cls2, String.class, objNewInstance.getClass()).invoke(null, File.class.getDeclaredMethod("toPath", null).invoke(file, null), TMP_PREFIX, objNewInstance) : cls.getDeclaredMethod("createTempDirectory", String.class, objNewInstance.getClass()).invoke(null, TMP_PREFIX, objNewInstance), null);
    }

    private boolean recursiveDelete(File file) {
        if (file.delete()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (!recursiveDelete(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    private boolean tryDelete() {
        File file = this.folder;
        if (file == null) {
            return true;
        }
        return recursiveDelete(file);
    }

    @Override // org.junit.rules.ExternalResource
    public void after() {
        delete();
    }

    @Override // org.junit.rules.ExternalResource
    public void before() {
        create();
    }

    public void create() {
        this.folder = createTemporaryFolderIn(this.parentFolder);
    }

    public void delete() {
        if (tryDelete() || !this.assureDeletion) {
            return;
        }
        Assert.fail("Unable to clean up temporary folder " + this.folder);
    }

    public File getRoot() {
        File file = this.folder;
        if (file != null) {
            return file;
        }
        throw new IllegalStateException("the temporary folder has not yet been created");
    }

    public File newFile() {
        return File.createTempFile(TMP_PREFIX, null, getRoot());
    }

    public File newFolder() {
        return createTemporaryFolderIn(getRoot());
    }

    public TemporaryFolder(File file) {
        this.parentFolder = file;
        this.assureDeletion = false;
    }

    public File newFile(String str) throws IOException {
        File file = new File(getRoot(), str);
        if (file.createNewFile()) {
            return file;
        }
        throw new IOException(AbstractC3264qG.x("a file with the name '", str, "' already exists in the test folder"));
    }

    public File newFolder(String str) {
        return newFolder(str);
    }

    public TemporaryFolder(Builder builder) {
        this.parentFolder = builder.parentFolder;
        this.assureDeletion = builder.assureDeletion;
    }

    public File newFolder(String... strArr) throws IOException {
        if (strArr.length == 0) {
            throw new IllegalArgumentException("must pass at least one path");
        }
        File root = getRoot();
        int i = 0;
        for (String str : strArr) {
            if (new File(str).isAbsolute()) {
                throw new IOException(AbstractC3264qG.x("folder path '", str, "' is not a relative path"));
            }
        }
        int length = strArr.length;
        boolean z = true;
        File file = null;
        File file2 = root;
        while (i < length) {
            File file3 = new File(file, strArr[i]);
            File file4 = new File(root, file3.getPath());
            boolean zMkdirs = file4.mkdirs();
            if (!zMkdirs && !file4.isDirectory()) {
                if (file4.exists()) {
                    throw new IOException("a file with the path '" + file3.getPath() + "' exists");
                }
                throw new IOException("could not create a folder with the path '" + file3.getPath() + "'");
            }
            i++;
            file2 = file4;
            z = zMkdirs;
            file = file3;
        }
        if (z) {
            return file2;
        }
        throw new IOException("a folder with the path '" + file.getPath() + "' already exists");
    }
}
