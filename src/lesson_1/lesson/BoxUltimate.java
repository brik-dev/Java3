package lesson_1.lesson;

public class BoxUltimate<T> {   //"T" используется здесь в виде параметра от Type, но может быть использована любая другая буква
    private T obj;              // Вместо Т во время создания объекта можно использовать любой тип/класс объекта

    public BoxUltimate (T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj){
        this.obj = obj;
    }

    public void info(){
        System.out.println("type " + obj.getClass() + " " + obj);
    }


}
