public class SimpleGeneric{

  public static void main(String[] args){
    System.out.println("Nothing to see here.");
  }
}

/**
 * A very simple and not very useful generic class
 */
class OneItemBox<T>{

  private T contents;

  public void put(T thing){
    contents = thing;
  }

  public T get(){
    return contents;
  }
}
