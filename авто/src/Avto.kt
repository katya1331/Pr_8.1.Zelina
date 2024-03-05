class Avto (nomera:String){
    var mark = "Unnamed"
    var moshnost = 0
    var probeg = 0
    var country = "Unnamed"
    var price = 0.0
    var skidka=0.0
    init {
        var nomers = nomera
    }

    fun Input (avto: Avto) {
        try {
            println("Введите марку машины(на русском)")
            avto.mark = readln().toString()
            do {
                println("Введите мощность машины")
                avto.moshnost = readln().toInt()
            } while (moshnost <= 0)
            do {
                println("Введите пробег машины в км")
                avto.probeg = readln().toInt()
            } while (probeg < 0)

        } catch (e: Exception) {
            println("Вы ввели что-то не то. Попробуйте еще раз")
        }
    }
    fun Country(avto: Avto)
    {
        if (avto.mark == "мерседес" || avto.mark == "ауди"|| avto.mark == "бмв")
        {
            avto.country = "Германия"
        }else if (avto.mark == "тойота" || avto.mark == "митсубиси"|| avto.mark == "мазда")
        {
            avto.country = "Япония"
        } else if (avto.mark == "ролс-ройс" || avto.mark == "макларен"|| avto.mark == "лэнд ровер")
        {
            avto.country = "Великобритания"
        }else  avto.country = "В базе не найдено"
    }
    fun Price(avto: Avto)
    {
        do
        {
            println("ВВедите Стоимость машины")
            avto.price= readLine()!!.toDouble()
        }while(price<0)
    }
    fun Skidka(avto: Avto) {
        println("если пробег машины больше 100.000км - скидка 15%")
        if (avto.probeg >100000) {
                avto.skidka = avto.price * 0.85
            } else {
            println("Скидки нет")
            avto.skidka = avto.price
        }
    }
    fun Output(avto: Avto)
    {
        println("\nМарка машины: ${avto.mark} \nМощность автомобиля: ${avto.moshnost}" +
                " \nПробег: ${avto.probeg} \nСтрана: ${avto.country} " +
                "\nЦена машины: ${avto.price} рублей \nЦена со скидкой: ${avto.skidka}")
    }
}