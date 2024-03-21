abstract class Ekzamen(override var name:String, override var predmet:String, override var data:String, override var ozenka: Int):Exam
{
    override fun Info()
    {
        try {
            println("Введите ФИ студента")
            name = readLine()!!.toString()
            println("Введите предмет")
            predmet = readLine()!!.toString()
            println("Введите дату проведения экзамена")
            data = readLine()!!.toString()
            println("Введите оценку за экзамен")
            ozenka = readLine()!!.toInt()
            if(ozenka<0)
            {
                println("Оценка не может быть меньше нуля")
            }
        }
        catch (e:Exception){
            println("Недопустимое значение")}
    }
    override fun Output()
    {
        println("ФИ студента: $name, Предмет: $predmet, Дата проведение экзамена: $data, Оценка: $ozenka")
    }
}


