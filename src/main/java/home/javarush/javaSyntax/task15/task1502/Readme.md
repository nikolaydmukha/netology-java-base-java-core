
Программа считывает с консоли строку и выводит ее на экран в верхнем регистре. Но оказывается, она не будет работать
на старых версиях Java (ниже 7й версии). Не меняя функциональности программы, перепиши блок try-with-resources на обычный try-catch.
Не забудь о вызове метода close() для объектов с внешними ресурсами.


Требования:
1.	Программа должна считать с консоли строку и вывести ее на экран в верхнем регистре.
2.	В программе должен использоваться блок try-catch без ресурсов.
3.	У объектов с внешними ресурсами должен быть вызван метод close() в блоке finally.

