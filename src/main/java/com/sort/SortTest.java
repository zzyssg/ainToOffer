package com.sort;


public class SortTest {
    public static void main(String[] args) {
        BubleSort bubleSort = new BubleSort();
        ChooseSort chooseSort = new ChooseSort();
        InsertSort insertSort = new InsertSort();
        ShellSort shellSort = new ShellSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();
        HeapSort headpSort = new HeapSort();


        int[] nums = {3, 6, 9, 2, 6, 1, 5, 0};
//        bubleSort.bubleSort(nums);
//        chooseSort.sort(nums);
//        insertSort.insertSort(nums);
//        shellSort.shellSort(nums);
//        mergeSort.mergeSort(nums);

//        quickSort.sort(nums);
//        headpSort.sort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
