object Scala_2 extends App{
    val x=new Rational(3,4);
    val y=new Rational(5,8);
    val z=new Rational(2,7)
    val n=x-y-z
    print(n)
}
class Rational(x:Int,y:Int){
    val nume=x/gcd(Math.abs(x),y);
    val demo=y/gcd(Math.abs(x),y);
    private def gcd(a:Int,b:Int):Int=if (b==0) a else gcd(b,a%b)
    def -(r:Rational)=new Rational(this.nume*r.demo-this.demo*r.nume,this.demo*r.demo)
    override def toString= nume+"/"+demo
}