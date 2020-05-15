package org.example;
import java.io.Serializable;
import java.util.ArrayList;

public class HomeWork {

    // dem so lan xuat hien cua n trong mang
    public static int countXuatHien(int[] a, int n){
        int count = 0;
        for (int value : a) {
            if (n == value) {
                count = count + 1;
            }
        }
        return count;
    }

    // in phan tu xuat hien 1 lan trong mang
    public static ArrayList<Integer> bai_1(int[] a){
        ArrayList<Integer> result = new ArrayList<>();
        for (int value : a) {
            if (countXuatHien(a, value) == 1) {
                result.add(value);
            }
        }
        return result;
    }

    // dem so phan tu bi trung nhau
    public static int bai_2(int[] a){
        int count=0;
        for (int value : a) {
            if (countXuatHien(a, value) > 1) {
                count++;
            }
        }
        return count;
    }

    // check 1 so co phai so nguyen to hay khong
    public static boolean isNguyenTo(int n) {
        if(n < 2){
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    // cho so n, tim n so nguyen to dau tien
    public static ArrayList<Integer> bai_3(int n){
        ArrayList<Integer> result = new ArrayList<>();
        int i = 2;
        int count = 0;
        while (count < n){
            if(isNguyenTo(i)){
                result.add(i);
                count = count + 1;
            }
            i = i + 1;
        }
        return result;
    }

    // tinh tong cac chu so cua so n
    public static int bai_4(int n){
        int sum = 0;
        String s = Integer.toString(n);
        for(int i = 0; i < s.length(); i++){
            sum = sum + Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return sum;
    }

    // phan tich n ra cac thua so nguyen to
    public static Serializable bai_5(int n){
        ArrayList<Integer> listResult = new ArrayList<>();
        if(n==1){
            return "N không phân tích được ra thừa số nguyên tố";
        }
        int i = 2;
        StringBuilder result = new StringBuilder(n + " = ");
        while(n>=2){
            if(n%i==0 && isNguyenTo(i)){
                listResult.add(i);
                n = n/i;
            } else {
                i=i+1;
            }
        }
        if(listResult.size() == 1){
            result.append(listResult.get(0));
        } else {
            for (int j=0; j<listResult.size()-1; j++) {
                result.append(listResult.get(j)).append("*");
            }
            result.append(listResult.get(listResult.size() - 1));
        }
        return result.toString();
    }

    // liet ke cac so fibo la so nguyen to nho hơn n
    public static ArrayList<Integer> bai_6(int n){
        ArrayList<Integer> listFB = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        listFB.add(1);
        listFB.add(2);
        int i = 2;
        while(i < n){
            listFB.add(listFB.get(i - 2) + listFB.get(i - 1));
            i++;
        }
        for(int j = 0; j < listFB.size(); j++){
            if(isNguyenTo(j)){
                result.add(j);
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] a = {1,2,4,1,1,4,3,5,6,7};
        System.out.println(HomeWork.bai_2(a));
    }
}
