package com.AdventOfCode.primitive.OCR;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * Class represents alphabet. Collects every letter from Letter class and combines it with ocr-ed letters.
 */
public class Letters {
    /**
     * letters collection with not ocr-ed letters from Letter class
     */
    private static final List<String> letterList = new ArrayList<>();
    /**
     * letters collection with ocr-ed letters, characters only as Strings
     */
    private static final List<String> OCRedList = new ArrayList<>();
    /**
     * Object Letter to get singly letters
     */
    private static final Letter letter = new Letter();

    /**
     * Initializes a newly created Letters object so that it represents an empty character sequence.
     * Creates two lists with alphabets, same index point on the exact letter in both lists.
     *
     * @throws InvocationTargetException - if the underlying method Letter.get() throws an exception.
     * @throws NoSuchMethodException     - if the underlying method Letter.get() throws an exception.
     * @throws IllegalAccessException    - if the underlying method Letter.get() throws an exception.
     */
    public Letters() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        for (int i = 0; i < 26; i++) {
            OCRedList.add(String.valueOf((char) (i + 65)));
            letterList.add((String) letter.get(String.valueOf((char) (i + 65))));
        }
    }

    /**
     * Finds in Letter list exact ocr-ed letter and returns that letter.
     *
     * @param letterBeforeOCR - single ascii art letter string
     * @return single letter from Letter class in String;
     * a character ? if letterBeforeOCR isn't similar to any actual letter from Letter class or is unpredicted
     */
    public String findLetter(String letterBeforeOCR) {
        for (int i = 0; i < letterList.size(); i++) {
            if (Objects.equals(letterList.get(i), letterBeforeOCR)) {
                return OCRedList.get(i);
            }
        }
        return "?";
    }
}