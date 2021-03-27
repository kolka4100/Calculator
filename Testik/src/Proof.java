public class Proof {
    public boolean PCProof(String[] words, int p) {

        boolean a = false;

        String A[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        for (int proofa = 0; proofa < A.length; proofa++) {
            if (words[p].equals(A[proofa])) {
                a = true;
            }
        }
        return a;
    }
    public Proof(String[] words) {

        int error = 0;

        if (words.length != 3) {
            throw new IllegalArgumentException("Ошибка: введены некоректные данные.");
        }

        boolean check1 = PCProof(words, 0);
        boolean check2 = PCProof(words, 2);

        if (check1 && check2) {
            Arabic asum = new Arabic(words);
            error++;
        } else if (check1 || check2) {
            throw new IllegalArgumentException("Ошибка: введены некоректные данные.");
        } else {
            RomeC rsum = new RomeC(words);
            error++;
        }
    }
}


