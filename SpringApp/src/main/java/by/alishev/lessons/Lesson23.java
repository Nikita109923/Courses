package by.alishev.lessons;
// *Примечание* Объекты класса String - immutable (не изменяемые) объекты, которые создаются один раз, а дальше
// меняется не сам объект, а делается копия которая изменяется на которотую нужно ссылаться.
// StringBuilder -класс для вывода строк, хорошо использовать объект этого класса с вызовом append метода.
// append -метод для конкантенации (склеивания/объединения) строк
// System.out.printf - позволяет редактировать строку.
// %f (float) - вставка числа с точкой (Если поставить .число пред f, то кол-во знаков после запятой будет равно указанному числу)
// %s - вставка строки.
// %d- вставка числа типа int (Если перед d поставить цифру, то вводимое значение будет занимать соответствующее число
// символов, пример ниже)
public class Lesson23 {
    public static void main(String[] args) {
     /*   StringBuilder sb =new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" cat");
        System.out.println(sb.toString());
     */
        System.out.printf("String, %10d \n", 5678);
        System.out.printf("String, %10d \n", 1076545678);
        System.out.printf("String, %10d \n", 8);
        System.out.printf("String, %10d \n", 678998);

        System.out.printf("String, %.2f \n", 67.8998);
        System.out.printf("String, %.3f \n", 6.5465438);


    }
}
