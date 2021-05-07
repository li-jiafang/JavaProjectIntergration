package abstractfactory.impl;

import abstractfactory.HtmlDocument;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author: ljf
 * @create: 2021/5/7 14:14
 * @description:
 **/
public class FastHtmlDocument implements HtmlDocument {
    @Override
    public String toHtml() {
        return null;
    }

    @Override
    public void save(Path path) throws IOException {

    }
}
