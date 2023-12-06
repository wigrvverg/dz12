package by.itaccademy.lesson12.main;

import java.util.Arrays;

public class Student {
	 private  String surname;
	 private String number;
	 private int[] progress;

	 
public Student (String surname, String number, int[] progress) {
	this.surname=surname;
	this.number=number;
	if(progress.length==5) {
	this.progress=progress;
	
}else {
	System.out.println("ошибка");
}
}
public String getSurname() {
    return surname;
}

public void setSurname(String surname) {
    this.surname = surname;
}

public String getNumber() {
    return number;
}

public void setNumber(String number) {
    this.number = number;
}
public int[] getProgress() {
    return progress;
}

public void setProgress(int[] progress) {
    this.progress = progress;
}
public boolean checkingGrades() {
	int count=0;
	for (int i = 0; i < progress.length; i++) {
	    int grades = progress[i];
	    if(grades==9 || grades==10) {
	    	count++;
	    }
	    }
	    if (count==5) {
	    	return true;
	    }else {
	    	
return false;
	    }   
}
public String toString() {
	return surname + " " + surname + ", группа: " + number + ", оценки: " + Arrays.toString(progress);
}
}
