package com.github.perfectstorms.life4j.types;

import org.junit.Assert;
import org.junit.Test;

public class DeadCellTest {

    @Test
    public void isLive() {
        Assert.assertFalse(new DeadCell().isLive());
    }
}