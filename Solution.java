class Solution {
    public boolean hasAlternatingBits(int n) {
        int stop = 31;
        for (int bit = 31; bit >= 0; bit--) {
            if (hasBit(n, bit)) {
                stop = bit;
                break;
            }
        }
        for (int bit = 1; bit <= stop; bit++) {
            if (hasBit(n, bit - 1) == hasBit(n, bit)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean hasBit(int n, int bit) {
        return (n & (1 << bit)) != 0;
    }
}
