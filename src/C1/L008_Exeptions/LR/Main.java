package C1.L008_Exeptions.LR;

import java.util.Scanner;

public class Main {

  static void ChoiseLine(Integer choise, Boolean namordnik, Boolean osheinik, Boolean povodok, Integer valid) throws MissingExeption {


      Scanner scn = new Scanner(System.in);

      switch (choise) {
          case 1:
              System.out.println("Nadel osheinik, whats next? (1 - odet' osheinik, 2 - odet' povodok, 3 - odet' namordnik, 4 - idti gulat'):");
              osheinik = true;
              choise = scn.nextInt();
              if (choise == 1) {
                  System.out.println("Osheinik uje nadet");
              }
              ChoiseLine(choise, namordnik, osheinik, povodok, valid);
              break;
          case 2:
              System.out.println("Nadel povodok, whats next? (1 - odet' osheinik, 2 - odet' povodok, 3 - odet' namordnik, 4 - idti gulat'):");
              povodok = true;
              choise = scn.nextInt();
              if (choise == 2) {
                  System.out.println("Povodok uje nadet");
              }
              ChoiseLine(choise, namordnik, osheinik, povodok, valid);
              break;
          case 3:
              System.out.println("Nadel namordnik, whats next? (1 - odet' osheinik, 2 - odet' povodok, 3 - odet' namordnik, 4 - idti gulat'):");
              namordnik = true;
              choise = scn.nextInt();
              if (choise == 3) {
                  System.out.println("Namordnik uje nadet");
              }
              ChoiseLine(choise, namordnik, osheinik, povodok, valid);
              break;
          case 4:
              if (povodok == true && osheinik == true && namordnik == true) {
                  System.out.println("BLYAT YA ZAEBALSA");
                  break;
              }
                  try {
                      if (!povodok) {
                          throw new MissingExeption("Netu povodka");
                      } else if (!osheinik) {
                          throw new MissingExeption("Netu osheinika");
                      } else if (!namordnik) {
                          throw new MissingExeption("Netu namordnika");
                      }
                  } catch (MissingExeption e) {
                      System.err.println(e.getMessage());
                  } finally {
                      choise = 1;
                      ChoiseLine(choise, namordnik, osheinik, povodok, valid);
                  }


              }
      }




    public static void main(String[] args) throws Exception {

        boolean osheinik = false;
        boolean povodok = false;
        boolean namordnik = false;
        int valid = 0;
        int choise;

        Scanner scn = new Scanner(System.in);

        System.out.println("What to do? (1 - odet' osheinik, 2 - odet' povodok, 3 - odet' namordnik, 4 - idti gulat'): ");
        choise = scn.nextInt();
        ChoiseLine(choise, namordnik, osheinik, povodok, valid);




    }
}
