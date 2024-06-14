public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int i = 1;
        while (i<5) {
            System.out.print(i); i++;
        }

        System.out.println();

        for (int a = 1; a<5; a++){
            System.out.print(a);
        }

        System.out.println();

        //Primitive Data Types
        byte myByte = 23;
        System.out.println("My byte is " + myByte);

        short myShort = 1000;
        System.out.println("My short is " + myShort);

        int myInt = 2380000;
        System.out.println("My int is " + myInt);

        long myLong = 50234568l;
        System.out.println("My long is " + myLong);

        float myFloat = 1.2345f;
        double myDouble = 10.765;
        boolean myBoolean = true;
        char myChar = 97;
        System.out.println("My float is " + myFloat);
        System.out.println("My double is " + myDouble);
        System.out.println("My boolean is " + myBoolean);
        System.out.println("My char is " + myChar);

        myInt = 2365;
        System.out.println("My int is " + myInt);

//      STRINGS

        String myString = "Hello to everyone! ";
                System.out.println(myString);

    }
}