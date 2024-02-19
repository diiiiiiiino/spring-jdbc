package com.example.springjdbc.transaction;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import java.sql.SQLException;

public class MyTransactionTemplateService {
    private final TransactionTemplate txTemplate;

    public MyTransactionTemplateService(PlatformTransactionManager transactionManager) {
        this.txTemplate = new TransactionTemplate(transactionManager);
    }

    public void tranLogic(){
        txTemplate.executeWithoutResult(status -> {
            try{
                bizLogic();
            } catch(Exception e){
                throw new IllegalArgumentException(e);
            }
        });
    }

    private void bizLogic(){

    }
}
