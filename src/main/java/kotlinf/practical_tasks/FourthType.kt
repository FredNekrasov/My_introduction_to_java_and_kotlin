package kotlinf.practical_tasks

class FourthType {
//Разработайте tailrec-функцию, осуществляющую суммирование чётных цифр данного натурального числа.
    tailrec fun task1(n: Int, sum: Int = 0): Int {
        if (n == 0) return sum
        val value = n % 10
        val newSum = if (value % 2 == 0) sum + value else sum
        return task1(n / 10, newSum)
    }
//Разработайте tailrec-функцию, осуществляющую нахождение произведения чётных цифр данного натурального числа.
    tailrec fun task2(n: Int, sum: Int = 1): Int {
        if (n == 0) return sum
        val value = n % 10
        val newSum = if (value % 2 == 0) sum * value else sum
        return task2(n / 10, newSum)
    }
//Разработайте tailrec-функцию, осуществляющую нахождение максимальной чётной цифры данного натурального числа.
    tailrec fun task3(n: Int, max: Int = 0): Int {
        if (n == 0) return max
        var value = n % 10
        if (max != 0) value = if ((value % 2 == 0) && (value > max)) value else max
        return task3(n / 10, value)
    }
//Разработайте tailrec-функцию, осуществляющую нахождение минимальной чётной цифры данного натурального числа.
    tailrec fun task4(n: Int, min: Int = 0): Int {
        if (n == 0) return min
        var value = n % 10
        if (min != 0) value = if ((value % 2 == 0) && (value < min)) value else min
        return task4(n / 10, value)
    }
//Разработайте tailrec-функцию, осуществляющую суммирование нечётных цифр данного натурального числа.
    tailrec fun task5(n: Int, sum: Int = 0): Int {
        if (n == 0) return sum
        val value = n % 10
        val newSum = if (value % 2 != 0) sum + value else sum
        return task5(n / 10, newSum)
    }
}