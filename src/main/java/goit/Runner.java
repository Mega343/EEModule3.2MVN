package goit;


import java.util.concurrent.ExecutionException;

public class Runner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] mas = {1,2,3,4,5,6,7,8,9,10};
        int numberOfThreads = 4;
        SquareSum squareSum = new SquareSumImpl();
        System.out.println(squareSum.getSquareSum(mas, numberOfThreads));
    }
}
