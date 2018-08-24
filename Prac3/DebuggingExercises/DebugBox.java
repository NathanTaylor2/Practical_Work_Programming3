package DebuggingExercises;

class DebugBox
{
   private int width;
   private int length;
   private int height;
   DebugBox()
   {
      length = 1;
      width = 2;
      height = 2;
   }
   DebugBox(int w, int l, int h)
   {
      width = w;
      length = l;
      height = h;
   }
   void showData()
   {
     System.out.println("Width: "  + width + "  Length: " +
       length + "  Height: " + height);
   }
   double calcVolume()
   {
     double vol = length * width * height;
     return vol;
   }
}
