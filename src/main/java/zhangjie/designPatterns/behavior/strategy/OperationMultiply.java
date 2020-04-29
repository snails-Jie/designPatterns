package zhangjie.designPatterns.behavior.strategy;

/**
 * @autor zhangjie
 * @date 2020/4/29 16:21
 */

public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
