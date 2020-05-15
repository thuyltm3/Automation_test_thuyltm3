package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void check_fibo() {
        int[] a = {1, 2, 3, 44, 5, 6};
        Assert.assertEquals(52, App.sumSoChan(a));
    }
}
