package ca.demo.salestool;

public class SalesData {

	int data[] ={0,4,42};
	
	public void display(){
		System.out.println();
		System.out.println("Data: ");
		System.out.println("=================================");
		for(int i=0; i< data.length;i++){
			System.out.println("data : "+data[i]);
		}
	}
}
