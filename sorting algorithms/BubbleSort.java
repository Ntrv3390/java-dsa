class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    // swap the numbers
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 16, 8, 4};
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }    
}
