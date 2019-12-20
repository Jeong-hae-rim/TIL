package collection;

import java.util.HashSet;

public class ProductTest {

	public static void main(String[] args) {
		Product [] p = new Product [4] ;
		
		p[0] = new Product("p100", "TV", "20000");
		p[1] = new Product("p200", "computer", "10000");
		p[2] = new Product("p100", "MP3", "700");
		p[3] = new Product("p300", "Audio", "1000");
		
		HashSet<Product> hs = new HashSet<Product>();
		 
//		 Product pro1 = new Product ("p100", "TV", "20000");
//		 map.put(pro1.getProductID(),  pro1);
		 for(Product data :p) {
			if( hs.add(data))
				System.out.println("성공적으로 저장되었습니다.");
			else
				System.out.println("동일한 ID 의 제품이 이미 저장되어 있습니다");
			 
		 }
		 System.out.println();
		 System.out.println(String.format("%-10s\t%-10s\t%-10s\t", "상품ID", "상품명", "가격"));
		 System.out.println("----------------------------------------");
		 
		
		 
		 
		 for(Product data :hs) {
			 System.out.println(data.toString());
		 }
	}


}
