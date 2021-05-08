package principle.dependencyInversion;

/**
 * @author: ljf
 * @create: 2021/5/8 17:08
 * @description: 通过接口实现依赖传递
 **/
public class DependencyInversion02 {


    public static void main(String[] args) {
        // 方式一 通过接口实现依赖传递
//        ChangHong changHong = new ChangHong();
//        OpenOrCloseTVImpl openOrCloseTV = new OpenOrCloseTVImpl();
//        openOrCloseTV.open(changHong);

        // 方式二 通过构造方法实现依赖传递
//        ChangHong changHong = new ChangHong();
//        OpenOrCloseTVImpl openOrCloseTV = new OpenOrCloseTVImpl(changHong);
//        openOrCloseTV.open();

        // 方式三 通过set方法实现依赖传递
        ChangHong changHong = new ChangHong();
        OpenOrCloseTVImpl openOrCloseTV = new OpenOrCloseTVImpl();
        openOrCloseTV.setTv(changHong);
        openOrCloseTV.open();
    }
}
// 方式一 通过接口实现依赖传递
//interface OpenOrCloseTV {
//    void open(Tv tv);
//}
//
//interface Tv {
//    void play();
//}
//
//class OpenOrCloseTVImpl implements OpenOrCloseTV {
//
//    @Override
//    public void open(Tv tv) {
//        tv.play();
//    }
//}
//
//class ChangHong implements Tv {
//
//    @Override
//    public void play() {
//        System.out.println("长虹电视机 打开");
//    }
//}

// 方式二 通过构造方法实现依赖传递
//interface OpenOrCloseTV {
//    void open();
//}
//
//interface Tv {
//    void play();
//}
//
//class OpenOrCloseTVImpl implements OpenOrCloseTV {
//    private Tv tv;
//
//    public OpenOrCloseTVImpl(Tv tv) {
//        this.tv = tv;
//    }
//
//    @Override
//    public void open() {
//        tv.play();
//    }
//}
//
//class ChangHong implements Tv {
//
//    @Override
//    public void play() {
//        System.out.println("长虹电视机 打开");
//    }
//}


// 方式三 通过set方法实现依赖传递
interface OpenOrCloseTV {
    void open();
}

interface Tv {
    void play();
}

class OpenOrCloseTVImpl implements OpenOrCloseTV {
    private Tv tv;

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        tv.play();
    }
}

class ChangHong implements Tv {

    @Override
    public void play() {
        System.out.println("长虹电视机 打开");
    }
}