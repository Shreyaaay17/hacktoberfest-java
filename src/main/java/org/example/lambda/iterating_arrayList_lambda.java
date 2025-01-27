import java.util.ArrayList;

class iterating_arrayList_lambda {
  public static void main(String[] args) {
    // create an ArrayList
    ArrayList<String> languages = new ArrayList<>();

    // add elements to the ArrayList
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");

    // print arraylist
    System.out.print("ArrayList: ");

    // iterate over each element of arraylist
    // using forEach() method
    languages.forEach((e) -> {
      System.out.print(e + ", ");
    });
  }
}
