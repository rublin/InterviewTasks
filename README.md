## tasks from interview
### Task1
На входе массив чисел, например: arr = [1, -2, 3, 4, -9, 6].
Задача – найти непрерывный подмассив arr, сумма элементов которого максимальна.
Ваша функция должна **возвращать только эту сумму**.

[Решение](https://github.com/rublin/InterviewTasks/blob/master/src/arrays/TheBiggestSum.java)

### Task2
На входе массив целых чисел, определить имеются ли дупликаты.
Написал три варианта решения разным подходом с проверкой на быстроту. Для миллионного масива результат такой:
```Java
#################################################
By HashSet result is: true; time is: 135
By Sort result is: true; time is: 827
By Stream result is: true; time is: 415
#################################################
```
З.Ы. На самом собеседовании использовал самый простой способ - через **HashSet**. Но это решение показалось не оптимальным для интервьюера.
[Решение](https://github.com/rublin/InterviewTasks/blob/master/src/main/java/arrays/Duplicates.java)
