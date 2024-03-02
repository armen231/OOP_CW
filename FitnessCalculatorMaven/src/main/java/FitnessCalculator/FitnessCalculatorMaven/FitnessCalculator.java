package FitnessCalculator.FitnessCalculatorMaven;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * <b>Класс реализующий иницализацию интерфейса, взимодействие с интерфейсом, выполение всех необходимых функций из класса classes</b>
 * @author Мовсесян Армен Саргисович
 * @version 1.0
 * В классе один метод main и один класс interfaceMain
 * Класс используют библиотеки:
 * java.awt.GridBagConstraints;
 * java.awt.GridBagLayout;
 * import java.awt.Insets;
 * java.awt.event.ActionEvent;
 * java.awt.event.ActionListener;
 * java.util.ArrayList;
 * javax.swing.JButton;
 * javax.swing.JFrame;
 * javax.swing.JLabel;
 * javax.swing.JPanel;
 * javax.swing.JTextField;
 * 
 * Для использования интерфкйса необходимо создать объект класса interfaceMain
 */
public class FitnessCalculator {
	/**
	 * Метод инициализирующий класс interfaceMain
	 */
	public static void main(String[] arges) {
		new interfaceMain();
	}
	/**
	 * <b>Класс реализирующий интерфейс приложения со всеми его функционалом</b>
	 * @author Мовсесян Армен Саргисович
	 * @version 1.0
	 * В классе 1 конструктор вызывающий метод interfaceMainF, 1 метод interfaceMainF реализующий интерфейс и 1 класс Result реализующий вычисление и отображение результатов.
	 * Классы используют библиотеку java.util.ArrayList.
	 * 
	 * Для использования 1 коасса необходимо создать объект этого класса.
	 */
	public static class interfaceMain {
		/** Поле для отображения основной панели в окне приложения */
		public static JPanel MainPanel = new JPanel();
		/** Поле для задания свойств окну приложения таких как название, размеры (ширина, высота) приложения и т. д.*/
		public static JFrame JF = new JFrame();
		/** Поле для хранения значения поля ввода и взаимодействие с элементом JTextField*/
		static JTextField input1;
		/** Поле для хранения значения поля ввода и взаимодействие с элементом JTextField*/
		static JTextField input2;
		/** Поле для хранения значения поля ввода и взаимодействие с элементом JTextField*/
		static JTextField input3;
		/** Поле для хранения значения поля ввода и взаимодействие с элементом JTextField*/
		static JTextField input4;
		/** Поле для отображения элемента JLabel*/
		static JLabel PulseZoneTableLabel5;
		/** Поле для отображения элемента JLabel*/
		static JLabel PulseZoneTableLabel9;
		/** Поле для отображения элемента JLabel*/
		static JLabel PulseZoneTableLabel13;
		/** Поле для отображения элемента JLabel*/
		static JLabel PulseZoneTableLabel17;
		/** Поле для отображения элемента JLabel*/
		static JLabel PulseZoneTableLabel21;
		/** Поле для отображения элемента JLabel*/
		static JLabel PulseZoneTableLabel25;
		/** Поле для отображения элемента JLabel*/
		static JLabel Label7;
		

