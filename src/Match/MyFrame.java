package Match;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame {
    private int AC = 0;
    private int RM = 0;
    private String text0 = "Result: 0 X 0";
    private String text1 = "Result: ";
    private String text2 = "Last Scorer: \n";

    MyFrame(int x, int y) {

        setTitle("Milan vs Madrid"); //Название окна
        setBounds(x, y, 300, 200); //Положение и размеры окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); //Окно фиксированных размеров
        setLayout(null); //отключение менеджера компоновки для окна

        Font f = new Font(Font.DIALOG, Font.BOLD | Font.HANGING_BASELINE, 14); //Создание объекта шрифта
        setFont(f); //Применение шрифта для окна
        JPanel P = new JPanel(); //Создание панели

        P.setBounds(10, 10, 265, 90); //Положение и размеры окна
        P.setBackground(Color.LIGHT_GRAY); //Цвет фона для панели
        P.setLayout(new BorderLayout()); //Определение менеджера компоновки для панели
        add(P); //добавление панели в окно

        JLabel L1 = new JLabel(text0); //Создание метки
        JLabel L2 = new JLabel(text2); //Создание метки

        L2.setHorizontalAlignment(JLabel.CENTER); //Выравнивание метки по центру
        L2.setForeground(Color.RED); //Цвет для шрифта метки
        L2.setFont(f); //Применение шрифта для метки
        P.add(L2, BorderLayout.BEFORE_FIRST_LINE); //Добавление метки на панель

        L1.setHorizontalAlignment(JLabel.CENTER);//Выравнивание метки по центру
        L1.setForeground(Color.RED); //Цвет для шрифта метки
        L1.setFont(f); //Применение шрифта для метки
        P.add(L1, BorderLayout.CENTER); //Добавление метки на панель

        JButton A = new JButton("AC Milan"); //Создание кнопки А
        A.setBounds(20, 130, 120, 30); //Размеры и расположение кнопки А
        A.setFont(f); //Установка шрифта для кнопки А
        A.addActionListener(new ActionListener() { //Добавление обработчика для окна
            public void actionPerformed(ActionEvent ae) {
                AC++;
                L1.setText(text1 + AC + " X " + RM);
                L2.setText(text2 + " AC Milan");
            }
        });
        add(A); //Добавление кнопки в окно

        JButton B = new JButton("Real Madrid"); //Создание кнопки В
        B.setBounds(140, 130, 120, 30); //Размеры и расположение кнопки В
        B.setFont(f); //Установка шрифта для кнопки В
        B.addActionListener(new ActionListener() { //Добавление обработчика для окна
            public void actionPerformed(ActionEvent ae) {
                RM++;
                L1.setText(text1 + AC + " X " + RM);
                L2.setText(text2 + " Real Madrid");
            }
        });
        add(B); //Добавление кнопки в окно

        JLabel p = new JLabel(); //Создание метки
        p.setHorizontalAlignment(JLabel.CENTER); //Выравнивание метки  по центру
        p.setForeground(Color.BLUE); //Установка цвета на метку
        p.setFont(f); //Установка шрифта на метку
        P.add(L1, BorderLayout.CENTER); //Добавление метки на панель

        JButton C = new JButton("End"); //Создание кнопки С
        C.setBounds(110, 100, 70, 30); //Размеры и расположение кнопки С
        C.setFont(f); //Установка шрифта для кнопки С
        C.addActionListener(new ActionListener() { //Добавление обработчика для окна
            public void actionPerformed(ActionEvent ae) {
                A.setEnabled(false); //Блокировка кнопки А
                B.setEnabled(false); //Блокировка кнопки В
                if (AC > RM)
                    L1.setText("Winner: AC Milan");
                else if (RM > AC)
                    L1.setText("Winner: Real Madrid");
                else
                    L1.setText("No winners");
            }

        });
        add(C); //Добавление кнопки С на панель
        setVisible(true); //Отображение окна
    }
}