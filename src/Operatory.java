public class Operatory {
    public static void main(String[] args) {


        //Operator arytmetyczny

        int a = 10, b = 5, c = 2;

        int result = a * b / c;
        System.out.println("a * b / c = " + result);

        int result2 = a + b - c;
        System.out.println("a + b - c = " + result2);

        //Operator relacyjny
        int x = 5, y = 10;

        System.out.println("x < y: " + (x < y));
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));


        //Operator logiczny
        boolean p = true, q = false;

        System.out.println("!p: " + !p);
        System.out.println("p && q: " + (p && q));
        System.out.println("p || q: " + (p || q));


        //Operator Warunkowy
        int f = 10, g = 5;

        int max = (f > g) ? f : g;
        System.out.println("Maksimum: " + max);

    }
}
