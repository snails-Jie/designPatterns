package zhangjie.designPatterns.behavior.memento;

/**
 * 备忘录：存储原发器的部分或者所有的状态信息（不能被其他对象所访问）
 * --> 暴露了内部状态就违反了封装的原则
 * 备忘录是除了原发器外其他对象都是不可以访问的
 */
public class Memento {
    private int bloodFlow;
    private int magicPoint;

    public int getBloodFlow() {
        return bloodFlow;
    }

    public void setBloodFlow(int bloodFlow) {
        this.bloodFlow = bloodFlow;
    }

    public int getMagicPoint() {
        return magicPoint;
    }

    public void setMagicPoint(int magicPoint) {
        this.magicPoint = magicPoint;
    }

    public Memento(int bloodFlow,int magicPoint){
        this.bloodFlow = bloodFlow;
        this.magicPoint = magicPoint;
    }

}
