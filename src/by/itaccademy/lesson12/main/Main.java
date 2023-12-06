package by.itaccademy.lesson12.main;

public class Main {
	public static void main(String[]args) {
		    Student[] students=new Student[10];
		    students[0] = new Student("Кобытев ф.ф", "1", new int[]{1, 2, 3, 4, 5});
		    students[1] = new Student("Иванов a.a.", "2", new int[]{6, 7, 8, 9, 10});
		    students[2] = new Student("Гаранин з.п.", "3", new int[]{10, 9, 8, 7, 6});
		    students[3] = new Student("Андреев г.ы.", "4", new int[]{1, 10, 10, 9, 10});
		    students[4] = new Student("Авдевич р.ф.", "5", new int[]{9, 9, 9, 9, 9});
		    students[5] = new Student("Егоров в.ф.", "6", new int[]{10, 10, 10, 10, 10});
		    students[6] = new Student("Макей ф.ф.", "7", new int[]{1, 1, 1, 1, 1});
		    students[7] = new Student("Смирнов ф.ф.", "8", new int[]{5, 6, 7, 9, 10});
		    students[8] = new Student("Соколов ф.ф.", "9", new int[]{1, 9, 4, 3, 2});
		    students[9] = new Student("Орлов ф.ф.", "10", new int[]{10, 10, 9, 10, 9});
		    
		    
		    for (int i = 0; i < 10; i++) {
	            System.out.println(students[i]);
	        }

	        System.out.println("\nОтличники:");

	        for (int i = 0; i < 10; i++) {
	            if (students[i].checkingGrades()){
	                System.out.println(students[i].getSurname() + ", группа: " + students[i].getNumber());
	            }
	        }

	    }
	
		
			

	}


