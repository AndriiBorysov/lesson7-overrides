package com.aborysov.printers;

import com.aborysov.Student;

public class DelegatingStudentPrinter
        implements IStudentPrinter {
    private IStudentPrinter[] printers;

    public DelegatingStudentPrinter(IStudentPrinter[] printers) {
        this.printers = printers;
    }

    @Override
    public void print(Student student) {
        for (int i = 0; i < printers.length; i++) {
            printers[i].print(student);
        }
    }
}
