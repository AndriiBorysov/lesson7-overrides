package com.aborysov.converters;

import com.aborysov.Student;

public class JsonStudentStringConverter
        implements IStudentStringConverter {
    @Override
    public String convert(Student student) {
        String result = new StringBuilder()
                .append("{\n")
                .append("\"name\": \"")
                .append(student.name)
                .append("\"")
                .append("\n")
                .append("}")
                .toString();
        return result;
    }
}
