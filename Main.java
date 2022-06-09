import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DynamicProgramming dp = new DynamicProgramming();

        double startTime = System.nanoTime();
        System.out.println(dp.factorialRecursive(14));
        System.out.println("Ms: " + (System.nanoTime() - startTime)/100000);

        startTime=System.nanoTime();
        System.out.println(dp.factorialDP(14));
        System.out.println("Ms: " + (System.nanoTime() - startTime)/100000);

        startTime=System.nanoTime();
        System.out.println(dp.fibonacciRecursive(15));
        System.out.println("Ms: " + (System.nanoTime() - startTime)/100000);

        startTime=System.nanoTime();
        System.out.println(dp.fibonacciDP(15));
        System.out.println("Ms: " + (System.nanoTime() - startTime)/100000);

        startTime=System.nanoTime();
        System.out.println(dp.combinationsRecursive(10, 100));
        System.out.println("Ms: " + (System.nanoTime() - startTime)/100000);

        startTime=System.nanoTime();
        System.out.println(dp.combinationDP(10, 100));
        System.out.println("Ms: " + (System.nanoTime() - startTime)/100000);

        GreedyAlgorithm profitProblem = new GreedyAlgorithm();

        ArrayList<GreedyAlgorithm.Job> jobs = new ArrayList<>();
        jobs.add(new GreedyAlgorithm.Job(1,4,100));
        jobs.add(new GreedyAlgorithm.Job(2,2,50));
        jobs.add(new GreedyAlgorithm.Job(3,4,100));
        jobs.add(new GreedyAlgorithm.Job(4,1,120));
        jobs.add(new GreedyAlgorithm.Job(5,7,240));
        jobs.add(new GreedyAlgorithm.Job(6,7,180));
        jobs.add(new GreedyAlgorithm.Job(7,1,150));;
        profitProblem.doAlgorithm(jobs);


    }


}
