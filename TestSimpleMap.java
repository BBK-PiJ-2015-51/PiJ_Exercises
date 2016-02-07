public class TestSimpleMap {

public static void main(String args[]) {


SimpleMap s = new SimpleMapImpl();

s.put(5, "a");
s.put(5, "b");
s.put(10, "c");
s.put(25, "d");

String result = s.get(10);
System.out.println(result);

}

}