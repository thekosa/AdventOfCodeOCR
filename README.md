# AdventOfCodeOCR
Simple and primitive OCR for applications from Advent of Code event

Day 10 exercise in Advent of Code 2022 required of me to implement application drawing some characters in ASCII art style. Those characters were answer. This package is made just for converting this ASCII art word to actual, not ASCII art, word.

This is really simple and primitive OCR, because dimensions of input are hardcoded and should be 5 rows high, and after every letter there must be a one sign column space.

To add this package to your project, you need use maven and add dependency, and then run mvn install:

<dependency>
  <groupId>com.adventofcode.primitive.OCR</groupId>
  <artifactId>adventofcode-ocr</artifactId>
  <version>1.2</version>
</dependency>

This is simple tool, there is only one method to convert ASCII art to string. Convert() gets ASCII art word, and returns string with actual letters. If there is something wrong with input word, or OCR can't recognize the letter, application will return "?" sign.

Thanks to whole Advent of Code community :)
