object Scala_3 extends App{
    var bank:List [Account]=List()
    bank=bank:+ new Account("982456345V",2345,1000)
    bank=bank:+ new Account("992456345V",2385,2000)
    bank=bank:+ new Account("972456345V",2445,5000)
    bank=bank:+ new Account("952456345V",9345,8000) 

    class Account(id:String,n:Int,b:Double){
        val nic:String =id
        val acNumber:Int=n
        var balance:Double=b

        def transfer(a:Account,b:Double)={
            this.balance=this.balance-b
            a.balance=a.balance+b
        }

        override def toString()="["+nic+":"+acNumber+":"+balance+"]"
    }

    bank(3).transfer(bank(0),1000)
    println(bank)

    

}