package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to40then4() {
        double expected = 4;
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to34then2dot82() {
        double expected = 2.82;
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to45then4dot24() {
        double expected = 4.24;
        Point a = new Point(1, 2);
        Point b = new Point(4, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when123to456then5dot19() {
        double expected = 5.19;
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}