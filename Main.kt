import kotlinx.coroutines.*
suspend fun main() {
    var nm = Naslednik("", "", "", 0)
    var Class:Naslednik=Naslednik("", "", "",0 )
    var k=Class.Input()
        for(i in 1..k){
            println("$i студент")
            delay(3000)
            nm.Info()
            nm.Predmet()
            nm.Grade()
            nm.Output()
        }
    }

