package Bank_Activities;
import java.util.*;

public class Main {

  public  Main(){

    }
    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Long getGetdata1() {
        return getdata1;
    }

    public void setGetdata1(Long getdata1) {
        this.getdata1 = getdata1;
    }

    public Long getGetdata2() {
        return getdata2;
    }

    public void setGetdata2(Long getdata2) {
        this.getdata2 = getdata2;
    }

    public Long getGetdata3() {
        return getdata3;
    }

    public void setGetdata3(Long getdata3) {
        this.getdata3 = getdata3;
    }

    public Long getGetdata4() {
        return getdata4;
    }

    public void setGetdata4(Long getdata4) {
        this.getdata4 = getdata4;
    }

    public String getGetname() {
        return getname;
    }

    public void setGetname(String getname) {
        this.getname = getname;
    }

    private Long getdata1,getdata2,getdata3,getdata4;
      private String getname;
    private double deposit;
        public static java.lang.System System;
    LinkedList Store=new LinkedList<>();

        Scanner sc=new Scanner(System.in);
        public boolean  details() {
            try {
                System.out.println("Enter Below Details");
                System.out.println("Please Enter Your Name:");
                getname = sc.next();
                if(getname==null)
                {
                    System.out.println("Please Enter Your Name");
                }
            }catch (InputMismatchException ex){
                System.out.println("Please Enter Letters Only");
            }
                try {
                    System.out.println("Please Enter Your Data Of Birth:");
                    getdata1 = sc.nextLong();
                    String abs=String.valueOf(getdata1);
                    int length = abs.length();
                    if(length!=8){
                        System.out.println("Please Enter Correct Date example(00-00-0000)");
                        getdata1 = sc.nextLong();
                    }else if (length!=8){
                        System.out.println("Please Enter Correct Date example(00-00-0000)");
                        getdata1 = sc.nextLong();
                    }
        System.out.println("Please Enter Your Aadhaar Number:");
        getdata2 = sc.nextLong();
                    String ab=String.valueOf(getdata2);
                    int length2 = ab.length();
                    if(length2!=12){
                        System.out.println("Please Enter Correct Aadhaar Number example 12... Digits Number");
                        getdata1 = sc.nextLong();
                    }else if (length2!=12){
                        System.out.println("Please Enter Correct AdhAar Number example 12... Digits Number");
                        getdata1 = sc.nextLong();
                    }
                        System.out.println("Please Enter Your Initialize Amount Minimum 500:");
                        getdata4 = sc.nextLong();
                        for (int i = 500; i!=getdata4; i++) {
                           if (getdata4 !=500) {
                               System.out.println("Please Enter Correct Amount of 500...:");
                               getdata4 = sc.nextLong();
                           }else if (getdata4 !=500){
                               System.out.println("Please Enter Correct  Amount of 500...:");
                               getdata4 = sc.nextLong();
                           }
                        }
        System.out.println("Please Enter Your Mobile Number:");
                    getdata3 = sc.nextLong();
                    String cc=String.valueOf(getdata3);
                    int length1 = cc.length();
                    if(length1==10){
                        System.out.println("Account Create Successfully");
                    }else if(length1!=10){
                        System.out.println("Account Not Create Successfully");
                        System.out.println("Please Enter 10 Digit.. Mobile Number");
                        getdata3 = sc.nextLong();
                    }else {
                        System.out.println("Account Create Successfully");
                    }
                    Store.add(getname);
                    Store.add(getdata1);
                    Store.add(getdata2);
                    Store.add(getdata3);
                    Store.add(getdata4);
                } catch (InputMismatchException ex) {
                    java.lang.System.out.println(" Incorrect Response please Read and Enter Match Answer");
                }
        return  true;

        }
            public boolean getdetails () {
                for (Object on : Store) {
                    System.out.println(on);
                }
                return true;
            }
            public boolean deposite () {

                System.out.println("Plece Enter Deposit Ammount:");
                double amount = sc.nextDouble();
                balance = balance + amount;
                if (balance >= getdata4) {
                    System.out.println("Your Money has been Deposited");
                } else {
                    System.out.println("Your money has been not deposited");
                }
                System.out.println(" ");
                return true;
            }
            public boolean withdrw () {
                System.out.println("Please enter withdraw amount");
                double amount = sc.nextInt();

                if (balance >= amount) {
                    balance = balance - amount;
                    System.out.println("Please collect your money");
                } else {
                    System.out.println("insufficient balance");
                }
                return true;
            }

            public boolean balance () {
                System.out.println("Balance:" + "" + balance);
                System.out.println(" ");
                return true;
            }

            public boolean exit () {
                System.exit(0);
                return false;
            }
        }

