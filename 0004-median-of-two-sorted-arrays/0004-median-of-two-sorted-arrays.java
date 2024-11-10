class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int a[]=new int[l1+l2];
        for(int i=0;i<l1;i++)
          a[i]=nums1[i];
        for(int i=0;i<l2;i++)
          a[l1+i]=nums2[i];
          Arrays.sort(a);
        if((l1+l2)%2==1)
            return (double)a[(l1+l2-1)/2];
        else{
            int mid=(l1+l2)/2;
            return (double) (a[mid]+a[mid-1])/2;
        }
}
}