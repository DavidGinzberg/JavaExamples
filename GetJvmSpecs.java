public class GetJvmSpecs{
  public static void main(String[] args){
    System.out.println("VM Name:\t" + System.getProperty("java.vm.name"));
    System.out.println("Java Home:\t" + System.getProperty("java.home"));
    System.out.println("Java Vendor:\t" + System.getProperty("java.vendor"));
    System.out.println("Java Version:\t" + System.getProperty("java.version"));
    System.out.println("Specification Vendor:\t" + System.getProperty("java.specification.vendor"));
  }
}
