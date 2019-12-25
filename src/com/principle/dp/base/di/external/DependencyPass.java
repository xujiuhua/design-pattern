package com.principle.dp.base.di.external;

/**
 * <p> 依赖的传递方式 </p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class DependencyPass {

    public static void main(String[] args) {
//        IOpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(new ChangHong());

//        ChangHong changHong = new ChangHong();
//        IOpenAndClose openAndClose = new OpenAndClose(changHong);
//        openAndClose.open();

//        ChangHong changHong = new ChangHong();
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.setTv(changHong);
//        openAndClose.open();

    }

}

/**
 * 方式1：通过接口传递实现依赖
 */
//interface IOpenAndClose {
//    void open(ITV tv);
//}
//
//interface ITV {
//    void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//}

class ChangHong implements ITV {

    @Override
    public void play() {
        System.out.println("长虹电视打开了!");
    }
}


/**
 * 方式2: 通过构造方法依赖传递
 */
interface IOpenAndClose {
    void open();
}

interface ITV {
    void play();
}

//class OpenAndClose implements IOpenAndClose {
//
//    public ITV tv;
//
//    public OpenAndClose(ITV tv) {
//        this.tv = tv;
//    }
//
//    @Override
//    public void open() {
//        tv.play();
//    }
//}

class OpenAndClose implements IOpenAndClose {

    public ITV tv;

    public void setTv(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        tv.play();
    }
}

