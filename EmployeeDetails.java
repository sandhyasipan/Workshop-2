package com.bridgelab;

public class EmployeeDetails {
    static Scanner scan = new Scanner(System.in);



    public void contactList() {
        System.out.println("Enter Name");
        String Name = scan.nextLine();

        System.out.println("Enter age");
        String age = scan.nextLine();

        System.out.println("Enter phoneNumber");
        String phoneNumber = scan.nextLine();

        System.out.println("Enter City ");
        String City = scan.nextLine();

        System.out.println("Enter State");
        String State = scan.nextLine();

        System.out.println("Enter Dipartment");
        String Dipartment = scan.nextLine();


        EmployeeDetails contactsList = new EmployeeDetails (Name ,age ,phoneNumber ,City ,State ,Dipartment);
        listData.add(EmployeeDetailsList);
    }
}

