public class TypesConvertion {
    public static void main(String[] args) {
        float f = 42.42f;

        int genericInt = 123;
        long l = genericInt;

        int x = (int) l;

        double d = 123.123;
        int xD = (int) d;

        // there are wrapper classes:
        // Double, Float, Long, Integer, Short, Byte, Character, Boolean

        Integer notSoGenericInt = 123; // rarely needed
        int stillGenericInt = notSoGenericInt;

        System.out.println(Integer.parseInt("3213"));
    }
}
