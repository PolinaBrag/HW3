public class average {
    public static void main(String[] args) {
        int[] numbers = {2,5,13,7,6,4};
        int i = 0;
        double sum = 0;
        while (i < numbers.length){
            sum += numbers[i];
            i++;
        }
        double average = sum/numbers.length;
        System.out.print(average);
    }
}
