package zhangjie.designPatterns.behavior.mediator;

/**
 * 定义抽象Mediator,可以与买家和卖家进行联络
 * @autor zhangjie
 * @date 2020/4/29 17:13
 */
public abstract class Mediator {
    public abstract void contact(String content,Trader trader);
}
