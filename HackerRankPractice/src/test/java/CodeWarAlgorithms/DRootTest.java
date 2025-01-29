package com.java.CodeWarAlgorithms;


import org.junit.Assert;
import org.junit.Test;

public class DRootTest {


    @Test
    public void Test1() {
        Assert.assertEquals( "Nope!" , 7, DRoot.digital_root(16));
    }
    @Test
    public void Test2() {
        Assert.assertEquals( "Nope!" , 6, DRoot.digital_root(456));
    }

}