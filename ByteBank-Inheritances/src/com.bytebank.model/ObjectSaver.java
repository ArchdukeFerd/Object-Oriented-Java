public class ObjectSaver {
    //In this class an object which saves many objects is going to be created
    //It will also implement a method that adds objects
    //saveObject.add(obj);
    //get, remove, etc.
    Object[] reference = new Object[10];
    int index = 0;

    public void add(Object da) {
        reference[index] = da;
        index++;
    }
    public Object get(int index){
        return reference[index];
    }
}
