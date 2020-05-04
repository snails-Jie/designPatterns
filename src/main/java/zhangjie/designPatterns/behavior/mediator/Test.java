package zhangjie.designPatterns.behavior.mediator;

/**
 * 1.MVC框架，其中C（控制器）就是M（模型）和V（视图）的中介者
 * 2.优点：降低类的复杂度，将一对多转换成一对一
 * 3.注意事项：不应当在职业混乱的时候使用
 */
public class Test {
    public static void main(String[] args) {
        // 定义中介者
        ConcreteMediator mediator = new ConcreteMediator();
        // 定义具体交易者
        TraderA traderA = new TraderA("张三", mediator);
        TraderB traderB = new TraderB("李四", mediator);
        // 中介者知晓每一个具体的交易者
        mediator.setTraderA(traderA);
        mediator.setTraderB(traderB);
        traderA.contact("我是租客，3000太贵了，能便宜500不？");
        traderB.contact("我是房东，底价2800，不能再少了！");
    }

}
