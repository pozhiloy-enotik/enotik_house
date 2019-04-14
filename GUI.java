import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Scanner;

public class GUI {
    int cena11 = 0;
    int cena22 = 0;
    public GUI(String matherial[][], int cena[][]) {
        JFrame itog = new JFrame("Итог");
        itog.setVisible(false);
        itog.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        itog.setSize(860, 80);

        Dimension sSize2 = Toolkit.getDefaultToolkit ().getScreenSize (),

                fSize2 = itog.getSize ();

        if (fSize2.height > sSize2.height) {fSize2.height = sSize2.height;}

        if (fSize2.width  > sSize2.width)  {fSize2.width = sSize2.width;}

        itog.setLocation ((sSize2.width - fSize2.width)/2,

                (sSize2.height - fSize2.height)/2);
        JPanel pannel = new JPanel();
        itog.add(pannel);
        JLabel itogLbl = new JLabel("ПАДШОТБ ИДОТ НИКАМУ НЕ ДВИГАЦА");
        itogLbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        pannel.add(itogLbl);

        JFrame frame = new JFrame("Постройка дома");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(430, 300);
        frame.setLocation(430, 100);
        Dimension sSize = Toolkit.getDefaultToolkit ().getScreenSize (),

                fSize = frame.getSize ();

        if (fSize.height > sSize.height) {fSize.height = sSize.height;}

        if (fSize.width  > sSize.width)  {fSize.width = sSize.width;}

        frame.setLocation ((sSize.width - fSize.width)/2,

                (sSize.height - fSize.height)/2);
        JPanel panel = new JPanel();
        //panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // added code

        frame.add(panel);
        JLabel lbl = new JLabel("");
        lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        //lbl.setVisible(true); // Not needed
        panel.add(lbl);

        JComboBox<String> cb = new JComboBox<String>(matherial[0]);
        cb.setMaximumSize(cb.getPreferredSize()); // added code
        cb.setAlignmentX(Component.CENTER_ALIGNMENT);// added code
        cb.setVisible(true);

        JComboBox<String> cb2 = new JComboBox<String>(matherial[1]);
        cb2.setMaximumSize(cb2.getPreferredSize()); // added code
        cb2.setAlignmentX(Component.CENTER_ALIGNMENT);// added code
        cb2.setVisible(false);

        JComboBox<String> cb3 = new JComboBox<String>(matherial[2]);
        cb3.setMaximumSize(cb3.getPreferredSize()); // added code
        cb3.setAlignmentX(Component.CENTER_ALIGNMENT);// added code
        cb3.setVisible(false);

        panel.add(cb);
        panel.add(cb2);
        panel.add(cb3);
        JLabel dlinaLbl = new JLabel("Введите длину объекта(м): ");
        lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        dlinaLbl.setVisible(false);
        JTextField dlina = new JTextField(10);
        dlina.setSize(10,1);
        dlina.setVisible(false);

        JLabel shirinaLbl = new JLabel("Введите ширину объекта(м): ");
        lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        dlinaLbl.setVisible(false);
        JTextField shirina = new JTextField(10);
        dlina.setSize(10,1);
        dlina.setVisible(false);

        JLabel etazLbl = new JLabel("Введите кол-во этажей: ");
        lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        dlinaLbl.setVisible(false);
        JTextField etaz = new JTextField(10);
        dlina.setSize(10,1);
        dlina.setVisible(false);

        JLabel visotEtazLbl = new JLabel("Введите высоту этажа(м): ");
        lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        dlinaLbl.setVisible(false);
        JTextField visotEtaz = new JTextField(10);
        dlina.setSize(10,1);
        dlina.setVisible(false);

        JButton sub = new JButton("Submit");
        sub.setVisible(false);
        dlinaLbl.setVisible(false);
        dlina.setVisible(false);
        shirina.setVisible(false);
        shirinaLbl.setVisible(false);
        etaz.setVisible(false);
        etazLbl.setVisible(false);
        visotEtaz.setVisible(false);
        visotEtazLbl.setVisible(false);
        sub.setVisible(false);
        dlina.setVisible(false);
        dlinaLbl.setVisible(false);
        panel.add(dlinaLbl);
        panel.add(dlina);
        panel.add(shirinaLbl);
        panel.add(shirina);
        panel.add(etazLbl);
        panel.add(etaz);
        panel.add(visotEtazLbl);
        panel.add(visotEtaz);

        panel.add(sub);
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox) e.getSource();
                String item = (String) box.getSelectedItem();
                if (item == "1 - Кирпич") {

                    int cena = 0;
                    cb2.setVisible(true);
                    cb3.setVisible(true);

                }
                dlinaLbl.setVisible(true);
                dlina.setVisible(true);
                shirina.setVisible(true);
                shirinaLbl.setVisible(true);
                etaz.setVisible(true);
                etazLbl.setVisible(true);
                visotEtaz.setVisible(true);
                visotEtazLbl.setVisible(true);
                sub.setVisible(true);
                dlina.setVisible(true);
                dlinaLbl.setVisible(true);
            }
        };


                    ActionListener act = new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            int[][] cena = new int[0][];
                            cena = new int[6][15];
                            cena[1][1] = 10;
                            cena[1][2] = 13;
                            cena[1][3] = 10;
                            cena[1][4] = 14;
                            cena[1][5] = 12;
                            cena[2][1] = 27;
                            cena[2][2] = 22;
                            cena[2][3] = 18;
                            cena[2][4] = 22;
                            cena[2][5] = 26;
                            cena[2][6] = 23;
                            cena[2][7] = 25;
                            cena[2][8] = 25;
                            cena[2][9] = 26;
                            cena[3][1] = 123;
                            cena[3][2] = 126;
                            Scanner sb22 = new Scanner((String)cb2.getSelectedItem());
                            Scanner sb33 = new Scanner((String)cb3.getSelectedItem());
                            String item1 = sb22.nextLine();
                            String item2 = sb33.nextLine();
                            int i2 = 0;
                            int j2 = 0;
                            int  i = Arrays.asList(matherial[1]).indexOf(item1);
                            int  j = Arrays.asList(matherial[2]).indexOf(item2);
                            if (i>0) {
                                i2 = i;
                            }
                            if (j>0) {
                                j2 = j;
                            }
                            Scanner dlin = new Scanner(dlina.getText());
                            int a = dlin.nextInt();
                            Scanner shir = new Scanner(shirina.getText());
                            int b = shir.nextInt();
                            Scanner etash = new Scanner(etaz.getText());
                            int E = etash.nextInt();
                            Scanner vis = new Scanner(visotEtaz.getText());
                            double h = vis.nextDouble();
                            System.out.println("Вам понадобится "+(int)kirpichSchet(a,b,E,h)+" строительных кирпичей, стоимостью "+ (int)kirpichSchet(a,b,E,h)*cena[1][i2]+" рублей.");
                            System.out.println("И "+(int)kirpichSchetObl(a,b,E,h)+" облицовочных кирпичей, стоимостью "+ (int)kirpichSchetObl(a,b,E,h)*cena[2][j2]+" рублей.");
                            itog.setVisible(true);
                            itogLbl.setText("   Вам понадобится "+(int)kirpichSchet(a,b,E,h)+" строительных кирпичей, стоимостью "+ (int)kirpichSchet(a,b,E,h)*cena[1][i2]+" рублей."
                             + "И "+(int)kirpichSchetObl(a,b,E,h)+" облицовочных кирпичей, стоимостью "+ (int)kirpichSchetObl(a,b,E,h)*cena[2][j2]+" рублей.");

                        }
                    };
                    sub.addActionListener(act);
                    cb.addActionListener(actionListener);


       /* if (item == "1 - Кирпич рядовой, полнотелый Воткинский M-100 (10руб за шт.)")
            if (item == "2 - Кирпич рядовой, полнотелый Чайковский M-125 (13руб за шт.)")
                if (item == "3 - Кирпич рядовой, полнотелый Ижевский M-125 (10руб за шт.)")
                    if (item == "4 - Кирпич рядовой, полнотелый Чайковский M-150 (14руб за шт.)")
                        if (item == "5 - Кирпич рядовой, полнотелый Ижевский M-150 (12руб за шт.)") {}
                        */



        frame.setVisible(true); // added code


    }
 /*   public void itog() {
        JFrame itog = new JFrame("Итог");
        itog.setVisible(false);
        itog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        itog.setSize(430, 300);
        itog.setLocation(430, 100);
        Dimension sSize2 = Toolkit.getDefaultToolkit ().getScreenSize (),

        fSize2 = itog.getSize ();

        if (fSize2.height > sSize2.height) {fSize2.height = sSize2.height;}

        if (fSize2.width  > sSize2.width)  {fSize2.width = sSize2.width;}

        itog.setLocation ((sSize2.width - fSize2.width)/2,

                (sSize2.height - fSize2.height)/2);
        JPanel kirp = new JPanel();
        //panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // added code

        itog.add(kirp);
        JLabel kirpLbl = new JLabel("asdasd1");
        kirpLbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        //lbl.setVisible(true); // Not needed
        kirp.add(kirpLbl);

        JPanel obliz = new JPanel();
        itog.add(obliz);
        JLabel oblizLbl = new JLabel("asdasd2");
        oblizLbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        //lbl.setVisible(true); // Not needed
        obliz.add(oblizLbl);

    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] matherial = new String[7][16];
        matherial[0][0] = "Выберите материал для постройки дома";
        matherial[0][1] = "1 - Кирпич";
        matherial[0][2] = "2 - Керамзитобетонный блок";
        matherial[0][3] = "3 - Газоблок";
        matherial[0][4] = "4 - Оцилиндрованный брус";
        matherial[0][5] = "5 - Клееный профилированный брус";
        matherial[0][6] = "6 - Деревянный каркас";
        matherial[1][0] = "1) Выберите тип кирпича";
        matherial[1][1] = "1 - Кирпич рядовой, полнотелый Воткинский M-100 (10руб за шт.)";
        matherial[1][2] = "2 - Кирпич рядовой, полнотелый Чайковский M-125 (13руб за шт.)";
        matherial[1][3] = "3 - Кирпич рядовой, полнотелый Ижевский M-125 (10руб за шт.)";
        matherial[1][4] = "4 - Кирпич рядовой, полнотелый Чайковский M-150 (14руб за шт.)";
        matherial[1][5] = "5 - Кирпич рядовой, полнотелый Ижевский M-150 (12руб за шт.)";
        matherial[2][0] = "2) Выберите облицовочный кирпич";
        matherial[2][1] = "6 - Голицыно Соната риф (27руб за шт.)";
        matherial[2][2] = "7 - Кирово-Чепецк «Аренберг» (22руб за шт.)";
        matherial[2][3] = "8 - Кирово-Чепецк «Красный» (18руб за шт.)";
        matherial[2][4] = "9 - TEREX Солома (22руб за шт.)";
        matherial[2][5] = "10 - На закаменной «Коричневый» (26руб за шт.)";
        matherial[2][6] = "11 - Кирово-Чепецк «Бавария» (23руб за шт.)";
        matherial[2][7] = "12 - Голицыно цвет Солома (25руб за шт.)";
        matherial[2][8] = "13 - Голицыно Терракотовый (25руб за шт.)";
        matherial[2][9] = "14 - Голицыно Слоновая кость (26руб за шт.)";
        matherial[3][0]="Выберите газоблок";
        matherial[3][1]="1 - Газоблок Д400, Д500, Д600 (123руб за шт.)";
        matherial[3][2]="2 - Газоблок Д700 (126руб за шт.)";

        int[][] cena = new int[0][];
        cena = new int[6][15];
        cena[1][1] = 10;
        cena[1][2] = 13;
        cena[1][3] = 10;
        cena[1][4] = 14;
        cena[1][5] = 12;
        cena[2][1] = 27;
        cena[2][2] = 22;
        cena[2][3] = 18;
        cena[2][4] = 22;
        cena[2][5] = 26;
        cena[2][6] = 23;
        cena[2][7] = 25;
        cena[2][8] = 25;
        cena[2][9] = 26;
        cena[3][1] = 123;
        cena[3][2] = 126;
        new GUI(matherial, cena);


        /*int Cena=0;
        int Cena2=0;
        int matherial1 = sc.nextInt();
        if (matherial1 == 1) {
            for (int i = 0; i < 16; i++) {
                System.out.println();
            }
            System.out.print("1) ");
            matherial1 = sc.nextInt();
            System.out.print("2) ");
            int matheiall2 = sc.nextInt();
            Cena=cena[1][matherial1];
            Cena2=cena[1][matheiall2];
            System.out.println("Введите длину объекта(м): ");
            int a=sc.nextInt();
            System.out.println("Введите ширину объекта(м): ");
            int b=sc.nextInt();
            System.out.println("Введите кол-во этажей: ");
            int E=sc.nextInt();
            System.out.println("Введите высоту этажа(м): ");
            double h=sc.nextDouble();
            System.out.println("Вам понадобится "+(int)kirpichSchet(a,b,E,h)+" строительных кирпичей, стоимостью "+ (int)kirpichSchet(a,b,E,h)*Cena+" рублей.");
            System.out.println("И "+(int)kirpichSchetObl(a,b,E,h)+" облицовочных кирпичей, стоимостью "+ (int)kirpichSchetObl(a,b,E,h)*Cena2+" рублей.");
        }
        if(matherial1==2){
            System.out.println("Керамзитобетонные блоки стоят примерно 43-48руб за шт. Размер блока - 240х190х188 мм");
            System.out.println("Введите длину объекта(м): ");
            int a=sc.nextInt();
            System.out.println("Введите ширину объекта(м): ");
            int b=sc.nextInt();
            System.out.println("Введите кол-во этажей: ");
            int E=sc.nextInt();
            System.out.println("Введите высоту этажа(м): ");
            double h=sc.nextDouble();
            System.out.println("Вам понадобится "+(int)KeramzBlock(a,b,E,h)+" блоков, стоимостью "+ (int)KeramzBlock(a,b,E,h)*43+" рублей.");

        }
        if (matherial1==3){
            System.out.println("Используются газоблоки размерами 600х300х200 мм.");
            for(int i=0;i<3;i++){
                System.out.println();
            }
            matherial1 = sc.nextInt();
            System.out.println("Введите длину объекта(м): ");
            int a=sc.nextInt();
            System.out.println("Введите ширину объекта(м): ");
            int b=sc.nextInt();
            System.out.println("Введите кол-во этажей: ");
            int E=sc.nextInt();
            System.out.println("Введите высоту этажа(м): ");
            double h=sc.nextDouble();
            System.out.println("Вам понадобится "+(int)GazoBlock(a,b,E,h)+" блоков, стоимостью "+ (int)GazoBlock(a,b,E,h)*cena[3][matherial1]+" рублей.");
        }
        */
    }

    static int kirpichSchet(int a, int b, int E, double h) {
        int P = 2 * (a + b);
        double S = P * E * h;
        double kolvo = (int) S * 204;
        return (int) kolvo;
    }

    static int kirpichSchetObl(int a, int b, int E, double h) {
        int P = 2 * (a + b);
        double S = P * E * h;
        double kolvo1 = (int) S * 51;
        return (int) kolvo1;
    }
    static int KeramzBlock(int a,int b,int E,double h){
        int P=2*(a+b);
        double S=P*E*h;
        double kolvo=(int)S*12.5;
        return (int) kolvo;
    }
    static int GazoBlock(int a,int b,int E,double h){
        int P=2*(a+b);
        double S=P*E*h;
        double kolvo=(int)S*8.33;
        kolvo=Math.round(kolvo);
        return (int) kolvo;
    }
}