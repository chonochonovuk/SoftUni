package cresla.entities.io;

import cresla.interfaces.OutputWriter;

public class Output implements OutputWriter {
    @Override
    public void write(String output) {

    }

    @Override
    public void writeLine(String output) {
        System.out.println(output);
    }
}
