fun main()
{
    try {
        var avto = Avto("a426se")
        avto.Input(avto)
        avto.Country(avto)
        avto.Price(avto)
        avto.Skidka(avto)
        avto.Output(avto)
    } catch (e:Throwable)
    {
        println("Вы ввели что-то не то. Попробуйте еще раз");
    }
}