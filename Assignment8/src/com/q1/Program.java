package com.q1;

import java.util.Comparator;





public class Program{
	
	public static <E extends Number> void SelectionSort(E[] arr) {
		System.out.println("The Array Before Sort:");
		for (E e : arr) {
			System.out.print(e+" ");
		}
		Comparator<E> arrCompare = new SelectionSortComparator<E>();
		for(int i = 0; i<arr.length-1;i++) {
			for(int j = i+1; j<arr.length;j++) {
				if(0<arrCompare.compare((E)arr[i], (E)arr[j])) {
					E temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.err.println(" ");
		System.out.println("The Array After Sort:");
		for (E e : arr) {
			System.out.print(e+" ");
		}
		
		
	}
	public static void main(String[] args) {
		Integer arr[]= {10,40,23,5,22,89,43,53,65,77};
		SelectionSort(arr);
		
		
//		Double arr1[] = {1.2,44.33,55.45,76.35,4.65,34.32};
//		SelectionSort(arr1);
	}
	
}
