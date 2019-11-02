public class CustomerLinkedList implements CustomerCollection {

    private int size;
    private CustomerList first;
    private CustomerList last;

    public void iterateCollection() {
        for (CustomerList x = first; x != null; x = x.next) {
            System.out.println(x.getValue());
        }
   }

    @Override
    public boolean add(String str) {
        try{
           CustomerList lastValue = last;
           CustomerList customerRecord = new CustomerList(++size, str);
            last = customerRecord;
            if (lastValue == null)
                first = customerRecord;
            else
                lastValue.next = customerRecord;
             return true;
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public boolean addAll(String[] strArr) {
        try{
            for(int i = 0; i < strArr.length; i++){
                add(strArr[i]);
            }
            return true;
        }catch(Exception e ){
            return false;
        }
    }

    @Override
    public boolean addAll(CustomerLinkedList strColl) {
        try{
            for (CustomerList x = strColl.first; x != null; x = x.next) {
                add(x.value);
            }
            return true;
        }catch(Exception e ){
            return false;
        }
    }

    @Override
    public boolean delete(int index) {
            CustomerList current = first;
            CustomerList previous = first;
            while(current.id != index)
             {
                 if(current.next == null)
                     return false;
                 else{
                      previous = current;
                      current = current.next;
                 }
             }
             if(current == first)  first = first.next;
             else
                previous.next = current.next;
                current.next.id--;
                 size--;
        return true;
    }

    @Override
    public boolean delete(String str) {
        CustomerList current = first;
        CustomerList previous = first;
        while(current.value != str)
        {
            if(current.next == null)
                return false;
            else{
                previous = current;
                current = current.next;
            }
        }
        if(current == first)  first = first.next;
        else
            previous.next = current.next;
            current.next.id--;
            size--;
        return true;
    }

    @Override
    public String get(int index) {
        if (index > size) {
            return null;
        }

        for (CustomerList x = first; x != null; x = x.next) {
            if(x.id == index) {
                return x.value;
            }
        }
        return null;
    }

    @Override
    public boolean contains(String str) {
        for (CustomerList x = first; x != null; x = x.next) {
             if (x.value == str){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean clear() {
        try{
            for (CustomerList x = first; x != null; x = x.next) {
                     CustomerList next = x.next;
                     x.id = 0;
                     x.value = null;
                     x.next = null;
            }
            first = last = null;
            size = 0;
            return true;
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean trim() {
         try {
             for (CustomerList x = first; x != null; x = x.next) {
                 if (x.value == null) {
                     delete(x.id);
                 }
             }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean compate(CustomerLinkedList coll) {
        if (coll == null) return false;
        if (size() != coll.size()) return false;
        for (CustomerList x = first; x != null; x = x.next){
            if (x == null){
                continue;
            };
            if (!coll.contains(x.value)){
                return false;
            }
        }
        return true;
    }

    private class CustomerList {
        int id;
        String value;
        CustomerList next;

        CustomerList(int id,String value){
            this.id = id;
            this.value = value;
        }

         String getValue(){
            return value + " id:" + id;
        }
    }
}
