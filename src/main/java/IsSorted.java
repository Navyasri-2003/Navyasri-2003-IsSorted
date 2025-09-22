public class IsSorted {
    public boolean checkSort(int[] arr){
        if (arr == null || arr.length <= 1) return true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }
}

