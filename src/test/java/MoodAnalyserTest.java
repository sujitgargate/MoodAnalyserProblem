import org.graalvm.compiler.lir.profiling.MoveProfilingPhase_OptionDescriptors;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

   @Test
   public void check_HappyMood() {
      MoodAnalyser moodAnalyser = new MoodAnalyser();
      String moodState = moodAnalyser.analyseMood("This is a Happy Message");
      Assert.assertEquals("HAPPY", moodState);
   }

   @Test
   public void check_SadMood() {
      MoodAnalyser moodAnalyser = new MoodAnalyser();
      String moodState = moodAnalyser.analyseMood("This is a Sad Message");
      Assert.assertEquals("SAD", moodState);
   }
}


