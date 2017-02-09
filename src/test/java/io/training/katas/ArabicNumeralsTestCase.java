package io.training.katas;


import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ArabicNumeralsTestCase {


    @Test
    public void should_return_1_given_I() {
        Assertions.assertThat(ArabicNumerals.convertToRomanNumeral("I")).isEqualTo(1);
    }

    @Test
    public void should_return_2_given_II() {
        Assertions.assertThat(ArabicNumerals.convertToRomanNumeral("II")).isEqualTo(2);
    }


    @Test
    public void should_return_3_given_III() {
        Assertions.assertThat(ArabicNumerals.convertToRomanNumeral("III")).isEqualTo(3);
    }


}
