package ru.gb.bullsandcows;

// 3 6 2 9

// 3 2 1 4 -> 1b 1c
//

/*        char a = '2' - '0'; // 2
        char a = 50 - 48; // 2*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Game {

    public static class BullCowCount {
        private int bulls;
        private int cows;

        public BullCowCount(int bulls, int cows) {
            this.bulls = bulls;
            this.cows = cows;
        }

        public int getBulls() {
            return bulls;
        }

        public int getCows() {
            return cows;
        }
    }

    private final int[] guessNumber;

    public Game() {
        guessNumber = generateNumber();
        System.out.println(Arrays.toString(guessNumber));
    }

    public String getGuessNumber() {
        return "" + guessNumber[0] + guessNumber[1] + guessNumber[2] + guessNumber[3];
    }

    private int[] generateNumber() {
        List<Integer> a = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        Collections.shuffle(a);
        return new int[]{a.get(0), a.get(1), a.get(2), a.get(3)};

        // Random random = new Random();

        /*        int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < 100; i++) {
            int i1 = random.nextInt(10);
            int i2 = random.nextInt(10);
            int c = a[i1];
            a[i1] = a[i2];
            a[i2] = c;
        }*/
        // return new int[]{a[0], a[1], a[2], a[3]};
    }

    public BullCowCount calcBullsAndCows(String userNumber) { // 2365 '2'
        int bulls = 0, cows = 0;
        for (int i = 0; i < 4; i++) {
            if (guessNumber[i] == userNumber.charAt(i) - '0') {
                bulls++;
            } else if (userNumber.contains(String.valueOf(guessNumber[i]))) {
                cows++;
            }
        }
        return new BullCowCount(bulls, cows);
    }
}
