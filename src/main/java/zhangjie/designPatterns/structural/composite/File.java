package zhangjie.designPatterns.structural.composite;

/**
 * 文件类
 */
public abstract class File {
    String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void display();
}
