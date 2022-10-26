package com.example.algos;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootTest
class AlgosApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("Hello");
	}
	@Test
	public void longestGap(){
		int num=32;
		String nums=returnBinary(num);
		System.out.println(nums);
		List<Integer> mydata = new ArrayList<>();
		List<Integer> mynew=new ArrayList<>();
		mynew.add(0);
		int counter=0;
		for (int i = 0; i <nums.length() ; i++) {

			int alwaysnxt=i+1;

			if(nums.substring(i, alwaysnxt).equals("1")){
				counter=0;
				System.out.println(new StringBuilder().append("Formated:").append(nums.substring(i,alwaysnxt)));
			}else{
					counter=counter+1;
				    System.out.println(new StringBuilder().append("FormatedxxP:").append(nums.substring(i,alwaysnxt)));
			}
			   mydata.add(counter);
		}

		//Get sublist between zeros//
		for (int j = 0; j < mydata.size(); j++) {
			int start_index = 0;
			int end_index = 0;

			if (mydata.get(j) == 0) {
				start_index = j;
				end_index = j;
			}
			int nt = j + 1;

			if (mydata.size() > nt){
				if (mydata.get(nt) == 0) {
					end_index = j + 1;
				}
		     }
			List<Integer> integers = mydata.subList(start_index, end_index);
			mynew.addAll(integers);

		}

		System.out.println("Myarraynow:"+mydata+"arrayList:"+mynew+"max:"+Collections.max(mynew));
		System.out.println("Mya:"+mydata+"arrayList:"+mynew+"max:"+Collections.max(mynew));
		System.out.println("Mynewdata:"+mydata+"arrayList:"+mynew+"max:"+Collections.max(mynew));
		System.out.println("My:"+mydata+"arrayList:"+mynew+"max:"+Collections.max(mynew));
	}

	private String returnBinary(int num) {
		return (Integer.toBinaryString(num)).toString();
	}


}
