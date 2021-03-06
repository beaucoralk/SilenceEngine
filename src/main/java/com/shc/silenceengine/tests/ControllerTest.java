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

package com.shc.silenceengine.tests;

import com.shc.silenceengine.core.Display;
import com.shc.silenceengine.core.Game;
import com.shc.silenceengine.input.Controller;
import com.shc.silenceengine.input.Keyboard;
import com.shc.silenceengine.utils.Logger;

/**
 * @author Sri Harsha Chilakapati
 */
public class ControllerTest extends Game
{
    public static void main(String[] args)
    {
        new ControllerTest().start();
    }

    @Override
    public void init()
    {
        if (Controller.getConnectedControllers().length == 0)
        {
            Logger.warn("Error, no controller detected!");
            Game.end();
        }

        // Print information of all the controllers
        for (Controller controller : Controller.getConnectedControllers())
        {
            System.out.println("ID: " + controller.getId());
            System.out.println("Name: " + controller.getName());
            System.out.println("Type: " + controller.getType());
            System.out.println("Num axes: " + controller.getNumAxes());
            System.out.println("Num buttons: " + controller.getNumButtons());
        }
    }

    @Override
    public void update(float delta)
    {
        if (Keyboard.isClicked(Keyboard.KEY_ESCAPE))
            Game.end();

        if (Controller.getConnectedControllers().length != 0)
            Controller.getConnectedControllers()[0].printValues();

        Display.setTitle("UPS: " + getUPS() + " | FPS: " + getFPS());
    }
}
