class Question2 {
    public static void main(String[] args) {
        String smallString = "a";
        int iterations = 10000;

        // Using String
        long startTimeString = System.currentTimeMillis();
        String resultString = "";
        for (int i = 0; i < iterations; i++) {
            resultString += smallString;
        }
        long endTimeString = System.currentTimeMillis();
        long elapsedTimeString = endTimeString - startTimeString;

        // Using StringBuilder
        long startTimeStringBuilder = System.currentTimeMillis();
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            resultBuilder.append(smallString);
        }
        long endTimeStringBuilder = System.currentTimeMillis();
        long elapsedTimeStringBuilder = endTimeStringBuilder - startTimeStringBuilder;

        // Using StringBuffer
        long startTimeStringBuffer = System.currentTimeMillis();
        StringBuffer resultBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            resultBuffer.append(smallString);
        }
        long endTimeStringBuffer = System.currentTimeMillis();
        long elapsedTimeStringBuffer = endTimeStringBuffer - startTimeStringBuffer;

        System.out.println("String concatenation time: " + elapsedTimeString + " ms");
        System.out.println("StringBuilder concatenation time: " + elapsedTimeStringBuilder + " ms");
        System.out.println("StringBuffer concatenation time: " + elapsedTimeStringBuffer + " ms");
    }
}