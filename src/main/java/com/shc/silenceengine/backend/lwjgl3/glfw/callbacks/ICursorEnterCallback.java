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

package com.shc.silenceengine.backend.lwjgl3.glfw.callbacks;

import com.shc.silenceengine.backend.lwjgl3.glfw.Window;

/**
 * Functional Interface describing the signature of the <code>GLFWcursorenterfun</code> in Java 8 environment. To set a
 * character enter callback on a window, use the function <code>setCursorEnterCallback()</code> on a <code>Window</code>
 * object.
 *
 * @author Sri Harsha Chilakapati
 */
@FunctionalInterface
public interface ICursorEnterCallback
{
    /**
     * The signature of the <code>GLFWcursorenterfun</code> method. This method is invoked by GLFW to notify the whether
     * the cursor entered or left the window.
     *
     * @param window  The Window that received the event.
     * @param entered True if the cursor entered the window client area, or false if it left it.
     */
    void invoke(Window window, boolean entered);
}