		/**
		 * Конструктор - содание объекта с дольнейшим вызовом метода interfaceMainF. 
		 */
		interfaceMain() {
			interfaceMainF();
		}
		/**
		 * Метод отображения всех элементов интерфейса
		 */
		public void interfaceMainF() {
			JF.setSize(950, 500);
			JF.setTitle("Фитнес калькулятор.");
			JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JF.setLocationRelativeTo(null);
			JF.setResizable(false);
			
			MainPanel.setLayout(new GridBagLayout());
			MainPanel.setSize(950, 500);
			
			JLabel Label1 = new JLabel();
			Label1.setText("Введите рост в метрах:");
			input1 = new JTextField(30);
			
			JLabel Label2 = new JLabel();
			Label2.setText("Введите вес в килограммах:");
			input2 = new JTextField(30);
			
			JLabel Label3 = new JLabel();
			Label3.setText("Введите возраст (полных лет):");
			input3 = new JTextField(30);
			
			JLabel Label4 = new JLabel();
			Label4.setText("Ваш индекс массы тела равен:");
			input4 = new JTextField(30);
			input4.setText("-");
			input4.enable(false);
			
			JLabel Label5 = new JLabel();
			Label5.setText("Значение вашего пульса и описание пульсовых зон:");
			
			/////////////////////////////////////////////////////////////////////////////////////////////
			
			JPanel PulseZoneTablePanel = new JPanel();
			PulseZoneTablePanel.setLayout(new GridBagLayout());
			
			JLabel PulseZoneTableLabel1 = new JLabel();
			PulseZoneTableLabel1.setText("Ваш пульсовой диапазон | ");
			
			JLabel PulseZoneTableLabel2 = new JLabel();
			PulseZoneTableLabel2.setText("Пульсовая зона | ");
			
			JLabel PulseZoneTableLabel3 = new JLabel();
			PulseZoneTableLabel3.setText("Результат работы в этой зоне | ");
			
			JLabel PulseZoneTableLabel4 = new JLabel();
			PulseZoneTableLabel4.setText("Рекомендации");
		
			////
			
			PulseZoneTableLabel5 = new JLabel();
			PulseZoneTableLabel5.setText("000 - 000   ");
			
			JLabel PulseZoneTableLabel6 = new JLabel();
			PulseZoneTableLabel6.setText("Зона легкой активности:   ");
			
			JLabel PulseZoneTableLabel7 = new JLabel();
			PulseZoneTableLabel7.setText("Адаптация к нагрузке   ");
			
			JLabel PulseZoneTableLabel8 = new JLabel();
			PulseZoneTableLabel8.setText("Нагрузка для начинающих и для адаптации   ");
			
			////
			
			JLabel PulseZoneTableLabel5_1 = new JLabel();
			PulseZoneTableLabel5_1.setText("");
			
			JLabel PulseZoneTableLabel6_1 = new JLabel();
			PulseZoneTableLabel6_1.setText(" 50%-60%  ");
			
			JLabel PulseZoneTableLabel7_1 = new JLabel();
			PulseZoneTableLabel7_1.setText("и восстановление  ");
			
			JLabel PulseZoneTableLabel8_1 = new JLabel();
			PulseZoneTableLabel8_1.setText("к тренировкам после длительного перерыва");
			
			////
			
			PulseZoneTableLabel9 = new JLabel();
			PulseZoneTableLabel9.setText("000 - 000  ");
			
			JLabel PulseZoneTableLabel10 = new JLabel();
			PulseZoneTableLabel10.setText("Начало жиросжигающей   ");
			
			JLabel PulseZoneTableLabel11 = new JLabel();
			PulseZoneTableLabel11.setText("Жиросжигание  ");
			
			JLabel PulseZoneTableLabel12 = new JLabel();
			PulseZoneTableLabel12.setText("Идеальная нагрузка для жиросжигания");
			
			////
			
			JLabel PulseZoneTableLabel9_1 = new JLabel();
			PulseZoneTableLabel9_1.setText("");
			
			JLabel PulseZoneTableLabel10_1 = new JLabel();
			PulseZoneTableLabel10_1.setText("зоны: 60%-70%");
			
			JLabel PulseZoneTableLabel11_1 = new JLabel();
			PulseZoneTableLabel11_1.setText("");
			
			JLabel PulseZoneTableLabel12_1 = new JLabel();
			PulseZoneTableLabel12_1.setText("и развития начального уровня выносливости");
			
			////
			
			PulseZoneTableLabel13 = new JLabel();
			PulseZoneTableLabel13.setText("000 - 000   ");
			
			JLabel PulseZoneTableLabel14 = new JLabel();
			PulseZoneTableLabel14.setText("Аэробная зона: 70%-80%   ");
			
			JLabel PulseZoneTableLabel15 = new JLabel();
			PulseZoneTableLabel15.setText("Выносливость + жиросжигание   ");
			
			JLabel PulseZoneTableLabel16 = new JLabel();
			PulseZoneTableLabel16.setText("Достаточно высокая нагрузка. Хорошо развивает");
			
			////
			
			JLabel PulseZoneTableLabel13_1 = new JLabel();
			PulseZoneTableLabel13_1.setText("");
			
			JLabel PulseZoneTableLabel14_1 = new JLabel();
			PulseZoneTableLabel14_1.setText("");
			
			JLabel PulseZoneTableLabel15_1 = new JLabel();
			PulseZoneTableLabel15_1.setText("");
			
			JLabel PulseZoneTableLabel16_1 = new JLabel();
			PulseZoneTableLabel16_1.setText("выносливость и эффективно сжигает калории");
			
			////
			
			PulseZoneTableLabel17 = new JLabel();
			PulseZoneTableLabel17.setText("000 - 000   ");
			
			JLabel PulseZoneTableLabel18 = new JLabel();
			PulseZoneTableLabel18.setText("Анаэробная зона:   ");
			
			JLabel PulseZoneTableLabel19 = new JLabel();
			PulseZoneTableLabel19.setText("Развитие физической   ");
			
			JLabel PulseZoneTableLabel20 = new JLabel();
			PulseZoneTableLabel20.setText("Высокая интенсивность. Тренировка сердечной");
			
			////
			
			JLabel PulseZoneTableLabel17_1 = new JLabel();
			PulseZoneTableLabel17_1.setText("");
			
			JLabel PulseZoneTableLabel18_1 = new JLabel();
			PulseZoneTableLabel18_1.setText("80%-90%   ");
			
			JLabel PulseZoneTableLabel19_1 = new JLabel();
			PulseZoneTableLabel19_1.setText("выносливости   ");
			
			JLabel PulseZoneTableLabel20_1 = new JLabel();
			PulseZoneTableLabel20_1.setText("мышцы и повышение выносливости");
			
			////
			
			PulseZoneTableLabel21 = new JLabel();
			PulseZoneTableLabel21.setText("000 - 000   ");
			
			JLabel PulseZoneTableLabel22 = new JLabel();
			PulseZoneTableLabel22.setText("Максимальная нагрузка:   ");
			
			JLabel PulseZoneTableLabel23 = new JLabel();
			PulseZoneTableLabel23.setText("Максимальная скорость   ");
			
			JLabel PulseZoneTableLabel24 = new JLabel();
			PulseZoneTableLabel24.setText("Работа в этой зоне возможна только непродолжительное");
			
			////
			
			JLabel PulseZoneTableLabel21_1 = new JLabel();
			PulseZoneTableLabel21_1.setText("");
			
			JLabel PulseZoneTableLabel22_1 = new JLabel();
			PulseZoneTableLabel22_1.setText("90%-100%   ");
			
			JLabel PulseZoneTableLabel23_1 = new JLabel();
			PulseZoneTableLabel23_1.setText("и отдача энергии   ");
			
			JLabel PulseZoneTableLabel24_1 = new JLabel();
			PulseZoneTableLabel24_1.setText("время и только опытным спортсменам");
			
			////
			
			PulseZoneTableLabel25 = new JLabel();
			PulseZoneTableLabel25.setText("000   ");
			
			JLabel PulseZoneTableLabel26 = new JLabel();
			PulseZoneTableLabel26.setText("Максимальный пульс: 100%   ");
			
			JLabel PulseZoneTableLabel27 = new JLabel();
			PulseZoneTableLabel27.setText("");
			
			JLabel PulseZoneTableLabel28 = new JLabel();
			PulseZoneTableLabel28.setText("Поднимать пульс выше этого значения опасно для здоровья!");
			
			PulseZoneTablePanel.add(PulseZoneTableLabel1, new GridBagConstraints(0,0,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel2, new GridBagConstraints(1,0,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel3, new GridBagConstraints(2,0,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel4, new GridBagConstraints(3,0,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			
			PulseZoneTablePanel.add(PulseZoneTableLabel5, new GridBagConstraints(0,1,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel6, new GridBagConstraints(1,1,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel7, new GridBagConstraints(2,1,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel8, new GridBagConstraints(3,1,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			
			PulseZoneTablePanel.add(PulseZoneTableLabel5_1, new GridBagConstraints(0,2,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel6_1, new GridBagConstraints(1,2,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel7_1, new GridBagConstraints(2,2,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel8_1, new GridBagConstraints(3,2,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			
			PulseZoneTablePanel.add(PulseZoneTableLabel9, new GridBagConstraints(0,3,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel10, new GridBagConstraints(1,3,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel11, new GridBagConstraints(2,3,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel12, new GridBagConstraints(3,3,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			
			PulseZoneTablePanel.add(PulseZoneTableLabel9_1, new GridBagConstraints(0,4,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel10_1, new GridBagConstraints(1,4,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel11_1, new GridBagConstraints(2,4,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel12_1, new GridBagConstraints(3,4,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			
			PulseZoneTablePanel.add(PulseZoneTableLabel13, new GridBagConstraints(0,5,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel14, new GridBagConstraints(1,5,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel15, new GridBagConstraints(2,5,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel16, new GridBagConstraints(3,5,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			
			PulseZoneTablePanel.add(PulseZoneTableLabel13_1, new GridBagConstraints(0,6,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel14_1, new GridBagConstraints(1,6,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel15_1, new GridBagConstraints(2,6,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel16_1, new GridBagConstraints(3,6,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			
			PulseZoneTablePanel.add(PulseZoneTableLabel17, new GridBagConstraints(0,7,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel18, new GridBagConstraints(1,7,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel19, new GridBagConstraints(2,7,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel20, new GridBagConstraints(3,7,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			
			PulseZoneTablePanel.add(PulseZoneTableLabel17_1, new GridBagConstraints(0,8,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel18_1, new GridBagConstraints(1,8,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel19_1, new GridBagConstraints(2,8,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel20_1, new GridBagConstraints(3,8,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			
			PulseZoneTablePanel.add(PulseZoneTableLabel21, new GridBagConstraints(0,9,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel22, new GridBagConstraints(1,9,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel23, new GridBagConstraints(2,9,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel24, new GridBagConstraints(3,9,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			
			PulseZoneTablePanel.add(PulseZoneTableLabel21_1, new GridBagConstraints(0,10,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel22_1, new GridBagConstraints(1,10,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel23_1, new GridBagConstraints(2,10,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel24_1, new GridBagConstraints(3,10,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			
			PulseZoneTablePanel.add(PulseZoneTableLabel25, new GridBagConstraints(0,11,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel26, new GridBagConstraints(1,11,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel27, new GridBagConstraints(2,11,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			PulseZoneTablePanel.add(PulseZoneTableLabel28, new GridBagConstraints(3,11,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			
			
			
			/////////////////////////////////////////////////////////////////////////////////////////////
			
			JButton Result = new JButton();
			Result.setText("Рассчитать");
			Result.addActionListener(new Result());

			JLabel Label6 = new JLabel();
			Label6.setText("");
			
			Label7 = new JLabel();
			Label7.setText("Описание ошибки: -");
			
			GridBagConstraints grid = new GridBagConstraints();
			
			grid.gridx = 0;
			grid.gridy = 9;
			grid.gridwidth = 1;
			grid.gridheight = 7;
			grid.weightx = 1;
			grid.weighty = 1;
			grid.fill = GridBagConstraints.BOTH;
			
			
			MainPanel.add(Label1, new GridBagConstraints(0,0,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			MainPanel.add(input1, new GridBagConstraints(0,1,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			MainPanel.add(Label2, new GridBagConstraints(0,2,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			MainPanel.add(input2, new GridBagConstraints(0,3,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			MainPanel.add(Label3, new GridBagConstraints(0,4,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			MainPanel.add(input3, new GridBagConstraints(0,5,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			MainPanel.add(Label4, new GridBagConstraints(0,6,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			MainPanel.add(input4, new GridBagConstraints(0,7,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			MainPanel.add(Label5, new GridBagConstraints(0,8,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			MainPanel.add(PulseZoneTablePanel, grid);
			MainPanel.add(Result, new GridBagConstraints(0,16,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			MainPanel.add(Label6, new GridBagConstraints(0,17,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			MainPanel.add(Label7, new GridBagConstraints(0,18,1,1,0.0,0.0,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0),0,0));
			
			JF.add(MainPanel);
			JF.setVisible(true);
		
		}
		
		/**
		 * Метод для вычисления индекса массы тела и шести пульсовых зон
		 */
		public static class Result implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent event) {
				
			}
		}
	}
}