/*
 * Copyright (c) 2017-2018 PlayerOne.
 *
 * The MIT License
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
package io.plactal.ultraincommander.data.remote.model.types;

/**
 * Created by swapnibble on 2018-05-17.
 */
public class TypeWaitWeight implements UltrainType.Packer {
    private int    mWaitSec; // uint32_t
    private short  mWeight;

    public TypeWaitWeight( long uint32WaitSec, int uint16Weight){
        mWaitSec= (int)( uint32WaitSec & 0xFFFFFFFF );
        mWeight = (short)( uint16Weight & 0xFFFF );
    }

    @Override
    public void pack(UltrainType.Writer writer) {
        writer.putIntLE( mWaitSec );
        writer.putShortLE( mWeight);
    }
}
