public class BubbleSort{
    void bubble(int a[]){
        int n = a.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        BubbleSort obj = new BubbleSort();
        int a[] = {5, 2, 9, 8, 1, 4, 7};
        System.out.print("Original array: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        obj.bubble(a);
        System.out.print("Sorted array: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}