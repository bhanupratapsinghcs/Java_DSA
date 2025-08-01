package org.javaDSA.leetCode.Array;

public class KokoEatingBanana {
    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(piles, mid, h)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private static boolean canEatAll(int[] piles, int speed, int h) {
        int hoursNeeded = 0;
        for (int pile : piles) {
            hoursNeeded += (pile + speed - 1) / speed; // Equivalent to Math.ceil(pile / speed)
        }
        return hoursNeeded <= h;
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println("Minimum eating speed: " + minEatingSpeed(piles, h)); // Output: 4
    }
}
