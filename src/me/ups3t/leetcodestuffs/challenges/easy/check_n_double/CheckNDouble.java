package me.ups3t.leetcodestuffs.challenges.easy.check_n_double;

public class CheckNDouble {

    public boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j] * 2 && i != j) return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }

}
