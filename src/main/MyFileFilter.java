package main;

import java.io.File;
import java.io.FileFilter;

            
public class MyFileFilter  implements FileFilter {
private String a;//переменная для расширения

public MyFileFilter(String a) {
	super();
	this.a = a;
}
private boolean chek(String ext) {
	
		if(a.equals(ext)) {
			return true;
		
	}
		System.out.println("Нет документа с таким расширением");
	return false;
}
@Override
public boolean accept(File pathname) {
	int pointerIndex = pathname.getName().lastIndexOf(".");// ищет точку в имени. и сохраняет индекс точки
	if (pointerIndex == -1) {
		return false;
		}
	String ext = pathname.getName().substring(pointerIndex + 1);
	return chek(ext);
}

}
