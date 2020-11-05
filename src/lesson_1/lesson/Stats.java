package lesson_1.lesson;

public class Stats<T extends Number> {
    private T[] nums;

    public Stats(T[] nums){
        this.nums = nums;
    }

    public double avg(){
        double sum = 0.0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i].doubleValue(); // нельзя использовать метод doubleValue, так как в этом классе можно использовать любой тип даже String
                                        // но можно ограничить сверху по Numbers при помощи extends и все методы как для Numbers станут доступны
        }
        return sum / nums.length;
    }

    public boolean sameAvg(Stats<?> another){
        return Math.abs(this.avg() - another.avg()) < 0.0001;
    }
}
