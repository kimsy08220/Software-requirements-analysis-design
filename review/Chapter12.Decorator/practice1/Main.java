package practice1;

import java.io.*;

public class Main {
	public static void main(String[] args) {
		Display b1 = new StringDisplay("Hello, world");
		Display b2 = new UpdownBorder(b1, '-');
		Display b3 = new SideBorder(b2, '*');
		b1.show();
		b2.show();
		b3.show();
		
		Display b4 = new FullBorder(new UpdownBorder(new SideBorder(new UpdownBorder(new SideBorder(new StringDisplay("�ȳ��ϼ���"), '*'), '='), '|'), '/'));
		b4.show();
	}
}