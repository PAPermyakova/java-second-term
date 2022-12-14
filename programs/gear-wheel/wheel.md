# Описание

На плоскости расположена система из N одинаковых шестеренок, которая приводится в движение вращением первой шестеренки по часовой стрелке (clockwise). Требуется определить направление вращения каждой шестеренки системы, либо установить, что систему заклинит.
***
## Входные данные
Первая строка входных данных содержит число шестеренок N, 1<N≤1000.

Вторая строка содержит число M. Далее идет M строк, каждая из которых содержит два различных числа i и j, означающих, что шестеренки с номерами i и j сцеплены. При этом каждая шестеренка сцеплена не более, чем с 6 другими шестеренками. Также гарантируется, что все шестеренки соединены с первой через несколько других шестеренок (то есть в незаклиненной системе будут вращаться все шестеренки).
***
## Выходные данные
Программа должна вывести на экран N строк. Строка с номером i должна содержать слово clockwise, если шестеренка i вращается по часовой стрелке или слова counter-clockwise в противном случае. Если систему заклинит, то программа выводит block

Пример входных данных:
5
5
1 2
2 3
5 3
2 4
4 5

Пример выходных данных:
clockwise
counter-clockwise
clockwise
clockwise
counter-clockwise

__NB! Примечание
Не гарантируется, что тестовым данным соответствует реально возможная конфигурация шестеренок. Тестовые данные следует воспринимать формально: шестеренка №1 вращается по часовой стрелке, две сцепленные шестеренки должны вращаться в разных направлениях. По заданной системе сцепления шестеренок требуется установить возможность вращения всей системы и направление вращения каждой шестеренки в случае положительного ответа на предыдущий вопрос.
Редактировать прикреплённые файлы__
