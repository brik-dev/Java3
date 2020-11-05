package lesson_1.lesson;

public class BoxInt {
    private Integer obj;

    public BoxInt(Integer obj) {
        this.obj = obj;
    }

    public Integer getObj() {
        return obj;
    }

    public void setObj(Integer obj){
        this.obj = obj;
    }

    public void info(){
        System.out.println("type " + obj.getClass() + " " + obj);
    }
}
