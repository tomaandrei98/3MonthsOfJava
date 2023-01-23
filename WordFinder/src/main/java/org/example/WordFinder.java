package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFinder {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the pool of letters:");
        String letters = scanner.nextLine().toUpperCase();

        Map<Character, Integer> lettersCountMap = getCharacterCountMap(letters);

        findWords(lettersCountMap);
    }

    private static void findWords(Map<Character, Integer> lettersCountMap) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/dictionary.txt"));

        for (String currentWord = reader.readLine(); currentWord != null; currentWord = reader.readLine()) {
            Map<Character, Integer> currentWordMap = getCharacterCountMap(currentWord);

            boolean canMakeCurrentWord = true;
            for (Character character : currentWordMap.keySet()) {
                int currentWordCharCount = currentWordMap.get(character);
                int lettersCharCount = lettersCountMap.getOrDefault(character, 0);

                if (currentWordCharCount > lettersCharCount) {
                    canMakeCurrentWord = false;
                    break;
                }
            }

            if (canMakeCurrentWord) {
                System.out.println(currentWord);
            }
        }
    }

    private static Map<Character, Integer> getCharacterCountMap(String letters) {
        Map<Character, Integer> lettersCountMap = new HashMap<>();
        for (int i = 0; i < letters.length(); i++) {
            char currentChar = letters.charAt(i);

            int count = lettersCountMap.getOrDefault(currentChar, 0);

            lettersCountMap.put(currentChar, count + 1);
        }
        return lettersCountMap;
    }
}