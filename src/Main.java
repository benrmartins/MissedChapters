public class Main {

    public static int missedLectures(int numChapters,int b,int e) {

        int num = e - b + 1;
        
        return Math.min(num,numChapters);

    }

    public static void main(String[] args) {
        System.out.println(missedLectures(5,5,6));//2
    }
}