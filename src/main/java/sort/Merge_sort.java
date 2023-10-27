package sort;

public class Merge_sort {

    public static void main( String args[] ) {
        int[] arr = {6,99,8,3,78,56,31};

        mergeSort(arr);

        for(int i = 0;i<arr.length;i++) {
            System.out.println(arr[i]+" ");
        }
    }

    private static void mergeSort(int[] arr) {
        int length = arr.length;
        if(length<=1) {
            return;
        }

        int middle = length/2;
        int[] leftarr = new int[middle];
        int[] rightarr = new int[length-middle];


        int j = 0;

        for(int i = 0;i<length;i++) {
            if(i<middle) {
                leftarr[i] = arr[i];
            }else {
                rightarr[j]=arr[i];
                j++;
            }
        }
        mergeSort(leftarr);
        mergeSort(rightarr);
        merge(leftarr,rightarr,arr);

    }


    private static void merge(int []leftarr,int[]rightarr,int[] arr) {
        int leftSize = arr.length/2;
        int rightSize = arr.length-leftSize;
        int i =0,l=0,r=0;

        while(l<leftSize && r < rightSize ) {
            if(leftarr[l]<rightarr[r]) {
                arr[i] = leftarr[l];
                i++;
                l++;
            }
            else {
                arr[i] = rightarr[r];
                i++;
                r++;
            }
        }
        while(l<leftSize) {
            arr[i]=leftarr[l];
            i++;
            l++;

        }
        while(r<rightSize) {
            arr[i] = rightarr[r];
            i++;
            r++;

        }

    }
}
