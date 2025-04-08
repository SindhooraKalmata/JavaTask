package com.xworkz.external.main;
import com.xworkz.external.Bank;
import com.xworkz.external.casting.BankCast;
import com.xworkz.external.internal.DigitalBank;
public class BankRunner {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.openAccount();
        bank.depositMoney();
        bank.withdrawMoney();
        bank.provideLoan();
        bank.closeAccount();

        Bank bank1 = new DigitalBank();
        bank1.openAccount();
        bank1.depositMoney();
        bank1.withdrawMoney();
        bank1.provideLoan();
        bank1.closeAccount();

        Bank bank2 = new DigitalBank();
        bank2.openAccount();
        bank2.depositMoney();
        bank2.withdrawMoney();
        bank2.provideLoan();
        bank2.closeAccount();

        Bank bank3 = new DigitalBank();
        bank3.openAccount();
        bank3.depositMoney();
        bank3.withdrawMoney();
        bank3.provideLoan();
        bank3.closeAccount();

        DigitalBank digitalBank=new DigitalBank();
        digitalBank.closed();
        digitalBank.closeAccount();
        digitalBank.openAccount();
        digitalBank.provideLoan();
        digitalBank.depositMoney();

        BankCast bankCast=new BankCast();
        bankCast.apply(bank);
        bankCast.apply(digitalBank);
    }
}
