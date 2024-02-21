public class AP1 {

    public boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean scores100(int[] scores) {
        int count = 0;
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100) {
                count++;
            }
        }
        return count > 0;
    }

    public boolean scoresClump(int[] scores) {
        int count = 0;
        for (int i = 0; i < scores.length - 2; i++) {
            if (scores[i + 2] - scores[i] <= 2) {
                count++;
            }
        }
        return count > 0;
    }

    public static void main(String[] args) {

    }
}
