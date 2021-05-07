package abstractfactory;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author: ljf
 * @create: 2021/5/7 14:06
 * @description:
 **/
public interface HtmlDocument {
    String toHtml();
    void save(Path path) throws IOException;
}
