class MergeSort {
    public static void mergeSort(int[] arr, int st, int en) {
        if(st >= en) return;
        int mid = st + (en - st) / 2;
        mergeSort(arr, st, mid);
        mergeSort(arr, mid + 1, en);
        merge(arr, st, mid, en);
    }
    public static void merge(int[] arr, int st, int mid, int en) {
        int[] merged = new int[(en - st) + 1];
        int i = st;
        int j = mid + 1;
        int x = 0;

        while(i <= mid && j <= en) {
            if(arr[i] < arr[j]) {
                merged[x++] = arr[i++];
            } else {
                merged[x++] = arr[j++];
            }
        }
        while(i <= mid) {
            merged[x++] = arr[i++];
        }
        while(j <= en) {
            merged[x++] = arr[j++];
        }
        for(i = st, j = 0; i <= en; i++, j++) {
            arr[i] = merged[j];
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 19, 6, 4, 8};
        int n = arr.length;
        mergeSort(arr, 0, n-1);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Worst case or median time complexity O(n(log(n))

// Extra array space used in merge sort hence quicksort is better in case of median complexity