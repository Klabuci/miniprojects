package com.company;

public class Bankacc {
    private String accnumber;
    private double balance;
    private String Nume;
    private String email;
    private int numartel;

    public void Deposit(double deposit){
        this.balance +=deposit;
        System.out.println("depozitarea s-a efectuat cu succes! " + "Noua balanta : "+ balance);
    }
    public void withdraw(double withdraw){
        if(balance - withdraw < 0){
            System.out.println("Balanta insuficienta");
        }
        else {
            this.balance -= withdraw;
            System.out.println("Retragerea a fost efectuata cu succes " + "Noua balanta : " + balance );
        }
    }


    public void setAccnumber(String accnou){
        this.accnumber=accnou;
        int length = String.valueOf(accnumber).length();
        if(length == 16) this.accnumber=accnou;
        else this.accnumber="Cont invalid";
    }
    public String getAccnumber(){
        return accnumber;
    }


        public void setBalance ( double balnou){
        this.balance = balnou;
    }
        public double getBalance () {
        return balance;
    }


        public void setNume (String numenou){
        this.Nume = numenou;
    }
        public String getNume () {
        return Nume;
    }


        public void setEmail (String emailnou){
        this.email = emailnou;
    }
        public String getEmail () {
        return email;
    }


        public void setNumartel ( int nrnou){
        this.numartel = nrnou;
    }
        public int getNumartel () {
        return numartel;

    }

}
