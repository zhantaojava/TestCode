
public class Boxes {
    public static int minimalNumberOfBoxes(int products, int availableLargeBoxes, int availableSmallBoxes) {
    	availableLargeBoxes=0;
    	availableSmallBoxes=0;
    	for(int i=1;i<=products;i++){
         	if(products%5==0){
         		products=products-5;
         		availableLargeBoxes= availableLargeBoxes+1;
         	}
         	if(products%2==0){
         		products=products-2;
         		availableSmallBoxes=availableSmallBoxes+1;
         	}
         	if(products%5!=0&&products%2!=0){
         		
         		availableLargeBoxes=availableLargeBoxes+1;
         	}
         }
    	
    	int totalbox=availableLargeBoxes+availableSmallBoxes;
    	
        
       return totalbox;
    }
    
    public static void main(String[] args) {
        System.out.println(minimalNumberOfBoxes(12, 3, 3));
    }
}
