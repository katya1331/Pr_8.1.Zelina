fun main()
{
    try {
        var avto = Avto("a426ss")
        avto.Input(avto)
        avto.Svyaz(avto)
        avto.Price(avto)
        avto.Skidka(avto)
        avto.Output(avto)
    } catch (e:Throwable)
    {
        println("введено некорректно");
    }
}