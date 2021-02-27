package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class f1{
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(convert(a));
    }

    public static int convert(int a){
        int result = a * 60;
    return result;
    }
}

class f2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(points(a,b));
    }

    public static int points(int a, int b){
        int result = a * 2 + b * 3;
        return result;
    }
}

class f3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(footballPoints(a, b, c));
    }

    public static int footballPoints(int a, int b, int c){
        int result = a * 3 + b;
        return result;
    }
}

class f4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(divisibleByFive(a));
    }
    public static boolean divisibleByFive(int a){
        boolean result = false;
        if (a % 5 == 0)
            result = true;
        return result;
    }
}

class f5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean a = in.nextBoolean();
        boolean b = in.nextBoolean();
        System.out.println(and(a, b));
    }

    public static boolean and(boolean a, boolean b){
        boolean result = false;
        if (a && b == true)
            result = true;
        return result;
    }
}

class f6{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            System.out.println(howManyWalls(a, b, c));
        }

        public static int howManyWalls(int a, int b, int c){
            int result;
            int S = b * c;
            result = a / S;
            return result;
        }
}

class f7{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(squared(a));
    }

    public static int squared(int a){
        return a * a;
    }
}

class f8{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(profitableGamble(a, b, c));
    }

    public static boolean profitableGamble(float a, int b, int c){
        boolean result = false;
        if (a * b - c > 0)
            result = true;
        return result;
    }
}

class f9{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(profitableGamble(a, b));
    }

    public static int profitableGamble(int a, int b){
        int result = a * 60 * b;
        return result;
    }
}

class f10{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(mod(a, b));
    }

    public static int mod(int a, int b){
        int result = a;
        while (result >= b){
            result = result - b;
        }

        //int result = a/b;
        //result = a - result*b;
        return result;
    }
}