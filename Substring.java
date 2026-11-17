public class Substring {
  public static void main(String[] args) {
    //substring = a method used to extract a portion of a string.
    //string.substring(start,end)

    String email = "Mahiiivijay31@gmail.com";
    String username = email.substring(0,13);
    String username2 = email.substring(0, email.indexOf("@"));
    String domain = email.substring(14,23);
    String domain2 = email.substring(email.indexOf("@"));
    System.out.println(username);
    System.out.println(domain);
    System.out.println(username2);
    System.out.println(domain2);
  }
}
