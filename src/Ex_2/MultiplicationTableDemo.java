package Ex_2;

public class MultiplicationTableDemo {
    public static void main(String[] args) {

        int rows = 9, cols = 9;
        int[][] table = new int[rows][cols];
        //Текстове значение для отображения в окне вывода:
        String txt = "\t|\t";

        for (int i = 1; i <= cols; i++) {
            txt += i + "\t";
        }

        txt += "\n";
        for (int i = 1; i <=  8 * cols ; i++) {
            txt += "-";
        }

        //Заполнение массива
        for (int i = 0; i < table.length; i++) {
            txt += "\n" + (i + 1) + "\t|\t";
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i+1)*(j+1);
                txt += table[i][j] + "\t";
            }
        }
        //Отображение сообщения в окне вывода
        System.out.println("Таблица умножения: ");
        System.out.println(txt);
    }
}
