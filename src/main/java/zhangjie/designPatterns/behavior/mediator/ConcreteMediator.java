package zhangjie.designPatterns.behavior.mediator;

/**
 * 定义具体中介者ConcreteMediator,具体中介者通过协调租客和房东方实现协作行为，了解并维护它的各个交易方
 */
public class

ConcreteMediator extends Mediator {

    TraderA traderA;
    TraderB traderB;

    public void setTraderA(TraderA traderA) {
        this.traderA = traderA;
    }

    public void setTraderB(TraderB traderB) {
        this.traderB = traderB;
    }

    @Override
    public void contact(String content, Trader trader) {
        if (trader==traderA) {
            traderB.getMessage(content);
        } else {
            traderA.getMessage(content);
        }
    }
}
