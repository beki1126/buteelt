package buteelt;
public class MyHashTable extends CustomList<iNeedGeneric> {
    // Sum of elements in the list
    public int sum(CustomList<iNeedGeneric> sa) {
        int sum = 0;
        for (int i = 0; i < sa.size(); i++) {
            sum += sa.get(i).getValue(); 
        }
        return sum;
    }

 
    public double average(CustomList<iNeedGeneric> sa) {
        return 1.0 * sum(sa) / sa.size();
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
        System.out.println("Even numbers:");
        for (int i = 0; i < sa.size(); i++) {
            if (sa.get(i).getValue() % 2 == 0) { 
                System.out.print(sa.get(i).getValue() + " ");
            }
        }
        System.out.println(); 
    }

    public void odd(CustomList<iNeedGeneric> sa) {
        System.out.println("Odd numbers:");
        for (int i = 0; i < sa.size(); i++) {
            if (sa.get(i).getValue() % 2 != 0) { 
                System.out.print(sa.get(i).getValue() + " "); 
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        MyHashTable mb = new MyHashTable();
        
        CustomList<iNeedGeneric> numbers = new CustomList<iNeedGeneric>();
        
        numbers.add(new iNeedGeneric(1));
        numbers.add(new iNeedGeneric(2));
        numbers.add(new iNeedGeneric(3));
        numbers.add(new iNeedGeneric(4));

        
        System.out.println(mb.min(numbers));
        System.out.println(mb.max(numbers));
        System.out.println(mb.average(numbers));
        System.out.println(mb.sum(numbers));

        mb.even(numbers);
        mb.odd(numbers);
    }
}