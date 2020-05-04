package zhangjie.designPatterns.behavior.mediator;

/**
 * @autor zhangjie
 * @date 2020/4/29 17:16
 */
public class TraderA extends Trader {

    // 具体同事类继承自Trader,此刻就可以与中介者mediator进行通信了
    public TraderA(String name, Mediator mediator) {
        super(name, mediator);
    }
    public void getMessage(String message){
        System.out.println("租客A"+name+"获得信息："+message);
    }
    //租客A与中介者通信
    public void contact(String message){
        mediator.contact(message, this);
    }
}
