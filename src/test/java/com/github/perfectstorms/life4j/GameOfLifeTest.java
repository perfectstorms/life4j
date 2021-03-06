package com.github.perfectstorms.life4j;

import org.junit.Assert;
import org.junit.Test;

public class GameOfLifeTest {

    private GameOfLife game = new GameOfLife(3, 3);

    @Test
    public void fill() {
    }

    @Test
    public void fill1() {
    }

    @Test
    public void start() {
        // given
        game.start();

        // assert
        Assert.assertTrue(game.isState());
    }

    @Test
    public void update() {
    }

    @Test
    public void pause() {
        // given
        game.pause();

        // assert
        Assert.assertFalse(game.isState());
    }

    @Test
    public void resume() {
        // given
        game.pause();
        game.resume();

        // assert
        Assert.assertTrue(game.isState());
    }

    @Test
    public void reset() {
        // excepted
        Cell[][] cells = {
                {null, null, null},
                {null, null, null},
                {null, null, null},
        };

        // given
        game.fill();
    }

    @Test
    public void read() {
    }

    @Test
    public void read1() {
    }

    @Test
    public void write() {
    }

    @Test
    public void write1() {
    }

    @Test
    public void generate() {
    }

    @Test
    public void getNeighborsCount() {
    }

    @Test
    public void generateNextEpoch() {
    }

    @Test
    public void clear() {
        // excepted
        Cell[][] expected = {
                {game.getDead(), game.getDead(), game.getDead()},
                {game.getDead(), game.getDead(), game.getDead()},
                {game.getDead(), game.getDead(), game.getDead()},
        };

        // given
        game.clear();

        // assert
        Assert.assertArrayEquals(expected, game.getCells()[0]);
    }

    @Test
    public void display() {
    }

    @Test
    public void getCells() {
    }

    @Test
    public void setCells() {
    }
}
