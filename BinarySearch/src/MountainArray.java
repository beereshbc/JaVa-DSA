//public class MountainArray {
//
//    public static void main(String[] args) {
//
//    }
//        public int findInMountainArray(int target, MountainArray mountainArr) {
//
//            int peak = findPeak(mountainArr);
//
//            int firstTry = binarySearch(mountainArr, target, 0, peak, true);
//            if (firstTry != -1) return firstTry;
//
//            return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
//        }
//
//        private int findPeak(MountainArray arr){
//            int start = 0;
//            int end = arr.length() - 1;
//
//            while (start < end) {
//                int mid = start + (end - start) / 2;
//
//                if (arr.get(mid) > arr.get(mid + 1)) {
//                    end = mid;
//                } else {
//                    start = mid + 1;
//                }
//            }
//            return start;
//        }}
