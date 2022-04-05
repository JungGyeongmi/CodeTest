package doitAlgorithm.page22;

public class Q4 {
    public static void main(String[] args) {

    }

    static int getMedInt(int a, int b, int c) {
        
        if (a >= b) {
            if (a > b) {
                if (b >= c) {
                    if (b > c) {
                        return b;
                    } else {
                        if (a > c) {
                            return c;
                        } else {
                            return a;
                        }
                    }
                }
            } else {
                if (b >= c) {
                    if (b > c) {
                        return b;
                    } else {
                        return a;
                    }
                }
            }
        } else {
            if (a >= c) {
                if (a > c) {
                    return a;
                } else {
                    return a;
                }
            } else {
                if (b >= c) {
                    if (b > c) {
                        return c;
                    } else {
                        return b;
                    }
                }
            }
        }

        return 0;
    }
}
