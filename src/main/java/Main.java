public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();


    int actual1 = (int) service.calculate(1000_60, true);
    int expected1 = 30;

    System.out.println("ОР: " + expected1 + ", ФР:" + actual1);
  }
}

