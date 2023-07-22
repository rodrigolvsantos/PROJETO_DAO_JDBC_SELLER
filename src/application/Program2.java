package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TESTE 1: department FindAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
			
		System.out.println("\n=== TESTE 2: department findById ===");
		System.out.print("Enter id for select test: ");
		int id = sc.nextInt();
		Department dep = departmentDao.finById(id);
		System.out.println(dep);
		
		System.out.println("\n=== TESTE 3: department update ===");
		System.out.print("Enter id for select test: ");
		id = sc.nextInt();
		Department dep2 = departmentDao.finById(id);
		System.out.print("Enter the new name ");
		String name = sc.next();
		dep2.setName(name);
		departmentDao.update(dep2);
		System.out.println("Update Completed");
		
		      
        System.out.println("\n=== TESTE 4: department insert ===");
        System.out.print("Enter a new Department: ");
        name = sc.next();
		Department newDepartmanent = new Department(null,name);
		departmentDao.insert(newDepartmanent);
		System.out.println("Inserted!! New Id: " + newDepartmanent.getName());
        
		System.out.println("\n=== TEST 5: delete =======");
		System.out.print("Enter id for delete test: ");
		id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");
        
        sc.close();
	}

}
