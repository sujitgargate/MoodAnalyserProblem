import org.graalvm.compiler.lir.profiling.MoveProfilingPhase_OptionDescriptors;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest {

   //This Test Case Is For Testing Happy Mood
   @Test
   public void givenMessage_Should_Return_Happy() {
      MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
      String moodState = moodAnalyser.analyseMood("I am in Happy Mood");
      Assert.assertEquals("SAD", moodState);
   }

   //This Test Case Is For Testing Sad Mood
   @Test
   public void givenMessage_Should_Return_Sad() {
      MoodAnalyser moodAnalyser = new MoodAnalyser("Sad");
      String moodState = moodAnalyser.analyseMood("I am in Sad Mood");
      Assert.assertEquals("SAD", moodState);
   }

   //This Test Case Is For Testing No Mood
   @Test
   public void givenNullMessage_Should_Return_Happy() {
      MoodAnalyser moodAnalyser = new MoodAnalyser();
      String moodState = moodAnalyser.analyseMood("I am in No Mood");
      Assert.assertEquals("SAD", moodState);
   }

   @Test
   public void invalidMood_Test() {
      MoodAnalyser moodAnalyser = new MoodAnalyser();
      String moodState = moodAnalyser.analyseMood(null);
   }
}


