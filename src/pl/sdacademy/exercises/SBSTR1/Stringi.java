package pl.sdacademy.exercises.SBSTR1;

public class Stringi {

    public static void main(String[] args) {
        System.out.println(isSubstring("lokasta", "ks"));
        System.out.println(isSubstringSpace("lokasta", "ks"));
    }

    private static boolean isSubstring(String string, String candidate) {
        for (int stringIndex = 0; stringIndex < string.length() - candidate.length(); stringIndex++) {
            if (string.charAt(stringIndex) == candidate.charAt(0)) {
                int candidateIndex = 0;
                while (string.charAt(stringIndex + candidateIndex) == candidate.charAt(candidateIndex)) {
                    candidateIndex++;
                    if (candidateIndex == candidate.length()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean isSubstringSpace(String string, String candidate) {
        boolean[] chek = new boolean[candidate.length()];
        int stringIndex = 0;
        for (int candidateIndex = 0; candidateIndex < candidate.length(); candidateIndex++) {
            for (;stringIndex<string.length(); stringIndex++) {
                if (string.charAt(stringIndex) == candidate.charAt(candidateIndex)) {
                    chek[candidateIndex] = true;
                    break;
                }
            }
        }
        for (int chekIndex = 0; chekIndex < candidate.length(); chekIndex++) {
            if (!chek[chekIndex]) {
                return false;
            }
        }
        return true;
    }

}
