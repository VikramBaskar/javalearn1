// 

class Program1 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 10, 20, 30, 10, 50, 10, 20};
        int[] frq = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (frq[i] == -1) {
                continue;
            }
           // int no = arr[i];
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    frq[j] = -1;
                }
            }
             frq[i] = count;
        }

        int countOfDup = 0;
        System.out.println("Duplicate elements:");
        for (int i = 0; i < frq.length; i++) {
            if (frq[i] > 1) {
                System.out.println(arr[i] + " -> " + frq[i] + " times");
                countOfDup++;
            }
        }
        System.out.println("Total number of duplicate elements: " + countOfDup);
    }
}
