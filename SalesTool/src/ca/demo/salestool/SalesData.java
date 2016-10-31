package ca.demo.salestool;

public class SalesData {

	int data[] ={0,4,42,123, 325, 998}; //a conflict?
	
	public void display(){
		System.out.println();
		System.out.println("Data are: ");
		System.out.println("=================================");
		for(int i=0; i< data.length;i++){
			System.out.println("data : "+data[i]);
		}
	}
}
