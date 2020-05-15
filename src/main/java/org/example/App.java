package org.example;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public void sayHello() {
        Random random = new Random();
        int number = random.nextInt(5);

        String[] firstname = {"luu", "pham", "tran", "nguyen", "quach"};
        String[] sirname = {"thi", "thi minh", "hong", "phuong", "van"};
        String[] lastname = {"thuy", "nhung", "thao", "hoa", "ly"};
        ArrayList<String> listUser = new ArrayList<String>();

        for (int i = 0; i < 50; i++) {
            String fullname = firstname[random.nextInt(firstname.length)] + " " +
                    sirname[random.nextInt(sirname.length)] + " " +
                    lastname[random.nextInt(lastname.length)];
            listUser.add(fullname);
        }
        int i = 1;
        for (String s : listUser) {
            System.out.println(i + ") " + s);
            i = i + 1;
        }
    }

    public void sum() {
        int i = 0;
        int sum = 0;
        while (i <= 100) {
            sum = sum + i;
            i = i + 2;
        }
        System.out.println(sum);
    }

    public static boolean isNguyenTo(int n) {
        boolean result = true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public void fibo(){
        ArrayList<Integer> listFB = new ArrayList<>();
        listFB.add(1);
        listFB.add(2);
        for(int i = 2; i< 10; i++){
            listFB.add(listFB.get(i - 2) + listFB.get(i - 1));
        }
        System.out.println(listFB);
    }

    // debug
    public static int getResult(String formula)
    {
        int total = 0;
        char sign = ' ';
        for(int i=0; i< formula.length(); i++)
        {
            if(formula.charAt(i)=='+' || formula.charAt(i)=='-')
            {
                sign = formula.charAt(i);
            }
            else
            {
                if(sign== ' ')
                {
                    total = Integer.parseInt(String.valueOf(formula.charAt(i)));
                }
                else
                {
                    if(sign == '-')
                    {
                        total-= Integer.parseInt(String.valueOf(formula.charAt(i)));
                    }
                    else
                    {
                        total += Integer.parseInt(String.valueOf(formula.charAt(i)));
                    }
                }
            }
        }
        return total;
    }

    // debug
    public int tinhGiaiThua(int n){
        int gt = 0;
        for(int i = 1; i<=n; i++){
            gt*=i;
        }
        return gt;
    }

    public static int sumSoChan(int[] a){
        int sum = 0;
        for(int i=0; i< a.length; i++){
            if(a[i]%2 == 0 ){
                sum = sum + a[i];
            }
        }
        return sum;
    }












    public static void main(String[] args){
        (new App()).fibo();
    }
}
