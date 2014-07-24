package com.brandwatch.pgqconsumer;


import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class PGQConsumerTest {

    @Test
    public void failingTest() {
        int i = 3;
        Assert.assertThat(i, CoreMatchers.is(5));
    }

}
