import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int x = in.nextInt(); //ввод объема контейнера
        int a = in.nextInt(); //ввод объёма А
        int b = in.nextInt(); //ввод объёма В
        int c = in.nextInt(); //ввод объёма С
        int k = 0; //счётчик людей, сей пакет поместился в контейнер
        //рассмотрим вариант когда A<B<C
        if (x>=a){ //войдет ли пакет А в контейнер?
            x -= a; //место оставшееся после помещения пакета А в контейнер
            k++; //увеличиваем счётчик
            if (x>=b){ //войдет ли пакет B в контейнер?
                x -= b; //место оставшееся после помещения пакета B в контейнер
                k++; //увеличиваем счётчик
                if (x>=c) //войдет ли пакет C в контейнер?
                    k++; //увеличиваем счётчики
            }
            //рассмотрим вариант, когда пакет В не войдёт
            else {
                if (x>=c) //войдет ли пакет C в контейнер?
                    k++; //увеличиваем счётчик
            }
        }
        //рассмотрим вариант, когда пакет A не войдёт
        else{
            if (x>=b){ //войдет ли пакет B в контейнер?
                x -= b; //место оставшееся после помещения пакета B в контейнер
                k++; //увеличиваем счётчик
                if (x>=c) //войдет ли пакет C в контейнер?
                    k++; //увеличиваем счётчик
            }
            //рассмотрим вариант, когда пакеты A и B не войдут
            else {
                if (x>=c) //войдет ли пакет C в контейнер?
                    k++; //увеличиваем счётчик
            }
        }
        out.print(3-k); //найдем сколько человек не смогут выкинуть мусор в контейнер
    }
}
