package buteelt;
import java.lang.Math;
import java.util.List;
public class MyHashTable extends CustomList<iNeedGeneric> {
    // Sum of elements in the list
 
    public double multiplyAllIndexOfElements(CustomList<iNeedGeneric> sa) {
        double sum = 1;
        for (int i = 0; i < sa.size(); i++) {
            sum *= sa.get(i).getValue(); 
        }
        return sum;
    }
    public double gioaverage(CustomList<iNeedGeneric> sa) {
        return  Math.sqrt(sum(sa) / sa.size());
    }

   
    public static double square(double number){
        double t;
      
        double squareroot = number / 2;
      
        do {
            t = squareroot;
            squareroot = (t + (number / t)) /4;
        } while ((t - squareroot) != 0);
      
        return squareroot;
    }
    public static double nthRoot(CustomList<iNeedGeneric> sa, double sum) {
    	int n = sa.size();
        double approx = sum / n;
        double betterApprox = approx;
        double precision = 0.0001;

        do {
            approx = betterApprox;
            double numerator = sum / Math.pow(approx, n - 1);
            double denominator = n;
            betterApprox = (numerator + (denominator - 1) * approx) / denominator;
        } while (Math.abs(approx - betterApprox) > precision);

        return betterApprox;
    }
    
    private double sum(CustomList<iNeedGeneric> sa) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static double geometricProgressionAverage(List<Double> numbers) {
        if (numbers.isEmpty()) {
            return 0; // or throw an exception depending on your requirements
        }

        double product = 1.0;
        for (double number : numbers) {
            product *= number;
        }

        return Math.pow(product, 1.0 / numbers.size());
    }



 
   


    public int max(CustomList<iNeedGeneric> sa) {
        int max = sa.get(0).getValue(); 
        for (int i = 0; i < sa.size(); i++) {
            if (max < sa.get(i).getValue()) { 
                max = sa.get(i).getValue(); 
            }
        }
        return max;
    }

    public int min(CustomList<iNeedGeneric> sa) {
        int min = sa.get(0).getValue(); 
        for (int i = 0; i < sa.size(); i++) {
            if (min > sa.get(i).getValue()) { 
                min = sa.get(i).getValue();
            }
        }
        return min;
    }

    public void even(CustomList<iNeedGeneric> sa) {
        System.out.println("Тэгш тоонууд:");
        for (int i = 0; i < sa.size(); i++) {
            if (sa.get(i).getValue() % 2 == 0) { 
                System.out.print(sa.get(i).getValue() + " ");
            }
        }
        System.out.println(); 
    }

    public void odd(CustomList<iNeedGeneric> sa) {
        System.out.println("Сондгой тоонууд:");
        for (int i = 0; i < sa.size(); i++) {
            if (sa.get(i).getValue() % 2 != 0) { 
                System.out.print(sa.get(i).getValue() + " "); 
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        MyHashTable mb = new MyHashTable();
      //   ArrayList <Integer> b = new ArrayList();
      
        
        CustomList<iNeedGeneric> numbers = new CustomList<iNeedGeneric>();
        
        numbers.add(new iNeedGeneric(2));
        numbers.add(new iNeedGeneric(19));
        numbers.add(new iNeedGeneric(23));
        numbers.add(new iNeedGeneric(27));
        numbers.add(new iNeedGeneric(33));
   
   

        
        System.out.println("Хамгийн бага тоо: "+mb.min(numbers));
        System.out.println("Хамгийн их тоо: "+mb.max(numbers));
        System.out.println("Үржвэр: "+mb.multiplyAllIndexOfElements(numbers));
        	System.out.println(" Геометр Дундаж" + mb.nthRoot(numbers, mb.multiplyAllIndexOfElements(numbers)) );
        mb.even(numbers);
        mb.odd(numbers);
    }
}