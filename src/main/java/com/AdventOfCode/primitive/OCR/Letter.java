package com.AdventOfCode.primitive.OCR;

import lombok.Getter;

import java.lang.reflect.InvocationTargetException;

@Getter
public class Letter {
    private final String a = ".##.\n#..#\n#..#\n####\n#..#\n#..#";
    private final String b = "###.\n#..#\n###.\n#..#\n#..#\n###.";
    private final String c = ".##.\n#..#\n#...\n#...\n#..#\n.##.";
    private final String d = "###.\n#..#\n#..#\n#..#\n#..#\n###.";
    private final String e = "####\n#...\n###.\n#...\n#...\n####";
    private final String f = "####\n#...\n###.\n#...\n#...\n#...";
    private final String g = "unpredicted1";
    private final String h = "#..#\n#..#\n####\n#..#\n#..#\n#..#";
    private final String i = "####\n.##.\n.##.\n.##.\n.##.\n####";
    private final String j = "..##\n...#\n...#\n...#\n#..#\n.##.";
    private final String k = "unpredicted2";
    private final String l = "#...\n#...\n#...\n#...\n#...\n####";
    private final String m = "unpredicted3";
    private final String n = "unpredicted4";
    private final String o = ".##.\n#..#\n#..#\n#..#\n#..#\n.##.";
    private final String p = "###.\n#..#\n###.\n#...\n#...\n#...";
    private final String q = "unpredicted10";
    private final String r = "unpredicted5";
    private final String s = "unpredicted6";
    private final String t = "####\n.##.\n.##.\n.##.\n.##.\n.##.";
    private final String u = "#..#\n#..#\n#..#\n#..#\n#..#\n.##.";
    private final String v = "unpredicted7";
    private final String w = "unpredicted8";
    private final String x = "unpredicted9";
    private final String y = "unpredicted0";
    private final String z = "####\n...#\n..#.\n.#..\n#...\n####";

    public Object get(String getWhat) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return this.getClass().getMethod("get" + getWhat).invoke(this);
    }
}
