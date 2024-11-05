package edu.bsu.cs;

public class SillyMethods {
    public boolean didGuess42(int year) {
        return year == 42;
    }

    public String countTo(int limit) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= limit; i++) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }
}


