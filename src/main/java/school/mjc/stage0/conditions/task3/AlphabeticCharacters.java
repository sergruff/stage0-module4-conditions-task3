package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character < 'A' || character > 'z') {
            System.out.println("wrong alphabet!");
            return;
        }
        Character check = Character.toUpperCase(character);
        if (check.equals('A') || check.equals('E') || check.equals('Y') || check.equals('U') || check.equals("I") || check.equals('O')) {
            System.out.println("Vowel");
        } else System.out.println("Consonant");
    }
}
