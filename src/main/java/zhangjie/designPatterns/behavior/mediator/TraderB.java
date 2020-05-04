package zhangjie.designPatterns.behavior.mediator;

public class TraderB extends Trader {

    public TraderB(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void getMessage(String message){
        System.out.println("房东B"+name+"获得信息："+message);
    }
    //房东B与中介者通信
    public void contact(String message){
        mediator.contact(message, this);
    }
}
