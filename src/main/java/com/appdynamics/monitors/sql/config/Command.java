package com.singularity.ee.agent.systemagent.monitors;

import java.util.HashSet;
import java.util.Set;

public class Command {

    private String command;
    private String displayPrefix;

    public String getDisplayPrefix() {return displayPrefix;}

    public void setDisplayPrefix(String displayPrefix) {this.displayPrefix = displayPrefix;}

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

}
