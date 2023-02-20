package com.mycompany.agency;

public class Staff {

    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff() {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList
        staffList[0] = new Executive("Mike", "mikeexec@gmail.com", "YYY-YYY-YYYY", "SSS-SS-SSSS", 50000);
        staffList[1] = new Intern("Tom", "tom123@gmail.com", "XXX-XXX-XXXX");
        staffList[2] = new StaffEmployee("Jennie", "jennie516@gmail.com", "YYY-YYY-YYYY", "SSS-SS-SSSS", 20000);
        staffList[3] = new TempEmploee("Peter", "petep@gmail.com", "YYY-YYY-YYYY", "SSS-SS-SSSS", 10000);
        staffList[4] = new StaffEmployee("Megan", "megz@gmail.com", "YYY-YYY-YYYY", "SSS-SS-SSSS", 20000);
        staffList[5] = new StaffEmployee("Mark", "markm@gmail.com", "YYY-YYY-YYYY", "SSS-SS-SSSS", 20000);

        ((Executive) staffList[0]).awardBonus(500.00);

        ((TempEmploee) staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday() {
        double amount;

        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0) {
                System.out.println("Thanks!");
            } else {
                System.out.println("Paid: " + amount);
            }

            System.out.println("-----------------------------------");
        }
    }
}
