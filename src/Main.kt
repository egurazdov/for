import kotlin.math.abs
import kotlin.math.sqrt
import kotlin.math.pow

const val pi = 3.14
fun main() {
//    Даны два числа a и b. Найти их среднее арифметическое.
    println("Задание 1")
    val a = 46
    val b = 33
    println("Среднее арифметическое чисел $a и $b = " + ((a.toDouble() + b.toDouble()) / 2))

    println("")

//    Дана площадь S круга. Найти его диаметр D и длину L окружности, ограничивающей этот круг,
//    учитывая, что L=π∗D, S=π∗D2/4. В качестве значения π использовать 3.14.
    println("Задание 2")
    val s = 46.6
    val d = sqrt(s / pi) * 2
    val l = pi * d
    println("Диаметр окружности = " + String.format("%.2f", d) + ", длина окружности = " + String.format("%.2f", l))
    println("")

//    Даны координаты двух противоположных вершин прямоугольника: (x1,y1), (x2,y2).
//    Стороны прямоугольника параллельны осям координат. Найти периметр и площадь данного прямоугольника.
    println("Задание 3")
    val x1 = 56
    val x2 = -34
    val y1 = -23
    val y2 = 11
    val srec = (x1 - x2) * (y1 - y2)
    println("Площадь прямоугольника = " + abs(srec))
    println("")

//    Необходимо вывести на консоль такую последовательность чисел: 1 2 4 8 16 32 64 128 256 512
    println("Задание 4")

    for (i in 0..9) print(" " + (2.0.pow(i)).toInt())

    println("")

//    Дано целое число n = 20. Уменьшая его до 0, вывести на экран только четные числа.
    println("Задание 5")
    val n = 20

    for (i in n downTo 1)  if (i%2==0) print(" $i")


}