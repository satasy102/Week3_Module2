public class BinarySearch {


    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int n = list.length;
        int key = 10;
        int result = ob.binarySearch(list, 0, n - 1, key);
        if (result == -1)
            System.out.println("Không tìm thấy phần tử " + key);
        else
            System.out.println("Phần tử " + key + " được tìm thấy tại chỉ số " +
                    result);
    }

    int binarySearch(int[] arr, int left, int right, int key) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            // Nếu arr[mid] = key, trả về chỉ số và kết thúc
            if (arr[mid] == key)
                return mid;

            // Nếu arr[mid] > key, gọi đệ quy tìm kiếm bên trái
            if (arr[mid] > key)
                return binarySearch(arr, left, mid - 1, key);

            // Ngược lại, nếu arr[mid] < key, gọi đệ quy tìm kiếm bên phải
            return binarySearch(arr, mid + 1, right, key);
        }

        // Trong trường hợp không tìm thấy
        return -1;
    }
}
