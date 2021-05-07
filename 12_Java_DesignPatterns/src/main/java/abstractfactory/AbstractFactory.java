package abstractfactory;

/**
 * @author: ljf
 * @create: 2021/5/7 14:06
 * @description:
 * 我们希望为用户提供一个Markdown文本转换为HTML和Word的服务
 *
 * 但是方法比较复杂,我们并不知道该怎么实现
 *
 *
 *
 * AbstractFactory 抽象工厂只是一个接口,没有任何实质性的代码
 * 同样的HtmlDocument和 WordDocument因为代码逻辑比较复杂,也不知道该如何实现他们,所以也只定义了接口
 *
 **/
public interface AbstractFactory {
    /**
     * 创建Html文档:
     * @param md
     * @return
     */
    HtmlDocument createHtml(String md);


    /**
     *  创建Word文档:
     * @param md
     * @return
     */
    WordDocument createWord(String md);
}
