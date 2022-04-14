public class Hello {
    public static void main(String[] args) {
        int minInt = Integer.MIN_VALUE, maxInt = Integer.MAX_VALUE;
        float minFloat = Float.MIN_VALUE, maxFloat = Float.MAX_VALUE;
        double minDouble = Double.MIN_VALUE, maxDouble = Double.MAX_VALUE;
        short minShort = Short.MIN_VALUE, maxShort = Short.MAX_VALUE;

        System.out.println("Integers from " + minInt + " to " + maxInt );
        System.out.println("Floats from " + minFloat + " to " + maxFloat);
        System.out.println("Doubles from " + minDouble + " to " + maxDouble);
        System.out.println("Shorts from " + minShort + " to " + maxShort);
    }
}
