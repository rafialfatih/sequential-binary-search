public class SequentialSearch {
    /* Fungsi untuk proses Sequential Search */
    public static int sequentialSearch(int[] arr, int findNum){
        /*
        * Perulangan untuk mencari index.
        * Apabila nilai yang dicari sama dengan nilai
        * yang ada di dalam array, maka akan mengembalikan
        * index nilai tersebut. Perulangan akan dilakukan sampai
        * dengan jumlah elemen array.
        */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findNum){
                return i;
            }
        }

        return -1; // Apabila elemen tidak ditemukan, maka akan mengembalikan nilai -1
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int findNum = 6;

        int res = sequentialSearch(arr, findNum);

        /*
         * Cek apakah hasil yang dikembalikan function sequentialSearch apakah -1 atau bukan.
         * Apabila bukan, maka akan meng-print hasilnya.
         */
        if(res != -1){
            System.out.println("Elemen " + findNum + " berada pada index ke-" + res);
        } else {
            System.out.println("Elemen tidak ada dalam array");
        }
    }
}
