package zhangjie.designPatterns.behavior.mediator;

/**
 * 定义抽象交易者Trader
 * @autor zhangjie
 * @date 2020/4/29 17:14
 */
public class Trader {
    protected String name;
    protected Mediator mediator;

    public Trader(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
