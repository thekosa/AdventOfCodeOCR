package Main;

import com.AdventOfCode.primitive.OCR.OCR;

public class Main {
    public static void main(String[] args) {
        String string =
                        "████ ████ ████  ██  █  █   ██  ██  ███  \n" +
                        "█       █ █    █  █ █  █    █ █  █ █  █ \n" +
                        "███    █  ███  █    ████    █ █  █ ███  \n" +
                        "█     █   █    █    █  █    █ ████ █  █ \n" +
                        "█    █    █    █  █ █  █ █  █ █  █ █  █ \n" +
                        "████ ████ █     ██  █  █  ██  █  █ ███  ";
        System.out.println(OCR.convert(string, " ", "█"));
    }
}
