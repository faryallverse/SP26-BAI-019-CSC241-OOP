public class Demo{
	public static void main(String[] args){
		Product p1 = new Product("Lays", 1200, 6);
		Product p2 = new Product("Dairy Milk", 1300, 3);
		Product p3 = new Product("Popcorn", 1400, 6);

		p1.displayProduct();
		p2.displayProduct();
		p3.displayProduct();
	}
}