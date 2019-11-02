public interface CustomerCollection {

    boolean add(String str);

    boolean addAll(String[] strArr);

    boolean addAll(CustomerLinkedList strColl);

    boolean delete (int index);

    boolean delete (String str);

    String get(int index);

    boolean contains(String str);

    boolean clear();

    int size();

    boolean trim();

    boolean compate( CustomerLinkedList coll);
}
