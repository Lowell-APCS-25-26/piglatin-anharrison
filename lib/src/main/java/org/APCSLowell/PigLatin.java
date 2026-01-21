package org.APCSLowell;

public class PigLatin {
    public int findFirstVowel(String sWord) {
        //precondition: sWord is a valid String of length greater than 0.
        //postcondition: returns the position of the first vowel in sWord.  If there are no vowels, returns -1
        String vowels = "aeiou";
        for (int i = 0; i < sWord.length(); i++) {
            if (vowels.indexOf(sWord.charAt(i)) != -1) {
                return i;
            }
        }
        return -1;
    }

    public String pigLatin(String sWord) {
        //precondition: sWord is a valid String of length greater than 0
        //postcondition: returns the pig latin equivalent of sWord
        int pos = findFirstVowel(sWord);
        if (pos == -1) {
            return sWord + "ay";
        } else if (sWord.startsWith("qu")) {
            return sWord.substring(2) + "qu" + "ay";
        } else if (pos == 0) {
            return sWord + "way";
        } else {
            return sWord.substring(pos) + sWord.substring(0, pos) + "ay";
        }
    }
}
