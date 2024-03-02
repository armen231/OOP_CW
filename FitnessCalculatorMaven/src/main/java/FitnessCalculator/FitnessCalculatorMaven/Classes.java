package FitnessCalculator.FitnessCalculatorMaven;

import java.util.ArrayList;

import FitnessCalculator.FitnessCalculatorMaven.AbstractClasses.abstractBodyMassIndex;
import FitnessCalculator.FitnessCalculatorMaven.AbstractClasses.abstractPulseZone;



/**
 * <b>Два класса унаследованные от абстрактных классов, первый класс реализует вычисление индекса массы тела человека, а второй ревлизует вычисление шести пульсовых зон.</b>
 * @author Мовсесян Армен Саргисович
 * @version 1.0
 * В классе 2 класса унаследованные от абстрактных классов.
 * Классы используют библиотеку java.util.ArrayList.
 * 
 * Для использования двух классов необходимо создать два объека этих классов.
 */
public class Classes {
	/**
	 * <b>Класс реализующий взмодействие с двумя переменными на чтение и запись с помощью соответствующих методов и один метод для вычисления индекса массы тела и его словестное описание.</b>
	 * @author Мовсесян Армен Саргисович
	 * @version 1.0
	 * В классе 2 переменные height и weight типа double, по два метода для взамидействие с переменными (get,set), один конструктор инициализаци класса, один метод для вычисления индекса массы тела и его словестное описание.
	 * Классы используют библиотеку java.util.ArrayList.
	 * 
	 * Для использования класса необходимо создать объект этого класса.
	 */
	static class BodyMassIndex extends abstractBodyMassIndex {
		/** Поле хранящий рост человека */
		private double height = 0.0;
		/** Поле хранящий вес человека */
		private double weight = 0.0;
		
		/**
		 * Конструктор - создание обекта с дольнейшим присваеванием двух значений двум переменным. 
		 * @param height - рост человека
		 * @param weight - вес человека
		 */
		public BodyMassIndex(double height, double weight) {
			this.height = height;
			this.weight = weight;
		}
		/**
		 * Метод получения значения обозначающий рост человека
		 * @return значение типа double обозначающий рос человека
		 */
		public double getHeight() {
			return height;
		}
		/**
		 * Метод задания значения обозначающий рост человека
		 * @param variable - значение указывающий рос человека
		 */
		public void setHeight(double variable) {
			height = variable;
		}
		/**
		 * Метод получения значения обозначающий вес человека
		 * @return значение типа double обозначающий вес человека
		 */
		public double getWeight() {
			return weight;
		}
		/**
		 * Метод задания значения обозначающий вес человека
		 * @param variable - значение указывающий вес человека
		 */
		public void setWeight(double variable) {
			weight = variable;
		}
		/**
		 * Метод вычисляющий индекс массы тела человека
		 * @return массив из 2 элементов, первый элемент содекжит индекс массы тема человека в виде числа и второй элемент содержащий расшифровку 1 элемента словами. 
		 */
		public ArrayList<String> BodyMassIndexResult() {
			ArrayList<String> DataList = new ArrayList<String>();
			double index = getWeight() / (getHeight() * getHeight());
			DataList.add(0, String.format("%.1f",index));
			if (index < 16) {
				DataList.add(1, "Выраженный дефицит массы тела");
			} else if (index >= 16 & index < 18.5) {
				DataList.add(1, "Недостаточная (дефицит) масса тела");
			} else if (index >= 18.5 & index < 25) {
				DataList.add(1, "Нормальная масса тела");
			} else if (index >= 25 & index < 30) {
				DataList.add(1, "Избыточная масса тела (предожирение)");
			} else if (index >= 30 & index < 35) {
				DataList.add(1, "Ожирение первой степени");
			} else if (index >= 35 & index < 40) {
				DataList.add(1, "Ожирение второй степени");
			} else if (index >= 40) {
				DataList.add(1, "Ожирение третьей степени (морбидное)");
			}
			return DataList;
		}
	}
	
	/**
	 * <b>Класс реализующий взмодействие с одной переменными на чтение и запись с помощью соответствующих методов и один метод для вычисления шести пульсовых зон .</b>
	 * @author Мовсесян Армен Саргисович
	 * @version 1.0
	 * В классе 1 переменная age типа int, два метода для взамидействие с переменной (get,set), один конструктор инициализаци класса, один метод для вычисления шести пульсовых зон.
	 * Классы используют библиотеку java.util.ArrayList.
	 * 
	 * Для использования класса необходимо создать объект этого класса.
	 */
	public static class PulseZone extends abstractPulseZone{
		/** Поле хранящий возраст человека */
		private int age = 0; // возраст человека

		/**
		 * Конструктор - создание обекта с дольнейшим присваеванием одного значения одной переменной. 
		 * @param age - возраст человека
		 */
		public PulseZone(int age) {
			this.age = age;
		}
		/**
		 * Метод получения значения обозначающий возраст человека
		 * @return значение типа int обозначающий возраст человека
		 */
		public int getAge() {
			return age;
		}
		/**
		 * Метод задания значения обозначающий возраст человека
		 * @param variable - значение указывающий возрас человека
		 */
		public void setAge(int variable) {
			age = variable;
		}
		/**
		 * Метод вычисляющий шесть пульсовых зон человека 
		 * @return массив из 6 элементов,каждый обозначающий свой диапазон частоты сердечных сокращений человека. 
		 */
		public ArrayList<String> PulseZoneResult() {
			ArrayList<String> DataList = new ArrayList<String>();
			int [] pulseZone = {50,60,70,80,90};
			int pulseMax = 220 - age;
			for (int i1 = 0; i1 < pulseZone.length; i1++) {
				if (i1 != pulseZone.length - 1) {
//					System.out.println((int) Math.ceil(pulseMax / 100.0 * pulseZone[i1])  + " - " + (int) Math.ceil(pulseMax / 100.0 * pulseZone[i1 + 1]) );
					DataList.add(i1, (int) Math.ceil(pulseMax / 100.0 * pulseZone[i1])  + " - " + (int) Math.ceil(pulseMax / 100.0 * pulseZone[i1 + 1]) );
				} else {
//					System.out.println((int) Math.ceil(pulseMax / 100.0 * pulseZone[i1])  + " - " + (int) Math.ceil(pulseMax / 100.0 * 100));
					DataList.add(i1, (int) Math.ceil(pulseMax / 100.0 * pulseZone[i1])  + " - " + (int) Math.ceil(pulseMax / 100.0 * 100));
				}
			}
			DataList.add(String.valueOf(pulseMax));
			
			return DataList;
		}
	}
}