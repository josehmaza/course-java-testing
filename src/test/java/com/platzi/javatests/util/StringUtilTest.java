package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_string_once() {
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_multiple_times(){
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_zero_times(){
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }
    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times(){
         StringUtil.repeat("hola", -2);
    }

    @Test
    public void str_not_empty(){
        String str = "anything";

        boolean resultado = StringUtil.isEmpty(str);

        Assert.assertFalse(resultado);
    }
    @Test
    public void str_empty(){
        String str = "";

        boolean resultado =  StringUtil.isEmpty(str);

        Assert.assertTrue(resultado);
    }

    @Test
    public void str_is_null(){
        String str = null;

        boolean resultado = StringUtil.isEmpty(str);

        Assert.assertTrue(resultado);
    }
    @Test
    public void str_with_only_spaces(){
        String str = "      ";

        boolean resultado = StringUtil.isEmpty(str);

        System.out.println("   ".trim().length());
        Assert.assertTrue(resultado);
    }
}