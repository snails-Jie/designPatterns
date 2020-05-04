package zhangjie.designPatterns.behavior.template;

/**
 * Spring中对hibernate的支持
 * 使用 Game 的模板方法 play() 来演示游戏的定义方式
 * 优点
 *   1.封装不变部分，扩展可变部分。
 *   2.提取公共代码，便于维护。
 *   3.行为由父类控制，子类实现。
 * 缺点：
 *   1.每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大
 * @autor zhangjie
 * @date 2020/4/29 17:07
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
