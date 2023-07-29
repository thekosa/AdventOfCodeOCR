package com.AdventOfCode.primitive.OCR;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Letters {
    private static final List<String> letterList = new ArrayList<>();
    private static final List<String> OCRedList = new ArrayList<>();
    private static final Letter letter = new Letter();

    public Letters() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        for (int i = 0; i < 26; i++) {
            OCRedList.add(String.valueOf((char) (i + 65)));
            letterList.add((String) letter.get(String.valueOf((char) (i + 65))));
        }
    }

    public String findLetter(String letterBeforeOCR) {
        for (int i = 0; i < letterList.size(); i++) {
            if (Objects.equals(letterList.get(i), letterBeforeOCR)) {
                return OCRedList.get(i);
            }
        }
        return "?";
    }
}