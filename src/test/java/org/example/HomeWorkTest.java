package org.example;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class HomeWorkTest {

    // in phan tu xuat hien 1 lan trong mang
    @Test
    public void test_bai_1(){
        int[] inputArr= {1,2,4,5,3,1,5,7,10};
        int[] outputArr = {2,4,3,7,10};
        ArrayList<Integer> expected = new ArrayList<>();
        for (Integer item : outputArr) {
            expected.add(item);
        }
        Assert.assertEquals(expected, HomeWork.bai_1(inputArr));
    }

    // dem so phan tu bi trung nhau
    @Test
    public void test_bai_2(){
        int[] inputArr= {1,2,4,5,3,1,5,7,10};
        int expected=4;
        Assert.assertEquals(expected, HomeWork.bai_2(inputArr));
    }

    // cho so n, tim n so nguyen to dau tien
    @Test
    public void test_bai_3() {
        int n = 8;
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19};
        ArrayList<Integer> expected = new ArrayList<>();
        for (Integer item : arr) {
            expected.add(item);
        }
        Assert.assertEquals(expected, HomeWork.bai_3(n));
    }

    // tinh tong cac chu so cua so n
    @Test
    public void test_bai_4() {
        int n = 456;
        Assert.assertEquals(15, HomeWork.bai_4(n));
    }

    // phan tich n ra cac thua so nguyen to
    @Test
    public void test_bai_5() {
        int n = 28;
        String expected = n + " = 2*2*7";
        Assert.assertEquals(expected, HomeWork.bai_5(n));
    }

    // liet ke cac so fibo la so nguyen to nho hơn n
    @Test
    public void test_bai_6() {
        int n = 13;
        int[] arr = {2, 3, 5, 7, 11};
        ArrayList<Integer> expected = new ArrayList<>();
        for (Integer item : arr) {
            expected.add(item);
        }
        Assert.assertEquals(expected, HomeWork.bai_6(n));
    }
}
