object Scala_3 extends App{
    var bank:List [Account]=List()
    bank=bank:+ new Account("982456345V",2345,-1000)
    bank=bank:+ new Account("992456345V",2385,2000)
    bank=bank:+ new Account("972456345V",2445,5000)
    bank=bank:+ new Account("952456345V",9345,8000) 

     //List of Accounts with negative balances
        val negativeBalance =  bank.filter((x:Account) => x.balance < 0)
        printf("\nList of Accounts with negative balances : " + negativeBalance)

        // Calculate the sum of all account balances
        val totalBalance:Double = bank.filter((x:Account) => x.balance != 0).map(bank => bank.balance).reduce((x,y)=>x+y)
        printf("\n\nSum of all account balances : " + totalBalance)
        
        val totalWithInterest =  bank.map((x:Account) => if (x.balance>0) x.balance = x.deposit(x.balance * 0.05) else x.balance = x.withdraw(-x.balance*0.1))
        printf("\n\nFinal balances with interest : " + bank)
        

    class Account(id:String,n:Int,b:Double){
        var nic:String =id
        var acNumber:Int=n
        var balance:Double=b

        def withdraw(a:Double) = this.balance - a
        def deposit(a:Double) = this.balance + a

        
        override def toString()="["+nic+":"+acNumber+":"+balance+"]"
    }
}