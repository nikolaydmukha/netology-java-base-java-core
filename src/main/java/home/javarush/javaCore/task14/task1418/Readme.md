
У нас есть программа, которая должна заполнять список и выводить его определенным образом в консоли.
Сейчас она работает некорректно. Чтобы исправить программу:
1. Подумай, что делает метод main().
2. Создай в классе Solution статические методы initList(List&lt;Number&gt; list), printListValues(List&lt;Number&gt; list), processCastedObjects(List&lt;Number&gt; list).
3. Найди блок кода, который заполняет значениями список, и перемести его в метод initList().
4. Найди блок кода, который в цикле for выводит на экран содержимое списка, и перемести его в метод printListValues().
5. Найди блок кода, в котором для каждого объекта списка проверяется тип и выводятся сообщения на экран, и перемести его в метод processCastedObjects().
6. Исправь 2 ошибки в методе printListValues() так, чтобы на экран корректно выводилось содержимое переданного в качестве параметра списка.
7. Исправь 2 ошибки в методе processCastedObjects(), связанные с приведением типов:
- для объекта типа Float нужно вывести &quot;Is float value defined? &quot; + !([Float_object].isNaN()).
- для объекта типа Double нужно вывести &quot;Is double value infinite? &quot; + [Double_object].isInfinite().


Требования:
1.	В классе Solution должны быть реализованы статические методы initList(List&lt;Number&gt; list),                 printListValues(List&lt;Number&gt; list), processCastedObjects(List&lt;Number&gt; list).
2.	Метод initList должен заполнять полученный список произвольными значениями.
3.	Метод printListValues должен выводить содержимое полученного списка на экран.
4.	Метод processCastedObjects должен анализировать элементы списка и для объектов типа Float или Double выводить на экран текст согласно условию задачи.

