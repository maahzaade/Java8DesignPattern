package com.infotech;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamOfFileClient36 {
    public static void main(String[] args) {
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        Path path = Paths.get("C:\\Users\\mahdiye.nikraftar\\Desktop\\brs56\\defect107\\cgiconf03.txt");
        try (Stream<String> lines = Files.lines(path, Charset.forName("UTF-8"))) {
            lines.forEach(System.out::println);
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
