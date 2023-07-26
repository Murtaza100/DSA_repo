public class MergeSort {
    public void mergeSort(int[] a, int l, int r) {
        if(l<r) {
            int mid = (l+r)/2;
            mergeSort(a, l, mid);
            mergeSort(a, mid+1, r);
            merge(a,l,mid,r);
        }
        
    }
    public void merge(int[] a, int l, int mid, int r) {
        int[] b = new int[r-l+1];
        int i = l, j = mid+1, k=0;
        while(i<=mid && j<=r) {
            if(a[i]>a[j]) {
                b[k] = a[j];
                j++;
            }
            else {
                b[k] = a[i];
                i++;
            }
            k++;
        }
        if(i>mid) {
            while(j<=r)
                b[k++] = a[j++];
        }
        else {
            while(i<=mid)
                b[k++] = a[i++];
        }
        for(int m=0,n=l; m<b.length; m++,n++) {
            a[n] = b[m];
        }
    }
}
