public class D007 {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int[] arr = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                i++;
                k++;
            } else {
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }

        if(j < nums2.length){
            for(int remainJ = j; remainJ < nums2.length; remainJ++){
                arr[k] = nums2[remainJ];
                k++;
            }
        } else if(i < nums1.length){
            for(int remainI = i; remainI < nums1.length; remainI++){
                arr[k] = nums1[remainI];
                k++;
            }
        }

        if(arr.length % 2 == 0) {
            return (double) (arr[(arr.length / 2) - 1] + arr[arr.length / 2]) / 2;
        } else {
            return (double) (arr[arr.length / 2]);
        }
    }
}
