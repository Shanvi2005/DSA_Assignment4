class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = piles[0];
        
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        
        int mid;        
        int result = -1;
        
        while (left <= right) {
            mid = (left + right) / 2; 
            if (check(piles, h, mid)) {
                right = mid - 1;
                result = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return result;
    }

    public boolean check(int[] piles, int h, int k) {
        if (k == 0) return false;
        
        int hoursLeft = h;
        int pileIndex = 0;
        
        while (hoursLeft >= 0 && pileIndex < piles.length) {
            hoursLeft -= Math.ceil((double) piles[pileIndex] / k);
            pileIndex++;
        }
        
        return (hoursLeft >= 0 && pileIndex == piles.length);
    }
}
