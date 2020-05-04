package zhangjie.designPatterns.behavior.interpreter;

/**
 * 表达式接口
 */
public interface Expression {
    public boolean interpret(String context);
}
