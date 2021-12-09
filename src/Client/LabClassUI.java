package Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import java.util.ArrayList;
import java.util.List;

import java.util.Comparator;

public class LabClassUI extends JPanel implements LabClass{

    private final int WIDTH = 1200, HEIGHT = 900;
    private List<Student> students = new ArrayList<>();

    JLabel Result = new JLabel();
    JTextField FIO = new JTextField(), INN = new JTextField();
    JButton Adding = new JButton(), Finding = new JButton(), Sorting = new JButton();

    JPanel[] pnl = new JPanel[3];
    JPanel[] pnlMid = new JPanel[3];
    JPanel[] pnlCenter = new JPanel[3];
    JPanel[] pnlDown = new JPanel[3];

     LabClassUI(){

        setBackground(Color.PINK);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setLayout(new GridLayout(3, 1));

        for(int i = 0 ; i < pnl.length ; i++)
        {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }

        pnl[1].setLayout(new GridLayout(1, 3));
        pnl[2].setLayout(new GridLayout(1, 3));

        for(int i = 0 ; i < 3 ; i++)
        {
            pnlMid[i] = new JPanel();
            pnl[1].add(pnlMid[i]);
            pnlDown[i] = new JPanel();
            pnl[2].add(pnlDown[i]);
        }

        pnlMid[1].setLayout(new GridLayout(2, 1));

        for(int i = 0 ; i < 2 ; i++)
        {
            pnlCenter[i] = new JPanel();
            pnlMid[1].add(pnlCenter[i]);
        }

        Adding.addActionListener(new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String Fio = FIO.getText();
                String Inn = INN.getText();
                Student stu = new Student(Fio, Inn);
                Add(stu);
            }
        });

        Sorting.addActionListener(new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Sort();
            }
        });

        Finding.addActionListener(new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String Fio = FIO.getText();
                String Inn = INN.getText();
                Student stu = new Student(Fio, Inn);
                Find(stu);
            }
        });

        Result.setPreferredSize(new Dimension(1200, 300));
        FIO.setPreferredSize(new Dimension(400, 100));
        INN.setPreferredSize(new Dimension(400, 100));
        Adding.setPreferredSize(new Dimension(400, 300));
        Finding.setPreferredSize(new Dimension(400, 300));
        Sorting.setPreferredSize(new Dimension(400, 300));

        Font font = new Font("Verdana", Font.PLAIN, 24);
        Result.setVerticalAlignment(JLabel.CENTER);
        Result.setHorizontalAlignment(JLabel.CENTER);
        Result.setFont(font);
        Result.setForeground(Color.BLACK);
        Result.setText("Введите ФИО и ИНН");

        Adding.setVerticalAlignment(JLabel.CENTER);
        Adding.setHorizontalAlignment(JLabel.CENTER);
        Adding.setFont(font);
        Adding.setForeground(Color.BLACK);
        Adding.setText("Добавить Студента");

        Finding.setVerticalAlignment(JLabel.CENTER);
        Finding.setHorizontalAlignment(JLabel.CENTER);
        Finding.setFont(font);
        Finding.setForeground(Color.BLACK);
        Finding.setText("Совершить Покупку");

        Sorting.setVerticalAlignment(JLabel.CENTER);
        Sorting.setHorizontalAlignment(JLabel.CENTER);
        Sorting.setFont(font);
        Sorting.setForeground(Color.BLACK);
        Sorting.setText("Отсортировать Список Студентов");

        FIO.setHorizontalAlignment(JLabel.CENTER);
        FIO.setFont(font);
        FIO.setForeground(Color.BLACK);
        FIO.setText("Введите ФИО");

        INN.setHorizontalAlignment(JLabel.CENTER);
        INN.setFont(font);
        INN.setForeground(Color.BLACK);
        INN.setText("Введите ИНН");

        pnl[0].add(Result);
        pnlCenter[0].add(FIO);
        pnlCenter[1].add(INN);
        pnlDown[0].add(Adding);
        pnlDown[1].add(Sorting);
        pnlDown[2].add(Finding);
    }

    @Override
    public void Find(Student st) {
        try{
            boolean check = true;
            for (Student stu: students){
                if (stu.getFIO().equals(st.getFIO())){
                    check = false;
                    if(st.getINN().equals(stu.getINN())){
                        Result.setText("Покупка прошла успешна");
                    } else {
                        throw new EmptyStringException();
                    }
                    break;
                }
            }
            if (check){
                throw new StudentNotFoundException();
            }
        } catch (StudentNotFoundException error1){
            Result.setText("Такого человека не существует");
        } catch (EmptyStringException error2){
            Result.setText("Ваш ИНН устарел");
        }
    }

    @Override
    public void Add(Student st) {
        if(!st.getINN().equals("") && !st.getFIO().equals("") && !st.getINN().equals("Введите ИНН") && !st.getFIO().equals("Введите ФИО")){
            students.add(st);
            Result.setText("Студент успешно добавлен");
        }
        else {
            Result.setText("Заполните все поля");
        }
    }

    @Override
    public void Sort() {
        Comparator<Student> comp = new SortStudent();
        students.sort(comp);
        Result.setText("Список успешно отсортирован");
    }
}