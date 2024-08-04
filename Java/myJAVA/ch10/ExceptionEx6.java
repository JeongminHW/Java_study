package ch10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx6 {

	public static void main(String[] args) {
		try {
			exec3();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void exec1() throws Exception{}
	public static void exec2() throws Exception{
		exec1();
	}
	public static void exec3() throws Exception{
		exec2();
	}

}
