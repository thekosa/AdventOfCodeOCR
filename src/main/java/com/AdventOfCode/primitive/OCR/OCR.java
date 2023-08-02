package com.AdventOfCode.primitive.OCR;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Main class in package, here is all the magic happening
 */
public class OCR {
    /**
     * Converts whole ASCII art word to word with standard characters.
     *
     * @param wordBeforeOCR - ASCII art word with only two type of signs, "#" as a high state, "." as a low state.
     *                      Between characters should be a one sign spacing column. ASCII art should have 6 rows high.
     * <blockquote><pre>
     * E.g. <br>
     * String wordBeforeOCR = <br>
     * "####.####.####..##..#..#...##..##..###..\n" + <br>
     * "#.......#.#....#..#.#..#....#.#..#.#..#.\n" + <br>
     * "###....#..###..#....####....#.#..#.###..\n" + <br>
     * "#.....#...#....#....#..#....#.####.#..#.\n" + <br>
     * "#....#....#....#..#.#..#.#..#.#..#.#..#.\n" + <br>
     * "####.####.#.....##..#..#..##..#..#.###..";    <br>
     * </pre></blockquote>
     * @return converted word to standard characters
     */
    public static String convert(String wordBeforeOCR) {
        List<String> lettersBeforeOCR = fromWord2Letters(wordBeforeOCR);
        StringBuilder convertedWord = new StringBuilder();
        for (String letter : lettersBeforeOCR) {
            Letters letters;
            try {
                letters = new Letters();
            } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
            convertedWord.append(letters.findLetter(letter));
        }
        return convertedWord.toString();
    }

    /**
     * Converts whole ASCII art word to word with standard characters.
     *
     * @param wordBeforeOCR - ASCII art word with only two type of signs. Low sign and high sign could be any.
     *                      Between characters should be a one sign spacing column. ASCII art should have 6 rows high.
     *                      <blockquote><pre>
     * E.g.:<br>
     * String wordBeforeOCR =<br>
     * "████ ████ ████  ██  █  █   ██  ██  ███  \n" + <br>
     * "█       █ █    █  █ █  █    █ █  █ █  █ \n" + <br>
     * "███    █  ███  █    ████    █ █  █ ███  \n" + <br>
     * "█     █   █    █    █  █    █ ████ █  █ \n" + <br>
     * "█    █    █    █  █ █  █ █  █ █  █ █  █ \n" + <br>
     * "████ ████ █     ██  █  █  ██  █  █ ███  ";    <br>
     * </pre></blockquote>
     * @param lowSign       - what sign represents low state sign, in the example above it's " "
     * @param highSign      - what sign represents high state sign, in the example above it's "█"
     * @return converted word to standard characters
     */
    public static String convert(String wordBeforeOCR, String lowSign, String highSign) {
        return convert(reSign(wordBeforeOCR, lowSign, highSign));
    }

    private static String reSign(String string, String lowSign, String highSign) {
        return string.replaceAll(lowSign, ".").replaceAll(highSign, "#");
    }

    private static List<String> fromWord2Letters(String word) {
        List<String> letters = new ArrayList<>();
        String[] rows = word.split("\n");
        int lettersQuantity = rows[0].length() / 5;

        for (int i = 0; i < lettersQuantity; i++) {
            StringBuilder letter = new StringBuilder();
            for (String row : rows) {
                letter.append(row, i * 5, i * 5 + 4).append("\n");
            }
            letter.delete(letter.length() - 1, letter.length());
            letters.add(letter.toString());
        }
        return letters;
    }
}
