package com.wallet.dao;

import com.wallet.model.User;
import com.wallet.model.Wallet;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class WalletDao {
    private static HashMap<Long, Wallet> wallets = new HashMap<>();

    static {
        Wallet w1 = Wallet.builder()
                .id(1L)
                .name("name wallet1")
                .user(User.builder().build())
                .isActive(true)
                .createdDate(new Date())
                .build();
        Wallet w2 = Wallet.builder()
                .id(2L)
                .name("name wallet2")
                .user(User.builder().build())
                .isActive(false)
                .createdDate(new Date())
                .build();
        wallets.put(1L, w1);
        wallets.put(2L, w2);
    }

    public List<Wallet> getAllWallets(){
        return new ArrayList<>(wallets.values());
    }
}
