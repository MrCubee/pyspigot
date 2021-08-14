package dev.magicmq.pyspigot.managers.script;

import org.python.core.PyCode;

import java.io.File;

public class Script {

    private final String name;
    private final PyCode code;
    private final File file;

    public Script(String name, PyCode code, File file) {
        this.name = name;
        this.code = code;
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public PyCode getCode() {
        return code;
    }

    public File getFile() {
        return file;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Script))
            return false;

        return name.equals(((Script) other).name);
    }
}
