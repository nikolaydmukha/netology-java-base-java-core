
Программа считывает с консоли номер, находит в журнале соответствующего студента и вызывает его отвечать.
И даже обрабатывает некорректные числа.
Но есть еще одна проблема: если введено не целое число, метод parseInt бросает NumberFormatException.
Оберни часть кода в try-catch так, чтобы программа продолжала работу, даже если было введено не целое число.
И если введено не целое число, выведи в консоль сообщение: &quot;Нужно ввести целое число&quot; и выполни continue; для корректной работы цикла.


Требования:
1.	Программа должна продолжить работу, если было введено не целое число.
2.	Программа должна выводить сообщение: &quot;Нужно ввести целое число&quot; каждый раз при вводе не целого числа.

