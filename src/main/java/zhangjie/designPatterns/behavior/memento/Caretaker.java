package zhangjie.designPatterns.behavior.memento;

/**
 * 负责人：负责保存好备忘录，不能对备忘录的内容进行操作和访问
 *   -->只能将备忘录传递给其他对象
 */
public class Caretaker {
    Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
