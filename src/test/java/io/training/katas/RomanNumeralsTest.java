package io.training.katas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Michelle on 21/01/2017.
 */
public class RomanNumeralsTest {

    @Test
    public void should_return_I_given_number_1(){
        assertThat(RomanNumeral.converFromArabic(1)).isEqualTo("I");
    }

    @Test
    public void should_return_V_given_number_5(){
        assertThat(RomanNumeral.converFromArabic(5)).isEqualTo("V");
    }

    @Test
    public void should_return_X_given_number_10(){
        assertThat(RomanNumeral.converFromArabic(10)).isEqualTo("X");
    }

    @Test
    public void should_return_L_given_number_50(){
        assertThat(RomanNumeral.converFromArabic(50)).isEqualTo("L");
    }

    @Test
    public void should_return_C_given_number_100(){
        assertThat(RomanNumeral.converFromArabic(100)).isEqualTo("C");
    }

    @Test
    public void should_return_D_given_number_500(){
        assertThat(RomanNumeral.converFromArabic(500)).isEqualTo("D");
    }

    @Test
    public void should_return_M_given_number_1000(){
        assertThat(RomanNumeral.converFromArabic(1000)).isEqualTo("M");
    }

    @Test
    public void should_return_II_given_number_2(){
        assertThat(RomanNumeral.converFromArabic(2)).isEqualTo("II");
    }


    @Test
    public void should_return_III_given_number_3(){
        assertThat(RomanNumeral.converFromArabic(3)).isEqualTo("III");
    }

    @Test
    public void should_return_VI_given_number_6(){
        assertThat(RomanNumeral.converFromArabic(6)).isEqualTo("VI");
    }

    @Test
    public void should_return_VII_given_number_7(){
        assertThat(RomanNumeral.converFromArabic(7)).isEqualTo("VII");
    }


    @Test
    public void should_return_XI_given_number_11(){
        assertThat(RomanNumeral.converFromArabic(11)).isEqualTo("XI");
    }

    @Test
    public void should_return_XII_given_number_12(){
        assertThat(RomanNumeral.converFromArabic(12)).isEqualTo("XII");
    }
    @Test
    public void should_return_XVII_given_number_17(){
        assertThat(RomanNumeral.converFromArabic(17)).isEqualTo("XVII");
    }
    @Test
    public void should_return_MCLV_given_number_1155(){
        assertThat(RomanNumeral.converFromArabic(1155)).isEqualTo("MCLV");
    }

    @Test
    public void should_return_IV_given_number_4(){
        assertThat(RomanNumeral.converFromArabic(4)).isEqualTo("IV");
    }

    @Test
    public void should_return_IX_given_number_9(){
        assertThat(RomanNumeral.converFromArabic(9)).isEqualTo("IX");
    }
    @Test
    public void should_return_XL_given_number_40(){
        assertThat(RomanNumeral.converFromArabic(40)).isEqualTo("XL");
    }

    @Test
    public void should_return_XC_given_number_90(){
        assertThat(RomanNumeral.converFromArabic(90)).isEqualTo("XC");
    }

    @Test
    public void should_return_CD_given_number_400(){
        assertThat(RomanNumeral.converFromArabic(400)).isEqualTo("CD");
    }
    @Test
    public void should_return_CM_given_number_900(){
        assertThat(RomanNumeral.converFromArabic(900)).isEqualTo("CM");
    }

    @Test
    public void should_return_MMDCCLVII_given_number_2757(){
        assertThat(RomanNumeral.converFromArabic(2757)).isEqualTo("MMDCCLVII");
    }



}
