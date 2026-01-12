class Container_with_most_water {

    static int[] height={1,8,6,2,5,8,4,3,7};
    public static int maxArea(int[] height) {
        int maximumArea=0;
        int left=0;
        int right=height.length-1;
        while( left<right){
            int w=right-left;
            int h=Math.min(height[left],height[right]);
            int newArea=h*w;
            if(newArea>maximumArea){
                maximumArea=newArea;
            }
            if (height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }

        }
        return maximumArea;
    }
    public static void main(String[] args) {
        System.out.println(maxArea(height));
    }
    
}