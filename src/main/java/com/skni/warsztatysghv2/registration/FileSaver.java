package com.skni.warsztatysghv2.registration;

import org.springframework.stereotype.Component;

import java.io.FileWriter;

@Component
public class FileSaver {

    public void saveToFile(Student student) {
        try (FileWriter fw = new FileWriter("student.txt")) {
            fw.write(student.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
