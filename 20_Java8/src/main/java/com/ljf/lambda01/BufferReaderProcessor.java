package com.ljf.lambda01;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author: ljf
 * @create: 2021/4/29 14:59
 * @description:
 **/
public interface BufferReaderProcessor {

    String process(BufferedReader bufferedReader) throws IOException;
}
