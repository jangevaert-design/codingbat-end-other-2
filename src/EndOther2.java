public class EndOther2 {
  public boolean endOther(String a, String b) {
    String stra = a.toLowerCase();
    String strb = b.toLowerCase();

    if (stra.length() >= strb.length()) {
      for (int i = 0; i < stra.length(); i++) {
        if (stra.endsWith(strb)) {
          return true;
        }
      }
    }
    if (strb.length() >= stra.length()) {
      for (int i = 0; i < strb.length(); i++) {
        if (strb.endsWith(stra)) {
          return true;
        }
      }
    }
    return false;
  }
}
