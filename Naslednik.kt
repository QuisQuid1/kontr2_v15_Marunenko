class Naslednik(name:String,predmet:String,data:String,ozenka: Int):Ekzamen(name,predmet,data,ozenka) {
    fun Grade()
    {
        println("Категории оценок: 5-отлично, 4-хорошо, 3-удовлетворительно, 2-неудовлетворительно")
        if (ozenka==5)
        {
            println("Отличо!!")
        }
        if (ozenka==4)
        {
            println("Хорошо")
        }
        if (ozenka==3)
        {
            println("Удовлетворительно")
        }
        if (ozenka==2)
        {
            println("Неудовлетворительно(")
        }
    }
    fun Predmet()
    {
        if (predmet=="Биология"||predmet=="Русский язык"||predmet=="Литература"||predmet=="География"||predmet=="Физкультура"||predmet=="Музыка"||predmet=="История"||predmet=="Обществознание")
        {
            println("Студент гумманитарий")
        }
        else if (predmet=="Математика"||predmet=="Информатика"||predmet=="Химия")
        {
            println("Студент технарь")
        }
        else{ println("Такого предмета не существует")}
    }

    fun Input():Int {
        println("Введите сколько студентов сдает экзамен")
        val n = readLine()!!.toInt()
        if (n > 0) {
            return n
        } else {
            println("Количество студентов не может быть меньше 0")
            return 1
        }

    }    }