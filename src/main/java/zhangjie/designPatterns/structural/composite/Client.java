package zhangjie.designPatterns.structural.composite;

/**
 * 由于容器对象和叶子对象在功能上面的区别，使用时必须区分
 * -->组合模式设计动机：定义如何将容器对象和叶子对象进行递归组合
 * 1. 叶子对象和组合对象实现相同的接口
 *    --> 这就是组合模式能够将叶子节点和对象节点进行一致处理的原因
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 我们先建立一个这样的文件系统
         *                  总文件
         *
         *   a.txt    b.jpg                   c文件夹
         *                         c_1.text  c_1.rmvb  c_1.jpg
         *
         */
        //总文件夹
        Folder zwjj = new Folder("总文件夹");
        //向总文件夹中放入三个文件：1.txt、2.jpg、1文件夹
        TextFile aText= new TextFile("a.txt");
        ImagerFile bImager = new ImagerFile("b.jpg");
        Folder cFolder = new Folder("C文件夹");

        zwjj.add(aText);
        zwjj.add(bImager);
        zwjj.add(cFolder);

        //向C文件夹中添加文件：c_1.txt、c_1.rmvb、c_1.jpg
        TextFile cText = new TextFile("c_1.txt");
        ImagerFile cImage = new ImagerFile("c_1.jpg");
        VideoFile cVideo = new VideoFile("c_1.rmvb");

        cFolder.add(cText);
        cFolder.add(cImage);
        cFolder.add(cVideo);

        //遍历C文件夹
        cFolder.display();
        //将c_1.txt删除
        cFolder.remove(cText);
        System.out.println("-----------------------");
        cFolder.display();
    }

}
