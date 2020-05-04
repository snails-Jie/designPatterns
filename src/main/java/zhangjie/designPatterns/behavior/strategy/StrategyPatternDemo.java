package zhangjie.designPatterns.behavior.strategy;

/**
 * 策略模式包含如下角色：
 * Context: 环境类
 * Strategy: 抽象策略类
 * ConcreteStrategy: 具体策略类
 * @autor zhangjie
 * @date 2020/4/29 16:23
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
