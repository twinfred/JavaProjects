package DataStructures.ArraysAndStrings.Unique;

import java.util.ArrayList;
import java.util.HashSet;

public class Unique {
    public static void main(String[] args) {
        System.out.println(areAllCharactersUniqueV4("lamp"));
        System.out.println(areAllCharactersUniqueV4("tortilla"));
        System.out.println(areAllCharactersUniqueV4("pine"));
        System.out.println(areAllCharactersUniqueV4("sofa"));
        System.out.println(areAllCharactersUniqueV4("module"));
        System.out.println(areAllCharactersUniqueV4("pineapple"));
    }

    // Checks if all characters in a string are unique
    // Allowed to use other data structures
    private static boolean areAllCharactersUniqueV1(String str) { // MY ANSWER
        String[] strArr = str.split("");
        HashSet<String> hashSet = new HashSet<>();
        for(String letter : strArr) {
            if (hashSet.contains(letter)) {
                return false;
            }

            hashSet.add(letter);
        }

        return true;
    }

    // Performance improvement over V1, same challenge
    // Time Complexity: O(n), where n is the length of the string
    private static boolean areAllcharactersUniqueV2(String str) { // CHATGPT ANSWER
        HashSet<Character> hashSet = new HashSet<>();

        for(int i = 0; i < str.length(); i++) {
            if (!hashSet.add(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    // Checks if all characters in a string are unique
    // NOT allowed to use other data structures
    private static boolean areAllCharactersUniqueV3(String str) { // MY ANSWER
        for(int currIdx = 0; currIdx < str.length() - 1; currIdx++ ) {
            int nextIdx = currIdx + 1;
            String currentLetter = str.substring(currIdx, nextIdx);

            for (int i = nextIdx; i < str.length(); i++) {
                if (currentLetter.equals(str.substring(i, i + 1))) {
                    return false;
                }
            }
        }

        return true;
    }

    // Improved performance over V3, same challenge
    // Time Complexity: O(n^2), where n is the length of the string
    private static boolean areAllCharactersUniqueV4(String str) { // CHATGPT ANSWER
        for(int i = 0; i < str.length() - 1; i++) {
            for(int x = i + 1; x < str.length(); x++) {
                if (str.charAt(i) == str.charAt(x)) {
                    return false;
                }
            }
        }

        return true;
    }
}
