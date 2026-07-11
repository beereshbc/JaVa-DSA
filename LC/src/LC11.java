public class LC11 {
    static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));

    }
// Wrong code
    static int maxArea(int[] height) {
        int area = 0;
        for (int i = 0; i <height.length ; i++) {
            for (int j = 0; j < height.length; j++) {
                int checkedArea = height[i]*height[j];
                if (checkedArea>area){
                    area =checkedArea;
                }
            }

        }
        return area;
    }
}
