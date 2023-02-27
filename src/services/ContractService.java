package services;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService)
    {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months)
    {
        double basicQuota = contract.getTotalValue()/months;


        for(int i = 0; 1 <= months; i++)
        {
            LocalDate dueDate = contract.getDate().plusMonths(i);//aumentar os meses

            double interest = onlinePaymentService.interest(basicQuota, i) ;
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);

            double quota = basicQuota + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }


    }
}

