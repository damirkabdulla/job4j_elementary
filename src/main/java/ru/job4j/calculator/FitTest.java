package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan184Then96point6() {
        short in = 184;
        double expected = 96.6;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
        }

        @Test
    public void whenWoman165Then63point249() {
        short in = 165;
        double expected = 63.249;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
