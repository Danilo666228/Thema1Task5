fun main() {
    println("Введите целое число n:")
    val n = readLine()?.toInt() ?: return

    println("Введите основание степени x:")
    val x = readLine()?.toInt() ?: return

    var y = 0
    var stepen = 1
    while (stepen < n) {
        stepen *= x
        y++
    }

    if (stepen == n) {
        println("Целочисленный показатель y = $y")
    } else {
        println("Целочисленный показатель не существует")
    }
}