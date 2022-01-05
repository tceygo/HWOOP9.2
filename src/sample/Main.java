package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть розмір списку");
		createList(sc.nextInt());

	}

	public static void createList(int a) {
		List<Integer> arr = new ArrayList<>(a);
		for (int i = 0; i < a; i++) {
			arr.add((int) (Math.random() * 150));

		}
		System.out.println(arr);
		for (int i = 0; i < 2; i++) {
			arr.remove(0);
		}
		arr.remove(arr.size() - 1);
		System.out.println(arr);

	}

}
