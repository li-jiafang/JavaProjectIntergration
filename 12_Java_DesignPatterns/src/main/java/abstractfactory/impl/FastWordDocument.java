package abstractfactory.impl;

import abstractfactory.WordDocument;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author: ljf
 * @create: 2021/5/7 14:15
 * @description:
 **/
public class FastWordDocument implements WordDocument {
    @Override
    public void save(Path path) throws IOException {

    }
}
