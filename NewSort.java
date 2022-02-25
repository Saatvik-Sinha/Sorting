public class NewSort {
    void sort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int t = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > t){
                arr[j+1] = arr[j];
                j -= 1;
            }
            arr[j+1] = t;
        }
    }
    public static void main(String args[]){
        NewSort obj = new NewSort();
        int a[] = {5, 2, 9, 8, 1, 4, 7};
        System.out.print("Original array: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        obj.sort(a);
        System.out.print("Sorted array: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}