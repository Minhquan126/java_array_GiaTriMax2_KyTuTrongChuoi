package GiaTriLonThu2;

public class Max2 {
    public static void main(String[] args) {
        int max = 0;
        int fakeMax = 0;
        int[] list = {2,4,5,3,9};
        for (int i = 0; i < 5; i++) {
            if (max < list[i]) {
                fakeMax = max;
                max = list[i];
            }
        }
        System.out.println("fake Max ;" + fakeMax);
    }
    }

