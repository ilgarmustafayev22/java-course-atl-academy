package lesson01;

public class Snake {
    public int length;
    public  String name;

    public Snake(int len, String name){
        this.length=len;
        this.name=name;
    }
    public String voice(){
        return "tsss";
    }
}
