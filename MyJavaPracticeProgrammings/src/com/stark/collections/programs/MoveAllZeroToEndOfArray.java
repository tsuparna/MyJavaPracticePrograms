package com.stark.collections.programs;

import java.util.Arrays;

public class MoveAllZeroToEndOfArray {
	
	public static void main(String args[]){
		int[] arr = {6,0,8,2,0,3,0,4,1,0,5,6,5,4,0,0};
		
		System.out.println(Arrays.toString(moveElementsToEndofArray(arr)));
		System.out.println(Arrays.toString(moveZeroToEndOfArrayUsingQuickSort(arr)));
	}
	//1. approch1
	static int[] moveElementsToEndofArray(int[] arr){
		int arrIndex=0;
		
		for(int i: arr){
			if(i!=0){
				arr[arrIndex++]=i;
			}
		}
		
		for(int i=arrIndex; i<arr.length; i++){
			arr[i]=0;
		}
		return  arr;
	}
	
	//approch 2
	
	static int[] moveZeroToEndOfArrayUsingQuickSort(int[] arr){
		
		int arrIndex =0;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]!=0){
				int temp = arr[i];
				arr[i]=arr[arrIndex];
				arr[arrIndex]=temp;
				arrIndex++;
			}
		}
		return arr;
	}

}
