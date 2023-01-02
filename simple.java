public class simple {
    public static void main(String args[])
    {
        basiccalculator obj = new basiccalculator(6,3);
        System.out.println("Sum = " + obj.addition());
        System.out.println("Difference = " + obj.difference());
        System.out.println("Product = " + obj.multiply());
        System.out.println("Division = " + obj.divide());
    }
}