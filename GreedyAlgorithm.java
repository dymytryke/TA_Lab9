import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class GreedyAlgorithm {
    static class Job implements Comparable<Job> {
        int id;
        int deadline;
        int profit;
        @Override
        public int compareTo(Job otherJob) {
            return otherJob.profit - this.profit;
        }
        public Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    private void printJobSequence(ArrayList<Job> jobs, int size) {
        Boolean[] slots = new Boolean[size];
        Arrays.fill(slots, false);
        int result[] = new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = jobs.get(i).deadline - 1; j >= 0; j--) {
                if (!slots[j]) {
                    result[j] = i;
                    slots[j] = true;
                    break;
                }
            }
        }
        int ans=0;
        for (int i = 0; i < jobs.size(); i++) {
            if (slots[i]) {
                ans += jobs.get(result[i]).profit;
                System.out.println("Task id: " + jobs.get(result[i]).id +
                        ". Task deadline: " + jobs.get(result[i]).deadline);
            }
        }
        System.out.println(ans);
    }

    public void doAlgorithm(ArrayList<Job> jobs) {
        Collections.sort(jobs);
        printJobSequence(jobs, jobs.size());
    }
}
