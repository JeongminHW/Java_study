package ch10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx7 {
	int a = 100;
	public void divide(int b) throws Exception {
		if(b == 0) {
			throw new Exception("a를 0으로 나누면 안됨");
		}
		else {
			System.out.println(a/b);
		}
	}
	
	public static void main(String[] args) {
		ExceptionEx7 et = new ExceptionEx7();
		try {
			et.divide(10);
			et.divide(0);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
