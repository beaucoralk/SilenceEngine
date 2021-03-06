/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2015 Sri Harsha Chilakapati
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.shc.silenceengine.core;

/**
 * <p>A class which represents a game loop. A game loop is the heart of any game, and it takes care of the lifecycle of
 * the game, by emitting events such as update, render, etc., The default game loop is a fixed time step implementation.
 * If you want to have more control on your game loop, subclass from this, and use it to run your game.</p>
 *
 * <pre>
 *     new MyGame.start(new MyGameLoop());
 * </pre>
 *
 * @author Sri Harsha Chilakapati
 * @since 0.4.1b
 */
public abstract class GameLoop
{
    protected Game    game;
    protected boolean running;

    protected int ups;
    protected int fps;

    public abstract void start();

    public abstract void pause();

    public abstract void resume();

    public abstract void stop();

    public Game getGame()
    {
        return game;
    }

    /* package private */ void setGame(Game game)
    {
        this.game = game;
    }

    public boolean isRunning()
    {
        return running;
    }

    public int getUpdatesPerSecond()
    {
        return ups;
    }

    public int getFramesPerSecond()
    {
        return fps;
    }
}
