class Solution {
    public int maximumSum(int[] arr) {
        int nodelete=arr[0];
        int onedelete=0;
        int maxsum=arr[0];

        for(int i=1;i<arr.length;i++){
            onedelete=Math.max(nodelete,arr[i]+onedelete);
            nodelete=Math.max(arr[i],arr[i]+nodelete);
            maxsum=Math.max(maxsum,Math.max(nodelete,onedelete));
        }

        return maxsum;
    }
}