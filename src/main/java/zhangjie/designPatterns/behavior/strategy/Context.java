package zhangjie.designPatterns.behavior.strategy;

/**
 * @autor zhangjie
 * @date 2020/4/29 16:23
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }

}
