package com.infotech;

import com.infotech.model.Detail;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MappingStreamAPIClient30 {
    public static void main(String[] args) {

        List<String> uris = new ArrayList<>();
        uris.add("C:\\Myfile1.txt");
        uris.add("C:\\Myfile2.txt");
        uris.add("C:\\Myfile3.txt");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        Stream<Path> map = uris.stream().map(uri -> Paths.get(uri));
        map.forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        List<Detail> details = new ArrayList<>();

        List<String> parts1 = new ArrayList<>();
        parts1.add("part1");
        parts1.add("part2");
        parts1.add("part3");

        Detail detail1 = new Detail(1001, parts1);
        details.add(detail1);

        List<String> parts2 = new ArrayList<>();
        parts1.add("part1");
        parts1.add("part2");
        parts1.add("part3");
        parts1.add("part4");
        parts1.add("part5");

        Detail detail2 = new Detail(1002, parts2);
        details.add(detail2);

        Stream<String> flatMapStream = details.stream().flatMap(detail -> detail.getParts().stream());
        flatMapStream.forEach(System.out::println);
    }
}
