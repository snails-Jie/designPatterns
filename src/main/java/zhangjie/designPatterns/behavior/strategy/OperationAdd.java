package zhangjie.designPatterns.behavior.strategy;

/**
 * @autor zhangjie
 * @date 2020/4/29 16:20
 */

public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
