class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length+nums2.length;
         int ind1=l1/2;
         int ind2=l1/2-1;
         int i=0,j=0,c=0;
         int v1=0,v2=0;
         while(i<nums1.length && j<nums2.length)
         {
            if(nums1[i]<nums2[j])
            {
                  if(c==ind1) v1=nums1[i];
                  if(c==ind2) v2=nums1[i];
                  c++;
                  i++;
            }
            else{
                if(c==ind1) v1=nums2[j];
                  if(c==ind2) v2=nums2[j];
                  c++;
                  j++;
            }
         }
            while(i<nums1.length)
         {
                  if(c==ind1) v1=nums1[i];
                  if(c==ind2) v2=nums1[i];
                  c++;
                  i++;
         }
             while(j<nums2.length)
         {
                  if(c==ind1) v1=nums2[j];
                  if(c==ind2) v2=nums2[j];
                  c++;
                  j++;
         }
         if(l1%2==1)
            return (double) v1;
           // System.out.println(v1+" "+v2);
          return ((double)v1+(double)v2)/2;
}
}