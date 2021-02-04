package com.company;
import java.util.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
class f1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.println(hiddenAnagram(a,b));
    }
    public static String hiddenAnagram(String s1, String s2){
        s1 = s1.strip().toLowerCase().replaceAll("[^a-z]", "");
        s2 = s2.strip().toLowerCase();
        String res = "";
        List<String> s2List = new ArrayList<>(Arrays.asList(s2.split("")));

        int i = 0;
        while (s2List.size() > 0 && i<s1.length()){
            if(s2List.contains(Character.toString(s1.charAt(i)))){
                res+=s1.charAt(i);
                s2List.remove(s2List.indexOf(Character.toString(s1.charAt(i))));
            }
            i++;
        }
        return res;
    }
}

class f2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int b = in.nextInt();
        for (int i = 0; i<collect(a,b).length;i++){
            System.out.println(collect(a,b)[i]);
        }

    }
    public static String [] collect(String a, int b){
        int size = a.length()/b;//размер слов
        String [] arr = new String[size];//создание массива с заданной длиной
        List<String> list = new ArrayList<>();//лист
        for(int i = b; i<a.length();i+=b){
            list.add(a.substring((i-b), i));//обрезаем слова и добавляем их в лист
        }
        int j = 0;
        for(String s: list){
            arr[j] = s;
            j++;
        }
        Arrays.sort(arr);
        return arr;
    }
}

class f3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.println(nicoCipher(a,b));
    }
    public static String nicoCipher(String message, String key){
        int messagelen = message.length();//длина 1
        int keylen = key.length();//длина 2
        int r = (messagelen-messagelen%keylen)/keylen;
        if (messagelen%keylen != 0) {
            r++;
        }
        for (int i = messagelen; i < r*keylen; i++) {
            message += " ";
        }
        char[][][] v = new char[r][keylen][2];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < keylen; j++) {
                v[i][j][0] = message.charAt(i*keylen+j);
                v[i][j][1] = key.charAt(j);
            }
            Arrays.sort(v[i], (a,b) ->(int) a[1] - (int) b[1]);
        }
        String result = "";
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < keylen; j++) {
                result += v[i][j][0];
            }
        }
        return result;
    }
}

class f4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int [] myArray = new int[a];//создание массива с длинной length
        for(int i=0; i<a; i++ ){
            myArray[i] = in.nextInt();
        }
        int b = in.nextInt();


        System.out.println(Arrays.toString(twoProduct(myArray,b)));


    }
    public static int[] twoProduct(int[] a, int b) {
        int[] res = new int[2];
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] * a[j] == b) {//проверка массива
                    res[0] = a[j];//
                    res[1] = a[i];
                    return res;
                }
            }
        }
        return res;
    }
}

class f5{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(Arrays.toString(isExact(a)));
    }
    public static int[] isExact(int x1){
        int i = 0;
        int res = calculateFactorial (i);
        int[] resses = new int[2];
        while (x1 > res) {
            i++;
            res = calculateFactorial(i);
            if(x1 == res){
                resses[0] = res;
                resses[1] = i;
                return resses;
            }
        }
        return resses;
    }
    static int calculateFactorial(int i){
        int result = 1;
        for (int n = 1; n <=i; n ++){
            result = result*n;
        }
        return result;
    }

}
