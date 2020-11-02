

public class LoopFun
{


      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */


      public Integer factorial(Integer number){
          Integer expected = 1;
          for(int i = 1; i <= number ; i++) {
              expected = expected * i;
          }
          return expected;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String expected = "";

          String[] acronym = phrase.split(" ");

              for (int j = 0; j < acronym.length; j++) {
                  Character acroChar = acronym[j].charAt(0);
                  expected += acroChar.toString().toUpperCase();
              }

          return expected;
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */


      /*


      // Keeps returning [Ljava.lang.String;
      // Trying to figure out how to display as a string, not the Array.


      public String encrypt(String word) {


          String expected = ";";
          String alphabet = "abcdefghijklmnopqrstuvwxyz";

          for (int i = 0; i < word.length(); i++) {

              Integer alphaInd = alphabet.indexOf(word.charAt(i));
              String[] expectArr = new String[word.length()];
              expected += expectArr.toString();

              if (word.charAt(i) == alphabet.charAt(alphaInd)) {
                   if (alphaInd > 22) {
                       Integer alphaSub = alphaInd - 23;
                       expectArr[i] = alphabet.substring(alphaSub, alphaSub + 1);
                   } else {
                       Integer alphaAdd = alphaInd + 3;
                       expectArr[i] = alphabet.substring(alphaAdd, alphaAdd + 1);
                   }

              }



          }   return expected;


      }


       */
}
