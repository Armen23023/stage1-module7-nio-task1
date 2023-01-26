package com.epam.mjc.nio;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileReader {

    public Profile getDataFromFile(File file) {
        String name = null;
        Integer age = null;
        String email = null;
        Long phone = null;
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(String.valueOf(file)))){
             name  = reader.readLine().split(" ")[1];
             age  = Integer.parseInt(reader.readLine().split(" ")[1]);
             email  = reader.readLine().split(" ")[1];
             phone  = Long.parseLong(reader.readLine().split(" ")[1]);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Profile(name,age,email,phone);
    }
}
