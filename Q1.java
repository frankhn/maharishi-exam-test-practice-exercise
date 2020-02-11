class Q1 {
    static int getArray(int[] currentArrays) {
        if (currentArrays.length % 2 == 0)
            return 0;
        int middleIndex = currentArrays.length / 2;
        int middleItem = currentArrays[middleIndex];
        for (int i = 0; i < currentArrays.length; i++) {
            if (i != middleIndex && middleItem >= currentArrays[i])
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] n = { 2, 4, 5, 1, 7, 2, 4};
        System.out.println(getArray(n));
    }

}
