object Scala_1 extends App{
    print("Enter the numirator:");
    val x=scala.io.StdIn.readInt();
    print("Enter the demonimator:");
    val y=scala.io.StdIn.readInt();
    val r1=new Rational(x,y);
    print(r1.neg);
}
class Rational(x:Int,y:Int){
    val nume=x/gcd(Math.abs(x),y);
    val demo=y/gcd(Math.abs(x),y);
    private def gcd(a:Int,b:Int):Int=if (b==0) a else gcd(b,a%b)
    def neg=new Rational(-this.nume,this.demo);
    override def toString= nume+"/"+demo
}