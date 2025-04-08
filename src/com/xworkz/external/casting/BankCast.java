package com.xworkz.external.casting;

import com.xworkz.external.Balm;
import com.xworkz.external.Bank;
import com.xworkz.external.internal.DigitalBank;
import com.xworkz.external.internal.ZanduBalm;

public class BankCast {
    public void apply(Bank bank){
        bank.closeAccount();
        bank.depositMoney();
        bank.openAccount();
        bank.provideLoan();
        bank.withdrawMoney();

        if(bank instanceof DigitalBank){
            DigitalBank digitalBank=new DigitalBank();
            digitalBank.closed();
        }
    }
}
