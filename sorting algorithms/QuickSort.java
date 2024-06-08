class QuickSort {
    public static int partitionArray(int[] arr, int low, int high) {
        int pivot = arr[high]; // choosing pivot to be last element, can also be first, median or random element in array
        int i = low - 1;
        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int[] arr, int low, int high) {
        if(low >= high) return;
        int pidx = partitionArray(arr, low, high);
        quickSort(arr, low, pidx - 1);
        quickSort(arr, pidx + 1, high);
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 8, 9, 3};
        int n = arr.length;
        quickSort(arr, 0, n-1);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Time Complexity

// worst case O(n^2) -> this will occur if pivot element is either the largest or the smallest when array is already sorted in asc or desc order

// Average case O(nlog(n))