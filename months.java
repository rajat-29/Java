public class months {

  public static void main(String[] args) {

    int monthno = 5;
    String monthname;

    switch (monthno) {

      case 1:
      {
        monthname = "Jan";
        break;
      }

      case 2:
      {
        monthname = "Feb";
        break;
      }

      case 3:
      {
        monthname = "March";
        break;
      }

      case 4:
      {
        monthname = "April";
        break;
      }

      case 5:
      {
        monthname = "May";
        break;
      }

      case 6:
      {
        monthname = "June";
        break;
      }

      case 7:
      {
        monthname = "July";
        break;
      }

      case 8:
      {
        monthname = "Aug";
        break;
      }

      case 9:
      {
        monthname = "Sep";
        break;
      }

      case 10:
      {
        monthname = "Oct";
        break;
      }

      case 11:
      {
        monthname = "Nov";
        break;
      }

      case 12:
      {
        monthname = "Dec";
        break;
      }

      default:
      {
        monthname = "Unknown";
        break;
      }
    }

    System.out.println(monthname);

  }
}
