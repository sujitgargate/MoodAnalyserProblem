
public class MoodAnalyser {
   public String analyseMood(String moodMessage) {

      if (moodMessage.contains("Sad")) {
         return "SAD";
      } else {
         return "HAPPY";
      }
   }
}