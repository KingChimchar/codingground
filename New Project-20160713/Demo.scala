import java.io._

class Point(xc:Int,yc:Int){
    var x:Int = xc;
    var y:Int = yc;
    
    def move(dx:Int,dy:Int)
    {
        x = x + dx;
        y = y + dy;
      println ("Point x location : " + x);
      println ("Point y location : " + y);
    }
}

object Demo{
    def main(args:Array[String])
    {
        var pt:Point = new Point(1,2);
        pt.move(3,2)
    }
}