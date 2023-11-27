public class BinarySearch {
    /* Fungsi untuk melakukan proses binary search */
    public static int binarySearch(int[] arr, int findNum) {
        /*
        * Inisiasi variabel untuk nilai kanan dan kiri
        */
        int left = 0;
        int right = arr.length - 1;

        /*
        * Perulangan untuk mencari index,
        * perulangan akan terus berulang sampai nilai mid ketemu
        * atau nilai left kurang dari sama dengan right
        */
        while (left <= right) {
            /* Inisiasi nilai mid atau nilai tengah */
            int mid = left + (right - left) / 2;

            /*
            * Cek apakah x (nilai yang dicari) sama dengan nilai
            * yang ada di tengah array. Jika ada, maka akan langsung
            * mengembalikan index
            */
            if (arr[mid] == findNum){
                return mid;
            }

            /*
            * Cek apakah nilai mid kurang dari x,
            * Jika iya, maka nilai left akan berubah
            */
            if (arr[mid] < findNum){
                left = mid + 1;
            }else{
                right = mid - 1; // Jika nilai mid lebih dari x, maka nilai right akan berubah
            }
        }

        return -1; // Apabila elemen tidak ditemukan, maka akan mengembalikan nilai -1
    }

    public static void main(String[] args) {
        int[] arr = {10, 21, 32, 43, 54};
        int findNum = 32;
        int result = binarySearch(arr, findNum);

        /*
        * Cek apakah hasil yang dikembalikan function binarySearch apakah -1 atau bukan.
        * Apabila bukan, maka akan meng-print hasilnya.
        */
        if (result != -1){
            System.out.println("Elemen " + findNum + " berada pada index ke-" + result);
        }else{
            System.out.println("Elemen tidak ada di dalam array!");
        }
    }
}
