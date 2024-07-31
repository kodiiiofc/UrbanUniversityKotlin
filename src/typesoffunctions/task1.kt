package typesoffunctions

fun main() {
    println(factorial(4))

    println(factorial(1))

    println(factorial(12))

    println(factorial(12).toInt()) // максимальное число для Int, поэтому возвращаем Long

    println(factorial(13))

    println(factorial(13).toInt())

    println(factorial(0))

    println(factorial(-30))
}

fun factorial(a: Int) : Long {
    val nextStep = a - 1
    if (nextStep <= 0) return 1     // уменьшаем следующе значение "a" пока, оно не будет равно 0,
                                    // а также ограничиваем факториал для 0 и отрицательных чисел, функция вернет 1
    return a * factorial(nextStep)
}