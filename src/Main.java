public class Main {

    public static void main(String[] args){

        CustomerLinkedList theCustomerLinkedList = new CustomerLinkedList();
        theCustomerLinkedList.add("One");
        theCustomerLinkedList.add("Two");
        theCustomerLinkedList.add("Three");
        theCustomerLinkedList.add("Four");
        theCustomerLinkedList.add("Five");
        theCustomerLinkedList.add("Six");
        theCustomerLinkedList.add("Seven");
        theCustomerLinkedList.add("Eight");
        theCustomerLinkedList.add("Nine");
        theCustomerLinkedList.add("Ten");
        theCustomerLinkedList.add("Eleven");
        theCustomerLinkedList.add(null);


        CustomerLinkedList theCustomerLinkedList1 = new CustomerLinkedList();
        theCustomerLinkedList1.add("Один");
        theCustomerLinkedList1.add("Два");
        theCustomerLinkedList1.add("Три");
        theCustomerLinkedList1.add("Четыри");
        theCustomerLinkedList1.add(null);
        theCustomerLinkedList1.add("Пять");
        theCustomerLinkedList1.add("Шесть");
        theCustomerLinkedList1.add("Семь");
        theCustomerLinkedList1.add("Восемь");
        theCustomerLinkedList1.add("Девять");


        String [] arr = {"1","2","3","4","5","6","7","8","9"};

        theCustomerLinkedList.addAll(theCustomerLinkedList1);
        theCustomerLinkedList.addAll(arr);

        System.out.println(theCustomerLinkedList.size());
        theCustomerLinkedList.iterateCollection();
        theCustomerLinkedList.trim();
        theCustomerLinkedList.iterateCollection();

        theCustomerLinkedList.delete(28);
        theCustomerLinkedList.delete("Пять");
        theCustomerLinkedList.delete("Девять");
        theCustomerLinkedList.iterateCollection();
        System.out.println(theCustomerLinkedList.size());
        System.out.println(theCustomerLinkedList.get(2));
        System.out.println(theCustomerLinkedList.contains("Восемь"));

        theCustomerLinkedList.iterateCollection();

        System.out.println(theCustomerLinkedList.compate(theCustomerLinkedList));
        System.out.println(theCustomerLinkedList.compate(theCustomerLinkedList1));

        theCustomerLinkedList.clear();
        theCustomerLinkedList.iterateCollection();

    }
}
